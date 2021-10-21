package com.example.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RobotDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RobotDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andExeDetailIdIsNull() {
            addCriterion("EXE_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdIsNotNull() {
            addCriterion("EXE_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdEqualTo(String value) {
            addCriterion("EXE_DETAIL_ID =", value, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdNotEqualTo(String value) {
            addCriterion("EXE_DETAIL_ID <>", value, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdGreaterThan(String value) {
            addCriterion("EXE_DETAIL_ID >", value, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXE_DETAIL_ID >=", value, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdLessThan(String value) {
            addCriterion("EXE_DETAIL_ID <", value, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdLessThanOrEqualTo(String value) {
            addCriterion("EXE_DETAIL_ID <=", value, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdLike(String value) {
            addCriterion("EXE_DETAIL_ID like", value, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdNotLike(String value) {
            addCriterion("EXE_DETAIL_ID not like", value, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdIn(List<String> values) {
            addCriterion("EXE_DETAIL_ID in", values, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdNotIn(List<String> values) {
            addCriterion("EXE_DETAIL_ID not in", values, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdBetween(String value1, String value2) {
            addCriterion("EXE_DETAIL_ID between", value1, value2, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeDetailIdNotBetween(String value1, String value2) {
            addCriterion("EXE_DETAIL_ID not between", value1, value2, "exeDetailId");
            return (Criteria) this;
        }

        public Criteria andExeIdIsNull() {
            addCriterion("EXE_ID is null");
            return (Criteria) this;
        }

        public Criteria andExeIdIsNotNull() {
            addCriterion("EXE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExeIdEqualTo(String value) {
            addCriterion("EXE_ID =", value, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdNotEqualTo(String value) {
            addCriterion("EXE_ID <>", value, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdGreaterThan(String value) {
            addCriterion("EXE_ID >", value, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXE_ID >=", value, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdLessThan(String value) {
            addCriterion("EXE_ID <", value, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdLessThanOrEqualTo(String value) {
            addCriterion("EXE_ID <=", value, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdLike(String value) {
            addCriterion("EXE_ID like", value, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdNotLike(String value) {
            addCriterion("EXE_ID not like", value, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdIn(List<String> values) {
            addCriterion("EXE_ID in", values, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdNotIn(List<String> values) {
            addCriterion("EXE_ID not in", values, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdBetween(String value1, String value2) {
            addCriterion("EXE_ID between", value1, value2, "exeId");
            return (Criteria) this;
        }

        public Criteria andExeIdNotBetween(String value1, String value2) {
            addCriterion("EXE_ID not between", value1, value2, "exeId");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("ITEM_ID like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("ITEM_ID not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("SPECIALITY is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("SPECIALITY is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("SPECIALITY =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("SPECIALITY <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("SPECIALITY >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIALITY >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("SPECIALITY <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("SPECIALITY <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("SPECIALITY like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("SPECIALITY not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("SPECIALITY in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("SPECIALITY not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("SPECIALITY between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("SPECIALITY not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andItemLevelIsNull() {
            addCriterion("ITEM_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andItemLevelIsNotNull() {
            addCriterion("ITEM_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andItemLevelEqualTo(String value) {
            addCriterion("ITEM_LEVEL =", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelNotEqualTo(String value) {
            addCriterion("ITEM_LEVEL <>", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelGreaterThan(String value) {
            addCriterion("ITEM_LEVEL >", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_LEVEL >=", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelLessThan(String value) {
            addCriterion("ITEM_LEVEL <", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelLessThanOrEqualTo(String value) {
            addCriterion("ITEM_LEVEL <=", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelLike(String value) {
            addCriterion("ITEM_LEVEL like", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelNotLike(String value) {
            addCriterion("ITEM_LEVEL not like", value, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelIn(List<String> values) {
            addCriterion("ITEM_LEVEL in", values, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelNotIn(List<String> values) {
            addCriterion("ITEM_LEVEL not in", values, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelBetween(String value1, String value2) {
            addCriterion("ITEM_LEVEL between", value1, value2, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemLevelNotBetween(String value1, String value2) {
            addCriterion("ITEM_LEVEL not between", value1, value2, "itemLevel");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("ITEM_TYPE =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("ITEM_TYPE <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("ITEM_TYPE >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_TYPE >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(String value) {
            addCriterion("ITEM_TYPE <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_TYPE <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLike(String value) {
            addCriterion("ITEM_TYPE like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotLike(String value) {
            addCriterion("ITEM_TYPE not like", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<String> values) {
            addCriterion("ITEM_TYPE in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<String> values) {
            addCriterion("ITEM_TYPE not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("ITEM_TYPE between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("ITEM_TYPE not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassIsNull() {
            addCriterion("PROJ_PLAN_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassIsNotNull() {
            addCriterion("PROJ_PLAN_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassEqualTo(String value) {
            addCriterion("PROJ_PLAN_CLASS =", value, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassNotEqualTo(String value) {
            addCriterion("PROJ_PLAN_CLASS <>", value, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassGreaterThan(String value) {
            addCriterion("PROJ_PLAN_CLASS >", value, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassGreaterThanOrEqualTo(String value) {
            addCriterion("PROJ_PLAN_CLASS >=", value, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassLessThan(String value) {
            addCriterion("PROJ_PLAN_CLASS <", value, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassLessThanOrEqualTo(String value) {
            addCriterion("PROJ_PLAN_CLASS <=", value, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassLike(String value) {
            addCriterion("PROJ_PLAN_CLASS like", value, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassNotLike(String value) {
            addCriterion("PROJ_PLAN_CLASS not like", value, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassIn(List<String> values) {
            addCriterion("PROJ_PLAN_CLASS in", values, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassNotIn(List<String> values) {
            addCriterion("PROJ_PLAN_CLASS not in", values, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassBetween(String value1, String value2) {
            addCriterion("PROJ_PLAN_CLASS between", value1, value2, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andProjPlanClassNotBetween(String value1, String value2) {
            addCriterion("PROJ_PLAN_CLASS not between", value1, value2, "projPlanClass");
            return (Criteria) this;
        }

        public Criteria andCmplDateIsNull() {
            addCriterion("CMPL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCmplDateIsNotNull() {
            addCriterion("CMPL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCmplDateEqualTo(Date value) {
            addCriterionForJDBCDate("CMPL_DATE =", value, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andCmplDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CMPL_DATE <>", value, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andCmplDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CMPL_DATE >", value, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andCmplDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CMPL_DATE >=", value, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andCmplDateLessThan(Date value) {
            addCriterionForJDBCDate("CMPL_DATE <", value, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andCmplDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CMPL_DATE <=", value, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andCmplDateIn(List<Date> values) {
            addCriterionForJDBCDate("CMPL_DATE in", values, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andCmplDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CMPL_DATE not in", values, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andCmplDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CMPL_DATE between", value1, value2, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andCmplDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CMPL_DATE not between", value1, value2, "cmplDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNull() {
            addCriterion("ACCEPT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIsNotNull() {
            addCriterion("ACCEPT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptDateEqualTo(Date value) {
            addCriterionForJDBCDate("ACCEPT_DATE =", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACCEPT_DATE <>", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACCEPT_DATE >", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCEPT_DATE >=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThan(Date value) {
            addCriterionForJDBCDate("ACCEPT_DATE <", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACCEPT_DATE <=", value, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateIn(List<Date> values) {
            addCriterionForJDBCDate("ACCEPT_DATE in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACCEPT_DATE not in", values, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCEPT_DATE between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andAcceptDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACCEPT_DATE not between", value1, value2, "acceptDate");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNull() {
            addCriterion("PHASE is null");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNotNull() {
            addCriterion("PHASE is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseEqualTo(String value) {
            addCriterion("PHASE =", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotEqualTo(String value) {
            addCriterion("PHASE <>", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThan(String value) {
            addCriterion("PHASE >", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThanOrEqualTo(String value) {
            addCriterion("PHASE >=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThan(String value) {
            addCriterion("PHASE <", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThanOrEqualTo(String value) {
            addCriterion("PHASE <=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLike(String value) {
            addCriterion("PHASE like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotLike(String value) {
            addCriterion("PHASE not like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseIn(List<String> values) {
            addCriterion("PHASE in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotIn(List<String> values) {
            addCriterion("PHASE not in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseBetween(String value1, String value2) {
            addCriterion("PHASE between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotBetween(String value1, String value2) {
            addCriterion("PHASE not between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIsNull() {
            addCriterion("INDEX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIsNotNull() {
            addCriterion("INDEX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIndexCodeEqualTo(String value) {
            addCriterion("INDEX_CODE =", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotEqualTo(String value) {
            addCriterion("INDEX_CODE <>", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeGreaterThan(String value) {
            addCriterion("INDEX_CODE >", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_CODE >=", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLessThan(String value) {
            addCriterion("INDEX_CODE <", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLessThanOrEqualTo(String value) {
            addCriterion("INDEX_CODE <=", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLike(String value) {
            addCriterion("INDEX_CODE like", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotLike(String value) {
            addCriterion("INDEX_CODE not like", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIn(List<String> values) {
            addCriterion("INDEX_CODE in", values, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotIn(List<String> values) {
            addCriterion("INDEX_CODE not in", values, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeBetween(String value1, String value2) {
            addCriterion("INDEX_CODE between", value1, value2, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotBetween(String value1, String value2) {
            addCriterion("INDEX_CODE not between", value1, value2, "indexCode");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNull() {
            addCriterion("RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(String value) {
            addCriterion("RULE_ID =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(String value) {
            addCriterion("RULE_ID <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(String value) {
            addCriterion("RULE_ID >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("RULE_ID >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(String value) {
            addCriterion("RULE_ID <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(String value) {
            addCriterion("RULE_ID <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLike(String value) {
            addCriterion("RULE_ID like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotLike(String value) {
            addCriterion("RULE_ID not like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<String> values) {
            addCriterion("RULE_ID in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<String> values) {
            addCriterion("RULE_ID not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(String value1, String value2) {
            addCriterion("RULE_ID between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(String value1, String value2) {
            addCriterion("RULE_ID not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andExeTimeIsNull() {
            addCriterion("EXE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExeTimeIsNotNull() {
            addCriterion("EXE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExeTimeEqualTo(Date value) {
            addCriterion("EXE_TIME =", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeNotEqualTo(Date value) {
            addCriterion("EXE_TIME <>", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeGreaterThan(Date value) {
            addCriterion("EXE_TIME >", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXE_TIME >=", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeLessThan(Date value) {
            addCriterion("EXE_TIME <", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeLessThanOrEqualTo(Date value) {
            addCriterion("EXE_TIME <=", value, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeIn(List<Date> values) {
            addCriterion("EXE_TIME in", values, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeNotIn(List<Date> values) {
            addCriterion("EXE_TIME not in", values, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeBetween(Date value1, Date value2) {
            addCriterion("EXE_TIME between", value1, value2, "exeTime");
            return (Criteria) this;
        }

        public Criteria andExeTimeNotBetween(Date value1, Date value2) {
            addCriterion("EXE_TIME not between", value1, value2, "exeTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCalValueIsNull() {
            addCriterion("CAL_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCalValueIsNotNull() {
            addCriterion("CAL_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCalValueEqualTo(String value) {
            addCriterion("CAL_VALUE =", value, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueNotEqualTo(String value) {
            addCriterion("CAL_VALUE <>", value, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueGreaterThan(String value) {
            addCriterion("CAL_VALUE >", value, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueGreaterThanOrEqualTo(String value) {
            addCriterion("CAL_VALUE >=", value, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueLessThan(String value) {
            addCriterion("CAL_VALUE <", value, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueLessThanOrEqualTo(String value) {
            addCriterion("CAL_VALUE <=", value, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueLike(String value) {
            addCriterion("CAL_VALUE like", value, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueNotLike(String value) {
            addCriterion("CAL_VALUE not like", value, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueIn(List<String> values) {
            addCriterion("CAL_VALUE in", values, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueNotIn(List<String> values) {
            addCriterion("CAL_VALUE not in", values, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueBetween(String value1, String value2) {
            addCriterion("CAL_VALUE between", value1, value2, "calValue");
            return (Criteria) this;
        }

        public Criteria andCalValueNotBetween(String value1, String value2) {
            addCriterion("CAL_VALUE not between", value1, value2, "calValue");
            return (Criteria) this;
        }

        public Criteria andWarnLevelIsNull() {
            addCriterion("WARN_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andWarnLevelIsNotNull() {
            addCriterion("WARN_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andWarnLevelEqualTo(Short value) {
            addCriterion("WARN_LEVEL =", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelNotEqualTo(Short value) {
            addCriterion("WARN_LEVEL <>", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelGreaterThan(Short value) {
            addCriterion("WARN_LEVEL >", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("WARN_LEVEL >=", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelLessThan(Short value) {
            addCriterion("WARN_LEVEL <", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelLessThanOrEqualTo(Short value) {
            addCriterion("WARN_LEVEL <=", value, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelIn(List<Short> values) {
            addCriterion("WARN_LEVEL in", values, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelNotIn(List<Short> values) {
            addCriterion("WARN_LEVEL not in", values, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelBetween(Short value1, Short value2) {
            addCriterion("WARN_LEVEL between", value1, value2, "warnLevel");
            return (Criteria) this;
        }

        public Criteria andWarnLevelNotBetween(Short value1, Short value2) {
            addCriterion("WARN_LEVEL not between", value1, value2, "warnLevel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}