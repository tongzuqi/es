package com.es.demo.enm;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tzq on 2018/6/22.
 */
public enum WeixinMessageEnum {


    PROFILEID("profileId","profile_id","string","微信帐号表id",false),
    LOCALACTIONDM("localActionDm","local_action_dm","string","本地动作代码",false),
    CREATETIME("createtime","createtime","string","时间",true),
    CONTENT("content","content","string","内容",true),
    FILEPATH("filepath","filepath","string","相对路径",true),
    PREWPATH("prewpath","prewpath","string","预览相对路径",true),
    TIMELENGTH("timelength","timelength","int","时长",true),
    MSGTYPE("msgtype","msgtype","bigint","消息类型",true),
    SWECHATID("swechatid","swechatid","string","发送人微信帐号",false),
    REMARK("remark","remark","string","备注",true),
    CLIENTDATE("clientDate","client_date","date","采集日期",true),
    SERVERDATE("serverDate","server_date","date","上传日期",true),
    SYNCDATE("syncDate","sync_date","date","同步日期",false),
    DATAFLAG("dataFlag","data_flag","int","数据来源",false),
    VALIDFLAG("validFlag","valid_flag","int","数据是否有效",false),
    TYPENAME("typeName","type_name","string","消息类型名称",true),
    LOCALACTIONNAME("localActionName","local_action_name","string","本地动作名称",true),
    DWDSERVERDATE("dwdServerDate","dwd_server_date","date","落dwd分区的时间",false),
    DWDSYNCDATE("dwdSyncDate","dwd_sync_date","date","dwd层的变更时间",false),
    DWDOPTYPE("dwdOpType","dwd_op_type","string","dwd操作类型",false),
    DWDVMD5("dwdVmd5","dwd_vmd5","string","dwd的md5计算",false),
    ID("id","id","string","id",false),
    MSGID("msgid","msgid","numeric","消息id",false),
    OTHERID("otherid","otherid","string","对方id/群组id",false),
    GROUPNAME("groupName","group_name","string","群组名称",true),
    SENDERID("senderid","senderid","string","发送方id",false),
    SENDERNAME("sendername","sendername","string","发送方名称",true),
    TYPEDM("typeDm","type_dm","string","消息类型代码",false),
    DELFLAG("delFlag","del_flag","smallint","状态",true),
    DWDBATCH("dwdBatch","dwd_batch","string","批次编号",false),
    DWDSOURCE("dwdSource","dwd_source","string","数据来源",false);


    private WeixinMessageEnum(String vo, String column, String type, String name, boolean display) {
        this.vo = vo;
        this.column = column;
        this.type= type;
        this.name = name ;
        this.display = display;
    }

    /**
     * 返回需要显示的column和name值的map集合
     * @return map
     */
    public static Map<String,String> getColumnNameMap(){
        Map<String,String> map  = new HashMap<String,String>();
        for (WeixinMessageEnum enm : WeixinMessageEnum.values()) {
            if(enm.display)
            map.put(enm.getColumn(),enm.getName());
        }
        return  map;
    }
    public static String getcolumnByCode(String vo) {
        for (WeixinMessageEnum enm : WeixinMessageEnum.values()) {
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
        for (WeixinMessageEnum enm : WeixinMessageEnum.values()) {
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
        for (WeixinMessageEnum enm : WeixinMessageEnum.values()) {
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
    private boolean display;

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
