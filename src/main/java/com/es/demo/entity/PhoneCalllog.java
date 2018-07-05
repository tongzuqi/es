package com.es.demo.entity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class PhoneCalllog {

    private String id;//主键(uuid)

    private String personId;//关联机主(t_person)表id

    private String msisdn;//本机号码

    private String phonenum;//通话号码

    private String relationshipName;//联系人姓名

    private String calltime;//通话时间

    private String endTime;//通话结束时间

    private Double duration;//通话时长(秒)

    private String statusDm;//通话状态代码

    private String localActionDm;//本地动作代码

    private Integer datasourceDm;//数据来源代码

    private Integer physeq;//通话记录物理存储序号

    private Integer delFlag;//状态(0：正常，1：从已删除恢复)

    private String remark;//备注

    private Date clientDate;//采集日期

    private Date serverDate;//上传日期

    private Date syncDate;//同步日期

    private String privacyconfigDm;//加密状态代码

    private String attribution;//对方手机号码归属

    private Integer dataFlag;//数据来源：0：金诺数据；1：蛛网数据；2：第三方数据

    private Integer validFlag;//数据是否有效：1 代表有效；0 代表无效

    private String statusName;//通话状态名称

    private String localActionName;//本地动作名称

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

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn == null ? null : msisdn.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName == null ? null : relationshipName.trim();
    }

    public String getCalltime() {
        return calltime;
    }

    public void setCalltime(String calltime) {
        this.calltime = calltime == null ? null : calltime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getStatusDm() {
        return statusDm;
    }

    public void setStatusDm(String statusDm) {
        this.statusDm = statusDm == null ? null : statusDm.trim();
    }

    public String getLocalActionDm() {
        return localActionDm;
    }

    public void setLocalActionDm(String localActionDm) {
        this.localActionDm = localActionDm == null ? null : localActionDm.trim();
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

    public String getAttribution() {
        return attribution;
    }

    public void setAttribution(String attribution) {
        this.attribution = attribution == null ? null : attribution.trim();
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

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    public String getLocalActionName() {
        return localActionName;
    }

    public void setLocalActionName(String localActionName) {
        this.localActionName = localActionName == null ? null : localActionName.trim();
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