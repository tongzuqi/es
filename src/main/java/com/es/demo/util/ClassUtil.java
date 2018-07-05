package com.es.demo.util;

import com.es.demo.enm.*;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by tzq on 2018/6/21.
 */
public class ClassUtil {


    /**
     * 获取一个类的所有属转string 数组
     * @param clazz
     * @return
     */
    public static  String[] getAllClassFieldsToStringArray(Class clazz){
        List<String> list = new ArrayList<String>();

        Map<String, Field> resutlMap = new LinkedHashMap<String, Field>();
        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                list.add(field.getName());
            }
        }
        String[] keys=list.toArray(new String[list.size()]);
        return keys;
    }





    /**
     * 获取一个类的所有属性
     *
     * @param clazz
     * @return
     */
    private static Map<String, Field>  getAllClassFields(Class clazz) {
        Map<String, Field> resutlMap = new LinkedHashMap<String, Field>();
        for (; clazz != Object.class; clazz = clazz.getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                resutlMap.put(field.getName(), field);
            }
        }
        for (Map.Entry<String, Field> entry : resutlMap.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue().toString();
            System.out.println("key=" + key );
        }
        return resutlMap;
    }
    /**
     * 获取一个table所有的Column和中文信息
     * @param table 表名
     * @return
     */
    public  static  Map<String,String> getTableEnumColumnName(String table){
        Map<String,String> map  = new HashMap<String,String>();
        if(table.equals(TablesEnum.T_PHONE_SMS.getCode())){
            map = PhoneSmsEnum.getColumnNameMap();
        }else if(table.equals(TablesEnum.T_PHONE_CONTACT.getCode())){
            map = PhoneContactEnum.getColumnNameMap();
        }else if(table.equals(TablesEnum.T_PHONE_CALLLOG.getCode())){
            map = PhoneCalllogEnum.getColumnNameMap();
        }else if(table.equals(TablesEnum.T_WEI_XIN_MESSAGE.getCode())){
            map = WeixinMessageEnum.getColumnNameMap();
        }else if(table.equals(TablesEnum.T_EMAIL.getCode())){
            map = EmailEnum.getColumnNameMap();
        }else if(table.equals(TablesEnum.T_QQ_MESSAGE.getCode())){
            map = QqMessageEnum.getColumnNameMap();
        }
        return  map ;
    }
    /**
     * 获取一个table所有的Column信息
     * @param table 表名
     * @param type 类型，null 查询所有
     * @return
     */
    public  static  List<String> getTableEnumOne(String table,String type){
        List<String> list  = new ArrayList<String>();
        if(table.equals(TablesEnum.T_PHONE_SMS.getCode())){
            list = PhoneSmsEnum.getColumnList(type);
        }else if(table.equals(TablesEnum.T_PHONE_CONTACT.getCode())){
            list = PhoneContactEnum.getColumnList(type);
        }else if(table.equals(TablesEnum.T_PHONE_CALLLOG.getCode())){
            list = PhoneCalllogEnum.getColumnList(type);
        }else if(table.equals(TablesEnum.T_WEI_XIN_MESSAGE.getCode())){
            list = WeixinMessageEnum.getColumnList(type);
        }else if(table.equals(TablesEnum.T_EMAIL.getCode())){
            list = EmailEnum.getColumnList(type);
        }else if(table.equals(TablesEnum.T_QQ_MESSAGE.getCode())){
            list = QqMessageEnum.getColumnList(type);
        }
        return  list ;
    }


    /**
     * 所有talbe的column字段去重
     * @param type
     * @return
     */
    public  static  List<String> getTableEnumColumnDuplicateRemoval(String type){
        List<String> listAll =  new ArrayList<String>();
        for (TablesEnum enm : TablesEnum.values()) {

            List<String> list = ClassUtil.getTableEnumOne(enm.getCode(),type);
            //System.out.println(list.size());
            listAll.addAll(list);
        }
        //System.out.println(listAll.size());
        Map<String,String> map = new HashMap<String,String>();
        for(String str  : listAll){
            map.put(str,str);
        }
        //System.out.println(map.size());
        listAll=  new ArrayList<String>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            listAll.add(entry.getKey().toString());

        }
        //System.out.println(listAll.size());
        return  listAll ;
    }



}
