package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectinfoExample() {
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

        public Criteria andPriNoIsNull() {
            addCriterion("PRI_NO is null");
            return (Criteria) this;
        }

        public Criteria andPriNoIsNotNull() {
            addCriterion("PRI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPriNoEqualTo(BigDecimal value) {
            addCriterion("PRI_NO =", value, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriNoNotEqualTo(BigDecimal value) {
            addCriterion("PRI_NO <>", value, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriNoGreaterThan(BigDecimal value) {
            addCriterion("PRI_NO >", value, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRI_NO >=", value, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriNoLessThan(BigDecimal value) {
            addCriterion("PRI_NO <", value, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRI_NO <=", value, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriNoIn(List<BigDecimal> values) {
            addCriterion("PRI_NO in", values, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriNoNotIn(List<BigDecimal> values) {
            addCriterion("PRI_NO not in", values, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRI_NO between", value1, value2, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRI_NO not between", value1, value2, "priNo");
            return (Criteria) this;
        }

        public Criteria andPriTypeIsNull() {
            addCriterion("PRI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPriTypeIsNotNull() {
            addCriterion("PRI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPriTypeEqualTo(String value) {
            addCriterion("PRI_TYPE =", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeNotEqualTo(String value) {
            addCriterion("PRI_TYPE <>", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeGreaterThan(String value) {
            addCriterion("PRI_TYPE >", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRI_TYPE >=", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeLessThan(String value) {
            addCriterion("PRI_TYPE <", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeLessThanOrEqualTo(String value) {
            addCriterion("PRI_TYPE <=", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeLike(String value) {
            addCriterion("PRI_TYPE like", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeNotLike(String value) {
            addCriterion("PRI_TYPE not like", value, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeIn(List<String> values) {
            addCriterion("PRI_TYPE in", values, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeNotIn(List<String> values) {
            addCriterion("PRI_TYPE not in", values, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeBetween(String value1, String value2) {
            addCriterion("PRI_TYPE between", value1, value2, "priType");
            return (Criteria) this;
        }

        public Criteria andPriTypeNotBetween(String value1, String value2) {
            addCriterion("PRI_TYPE not between", value1, value2, "priType");
            return (Criteria) this;
        }

        public Criteria andPriLocationIsNull() {
            addCriterion("PRI_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andPriLocationIsNotNull() {
            addCriterion("PRI_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andPriLocationEqualTo(String value) {
            addCriterion("PRI_LOCATION =", value, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationNotEqualTo(String value) {
            addCriterion("PRI_LOCATION <>", value, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationGreaterThan(String value) {
            addCriterion("PRI_LOCATION >", value, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationGreaterThanOrEqualTo(String value) {
            addCriterion("PRI_LOCATION >=", value, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationLessThan(String value) {
            addCriterion("PRI_LOCATION <", value, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationLessThanOrEqualTo(String value) {
            addCriterion("PRI_LOCATION <=", value, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationLike(String value) {
            addCriterion("PRI_LOCATION like", value, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationNotLike(String value) {
            addCriterion("PRI_LOCATION not like", value, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationIn(List<String> values) {
            addCriterion("PRI_LOCATION in", values, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationNotIn(List<String> values) {
            addCriterion("PRI_LOCATION not in", values, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationBetween(String value1, String value2) {
            addCriterion("PRI_LOCATION between", value1, value2, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriLocationNotBetween(String value1, String value2) {
            addCriterion("PRI_LOCATION not between", value1, value2, "priLocation");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeIsNull() {
            addCriterion("PRI_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeIsNotNull() {
            addCriterion("PRI_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PRI_START_TIME =", value, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PRI_START_TIME <>", value, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PRI_START_TIME >", value, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRI_START_TIME >=", value, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("PRI_START_TIME <", value, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRI_START_TIME <=", value, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PRI_START_TIME in", values, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PRI_START_TIME not in", values, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRI_START_TIME between", value1, value2, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRI_START_TIME not between", value1, value2, "priStartTime");
            return (Criteria) this;
        }

        public Criteria andPriAssistantIsNull() {
            addCriterion("PRI_ASSISTANT is null");
            return (Criteria) this;
        }

        public Criteria andPriAssistantIsNotNull() {
            addCriterion("PRI_ASSISTANT is not null");
            return (Criteria) this;
        }

        public Criteria andPriAssistantEqualTo(String value) {
            addCriterion("PRI_ASSISTANT =", value, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantNotEqualTo(String value) {
            addCriterion("PRI_ASSISTANT <>", value, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantGreaterThan(String value) {
            addCriterion("PRI_ASSISTANT >", value, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantGreaterThanOrEqualTo(String value) {
            addCriterion("PRI_ASSISTANT >=", value, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantLessThan(String value) {
            addCriterion("PRI_ASSISTANT <", value, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantLessThanOrEqualTo(String value) {
            addCriterion("PRI_ASSISTANT <=", value, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantLike(String value) {
            addCriterion("PRI_ASSISTANT like", value, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantNotLike(String value) {
            addCriterion("PRI_ASSISTANT not like", value, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantIn(List<String> values) {
            addCriterion("PRI_ASSISTANT in", values, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantNotIn(List<String> values) {
            addCriterion("PRI_ASSISTANT not in", values, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantBetween(String value1, String value2) {
            addCriterion("PRI_ASSISTANT between", value1, value2, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriAssistantNotBetween(String value1, String value2) {
            addCriterion("PRI_ASSISTANT not between", value1, value2, "priAssistant");
            return (Criteria) this;
        }

        public Criteria andPriStatusIsNull() {
            addCriterion("PRI_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPriStatusIsNotNull() {
            addCriterion("PRI_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPriStatusEqualTo(String value) {
            addCriterion("PRI_STATUS =", value, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusNotEqualTo(String value) {
            addCriterion("PRI_STATUS <>", value, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusGreaterThan(String value) {
            addCriterion("PRI_STATUS >", value, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PRI_STATUS >=", value, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusLessThan(String value) {
            addCriterion("PRI_STATUS <", value, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusLessThanOrEqualTo(String value) {
            addCriterion("PRI_STATUS <=", value, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusLike(String value) {
            addCriterion("PRI_STATUS like", value, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusNotLike(String value) {
            addCriterion("PRI_STATUS not like", value, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusIn(List<String> values) {
            addCriterion("PRI_STATUS in", values, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusNotIn(List<String> values) {
            addCriterion("PRI_STATUS not in", values, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusBetween(String value1, String value2) {
            addCriterion("PRI_STATUS between", value1, value2, "priStatus");
            return (Criteria) this;
        }

        public Criteria andPriStatusNotBetween(String value1, String value2) {
            addCriterion("PRI_STATUS not between", value1, value2, "priStatus");
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