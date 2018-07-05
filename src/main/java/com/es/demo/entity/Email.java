package com.es.demo.entity;

import java.util.Date;

public class Email {
    private String id;//主键(uuid)

    private String accountId;//邮箱帐号表id

    private String mailFrom;//邮箱地址和名字(使用如下格式 "name"<abc@domain.com>

    private String mailTo;//邮箱地址和名字(使用如下格式 "name"<abc@domain.com> 多个地址用逗号隔开 )

    private String cc;//邮箱地址和名字(使用如下格式 "name"<abc@domain.com> 多个地址用逗号隔开 )

    private String bcc;//邮箱地址和名字(使用如下格式 "name"<abc@domain.com> 多个地址用逗号隔开 )

    private String subject;//邮件主题

    private String content;//邮件内容

    private String bodypath;//html邮件内容的相对存放路径(相对于数据库文件路径), 包括了文件名.

    private Date senddate;//时间((yyyy-mm-dd hh24:mm:ss)) 对于收到的邮件为接收时间, 对于发出的邮件为发送时间,  草稿等则为最后修改的时间

    private Integer mailSaveFolderDm;//所在的邮箱位置代码

    private Integer isread;//该邮件是否已读，0:未读1:已读9:其他

    private Integer delFlag;//状态(0：正常，1：从已删除恢复)

    private String remark;//备注

    private Date clientDate;//采集日期

    private Date serverDate;//上传日期

    private Date syncDate;//同步日期

    private Integer appType;//应用类型

    private Integer dataFlag;//数据来源：0：金诺数据；1：蛛网数据；2：第三方数据

    private Integer validFlag;//数据是否有效：1 代表有效；0 代表无效

    private String mailSaveFolderName;//所在的邮箱位置名称

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

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getMailFrom() {
        return mailFrom;
    }

    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom == null ? null : mailFrom.trim();
    }

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo == null ? null : mailTo.trim();
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc == null ? null : cc.trim();
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc == null ? null : bcc.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getBodypath() {
        return bodypath;
    }

    public void setBodypath(String bodypath) {
        this.bodypath = bodypath == null ? null : bodypath.trim();
    }

    public Date getSenddate() {
        return senddate;
    }

    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    public Integer getMailSaveFolderDm() {
        return mailSaveFolderDm;
    }

    public void setMailSaveFolderDm(Integer mailSaveFolderDm) {
        this.mailSaveFolderDm = mailSaveFolderDm;
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
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

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
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

    public String getMailSaveFolderName() {
        return mailSaveFolderName;
    }

    public void setMailSaveFolderName(String mailSaveFolderName) {
        this.mailSaveFolderName = mailSaveFolderName == null ? null : mailSaveFolderName.trim();
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