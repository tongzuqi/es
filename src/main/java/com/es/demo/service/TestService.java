package com.es.demo.service;

/**
 * Created by tzq on 2018/6/19.
 */

import java.util.List;
import java.util.Map;

public interface TestService {

    /**
     * 获取整个tables的字段和中文的翻译map集合
     * @return map key 为table+"_column" value 为一个map key为字段，value为中文
     */
    public Map<String,Object> getTablesEnumColumnName();

    /**
     * 对整个库中进行检索
     * @param searchContent
     * @param pageNumber
     * @param pageSize
     * @return
     */
    String searchAll(String searchContent,int pageNumber,int pageSize);

    /**
     * 对talbes枚举表中所有的table信息，进行单表的检索
     * @param searchContent
     * @param pageNumber
     * @param pageSize
     * @param list
     * @return
     */
    Map<String ,String > searchTables (String searchContent, int pageNumber, int pageSize, List<String> list);


}