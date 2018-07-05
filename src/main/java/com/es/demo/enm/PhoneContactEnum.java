package com.es.demo.enm;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tzq on 2018/6/22.
 */
public enum PhoneContactEnum {


    ID("id", "id", "string", "主键(uuid)", false),
    PERSONID("personId", "person_id", "string", "关联机主(t_person)表id", false),
    NAME("name", "name", "string", "姓名", true),
    PHONEVALUETYPEDM("phoneValueTypeDm", "phone_value_type_dm", "string", "通讯录字段类型代码", false),
    PHONENUMBERTYPE("phoneNumberType", "phone_number_type", "string", "通讯录字段标签", true),
    PHONENUM("phonenum", "phonenum", "string", "电话号码", true),
    DATASOURCEDM("datasourceDm", "datasource_dm", "int", "数据来源代码", false),
    PHYSEQ("physeq", "physeq", "int", "通讯录存储物理序号", true),
    DELFLAG("delFlag", "del_flag", "int", "状态", true),
    REMARK("remark", "remark", "string", "备注", true),
    CLIENTDATE("clientDate", "client_date", "date", "采集日期", true),
    SERVERDATE("serverDate", "server_date", "date", "上传日期", true),
    SYNCDATE("syncDate", "sync_date", "date", "同步日期", false),
    PRIVACYCONFIGDM("privacyconfigDm", "privacyconfig_dm", "string", "加密状态代码", false),
    DATAFLAG("dataFlag", "data_flag", "int", "数据来源", false),
    VALIDFLAG("validFlag", "valid_flag", "int", "数据是否有效", false),
    PHONEVALUETYPENAME("phoneValueTypeName", "phone_value_type_name", "string", "通讯录字段类型名称", true),
    DATASOURCENAME("datasourceName", "datasource_name", "string", "数据来源名称", false),
    PRIVACYCONFIGNAME("privacyconfigName", "privacyconfig_name", "string", "加密状态名称", true),
    DWDSERVERDATE("dwdServerDate", "dwd_server_date", "date", "落dwd分区的时间", false),
    DWDSYNCDATE("dwdSyncDate", "dwd_sync_date", "date", "dwd层的变更时间", false),
    DWDOPTYPE("dwdOpType", "dwd_op_type", "string", "dwd操作类型", false),
    DWDVMD5("dwdVmd5", "dwd_vmd5", "string", "dwd的md5计算", false),
    DWDBATCH("dwdBatch", "dwd_batch", "string", "批次编号", false),
    DWDSOURCE("dwdSource", "dwd_source", "string", "数据来源", false),
    PINYIN("pinyin", "pinyin", "string", "姓名全拼", true),
    NAMEINITIAL("nameInitial", "name_initial", "string", "姓名首字母(默认为#)", true);


    private PhoneContactEnum(String vo, String column, String type, String name, boolean display) {
        this.vo = vo;
        this.column = column;
        this.type = type;
        this.name = name;
        this.display = display;
    }

    /**
     * 返回前端显示的column和name值的map集合
     *
     * @return map
     */
    public static Map<String, String> getColumnNameMap() {
        Map<String, String> map = new HashMap<String, String>();
        for (PhoneContactEnum enm : PhoneContactEnum.values()) {
            if(enm.display) map.put(enm.getColumn(), enm.getName());
        }
        return map;
    }

    public static String getcolumnByCode(String vo) {
        for (PhoneContactEnum enm : PhoneContactEnum.values()) {
            if (enm.getVo() == vo) {
                return enm.getColumn();
            }
        }
        return null;
    }

    /**
     * 根据type 获取相应的vo信息集合 type 可以为空
     *
     * @param type
     * @return
     */
    public static List<String> getVoList(String type) {
        List<String> list = new ArrayList<String>();
        for (PhoneContactEnum enm : PhoneContactEnum.values()) {
            if (StringUtils.isNotEmpty(type)) {
                if (enm.getType().equals(type)) {
                    list.add(enm.getVo());
                }
            } else {
                list.add(enm.getVo());
            }

        }
        return list;
    }

    /**
     * 根据type 获取相应的实体信息集合 type 可以为空
     *
     * @param type
     * @return
     */
    public static List<String> getColumnList(String type) {
        List<String> list = new ArrayList<String>();
        for (PhoneContactEnum enm : PhoneContactEnum.values()) {
            if (StringUtils.isNotEmpty(type)) {
                if (enm.getType().equals(type)) {
                    list.add(enm.getColumn());
                }
            } else {
                list.add(enm.getColumn());
            }

        }
        return list;
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
