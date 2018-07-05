package com.es.demo.controller;

/**
 * Created by tzq on 2018/6/19.
 */

import com.es.demo.bean.ResponseBean;
import com.es.demo.enm.TablesEnum;
import com.es.demo.service.TestService;
import com.es.demo.util.Result;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/entityController")
public class EntityController {
    private final static Logger logger = LoggerFactory.getLogger(EntityController.class);
    @Autowired
    private TestService cityESService;


    /**
     * 搜索全部分表的信息
     * @param name
     * @return
     */
    @RequestMapping(value="/searchTables")//, method=RequestMethod.POST
    public @ResponseBody Result<Object> searchTables(String name,int pageNumber, int pageSize) {
        Map<String ,String > entityList = null;
        Result<Object> result = new Result<Object>(true, ResponseBean.CODE_SUCCESS,"查询成功",null);
            if(StringUtils.isNotEmpty(name)) {
                try {

                    List<String> list = new  ArrayList<String>();
                    for (TablesEnum enm : TablesEnum.values()) {
                        list.add(enm.getCode());
                    }
                    entityList = cityESService.searchTables(name,pageNumber,pageSize,list);
                    if (entityList != null){
                        result = result.returnVo(1,"查询",null);
                        result.setData(entityList);
                    }else {
                        result.setMessage("查询结果为空");
                        result.setCode(ResponseBean.CODE_SUCCESS);
                        result.setOk(true);
                    }
                }catch (Exception e){
                    logger.error(e.getClass().getName()+"："+e.getMessage());
                    result.setMessage("操作异常！");
                    result.setCode(ResponseBean.CODE_NO_RESULT);
                    result.setOk(false);
                }
            }else{
                result.setMessage("参数缺失！");
                result.setCode(ResponseBean.CODE_NO_RESULT);
                result.setOk(false);
            }

        return result;
    }
    /**
     * 搜索单个分表的信息
     * @param name
     * @return
     */
    @RequestMapping(value="/searchTable")//, method=RequestMethod.POST
    public @ResponseBody Result<Object> searchTable(String name,int pageNumber, int pageSize,String table) {
        Map<String ,String > entityList = null;
        Result<Object> result = new Result<Object>(true, ResponseBean.CODE_SUCCESS,"查询成功",null);
        if(StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(table) ) {
            try {
                List<String> list = new  ArrayList<String>();
                if(table.indexOf(",")!=-1) {
                    list = Arrays.asList(table.split(","));
                }else{
                    list.add(table);
                }

                entityList = cityESService.searchTables(name,pageNumber,pageSize,list);
                if (entityList != null){
                    result = result.returnVo(1,"查询",null);
                    result.setData(entityList);
                }else {
                    result.setMessage("查询结果为空");
                    result.setCode(ResponseBean.CODE_SUCCESS);
                    result.setOk(true);
                }
            }catch (Exception e){
                logger.error(e.getClass().getName()+"："+e.getMessage());
                result.setMessage("操作异常！");
                result.setCode(ResponseBean.CODE_NO_RESULT);
                result.setOk(false);
            }
        }else{
            result.setMessage("参数缺失！");
            result.setCode(ResponseBean.CODE_NO_RESULT);
            result.setOk(false);
        }

        return result;
    }
    /**
     * 搜索全库的信息
     * @param name
     * @return
     */
    @RequestMapping(value="/searchAll")//, method=RequestMethod.POST
    public @ResponseBody Result<Object> searchAll(String name,int pageNumber,
                                                           int pageSize) {

        Result<Object> result = new Result<Object>(true, ResponseBean.CODE_SUCCESS,"查询成功",null);
        Map<String ,String > entityList = new HashMap<String ,String > ();

        try {
            if(StringUtils.isNotEmpty(name)) {
                String entity = cityESService.searchAll(name,pageNumber,pageSize);
                entityList.put("all",entity);
                if (StringUtils.isNotEmpty(entity)){
                    result = result.returnVo(1,"查询",null);
                    result.setData(entityList);
                }else {
                    result.setMessage("查询结果为空");
                    result.setCode(ResponseBean.CODE_SUCCESS);
                    result.setOk(true);
                }
            }else{
            result.setMessage("参数缺失！");
            result.setCode(ResponseBean.CODE_NO_RESULT);
            result.setOk(false);
            }

        }catch (Exception e){
            logger.error(e.getClass().getName()+"："+e.getMessage());
            result.setMessage("操作异常！");
            result.setCode(ResponseBean.CODE_NO_RESULT);
            result.setOk(false);
        }
        return result;
    }

    /**
     * 表和列翻译
     * @return map
     */
    @RequestMapping(value="/getTablesEnumColumnName")//, method= RequestMethod.POST
    public @ResponseBody Result<Object> getTablesEnumColumnName() {
        Result<Object> result = new Result<Object>(true, ResponseBean.CODE_SUCCESS,"查询成功",null);
        Map<String ,Object > entityList = new HashMap<String ,Object > ();

        try {
            entityList= cityESService.getTablesEnumColumnName();
            if (entityList != null){
                result = result.returnVo(1,"查询",null);
                result.setData(entityList);
            }else {
                result.setMessage("查询结果为空");
                result.setCode(ResponseBean.CODE_SUCCESS);
                result.setOk(true);
            }
        }catch (Exception e){
            logger.error(e.getClass().getName()+"："+e.getMessage());
            result.setMessage("操作异常！");
            result.setCode(ResponseBean.CODE_NO_RESULT);
            result.setOk(false);
        }
        return result;
    }


}