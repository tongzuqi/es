package com.es.demo.enm;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tzq on 2018/6/22.
 */
public enum PhoneCalllogEnum {


    ID("id","id","string","主键(uuid)",false),
    PERSONID("personId","person_id","string","关联机主(t_person)表id",false),
    MSISDN("msisdn","msisdn","string","本机号码",true),
    PHONENUM("phonenum","phonenum","string","通话号码",true),
    RELATIONSHIPNAME("relationshipName","relationship_name","string","联系人姓名",true),
    CALLTIME("calltime","calltime","string","通话时间",true),
    ENDTIME("endTime","end_time","string","通话结束时间",true),
    DURATION("duration","duration","int","通话时长(秒)",true),
    STATUSDM("statusDm","status_dm","string","通话状态代码",false),
    LOCALACTIONDM("localActionDm","local_action_dm","string","本地动作代码",false),
    DATASOURCEDM("datasourceDm","datasource_dm","int","数据来源代码",false),
    PHYSEQ("physeq","physeq","int","通话记录物理存储序号",true),
    DELFLAG("delFlag","del_flag","int","状态",true),
    REMARK("remark","remark","string","备注",true),
    CLIENTDATE("clientDate","client_date","date","采集日期",true),
    SERVERDATE("serverDate","server_date","date","上传日期",true),
    SYNCDATE("syncDate","sync_date","date","同步日期",false),
    PRIVACYCONFIGDM("privacyconfigDm","privacyconfig_dm","string","加密状态代码",false),
    ATTRIBUTION("attribution","attribution","string","对方手机号码归属",true),
    DATAFLAG("dataFlag","data_flag","int","数据来源名称",false),
    VALIDFLAG("validFlag","valid_flag","int","数据是否有效",false),
    STATUSNAME("statusName","status_name","string","通话状态名称",true),
    LOCALACTIONNAME("localActionName","local_action_name","string","本地动作名称",true),
    DATASOURCENAME("datasourceName","datasource_name","string","数据来源名称",false),
    PRIVACYCONFIGNAME("privacyconfigName","privacyconfig_name","string","加密状态名称",true),
    DWDSERVERDATE("dwdServerDate","dwd_server_date","date","落dwd分区的时间",false),
    DWDSYNCDATE("dwdSyncDate","dwd_sync_date","date","dwd层的变更时间",false),
    DWDOPTYPE("dwdOpType","dwd_op_type","string","dwd操作类型",false),
    DWDVMD5("dwdVmd5","dwd_vmd5","string","dwd的md5计算",false),
    DWDBATCH("dwdBatch","dwd_batch","string","批次编号",false),
    DWDSOURCE("dwdSource","dwd_source","string","数据来源",false);

    private PhoneCalllogEnum(String vo, String column, String type,String name,boolean display) {
        this.vo = vo;
        this.column = column;
        this.type= type;
        this.name = name ;
        this.display = display ;
    }

    /**
     * 返回所有的column和name值的map集合
     * @return map
     */
    public static Map<String,String> getColumnNameMap(){
        Map<String,String> map  = new HashMap<String,String>();
        for (PhoneCalllogEnum enm : PhoneCalllogEnum.values()) {
            if(enm.display) map.put(enm.getColumn(),enm.getName());
        }
        return  map;
    }
    public static String getcolumnByCode(String vo) {
        for (PhoneCalllogEnum enm : PhoneCalllogEnum.values()) {
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
        for (PhoneCalllogEnum enm : PhoneCalllogEnum.values()) {
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
        for (PhoneCalllogEnum enm : PhoneCalllogEnum.values()) {
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
