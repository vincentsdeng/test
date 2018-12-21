package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudytrackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudytrackExample() {
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

        public Criteria andTrackIdIsNull() {
            addCriterion("TRACK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrackIdIsNotNull() {
            addCriterion("TRACK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrackIdEqualTo(BigDecimal value) {
            addCriterion("TRACK_ID =", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdNotEqualTo(BigDecimal value) {
            addCriterion("TRACK_ID <>", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdGreaterThan(BigDecimal value) {
            addCriterion("TRACK_ID >", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRACK_ID >=", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdLessThan(BigDecimal value) {
            addCriterion("TRACK_ID <", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRACK_ID <=", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdIn(List<BigDecimal> values) {
            addCriterion("TRACK_ID in", values, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdNotIn(List<BigDecimal> values) {
            addCriterion("TRACK_ID not in", values, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRACK_ID between", value1, value2, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRACK_ID not between", value1, value2, "trackId");
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

        public Criteria andStuIdEqualTo(BigDecimal value) {
            addCriterion("STU_ID =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(BigDecimal value) {
            addCriterion("STU_ID <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(BigDecimal value) {
            addCriterion("STU_ID >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_ID >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(BigDecimal value) {
            addCriterion("STU_ID <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_ID <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<BigDecimal> values) {
            addCriterion("STU_ID in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<BigDecimal> values) {
            addCriterion("STU_ID not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_ID between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_ID not between", value1, value2, "stuId");
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

        public Criteria andSubjectNoEqualTo(BigDecimal value) {
            addCriterion("SUBJECT_NO =", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotEqualTo(BigDecimal value) {
            addCriterion("SUBJECT_NO <>", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThan(BigDecimal value) {
            addCriterion("SUBJECT_NO >", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBJECT_NO >=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThan(BigDecimal value) {
            addCriterion("SUBJECT_NO <", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBJECT_NO <=", value, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoIn(List<BigDecimal> values) {
            addCriterion("SUBJECT_NO in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotIn(List<BigDecimal> values) {
            addCriterion("SUBJECT_NO not in", values, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBJECT_NO between", value1, value2, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andSubjectNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBJECT_NO not between", value1, value2, "subjectNo");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeIsNull() {
            addCriterion("TO_COMPANY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeIsNotNull() {
            addCriterion("TO_COMPANY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("TO_COMPANY_TIME =", value, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TO_COMPANY_TIME <>", value, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TO_COMPANY_TIME >", value, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TO_COMPANY_TIME >=", value, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeLessThan(Date value) {
            addCriterionForJDBCDate("TO_COMPANY_TIME <", value, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TO_COMPANY_TIME <=", value, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("TO_COMPANY_TIME in", values, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TO_COMPANY_TIME not in", values, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TO_COMPANY_TIME between", value1, value2, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andToCompanyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TO_COMPANY_TIME not between", value1, value2, "toCompanyTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusIsNull() {
            addCriterion("ATTENDANCE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusIsNotNull() {
            addCriterion("ATTENDANCE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusEqualTo(String value) {
            addCriterion("ATTENDANCE_STATUS =", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusNotEqualTo(String value) {
            addCriterion("ATTENDANCE_STATUS <>", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusGreaterThan(String value) {
            addCriterion("ATTENDANCE_STATUS >", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENDANCE_STATUS >=", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusLessThan(String value) {
            addCriterion("ATTENDANCE_STATUS <", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusLessThanOrEqualTo(String value) {
            addCriterion("ATTENDANCE_STATUS <=", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusLike(String value) {
            addCriterion("ATTENDANCE_STATUS like", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusNotLike(String value) {
            addCriterion("ATTENDANCE_STATUS not like", value, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusIn(List<String> values) {
            addCriterion("ATTENDANCE_STATUS in", values, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusNotIn(List<String> values) {
            addCriterion("ATTENDANCE_STATUS not in", values, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusBetween(String value1, String value2) {
            addCriterion("ATTENDANCE_STATUS between", value1, value2, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andAttendanceStatusNotBetween(String value1, String value2) {
            addCriterion("ATTENDANCE_STATUS not between", value1, value2, "attendanceStatus");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNull() {
            addCriterion("PERFORMANCE is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNotNull() {
            addCriterion("PERFORMANCE is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceEqualTo(String value) {
            addCriterion("PERFORMANCE =", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotEqualTo(String value) {
            addCriterion("PERFORMANCE <>", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThan(String value) {
            addCriterion("PERFORMANCE >", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("PERFORMANCE >=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThan(String value) {
            addCriterion("PERFORMANCE <", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThanOrEqualTo(String value) {
            addCriterion("PERFORMANCE <=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLike(String value) {
            addCriterion("PERFORMANCE like", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotLike(String value) {
            addCriterion("PERFORMANCE not like", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceIn(List<String> values) {
            addCriterion("PERFORMANCE in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotIn(List<String> values) {
            addCriterion("PERFORMANCE not in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceBetween(String value1, String value2) {
            addCriterion("PERFORMANCE between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotBetween(String value1, String value2) {
            addCriterion("PERFORMANCE not between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andTaskResponseIsNull() {
            addCriterion("TASK_RESPONSE is null");
            return (Criteria) this;
        }

        public Criteria andTaskResponseIsNotNull() {
            addCriterion("TASK_RESPONSE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskResponseEqualTo(String value) {
            addCriterion("TASK_RESPONSE =", value, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseNotEqualTo(String value) {
            addCriterion("TASK_RESPONSE <>", value, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseGreaterThan(String value) {
            addCriterion("TASK_RESPONSE >", value, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_RESPONSE >=", value, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseLessThan(String value) {
            addCriterion("TASK_RESPONSE <", value, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseLessThanOrEqualTo(String value) {
            addCriterion("TASK_RESPONSE <=", value, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseLike(String value) {
            addCriterion("TASK_RESPONSE like", value, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseNotLike(String value) {
            addCriterion("TASK_RESPONSE not like", value, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseIn(List<String> values) {
            addCriterion("TASK_RESPONSE in", values, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseNotIn(List<String> values) {
            addCriterion("TASK_RESPONSE not in", values, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseBetween(String value1, String value2) {
            addCriterion("TASK_RESPONSE between", value1, value2, "taskResponse");
            return (Criteria) this;
        }

        public Criteria andTaskResponseNotBetween(String value1, String value2) {
            addCriterion("TASK_RESPONSE not between", value1, value2, "taskResponse");
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