package com.java.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class MOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MOrderExample() {
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

        public Criteria andOIdIsNull() {
            addCriterion("o_id is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("o_id is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(Integer value) {
            addCriterion("o_id =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(Integer value) {
            addCriterion("o_id <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(Integer value) {
            addCriterion("o_id >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("o_id >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(Integer value) {
            addCriterion("o_id <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(Integer value) {
            addCriterion("o_id <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<Integer> values) {
            addCriterion("o_id in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<Integer> values) {
            addCriterion("o_id not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(Integer value1, Integer value2) {
            addCriterion("o_id between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(Integer value1, Integer value2) {
            addCriterion("o_id not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andONameIsNull() {
            addCriterion("o_name is null");
            return (Criteria) this;
        }

        public Criteria andONameIsNotNull() {
            addCriterion("o_name is not null");
            return (Criteria) this;
        }

        public Criteria andONameEqualTo(String value) {
            addCriterion("o_name =", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotEqualTo(String value) {
            addCriterion("o_name <>", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameGreaterThan(String value) {
            addCriterion("o_name >", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameGreaterThanOrEqualTo(String value) {
            addCriterion("o_name >=", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLessThan(String value) {
            addCriterion("o_name <", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLessThanOrEqualTo(String value) {
            addCriterion("o_name <=", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameLike(String value) {
            addCriterion("o_name like", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotLike(String value) {
            addCriterion("o_name not like", value, "oName");
            return (Criteria) this;
        }

        public Criteria andONameIn(List<String> values) {
            addCriterion("o_name in", values, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotIn(List<String> values) {
            addCriterion("o_name not in", values, "oName");
            return (Criteria) this;
        }

        public Criteria andONameBetween(String value1, String value2) {
            addCriterion("o_name between", value1, value2, "oName");
            return (Criteria) this;
        }

        public Criteria andONameNotBetween(String value1, String value2) {
            addCriterion("o_name not between", value1, value2, "oName");
            return (Criteria) this;
        }

        public Criteria andOInfoIsNull() {
            addCriterion("o_info is null");
            return (Criteria) this;
        }

        public Criteria andOInfoIsNotNull() {
            addCriterion("o_info is not null");
            return (Criteria) this;
        }

        public Criteria andOInfoEqualTo(String value) {
            addCriterion("o_info =", value, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoNotEqualTo(String value) {
            addCriterion("o_info <>", value, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoGreaterThan(String value) {
            addCriterion("o_info >", value, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoGreaterThanOrEqualTo(String value) {
            addCriterion("o_info >=", value, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoLessThan(String value) {
            addCriterion("o_info <", value, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoLessThanOrEqualTo(String value) {
            addCriterion("o_info <=", value, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoLike(String value) {
            addCriterion("o_info like", value, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoNotLike(String value) {
            addCriterion("o_info not like", value, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoIn(List<String> values) {
            addCriterion("o_info in", values, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoNotIn(List<String> values) {
            addCriterion("o_info not in", values, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoBetween(String value1, String value2) {
            addCriterion("o_info between", value1, value2, "oInfo");
            return (Criteria) this;
        }

        public Criteria andOInfoNotBetween(String value1, String value2) {
            addCriterion("o_info not between", value1, value2, "oInfo");
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