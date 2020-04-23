package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class ConsumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ConsumeExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andConsumeIdIsNull() {
            addCriterion("Consume_Id is null");
            return (Criteria) this;
        }

        public Criteria andConsumeIdIsNotNull() {
            addCriterion("Consume_Id is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeIdEqualTo(Integer value) {
            addCriterion("Consume_Id =", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdNotEqualTo(Integer value) {
            addCriterion("Consume_Id <>", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdGreaterThan(Integer value) {
            addCriterion("Consume_Id >", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Consume_Id >=", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdLessThan(Integer value) {
            addCriterion("Consume_Id <", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Consume_Id <=", value, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdIn(List<Integer> values) {
            addCriterion("Consume_Id in", values, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdNotIn(List<Integer> values) {
            addCriterion("Consume_Id not in", values, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdBetween(Integer value1, Integer value2) {
            addCriterion("Consume_Id between", value1, value2, "consumeId");
            return (Criteria) this;
        }

        public Criteria andConsumeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Consume_Id not between", value1, value2, "consumeId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberIsNull() {
            addCriterion("Consume_number is null");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberIsNotNull() {
            addCriterion("Consume_number is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberEqualTo(String value) {
            addCriterion("Consume_number =", value, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberNotEqualTo(String value) {
            addCriterion("Consume_number <>", value, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberGreaterThan(String value) {
            addCriterion("Consume_number >", value, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Consume_number >=", value, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberLessThan(String value) {
            addCriterion("Consume_number <", value, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberLessThanOrEqualTo(String value) {
            addCriterion("Consume_number <=", value, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberLike(String value) {
            addCriterion("Consume_number like", value, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberNotLike(String value) {
            addCriterion("Consume_number not like", value, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberIn(List<String> values) {
            addCriterion("Consume_number in", values, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberNotIn(List<String> values) {
            addCriterion("Consume_number not in", values, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberBetween(String value1, String value2) {
            addCriterion("Consume_number between", value1, value2, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeNumberNotBetween(String value1, String value2) {
            addCriterion("Consume_number not between", value1, value2, "consumeNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeStateIsNull() {
            addCriterion("Consume_State is null");
            return (Criteria) this;
        }

        public Criteria andConsumeStateIsNotNull() {
            addCriterion("Consume_State is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeStateEqualTo(String value) {
            addCriterion("Consume_State =", value, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateNotEqualTo(String value) {
            addCriterion("Consume_State <>", value, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateGreaterThan(String value) {
            addCriterion("Consume_State >", value, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateGreaterThanOrEqualTo(String value) {
            addCriterion("Consume_State >=", value, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateLessThan(String value) {
            addCriterion("Consume_State <", value, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateLessThanOrEqualTo(String value) {
            addCriterion("Consume_State <=", value, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateLike(String value) {
            addCriterion("Consume_State like", value, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateNotLike(String value) {
            addCriterion("Consume_State not like", value, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateIn(List<String> values) {
            addCriterion("Consume_State in", values, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateNotIn(List<String> values) {
            addCriterion("Consume_State not in", values, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateBetween(String value1, String value2) {
            addCriterion("Consume_State between", value1, value2, "consumeState");
            return (Criteria) this;
        }

        public Criteria andConsumeStateNotBetween(String value1, String value2) {
            addCriterion("Consume_State not between", value1, value2, "consumeState");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("User_Number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("User_Number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(String value) {
            addCriterion("User_Number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(String value) {
            addCriterion("User_Number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(String value) {
            addCriterion("User_Number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("User_Number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(String value) {
            addCriterion("User_Number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(String value) {
            addCriterion("User_Number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLike(String value) {
            addCriterion("User_Number like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotLike(String value) {
            addCriterion("User_Number not like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<String> values) {
            addCriterion("User_Number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<String> values) {
            addCriterion("User_Number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(String value1, String value2) {
            addCriterion("User_Number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(String value1, String value2) {
            addCriterion("User_Number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeIsNull() {
            addCriterion("Consume_Time is null");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeIsNotNull() {
            addCriterion("Consume_Time is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeEqualTo(String value) {
            addCriterion("Consume_Time =", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotEqualTo(String value) {
            addCriterion("Consume_Time <>", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeGreaterThan(String value) {
            addCriterion("Consume_Time >", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Consume_Time >=", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeLessThan(String value) {
            addCriterion("Consume_Time <", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeLessThanOrEqualTo(String value) {
            addCriterion("Consume_Time <=", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeLike(String value) {
            addCriterion("Consume_Time like", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotLike(String value) {
            addCriterion("Consume_Time not like", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeIn(List<String> values) {
            addCriterion("Consume_Time in", values, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotIn(List<String> values) {
            addCriterion("Consume_Time not in", values, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeBetween(String value1, String value2) {
            addCriterion("Consume_Time between", value1, value2, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotBetween(String value1, String value2) {
            addCriterion("Consume_Time not between", value1, value2, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeIsNull() {
            addCriterion("NewConsume_Time is null");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeIsNotNull() {
            addCriterion("NewConsume_Time is not null");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeEqualTo(String value) {
            addCriterion("NewConsume_Time =", value, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeNotEqualTo(String value) {
            addCriterion("NewConsume_Time <>", value, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeGreaterThan(String value) {
            addCriterion("NewConsume_Time >", value, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("NewConsume_Time >=", value, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeLessThan(String value) {
            addCriterion("NewConsume_Time <", value, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeLessThanOrEqualTo(String value) {
            addCriterion("NewConsume_Time <=", value, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeLike(String value) {
            addCriterion("NewConsume_Time like", value, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeNotLike(String value) {
            addCriterion("NewConsume_Time not like", value, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeIn(List<String> values) {
            addCriterion("NewConsume_Time in", values, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeNotIn(List<String> values) {
            addCriterion("NewConsume_Time not in", values, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeBetween(String value1, String value2) {
            addCriterion("NewConsume_Time between", value1, value2, "newconsumeTime");
            return (Criteria) this;
        }

        public Criteria andNewconsumeTimeNotBetween(String value1, String value2) {
            addCriterion("NewConsume_Time not between", value1, value2, "newconsumeTime");
            return (Criteria) this;
        }
    }

    /**
     */
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