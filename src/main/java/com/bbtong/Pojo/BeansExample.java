package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class BeansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public BeansExample() {
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

        public Criteria andBeansIdIsNull() {
            addCriterion("Beans_Id is null");
            return (Criteria) this;
        }

        public Criteria andBeansIdIsNotNull() {
            addCriterion("Beans_Id is not null");
            return (Criteria) this;
        }

        public Criteria andBeansIdEqualTo(Integer value) {
            addCriterion("Beans_Id =", value, "beansId");
            return (Criteria) this;
        }

        public Criteria andBeansIdNotEqualTo(Integer value) {
            addCriterion("Beans_Id <>", value, "beansId");
            return (Criteria) this;
        }

        public Criteria andBeansIdGreaterThan(Integer value) {
            addCriterion("Beans_Id >", value, "beansId");
            return (Criteria) this;
        }

        public Criteria andBeansIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Beans_Id >=", value, "beansId");
            return (Criteria) this;
        }

        public Criteria andBeansIdLessThan(Integer value) {
            addCriterion("Beans_Id <", value, "beansId");
            return (Criteria) this;
        }

        public Criteria andBeansIdLessThanOrEqualTo(Integer value) {
            addCriterion("Beans_Id <=", value, "beansId");
            return (Criteria) this;
        }

        public Criteria andBeansIdIn(List<Integer> values) {
            addCriterion("Beans_Id in", values, "beansId");
            return (Criteria) this;
        }

        public Criteria andBeansIdNotIn(List<Integer> values) {
            addCriterion("Beans_Id not in", values, "beansId");
            return (Criteria) this;
        }

        public Criteria andBeansIdBetween(Integer value1, Integer value2) {
            addCriterion("Beans_Id between", value1, value2, "beansId");
            return (Criteria) this;
        }

        public Criteria andBeansIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Beans_Id not between", value1, value2, "beansId");
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

        public Criteria andCardNumberIsNull() {
            addCriterion("Card_Number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("Card_Number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("Card_Number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("Card_Number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("Card_Number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Card_Number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("Card_Number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("Card_Number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("Card_Number like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("Card_Number not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("Card_Number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("Card_Number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("Card_Number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("Card_Number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andBeansStateIsNull() {
            addCriterion("Beans_State is null");
            return (Criteria) this;
        }

        public Criteria andBeansStateIsNotNull() {
            addCriterion("Beans_State is not null");
            return (Criteria) this;
        }

        public Criteria andBeansStateEqualTo(String value) {
            addCriterion("Beans_State =", value, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateNotEqualTo(String value) {
            addCriterion("Beans_State <>", value, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateGreaterThan(String value) {
            addCriterion("Beans_State >", value, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateGreaterThanOrEqualTo(String value) {
            addCriterion("Beans_State >=", value, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateLessThan(String value) {
            addCriterion("Beans_State <", value, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateLessThanOrEqualTo(String value) {
            addCriterion("Beans_State <=", value, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateLike(String value) {
            addCriterion("Beans_State like", value, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateNotLike(String value) {
            addCriterion("Beans_State not like", value, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateIn(List<String> values) {
            addCriterion("Beans_State in", values, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateNotIn(List<String> values) {
            addCriterion("Beans_State not in", values, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateBetween(String value1, String value2) {
            addCriterion("Beans_State between", value1, value2, "beansState");
            return (Criteria) this;
        }

        public Criteria andBeansStateNotBetween(String value1, String value2) {
            addCriterion("Beans_State not between", value1, value2, "beansState");
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

        public Criteria andBeansTimeIsNull() {
            addCriterion("Beans_Time is null");
            return (Criteria) this;
        }

        public Criteria andBeansTimeIsNotNull() {
            addCriterion("Beans_Time is not null");
            return (Criteria) this;
        }

        public Criteria andBeansTimeEqualTo(String value) {
            addCriterion("Beans_Time =", value, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeNotEqualTo(String value) {
            addCriterion("Beans_Time <>", value, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeGreaterThan(String value) {
            addCriterion("Beans_Time >", value, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Beans_Time >=", value, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeLessThan(String value) {
            addCriterion("Beans_Time <", value, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeLessThanOrEqualTo(String value) {
            addCriterion("Beans_Time <=", value, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeLike(String value) {
            addCriterion("Beans_Time like", value, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeNotLike(String value) {
            addCriterion("Beans_Time not like", value, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeIn(List<String> values) {
            addCriterion("Beans_Time in", values, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeNotIn(List<String> values) {
            addCriterion("Beans_Time not in", values, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeBetween(String value1, String value2) {
            addCriterion("Beans_Time between", value1, value2, "beansTime");
            return (Criteria) this;
        }

        public Criteria andBeansTimeNotBetween(String value1, String value2) {
            addCriterion("Beans_Time not between", value1, value2, "beansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeIsNull() {
            addCriterion("NewBeans_Time is null");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeIsNotNull() {
            addCriterion("NewBeans_Time is not null");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeEqualTo(String value) {
            addCriterion("NewBeans_Time =", value, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeNotEqualTo(String value) {
            addCriterion("NewBeans_Time <>", value, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeGreaterThan(String value) {
            addCriterion("NewBeans_Time >", value, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeGreaterThanOrEqualTo(String value) {
            addCriterion("NewBeans_Time >=", value, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeLessThan(String value) {
            addCriterion("NewBeans_Time <", value, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeLessThanOrEqualTo(String value) {
            addCriterion("NewBeans_Time <=", value, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeLike(String value) {
            addCriterion("NewBeans_Time like", value, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeNotLike(String value) {
            addCriterion("NewBeans_Time not like", value, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeIn(List<String> values) {
            addCriterion("NewBeans_Time in", values, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeNotIn(List<String> values) {
            addCriterion("NewBeans_Time not in", values, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeBetween(String value1, String value2) {
            addCriterion("NewBeans_Time between", value1, value2, "newbeansTime");
            return (Criteria) this;
        }

        public Criteria andNewbeansTimeNotBetween(String value1, String value2) {
            addCriterion("NewBeans_Time not between", value1, value2, "newbeansTime");
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