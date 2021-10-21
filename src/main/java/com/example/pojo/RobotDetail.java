package com.example.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RobotDetail {
    private String exeDetailId;

    private String exeId;

    private String deptCode;

    private String itemId;

    private String itemName;

    private String speciality;

    private String itemLevel;

    private String itemType;

    private String projPlanClass;

    private Date cmplDate;

    private Date acceptDate;

    private String phase;

    private String indexCode;

    private String ruleId;

    private Date exeTime;

    private Short status;

    private String calValue;

    private Short warnLevel;

    private String userAssess;

    public String getExeDetailId() {
        return exeDetailId;
    }

    public void setExeDetailId(String exeDetailId) {
        this.exeDetailId = exeDetailId == null ? null : exeDetailId.trim();
    }

    public String getExeId() {
        return exeId;
    }

    public void setExeId(String exeId) {
        this.exeId = exeId == null ? null : exeId.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(String itemLevel) {
        this.itemLevel = itemLevel == null ? null : itemLevel.trim();
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType == null ? null : itemType.trim();
    }

    public String getProjPlanClass() {
        return projPlanClass;
    }

    public void setProjPlanClass(String projPlanClass) {
        this.projPlanClass = projPlanClass == null ? null : projPlanClass.trim();
    }

    public Date getCmplDate() {
        return cmplDate;
    }

    public void setCmplDate(Date cmplDate) {
        this.cmplDate = cmplDate;
    }

    public Date getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(Date acceptDate) {
        this.acceptDate = acceptDate;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase == null ? null : phase.trim();
    }

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode == null ? null : indexCode.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    public Date getExeTime() {
        return exeTime;
    }

    public void setExeTime(Date exeTime) {
        this.exeTime = exeTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getCalValue() {
        return calValue;
    }

    public void setCalValue(String calValue) {
        this.calValue = calValue == null ? null : calValue.trim();
    }

    public Short getWarnLevel() {
        return warnLevel;
    }

    public void setWarnLevel(Short warnLevel) {
        this.warnLevel = warnLevel;
    }

    public String getUserAssess() {
        return userAssess;
    }

    public void setUserAssess(String userAssess) {
        this.userAssess = userAssess == null ? null : userAssess.trim();
    }
}