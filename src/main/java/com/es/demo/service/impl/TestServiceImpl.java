package com.es.demo.service.impl;

/**
 * Created by tzq on 2018/6/19.
 */

import com.es.demo.enm.TablesEnum;
import com.es.demo.service.TestService;
import com.es.demo.util.ClassUtil;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Search;
import org.elasticsearch.index.query.MatchAllQueryBuilder;
import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    public static final String INDEX_NAME = "postgres";
    private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private JestClient jestClient;

    //搜索多个分表的信息
    public Map<String ,String > searchTables (String searchContent,int pageNumber,int pageSize,List<String> list){
        Map<String ,String > map  = new HashMap<String ,String >();
        for (String table : list) {
            map.put(table,searchToTable(searchContent,pageNumber,pageSize,table));//每一个表查询下的信息用key和value 组装

        }
        return  map;
    }


    /**
     * 获取整个tables的字段和中文的翻译map集合
     * @return map key 为table+"_column" value 为一个map key为字段，value为中文
     */
    public Map<String,Object> getTablesEnumColumnName(){
        Map<String ,Object > map  = new HashMap<String ,Object >();//返回的map
        Map<String ,Object > map_column  = new HashMap<String ,Object >();//column存放的map
        for (TablesEnum enm : TablesEnum.values()) {
            map_column.put(enm.getCode()+"_column",ClassUtil.getTableEnumColumnName(enm.getCode()));//每一个表查询下的信息用key和value 组装
        }
        map.put("column",map_column);
        map.put("table",TablesEnum.getColumnNameMap());
        return map;
    }


    /**
     * 查询某一个表的全文搜索
     * @param searchContent //搜索文字
     * @param table  //表名
     * @return
     */
    public String searchToTable(String searchContent,int pageNumber,
                                int pageSize, String table) {
        MatchAllQueryBuilder mpq1 = QueryBuilders.matchAllQuery();
        //取一个表都是string类型的列集合
        List<String> list = ClassUtil.getTableEnumOne(table,"string");
        String[] keys=list.toArray(new String[list.size()]);
        MultiMatchQueryBuilder  mpq2 =  QueryBuilders.multiMatchQuery(searchContent,keys);

        QueryBuilder qb2 = QueryBuilders.boolQuery().must(mpq1).must(mpq2);
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(qb2);


        // 设置分页
        searchSourceBuilder.from((pageNumber - 1) * pageSize);//设置起始页
        searchSourceBuilder.size(pageSize);//设置页大小


        //高亮
        HighlightBuilder highlightBuilder = new HighlightBuilder();
        for(String str : keys){
            highlightBuilder.field(str);//高亮field
        }
        highlightBuilder.preTags("<em>").postTags("</em>");//高亮标签
        highlightBuilder.fragmentSize(200);//高亮内容长度
        searchSourceBuilder.highlighter(highlightBuilder);

        //把参数和访问路径整合
        Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(INDEX_NAME).addType(table).build();
        try {
            //查询
            JestResult result = jestClient.execute(search);
            System.out.println("***getURI************************************************************************************************************************************");
            System.out.println("get /"+ search.getURI());
            System.out.println("***es查询语句************************************************************************************************************************************");
            System.out.println(searchSourceBuilder.toString());
            System.out.println("***getJsonString************************************************************************************************************************************");
            System.out.println(result.getJsonObject());
            return  result.getJsonString().toString().replace( "null","\"\"" );

        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }


    public String searchAll(String searchContent,int pageNumber,
                                int pageSize) {
        //不重复的额所有字段
        List<String> list = ClassUtil.getTableEnumColumnDuplicateRemoval("string");
        String[] keys=list.toArray(new String[list.size()]);

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.boolQuery().must(QueryBuilders.multiMatchQuery(searchContent,keys)));



        // 设置分页
        searchSourceBuilder.from((pageNumber - 1) * pageSize);//设置起始页
        searchSourceBuilder.size(pageSize);//设置页大小



        //高亮
        HighlightBuilder highlightBuilder = new HighlightBuilder();
        for(String str : keys){
            highlightBuilder.field(str);//高亮field
        }
        highlightBuilder.preTags("<em>").postTags("</em>");//高亮标签
        highlightBuilder.fragmentSize(200);//高亮内容长度
        searchSourceBuilder.highlighter(highlightBuilder);

        //把参数和访问路径整合
        Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(INDEX_NAME).build();
        try {
            //查询
            JestResult result = jestClient.execute(search);
            System.out.println("***getURI************************************************************************************************************************************");
            System.out.println("get /"+ search.getURI());
            System.out.println("***es查询语句************************************************************************************************************************************");
            System.out.println(searchSourceBuilder.toString());
            System.out.println("***getJsonString************************************************************************************************************************************");
            System.out.println(result.getJsonObject());
            return  result.getJsonString().toString().replace( "null","\"\"" );

        } catch (IOException e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }


}