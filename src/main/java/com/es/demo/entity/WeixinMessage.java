package com.es.demo.entity;

import java.util.Date;

public class WeixinMessage {
    private String id;

    private String profileId;

    private Long msgid;

    private Integer typeDm;

    private String localActionDm;

    private String createtime;

    private String otherid;

    private String groupName;

    private String senderid;

    private String sendername;

    private String content;

    private String filepath;

    private String prewpath;

    private Integer timelength;

    private Long msgtype;

    private String swechatid;

    private Integer delFlag;

    private String remark;

    private Date clientDate;

    private Date serverDate;

    private Date syncDate;

    private Integer dataFlag;

    private Integer validFlag;

    private String typeName;

    private String localActionName;

    private Date dwdServerDate;

    private Date dwdSyncDate;

    private String dwdOpType;

    private String dwdVmd5;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId == null ? null : profileId.trim();
    }

    public Long getMsgid() {
        return msgid;
    }

    public void setMsgid(Long msgid) {
        this.msgid = msgid;
    }

    public Integer getTypeDm() {
        return typeDm;
    }

    public void setTypeDm(Integer typeDm) {
        this.typeDm = typeDm;
    }

    public String getLocalActionDm() {
        return localActionDm;
    }

    public void setLocalActionDm(String localActionDm) {
        this.localActionDm = localActionDm == null ? null : localActionDm.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getOtherid() {
        return otherid;
    }

    public void setOtherid(String otherid) {
        this.otherid = otherid == null ? null : otherid.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid == null ? null : senderid.trim();
    }

    public String getSendername() {
        return sendername;
    }

    public void setSendername(String sendername) {
        this.sendername = sendername == null ? null : sendername.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath == null ? null : filepath.trim();
    }

    public String getPrewpath() {
        return prewpath;
    }

    public void setPrewpath(String prewpath) {
        this.prewpath = prewpath == null ? null : prewpath.trim();
    }

    public Integer getTimelength() {
        return timelength;
    }

    public void setTimelength(Integer timelength) {
        this.timelength = timelength;
    }

    public Long getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(Long msgtype) {
        this.msgtype = msgtype;
    }

    public String getSwechatid() {
        return swechatid;
    }

    public void setSwechatid(String swechatid) {
        this.swechatid = swechatid == null ? null : swechatid.trim();
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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getLocalActionName() {
        return localActionName;
    }

    public void setLocalActionName(String localActionName) {
        this.localActionName = localActionName == null ? null : localActionName.trim();
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