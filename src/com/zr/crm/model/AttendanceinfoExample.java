package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendanceinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceinfoExample() {
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

        public Criteria andAttendanceTimeIsNull() {
            addCriterion("ATTENDANCE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeIsNotNull() {
            addCriterion("ATTENDANCE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ATTENDANCE_TIME =", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ATTENDANCE_TIME <>", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ATTENDANCE_TIME >", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ATTENDANCE_TIME >=", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeLessThan(Date value) {
            addCriterionForJDBCDate("ATTENDANCE_TIME <", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ATTENDANCE_TIME <=", value, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ATTENDANCE_TIME in", values, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ATTENDANCE_TIME not in", values, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ATTENDANCE_TIME between", value1, value2, "attendanceTime");
            return (Criteria) this;
        }

        public Criteria andAttendanceTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ATTENDANCE_TIME not between", value1, value2, "attendanceTime");
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