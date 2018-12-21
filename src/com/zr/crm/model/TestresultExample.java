package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestresultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestresultExample() {
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

        public Criteria andTestNoIsNull() {
            addCriterion("TEST_NO is null");
            return (Criteria) this;
        }

        public Criteria andTestNoIsNotNull() {
            addCriterion("TEST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTestNoEqualTo(Long value) {
            addCriterion("TEST_NO =", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoNotEqualTo(Long value) {
            addCriterion("TEST_NO <>", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoGreaterThan(Long value) {
            addCriterion("TEST_NO >", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoGreaterThanOrEqualTo(Long value) {
            addCriterion("TEST_NO >=", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoLessThan(Long value) {
            addCriterion("TEST_NO <", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoLessThanOrEqualTo(Long value) {
            addCriterion("TEST_NO <=", value, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoIn(List<Long> values) {
            addCriterion("TEST_NO in", values, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoNotIn(List<Long> values) {
            addCriterion("TEST_NO not in", values, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoBetween(Long value1, Long value2) {
            addCriterion("TEST_NO between", value1, value2, "testNo");
            return (Criteria) this;
        }

        public Criteria andTestNoNotBetween(Long value1, Long value2) {
            addCriterion("TEST_NO not between", value1, value2, "testNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIsNull() {
            addCriterion("SUBJECT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIsNotNull() {
            addCriterion("SUBJECT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNoEqualTo(Long value) {
            addCriterion("SUBJECT_NO =", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotEqualTo(Long value) {
            addCriterion("SUBJECT_NO <>", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThan(Long value) {
            addCriterion("SUBJECT_NO >", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThanOrEqualTo(Long value) {
            addCriterion("SUBJECT_NO >=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThan(Long value) {
            addCriterion("SUBJECT_NO <", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThanOrEqualTo(Long value) {
            addCriterion("SUBJECT_NO <=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIn(List<Long> values) {
            addCriterion("SUBJECT_NO in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotIn(List<Long> values) {
            addCriterion("SUBJECT_NO not in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoBetween(Long value1, Long value2) {
            addCriterion("SUBJECT_NO between", value1, value2, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotBetween(Long value1, Long value2) {
            addCriterion("SUBJECT_NO not between", value1, value2, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNull() {
            addCriterion("STU_ID is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("STU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Long value) {
            addCriterion("STU_ID =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Long value) {
            addCriterion("STU_ID <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Long value) {
            addCriterion("STU_ID >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STU_ID >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Long value) {
            addCriterion("STU_ID <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Long value) {
            addCriterion("STU_ID <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Long> values) {
            addCriterion("STU_ID in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Long> values) {
            addCriterion("STU_ID not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Long value1, Long value2) {
            addCriterion("STU_ID between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Long value1, Long value2) {
            addCriterion("STU_ID not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNull() {
            addCriterion("TEST_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andTestScoreIsNotNull() {
            addCriterion("TEST_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andTestScoreEqualTo(BigDecimal value) {
            addCriterion("TEST_SCORE =", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotEqualTo(BigDecimal value) {
            addCriterion("TEST_SCORE <>", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThan(BigDecimal value) {
            addCriterion("TEST_SCORE >", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEST_SCORE >=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThan(BigDecimal value) {
            addCriterion("TEST_SCORE <", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEST_SCORE <=", value, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreIn(List<BigDecimal> values) {
            addCriterion("TEST_SCORE in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotIn(List<BigDecimal> values) {
            addCriterion("TEST_SCORE not in", values, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEST_SCORE between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEST_SCORE not between", value1, value2, "testScore");
            return (Criteria) this;
        }

        public Criteria andTestStatusIsNull() {
            addCriterion("TEST_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTestStatusIsNotNull() {
            addCriterion("TEST_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTestStatusEqualTo(String value) {
            addCriterion("TEST_STATUS =", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusNotEqualTo(String value) {
            addCriterion("TEST_STATUS <>", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusGreaterThan(String value) {
            addCriterion("TEST_STATUS >", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_STATUS >=", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusLessThan(String value) {
            addCriterion("TEST_STATUS <", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusLessThanOrEqualTo(String value) {
            addCriterion("TEST_STATUS <=", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusLike(String value) {
            addCriterion("TEST_STATUS like", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusNotLike(String value) {
            addCriterion("TEST_STATUS not like", value, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusIn(List<String> values) {
            addCriterion("TEST_STATUS in", values, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusNotIn(List<String> values) {
            addCriterion("TEST_STATUS not in", values, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusBetween(String value1, String value2) {
            addCriterion("TEST_STATUS between", value1, value2, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestStatusNotBetween(String value1, String value2) {
            addCriterion("TEST_STATUS not between", value1, value2, "testStatus");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNull() {
            addCriterion("TEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNotNull() {
            addCriterion("TEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTestTimeEqualTo(Date value) {
            addCriterionForJDBCDate("TEST_TIME =", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TEST_TIME <>", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TEST_TIME >", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEST_TIME >=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThan(Date value) {
            addCriterionForJDBCDate("TEST_TIME <", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TEST_TIME <=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeIn(List<Date> values) {
            addCriterionForJDBCDate("TEST_TIME in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TEST_TIME not in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEST_TIME between", value1, value2, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TEST_TIME not between", value1, value2, "testTime");
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