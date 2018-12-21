package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentinfoExample() {
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

        public Criteria andStuNameIsNull() {
            addCriterion("STU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("STU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("STU_NAME =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("STU_NAME <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("STU_NAME >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("STU_NAME >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("STU_NAME <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("STU_NAME <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("STU_NAME like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("STU_NAME not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("STU_NAME in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("STU_NAME not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("STU_NAME between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("STU_NAME not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNull() {
            addCriterion("STU_SEX is null");
            return (Criteria) this;
        }

        public Criteria andStuSexIsNotNull() {
            addCriterion("STU_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andStuSexEqualTo(String value) {
            addCriterion("STU_SEX =", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotEqualTo(String value) {
            addCriterion("STU_SEX <>", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThan(String value) {
            addCriterion("STU_SEX >", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexGreaterThanOrEqualTo(String value) {
            addCriterion("STU_SEX >=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThan(String value) {
            addCriterion("STU_SEX <", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLessThanOrEqualTo(String value) {
            addCriterion("STU_SEX <=", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexLike(String value) {
            addCriterion("STU_SEX like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotLike(String value) {
            addCriterion("STU_SEX not like", value, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexIn(List<String> values) {
            addCriterion("STU_SEX in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotIn(List<String> values) {
            addCriterion("STU_SEX not in", values, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexBetween(String value1, String value2) {
            addCriterion("STU_SEX between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuSexNotBetween(String value1, String value2) {
            addCriterion("STU_SEX not between", value1, value2, "stuSex");
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNull() {
            addCriterion("STU_AGE is null");
            return (Criteria) this;
        }

        public Criteria andStuAgeIsNotNull() {
            addCriterion("STU_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andStuAgeEqualTo(BigDecimal value) {
            addCriterion("STU_AGE =", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotEqualTo(BigDecimal value) {
            addCriterion("STU_AGE <>", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThan(BigDecimal value) {
            addCriterion("STU_AGE >", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_AGE >=", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThan(BigDecimal value) {
            addCriterion("STU_AGE <", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_AGE <=", value, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeIn(List<BigDecimal> values) {
            addCriterion("STU_AGE in", values, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotIn(List<BigDecimal> values) {
            addCriterion("STU_AGE not in", values, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_AGE between", value1, value2, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuAgeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_AGE not between", value1, value2, "stuAge");
            return (Criteria) this;
        }

        public Criteria andStuTelIsNull() {
            addCriterion("STU_TEL is null");
            return (Criteria) this;
        }

        public Criteria andStuTelIsNotNull() {
            addCriterion("STU_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andStuTelEqualTo(String value) {
            addCriterion("STU_TEL =", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotEqualTo(String value) {
            addCriterion("STU_TEL <>", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelGreaterThan(String value) {
            addCriterion("STU_TEL >", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelGreaterThanOrEqualTo(String value) {
            addCriterion("STU_TEL >=", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLessThan(String value) {
            addCriterion("STU_TEL <", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLessThanOrEqualTo(String value) {
            addCriterion("STU_TEL <=", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelLike(String value) {
            addCriterion("STU_TEL like", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotLike(String value) {
            addCriterion("STU_TEL not like", value, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelIn(List<String> values) {
            addCriterion("STU_TEL in", values, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotIn(List<String> values) {
            addCriterion("STU_TEL not in", values, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelBetween(String value1, String value2) {
            addCriterion("STU_TEL between", value1, value2, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuTelNotBetween(String value1, String value2) {
            addCriterion("STU_TEL not between", value1, value2, "stuTel");
            return (Criteria) this;
        }

        public Criteria andStuEduIsNull() {
            addCriterion("STU_EDU is null");
            return (Criteria) this;
        }

        public Criteria andStuEduIsNotNull() {
            addCriterion("STU_EDU is not null");
            return (Criteria) this;
        }

        public Criteria andStuEduEqualTo(String value) {
            addCriterion("STU_EDU =", value, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduNotEqualTo(String value) {
            addCriterion("STU_EDU <>", value, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduGreaterThan(String value) {
            addCriterion("STU_EDU >", value, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduGreaterThanOrEqualTo(String value) {
            addCriterion("STU_EDU >=", value, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduLessThan(String value) {
            addCriterion("STU_EDU <", value, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduLessThanOrEqualTo(String value) {
            addCriterion("STU_EDU <=", value, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduLike(String value) {
            addCriterion("STU_EDU like", value, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduNotLike(String value) {
            addCriterion("STU_EDU not like", value, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduIn(List<String> values) {
            addCriterion("STU_EDU in", values, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduNotIn(List<String> values) {
            addCriterion("STU_EDU not in", values, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduBetween(String value1, String value2) {
            addCriterion("STU_EDU between", value1, value2, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuEduNotBetween(String value1, String value2) {
            addCriterion("STU_EDU not between", value1, value2, "stuEdu");
            return (Criteria) this;
        }

        public Criteria andStuMaiorIsNull() {
            addCriterion("STU_MAIOR is null");
            return (Criteria) this;
        }

        public Criteria andStuMaiorIsNotNull() {
            addCriterion("STU_MAIOR is not null");
            return (Criteria) this;
        }

        public Criteria andStuMaiorEqualTo(String value) {
            addCriterion("STU_MAIOR =", value, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorNotEqualTo(String value) {
            addCriterion("STU_MAIOR <>", value, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorGreaterThan(String value) {
            addCriterion("STU_MAIOR >", value, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorGreaterThanOrEqualTo(String value) {
            addCriterion("STU_MAIOR >=", value, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorLessThan(String value) {
            addCriterion("STU_MAIOR <", value, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorLessThanOrEqualTo(String value) {
            addCriterion("STU_MAIOR <=", value, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorLike(String value) {
            addCriterion("STU_MAIOR like", value, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorNotLike(String value) {
            addCriterion("STU_MAIOR not like", value, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorIn(List<String> values) {
            addCriterion("STU_MAIOR in", values, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorNotIn(List<String> values) {
            addCriterion("STU_MAIOR not in", values, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorBetween(String value1, String value2) {
            addCriterion("STU_MAIOR between", value1, value2, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuMaiorNotBetween(String value1, String value2) {
            addCriterion("STU_MAIOR not between", value1, value2, "stuMaior");
            return (Criteria) this;
        }

        public Criteria andStuGraduateIsNull() {
            addCriterion("STU_GRADUATE is null");
            return (Criteria) this;
        }

        public Criteria andStuGraduateIsNotNull() {
            addCriterion("STU_GRADUATE is not null");
            return (Criteria) this;
        }

        public Criteria andStuGraduateEqualTo(String value) {
            addCriterion("STU_GRADUATE =", value, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateNotEqualTo(String value) {
            addCriterion("STU_GRADUATE <>", value, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateGreaterThan(String value) {
            addCriterion("STU_GRADUATE >", value, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateGreaterThanOrEqualTo(String value) {
            addCriterion("STU_GRADUATE >=", value, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateLessThan(String value) {
            addCriterion("STU_GRADUATE <", value, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateLessThanOrEqualTo(String value) {
            addCriterion("STU_GRADUATE <=", value, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateLike(String value) {
            addCriterion("STU_GRADUATE like", value, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateNotLike(String value) {
            addCriterion("STU_GRADUATE not like", value, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateIn(List<String> values) {
            addCriterion("STU_GRADUATE in", values, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateNotIn(List<String> values) {
            addCriterion("STU_GRADUATE not in", values, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateBetween(String value1, String value2) {
            addCriterion("STU_GRADUATE between", value1, value2, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuGraduateNotBetween(String value1, String value2) {
            addCriterion("STU_GRADUATE not between", value1, value2, "stuGraduate");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNull() {
            addCriterion("STU_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andStuAddressIsNotNull() {
            addCriterion("STU_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andStuAddressEqualTo(String value) {
            addCriterion("STU_ADDRESS =", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotEqualTo(String value) {
            addCriterion("STU_ADDRESS <>", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThan(String value) {
            addCriterion("STU_ADDRESS >", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressGreaterThanOrEqualTo(String value) {
            addCriterion("STU_ADDRESS >=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThan(String value) {
            addCriterion("STU_ADDRESS <", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLessThanOrEqualTo(String value) {
            addCriterion("STU_ADDRESS <=", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressLike(String value) {
            addCriterion("STU_ADDRESS like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotLike(String value) {
            addCriterion("STU_ADDRESS not like", value, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressIn(List<String> values) {
            addCriterion("STU_ADDRESS in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotIn(List<String> values) {
            addCriterion("STU_ADDRESS not in", values, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressBetween(String value1, String value2) {
            addCriterion("STU_ADDRESS between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuAddressNotBetween(String value1, String value2) {
            addCriterion("STU_ADDRESS not between", value1, value2, "stuAddress");
            return (Criteria) this;
        }

        public Criteria andStuExpeIsNull() {
            addCriterion("STU_EXPE is null");
            return (Criteria) this;
        }

        public Criteria andStuExpeIsNotNull() {
            addCriterion("STU_EXPE is not null");
            return (Criteria) this;
        }

        public Criteria andStuExpeEqualTo(String value) {
            addCriterion("STU_EXPE =", value, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeNotEqualTo(String value) {
            addCriterion("STU_EXPE <>", value, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeGreaterThan(String value) {
            addCriterion("STU_EXPE >", value, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeGreaterThanOrEqualTo(String value) {
            addCriterion("STU_EXPE >=", value, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeLessThan(String value) {
            addCriterion("STU_EXPE <", value, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeLessThanOrEqualTo(String value) {
            addCriterion("STU_EXPE <=", value, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeLike(String value) {
            addCriterion("STU_EXPE like", value, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeNotLike(String value) {
            addCriterion("STU_EXPE not like", value, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeIn(List<String> values) {
            addCriterion("STU_EXPE in", values, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeNotIn(List<String> values) {
            addCriterion("STU_EXPE not in", values, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeBetween(String value1, String value2) {
            addCriterion("STU_EXPE between", value1, value2, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuExpeNotBetween(String value1, String value2) {
            addCriterion("STU_EXPE not between", value1, value2, "stuExpe");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeIsNull() {
            addCriterion("STU_TRAIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeIsNotNull() {
            addCriterion("STU_TRAIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeEqualTo(Date value) {
            addCriterionForJDBCDate("STU_TRAIN_TIME =", value, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("STU_TRAIN_TIME <>", value, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("STU_TRAIN_TIME >", value, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_TRAIN_TIME >=", value, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeLessThan(Date value) {
            addCriterionForJDBCDate("STU_TRAIN_TIME <", value, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("STU_TRAIN_TIME <=", value, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeIn(List<Date> values) {
            addCriterionForJDBCDate("STU_TRAIN_TIME in", values, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("STU_TRAIN_TIME not in", values, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_TRAIN_TIME between", value1, value2, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuTrainTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("STU_TRAIN_TIME not between", value1, value2, "stuTrainTime");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoIsNull() {
            addCriterion("STU_PROJECT_NO is null");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoIsNotNull() {
            addCriterion("STU_PROJECT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoEqualTo(BigDecimal value) {
            addCriterion("STU_PROJECT_NO =", value, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoNotEqualTo(BigDecimal value) {
            addCriterion("STU_PROJECT_NO <>", value, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoGreaterThan(BigDecimal value) {
            addCriterion("STU_PROJECT_NO >", value, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_PROJECT_NO >=", value, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoLessThan(BigDecimal value) {
            addCriterion("STU_PROJECT_NO <", value, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STU_PROJECT_NO <=", value, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoIn(List<BigDecimal> values) {
            addCriterion("STU_PROJECT_NO in", values, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoNotIn(List<BigDecimal> values) {
            addCriterion("STU_PROJECT_NO not in", values, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_PROJECT_NO between", value1, value2, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andStuProjectNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STU_PROJECT_NO not between", value1, value2, "stuProjectNo");
            return (Criteria) this;
        }

        public Criteria andLateCountIsNull() {
            addCriterion("LATE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLateCountIsNotNull() {
            addCriterion("LATE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLateCountEqualTo(BigDecimal value) {
            addCriterion("LATE_COUNT =", value, "lateCount");
            return (Criteria) this;
        }

        public Criteria andLateCountNotEqualTo(BigDecimal value) {
            addCriterion("LATE_COUNT <>", value, "lateCount");
            return (Criteria) this;
        }

        public Criteria andLateCountGreaterThan(BigDecimal value) {
            addCriterion("LATE_COUNT >", value, "lateCount");
            return (Criteria) this;
        }

        public Criteria andLateCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LATE_COUNT >=", value, "lateCount");
            return (Criteria) this;
        }

        public Criteria andLateCountLessThan(BigDecimal value) {
            addCriterion("LATE_COUNT <", value, "lateCount");
            return (Criteria) this;
        }

        public Criteria andLateCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LATE_COUNT <=", value, "lateCount");
            return (Criteria) this;
        }

        public Criteria andLateCountIn(List<BigDecimal> values) {
            addCriterion("LATE_COUNT in", values, "lateCount");
            return (Criteria) this;
        }

        public Criteria andLateCountNotIn(List<BigDecimal> values) {
            addCriterion("LATE_COUNT not in", values, "lateCount");
            return (Criteria) this;
        }

        public Criteria andLateCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATE_COUNT between", value1, value2, "lateCount");
            return (Criteria) this;
        }

        public Criteria andLateCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LATE_COUNT not between", value1, value2, "lateCount");
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