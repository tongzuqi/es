package com.es.demo;

import com.es.demo.enm.TablesEnum;
import com.es.demo.service.TestService;
import com.es.demo.util.ClassUtil;
import io.searchbox.client.JestClient;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.elasticsearch.index.query.MatchAllQueryBuilder;
import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsApplicationTests {

	@Autowired
	private TestService cityESService;
	@Autowired
	private JestClient jestClient;
	//索引库名
	String index = "postgres";
	//类型名称
	String type = "t_phone_mms";
	public static final String INDEX_NAME = "postgres";
	@Test
	public void test()throws Exception {
		List<String> listAll =  new ArrayList<String>();
		for (TablesEnum enm : TablesEnum.values()) {

			List<String> list = ClassUtil.getTableEnumOne(enm.getCode(),null);
			System.out.println(list.size());
			listAll.addAll(list);
		}
		System.out.println(listAll.size());
		Map<String,String> map = new HashMap<String,String>();
		for(String str  : listAll){
			map.put(str,str);
		}
		System.out.println(map.size());
		listAll=  new ArrayList<String>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			listAll.add(entry.getKey().toString());

		}
		System.out.println(listAll.size());

	}
	@Test
	public void getTableColumnNameMap(){
		String searchContent ="是";
		int pageNumber=1;
		int pageSize=2;
		String table="t_phone_sms";
		MatchAllQueryBuilder mpq1 = QueryBuilders.matchAllQuery();
		//取一个表都是string类型的列集合
		List<String> list = ClassUtil.getTableEnumOne(table,"string");
		String[] keys=list.toArray(new String[list.size()]);
		MultiMatchQueryBuilder mpq2 =  QueryBuilders.multiMatchQuery(searchContent,keys);

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
		highlightBuilder.preTags("<em style='color: red;'>").postTags("</em>");//高亮标签
		highlightBuilder.fragmentSize(200);//高亮内容长度
		searchSourceBuilder.highlighter(highlightBuilder);

		//把参数和访问路径整合
		Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(INDEX_NAME).addType(table).build();
		try {
			//查询
			SearchResult result = jestClient.execute(search);
			//System.out.println("***getURI************************************************************************************************************************************");
			//System.out.println("get /"+ search.getURI());
			//System.out.println("***es查询语句************************************************************************************************************************************");
			//System.out.println(searchSourceBuilder.toString());
			//System.out.println("***getJsonString************************************************************************************************************************************");
			System.out.println("*****************************************************************");
			System.out.println(result.getJsonString().toString());
			System.out.println("*****************************************************************");

			System.out.println(result.getJsonString().toString().replace( "null","\"\"" ));
			System.out.println("*****************************************************************");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}


}