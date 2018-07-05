package com.es.demo.enm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tzq on 2018/6/21.
 */
public enum TablesEnum {

    T_PHONE_SMS("t_phone_sms","短信"),
    T_PHONE_CALLLOG("t_phone_calllog","通话记录"),
    T_PHONE_CONTACT("t_phone_contact","通讯录"),
    T_WEI_XIN_MESSAGE("t_weixin_message","微信消息"),
    T_EMAIL("t_email","邮件"),
    T_QQ_MESSAGE("t_qq_message","qq消息")
    ;

    private TablesEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 返回所有的column和name值的map集合
     * @return map
     */
    public static Map<String,String> getColumnNameMap(){
        Map<String,String> map  = new HashMap<String,String>();
        for (TablesEnum enm : TablesEnum.values()) {
            map.put(enm.getCode(),enm.getName());
        }
        return  map;
    }
    public static String getNameByCode(String code) {
        for (TablesEnum enm : TablesEnum.values()) {
            if (enm.getCode() == code) {
                return enm.getName();
            }
        }
        return null;
    }
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
