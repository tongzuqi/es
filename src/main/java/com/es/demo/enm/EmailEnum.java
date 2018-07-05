package com.es.demo.enm;

import org.apache.commons.lang.StringUtils;

import java.util.*;

public enum EmailEnum {


    ACCOUNTID("accountId","account_id","string","邮箱帐号表id",false),
    MAILFROM("mailFrom","mail_from","string","发件人",true),
    MAILTO("mailTo","mail_to","string","收件人",true),
    CC("cc","cc","string","抄送",true),
    BCC("bcc","bcc","string","暗送",true),
    SUBJECT("subject","subject","string","邮件主题",true),
    CONTENT("content","content","string","邮件内容",true),
    BODYPATH("bodypath","bodypath","string","存放路径",true),
    SENDDATE("senddate","senddate","date","时间",true),
    REMARK("remark","remark","string","备注",true),
    CLIENTDATE("clientDate","client_date","date","采集日期",true),
    SERVERDATE("serverDate","server_date","date","上传日期",true),
    SYNCDATE("syncDate","sync_date","date","同步日期",false),
    APPTYPE("appType","app_type","int","应用类型",true),
    DATAFLAG("dataFlag","data_flag","int","数据来源",false),
    VALIDFLAG("validFlag","valid_flag","int","数据是否有效",false),
    MAILSAVEFOLDERNAME("mailSaveFolderName","mail_save_folder_name","string","所在的邮箱位置名称",true),
    DWDSERVERDATE("dwdServerDate","dwd_server_date","date","落dwd分区的时间",false),
    DWDSYNCDATE("dwdSyncDate","dwd_sync_date","date","dwd层的变更时间",false),
    DWDOPTYPE("dwdOpType","dwd_op_type","string","dwd操作类型",false),
    DWDVMD5("dwdVmd5","dwd_vmd5","string","dwd的md5计算",false),
    ID("id","id","string","主键",false),
    ISREAD("isread","isread","smallint","是否已读",true),
    MAILSAVEFOLDERDM("mailSaveFolderDm","mail_save_folder_dm","string","邮箱位置代码",false),
    DELFLAG("delFlag","del_flag","smallint","状态",true),
    DWDBATCH("dwdBatch","dwd_batch","string","批次编号",false),
    DWDSOURCE("dwdSource","dwd_source","string","数据来源",false);

    private EmailEnum(String vo, String column, String type,String name,boolean display) {
        this.vo = vo;
        this.column = column;
        this.type= type;
        this.name = name ;
        this.display =display ;
    }

    /**
     * 返回所有的column和name值的map集合
     * @return map
     */
    public static Map<String,String> getColumnNameMap(){
        Map<String,String> map  = new HashMap<String,String>();
        for (EmailEnum enm : EmailEnum.values()) {
            if(enm.display) map.put(enm.getColumn(),enm.getName());
        }
        return  map;
    }
    public static String getcolumnByCode(String vo) {
        for (EmailEnum enm : EmailEnum.values()) {
            if (enm.getVo() == vo) {
                return enm.getColumn();
            }
        }
        return null;
    }

    /**
     * 根据type 获取相应的vo信息集合 type 可以为空
     * @param type
     * @return
     */
    public static List<String> getVoList(String type ){
        List<String> list = new ArrayList<String>();
        for (EmailEnum enm : EmailEnum.values()) {
            if(StringUtils.isNotEmpty(type)){
                if(enm.getType().equals(type)) {
                    list.add(enm.getVo());
                }
            }else{
                list.add(enm.getVo());
            }

        }
        return  list;
    }
    /**
     * 根据type 获取相应的实体信息集合 type 可以为空
     * @param type
     * @return
     */
    public static List<String> getColumnList(String type ){
        List<String> list = new ArrayList<String>();
        for (EmailEnum enm : EmailEnum.values()) {
            if(StringUtils.isNotEmpty(type)){
                if(enm.getType().equals(type)) {
                    list.add(enm.getColumn());
                }
            }else{
                list.add(enm.getColumn());
            }

        }
        return  list;
    }
    private String vo;
    private String column;
    private String type;
    private String name;
    private boolean display ;

    public String getVo() {
        return vo;
    }

    public void setVo(String vo) {
        this.vo = vo;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }
}
