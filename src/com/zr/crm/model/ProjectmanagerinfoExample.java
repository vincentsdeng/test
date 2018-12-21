package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectmanagerinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectmanagerinfoExample() {
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

        public Criteria andPrjMngIdIsNull() {
            addCriterion("PRJ_MNG_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdIsNotNull() {
            addCriterion("PRJ_MNG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdEqualTo(BigDecimal value) {
            addCriterion("PRJ_MNG_ID =", value, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdNotEqualTo(BigDecimal value) {
            addCriterion("PRJ_MNG_ID <>", value, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdGreaterThan(BigDecimal value) {
            addCriterion("PRJ_MNG_ID >", value, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRJ_MNG_ID >=", value, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdLessThan(BigDecimal value) {
            addCriterion("PRJ_MNG_ID <", value, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRJ_MNG_ID <=", value, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdIn(List<BigDecimal> values) {
            addCriterion("PRJ_MNG_ID in", values, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdNotIn(List<BigDecimal> values) {
            addCriterion("PRJ_MNG_ID not in", values, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRJ_MNG_ID between", value1, value2, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRJ_MNG_ID not between", value1, value2, "prjMngId");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameIsNull() {
            addCriterion("PRJ_MNG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameIsNotNull() {
            addCriterion("PRJ_MNG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameEqualTo(String value) {
            addCriterion("PRJ_MNG_NAME =", value, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameNotEqualTo(String value) {
            addCriterion("PRJ_MNG_NAME <>", value, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameGreaterThan(String value) {
            addCriterion("PRJ_MNG_NAME >", value, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRJ_MNG_NAME >=", value, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameLessThan(String value) {
            addCriterion("PRJ_MNG_NAME <", value, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameLessThanOrEqualTo(String value) {
            addCriterion("PRJ_MNG_NAME <=", value, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameLike(String value) {
            addCriterion("PRJ_MNG_NAME like", value, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameNotLike(String value) {
            addCriterion("PRJ_MNG_NAME not like", value, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameIn(List<String> values) {
            addCriterion("PRJ_MNG_NAME in", values, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameNotIn(List<String> values) {
            addCriterion("PRJ_MNG_NAME not in", values, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameBetween(String value1, String value2) {
            addCriterion("PRJ_MNG_NAME between", value1, value2, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngNameNotBetween(String value1, String value2) {
            addCriterion("PRJ_MNG_NAME not between", value1, value2, "prjMngName");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorIsNull() {
            addCriterion("PRJ_MNG_MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorIsNotNull() {
            addCriterion("PRJ_MNG_MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorEqualTo(String value) {
            addCriterion("PRJ_MNG_MAJOR =", value, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorNotEqualTo(String value) {
            addCriterion("PRJ_MNG_MAJOR <>", value, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorGreaterThan(String value) {
            addCriterion("PRJ_MNG_MAJOR >", value, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorGreaterThanOrEqualTo(String value) {
            addCriterion("PRJ_MNG_MAJOR >=", value, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorLessThan(String value) {
            addCriterion("PRJ_MNG_MAJOR <", value, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorLessThanOrEqualTo(String value) {
            addCriterion("PRJ_MNG_MAJOR <=", value, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorLike(String value) {
            addCriterion("PRJ_MNG_MAJOR like", value, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorNotLike(String value) {
            addCriterion("PRJ_MNG_MAJOR not like", value, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorIn(List<String> values) {
            addCriterion("PRJ_MNG_MAJOR in", values, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorNotIn(List<String> values) {
            addCriterion("PRJ_MNG_MAJOR not in", values, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorBetween(String value1, String value2) {
            addCriterion("PRJ_MNG_MAJOR between", value1, value2, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngMajorNotBetween(String value1, String value2) {
            addCriterion("PRJ_MNG_MAJOR not between", value1, value2, "prjMngMajor");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsIsNull() {
            addCriterion("PRJ_MNG_YEARS is null");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsIsNotNull() {
            addCriterion("PRJ_MNG_YEARS is not null");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsEqualTo(BigDecimal value) {
            addCriterion("PRJ_MNG_YEARS =", value, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsNotEqualTo(BigDecimal value) {
            addCriterion("PRJ_MNG_YEARS <>", value, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsGreaterThan(BigDecimal value) {
            addCriterion("PRJ_MNG_YEARS >", value, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRJ_MNG_YEARS >=", value, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsLessThan(BigDecimal value) {
            addCriterion("PRJ_MNG_YEARS <", value, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRJ_MNG_YEARS <=", value, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsIn(List<BigDecimal> values) {
            addCriterion("PRJ_MNG_YEARS in", values, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsNotIn(List<BigDecimal> values) {
            addCriterion("PRJ_MNG_YEARS not in", values, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRJ_MNG_YEARS between", value1, value2, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngYearsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRJ_MNG_YEARS not between", value1, value2, "prjMngYears");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinIsNull() {
            addCriterion("PRJ_MNG_JOIN is null");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinIsNotNull() {
            addCriterion("PRJ_MNG_JOIN is not null");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinEqualTo(Date value) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN =", value, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinNotEqualTo(Date value) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN <>", value, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinGreaterThan(Date value) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN >", value, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN >=", value, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinLessThan(Date value) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN <", value, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN <=", value, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinIn(List<Date> values) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN in", values, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinNotIn(List<Date> values) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN not in", values, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN between", value1, value2, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andPrjMngJoinNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRJ_MNG_JOIN not between", value1, value2, "prjMngJoin");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeIsNull() {
            addCriterion("CRETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreteTimeIsNotNull() {
            addCriterion("CRETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreteTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CRETE_TIME =", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CRETE_TIME <>", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CRETE_TIME >", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRETE_TIME >=", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeLessThan(Date value) {
            addCriterionForJDBCDate("CRETE_TIME <", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRETE_TIME <=", value, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CRETE_TIME in", values, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CRETE_TIME not in", values, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRETE_TIME between", value1, value2, "creteTime");
            return (Criteria) this;
        }

        public Criteria andCreteTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRETE_TIME not between", value1, value2, "creteTime");
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