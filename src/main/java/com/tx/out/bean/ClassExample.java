package com.tx.out.bean;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBjIsNull() {
            addCriterion("bj is null");
            return (Criteria) this;
        }

        public Criteria andBjIsNotNull() {
            addCriterion("bj is not null");
            return (Criteria) this;
        }

        public Criteria andBjEqualTo(String value) {
            addCriterion("bj =", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotEqualTo(String value) {
            addCriterion("bj <>", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThan(String value) {
            addCriterion("bj >", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThanOrEqualTo(String value) {
            addCriterion("bj >=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThan(String value) {
            addCriterion("bj <", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThanOrEqualTo(String value) {
            addCriterion("bj <=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLike(String value) {
            addCriterion("bj like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotLike(String value) {
            addCriterion("bj not like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjIn(List<String> values) {
            addCriterion("bj in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotIn(List<String> values) {
            addCriterion("bj not in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjBetween(String value1, String value2) {
            addCriterion("bj between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotBetween(String value1, String value2) {
            addCriterion("bj not between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("xm is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("xm is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("xm =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("xm <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("xm >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("xm >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("xm <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("xm <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("xm like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("xm not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("xm in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("xm not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("xm between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("xm not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("xb is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("xb is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("xb =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("xb <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("xb >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("xb >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("xb <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("xb <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("xb like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("xb not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("xb in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("xb not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("xb between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("xb not between", value1, value2, "xb");
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