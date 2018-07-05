package com.es.demo.entity;

import java.util.Date;

public class PhoneContact {
    private String id;//主键(uuid)

    private String personId;//关联机主(t_person)表id

    private String name;//姓名

    private String phoneValueTypeDm;//通讯录字段类型代码

    private String phoneNumberType;//通讯录字段标签，手机、家庭、工作等系统内置或自定义的字段标签，无则为空，字段类型为群组时字段标签也为空

    private String phonenum;//电话号码

    private Integer datasourceDm;//数据来源代码

    private Integer physeq;//通讯录存储物理序号

    private Integer delFlag;//状态(0：正常，1：从已删除恢复)

    private String remark;//备注

    private Date clientDate;//采集日期

    private Date serverDate;//上传日期

    private Date syncDate;//同步日期

    private String privacyconfigDm;//加密状态代码

    private Integer dataFlag;//数据来源：0：金诺数据；1：蛛网数据；2：第三方数据

    private Integer validFlag;//数据是否有效：1 代表有效；0 代表无效

    private String phoneValueTypeName;//通讯录字段类型名称

    private String datasourceName;//数据来源名称

    private String privacyconfigName;//加密状态名称

    private Date dwdServerDate;//落dwd分区的时间

    private Date dwdSyncDate;//dwd层的变更时间

    private String dwdOpType;//dwd操作类型

    private String dwdVmd5;//dwd的md5计算

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhoneValueTypeDm() {
        return phoneValueTypeDm;
    }

    public void setPhoneValueTypeDm(String phoneValueTypeDm) {
        this.phoneValueTypeDm = phoneValueTypeDm == null ? null : phoneValueTypeDm.trim();
    }

    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType == null ? null : phoneNumberType.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public Integer getDatasourceDm() {
        return datasourceDm;
    }

    public void setDatasourceDm(Integer datasourceDm) {
        this.datasourceDm = datasourceDm;
    }

    public Integer getPhyseq() {
        return physeq;
    }

    public void setPhyseq(Integer physeq) {
        this.physeq = physeq;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getClientDate() {
        return clientDate;
    }

    public void setClientDate(Date clientDate) {
        this.clientDate = clientDate;
    }

    public Date getServerDate() {
        return serverDate;
    }

    public void setServerDate(Date serverDate) {
        this.serverDate = serverDate;
    }

    public Date getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(Date syncDate) {
        this.syncDate = syncDate;
    }

    public String getPrivacyconfigDm() {
        return privacyconfigDm;
    }

    public void setPrivacyconfigDm(String privacyconfigDm) {
        this.privacyconfigDm = privacyconfigDm == null ? null : privacyconfigDm.trim();
    }

    public Integer getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(Integer dataFlag) {
        this.dataFlag = dataFlag;
    }

    public Integer getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Integer validFlag) {
        this.validFlag = validFlag;
    }

    public String getPhoneValueTypeName() {
        return phoneValueTypeName;
    }

    public void setPhoneValueTypeName(String phoneValueTypeName) {
        this.phoneValueTypeName = phoneValueTypeName == null ? null : phoneValueTypeName.trim();
    }

    public String getDatasourceName() {
        return datasourceName;
    }

    public void setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName == null ? null : datasourceName.trim();
    }

    public String getPrivacyconfigName() {
        return privacyconfigName;
    }

    public void setPrivacyconfigName(String privacyconfigName) {
        this.privacyconfigName = privacyconfigName == null ? null : privacyconfigName.trim();
    }

    public Date getDwdServerDate() {
        return dwdServerDate;
    }

    public void setDwdServerDate(Date dwdServerDate) {
        this.dwdServerDate = dwdServerDate;
    }

    public Date getDwdSyncDate() {
        return dwdSyncDate;
    }

    public void setDwdSyncDate(Date dwdSyncDate) {
        this.dwdSyncDate = dwdSyncDate;
    }

    public String getDwdOpType() {
        return dwdOpType;
    }

    public void setDwdOpType(String dwdOpType) {
        this.dwdOpType = dwdOpType == null ? null : dwdOpType.trim();
    }

    public String getDwdVmd5() {
        return dwdVmd5;
    }

    public void setDwdVmd5(String dwdVmd5) {
        this.dwdVmd5 = dwdVmd5 == null ? null : dwdVmd5.trim();
    }
}