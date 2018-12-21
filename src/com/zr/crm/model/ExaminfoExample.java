package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExaminfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminfoExample() {
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

        public Criteria andExamIdIsNull() {
            addCriterion("EXAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("EXAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(BigDecimal value) {
            addCriterion("EXAM_ID =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(BigDecimal value) {
            addCriterion("EXAM_ID <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(BigDecimal value) {
            addCriterion("EXAM_ID >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXAM_ID >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(BigDecimal value) {
            addCriterion("EXAM_ID <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXAM_ID <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<BigDecimal> values) {
            addCriterion("EXAM_ID in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<BigDecimal> values) {
            addCriterion("EXAM_ID not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXAM_ID between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXAM_ID not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNull() {
            addCriterion("EXAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExamNameIsNotNull() {
            addCriterion("EXAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExamNameEqualTo(String value) {
            addCriterion("EXAM_NAME =", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotEqualTo(String value) {
            addCriterion("EXAM_NAME <>", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThan(String value) {
            addCriterion("EXAM_NAME >", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_NAME >=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThan(String value) {
            addCriterion("EXAM_NAME <", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLessThanOrEqualTo(String value) {
            addCriterion("EXAM_NAME <=", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameLike(String value) {
            addCriterion("EXAM_NAME like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotLike(String value) {
            addCriterion("EXAM_NAME not like", value, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameIn(List<String> values) {
            addCriterion("EXAM_NAME in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotIn(List<String> values) {
            addCriterion("EXAM_NAME not in", values, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameBetween(String value1, String value2) {
            addCriterion("EXAM_NAME between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNameNotBetween(String value1, String value2) {
            addCriterion("EXAM_NAME not between", value1, value2, "examName");
            return (Criteria) this;
        }

        public Criteria andExamNoIsNull() {
            addCriterion("EXAM_NO is null");
            return (Criteria) this;
        }

        public Criteria andExamNoIsNotNull() {
            addCriterion("EXAM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExamNoEqualTo(BigDecimal value) {
            addCriterion("EXAM_NO =", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotEqualTo(BigDecimal value) {
            addCriterion("EXAM_NO <>", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoGreaterThan(BigDecimal value) {
            addCriterion("EXAM_NO >", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXAM_NO >=", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoLessThan(BigDecimal value) {
            addCriterion("EXAM_NO <", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXAM_NO <=", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoIn(List<BigDecimal> values) {
            addCriterion("EXAM_NO in", values, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotIn(List<BigDecimal> values) {
            addCriterion("EXAM_NO not in", values, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXAM_NO between", value1, value2, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXAM_NO not between", value1, value2, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamTitleIsNull() {
            addCriterion("EXAM_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andExamTitleIsNotNull() {
            addCriterion("EXAM_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andExamTitleEqualTo(String value) {
            addCriterion("EXAM_TITLE =", value, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleNotEqualTo(String value) {
            addCriterion("EXAM_TITLE <>", value, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleGreaterThan(String value) {
            addCriterion("EXAM_TITLE >", value, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_TITLE >=", value, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleLessThan(String value) {
            addCriterion("EXAM_TITLE <", value, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleLessThanOrEqualTo(String value) {
            addCriterion("EXAM_TITLE <=", value, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleLike(String value) {
            addCriterion("EXAM_TITLE like", value, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleNotLike(String value) {
            addCriterion("EXAM_TITLE not like", value, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleIn(List<String> values) {
            addCriterion("EXAM_TITLE in", values, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleNotIn(List<String> values) {
            addCriterion("EXAM_TITLE not in", values, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleBetween(String value1, String value2) {
            addCriterion("EXAM_TITLE between", value1, value2, "examTitle");
            return (Criteria) this;
        }

        public Criteria andExamTitleNotBetween(String value1, String value2) {
            addCriterion("EXAM_TITLE not between", value1, value2, "examTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleIsNull() {
            addCriterion("SUB_EXAM_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleIsNotNull() {
            addCriterion("SUB_EXAM_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleEqualTo(String value) {
            addCriterion("SUB_EXAM_TITLE =", value, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleNotEqualTo(String value) {
            addCriterion("SUB_EXAM_TITLE <>", value, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleGreaterThan(String value) {
            addCriterion("SUB_EXAM_TITLE >", value, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_EXAM_TITLE >=", value, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleLessThan(String value) {
            addCriterion("SUB_EXAM_TITLE <", value, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleLessThanOrEqualTo(String value) {
            addCriterion("SUB_EXAM_TITLE <=", value, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleLike(String value) {
            addCriterion("SUB_EXAM_TITLE like", value, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleNotLike(String value) {
            addCriterion("SUB_EXAM_TITLE not like", value, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleIn(List<String> values) {
            addCriterion("SUB_EXAM_TITLE in", values, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleNotIn(List<String> values) {
            addCriterion("SUB_EXAM_TITLE not in", values, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleBetween(String value1, String value2) {
            addCriterion("SUB_EXAM_TITLE between", value1, value2, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamTitleNotBetween(String value1, String value2) {
            addCriterion("SUB_EXAM_TITLE not between", value1, value2, "subExamTitle");
            return (Criteria) this;
        }

        public Criteria andSubExamContentIsNull() {
            addCriterion("SUB_EXAM_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSubExamContentIsNotNull() {
            addCriterion("SUB_EXAM_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSubExamContentEqualTo(String value) {
            addCriterion("SUB_EXAM_CONTENT =", value, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentNotEqualTo(String value) {
            addCriterion("SUB_EXAM_CONTENT <>", value, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentGreaterThan(String value) {
            addCriterion("SUB_EXAM_CONTENT >", value, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_EXAM_CONTENT >=", value, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentLessThan(String value) {
            addCriterion("SUB_EXAM_CONTENT <", value, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentLessThanOrEqualTo(String value) {
            addCriterion("SUB_EXAM_CONTENT <=", value, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentLike(String value) {
            addCriterion("SUB_EXAM_CONTENT like", value, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentNotLike(String value) {
            addCriterion("SUB_EXAM_CONTENT not like", value, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentIn(List<String> values) {
            addCriterion("SUB_EXAM_CONTENT in", values, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentNotIn(List<String> values) {
            addCriterion("SUB_EXAM_CONTENT not in", values, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentBetween(String value1, String value2) {
            addCriterion("SUB_EXAM_CONTENT between", value1, value2, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamContentNotBetween(String value1, String value2) {
            addCriterion("SUB_EXAM_CONTENT not between", value1, value2, "subExamContent");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreIsNull() {
            addCriterion("SUB_EXAM_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreIsNotNull() {
            addCriterion("SUB_EXAM_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreEqualTo(BigDecimal value) {
            addCriterion("SUB_EXAM_SCORE =", value, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreNotEqualTo(BigDecimal value) {
            addCriterion("SUB_EXAM_SCORE <>", value, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreGreaterThan(BigDecimal value) {
            addCriterion("SUB_EXAM_SCORE >", value, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUB_EXAM_SCORE >=", value, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreLessThan(BigDecimal value) {
            addCriterion("SUB_EXAM_SCORE <", value, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUB_EXAM_SCORE <=", value, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreIn(List<BigDecimal> values) {
            addCriterion("SUB_EXAM_SCORE in", values, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreNotIn(List<BigDecimal> values) {
            addCriterion("SUB_EXAM_SCORE not in", values, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUB_EXAM_SCORE between", value1, value2, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUB_EXAM_SCORE not between", value1, value2, "subExamScore");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerIsNull() {
            addCriterion("SUB_EXAM_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerIsNotNull() {
            addCriterion("SUB_EXAM_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerEqualTo(String value) {
            addCriterion("SUB_EXAM_ANSWER =", value, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerNotEqualTo(String value) {
            addCriterion("SUB_EXAM_ANSWER <>", value, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerGreaterThan(String value) {
            addCriterion("SUB_EXAM_ANSWER >", value, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_EXAM_ANSWER >=", value, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerLessThan(String value) {
            addCriterion("SUB_EXAM_ANSWER <", value, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerLessThanOrEqualTo(String value) {
            addCriterion("SUB_EXAM_ANSWER <=", value, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerLike(String value) {
            addCriterion("SUB_EXAM_ANSWER like", value, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerNotLike(String value) {
            addCriterion("SUB_EXAM_ANSWER not like", value, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerIn(List<String> values) {
            addCriterion("SUB_EXAM_ANSWER in", values, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerNotIn(List<String> values) {
            addCriterion("SUB_EXAM_ANSWER not in", values, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerBetween(String value1, String value2) {
            addCriterion("SUB_EXAM_ANSWER between", value1, value2, "subExamAnswer");
            return (Criteria) this;
        }

        public Criteria andSubExamAnswerNotBetween(String value1, String value2) {
            addCriterion("SUB_EXAM_ANSWER not between", value1, value2, "subExamAnswer");
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

        public Criteria andCreatTimeIsNull() {
            addCriterion("CREAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("CREAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREAT_TIME =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREAT_TIME <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREAT_TIME >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREAT_TIME >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREAT_TIME <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREAT_TIME <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREAT_TIME in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREAT_TIME not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREAT_TIME between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREAT_TIME not between", value1, value2, "creatTime");
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