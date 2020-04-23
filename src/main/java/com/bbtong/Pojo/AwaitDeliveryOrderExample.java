package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class AwaitDeliveryOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AwaitDeliveryOrderExample() {
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

        public Criteria andAwaitDeliveryOrderIdIsNull() {
            addCriterion("Await_Delivery_Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdIsNotNull() {
            addCriterion("Await_Delivery_Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdEqualTo(Integer value) {
            addCriterion("Await_Delivery_Order_Id =", value, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdNotEqualTo(Integer value) {
            addCriterion("Await_Delivery_Order_Id <>", value, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdGreaterThan(Integer value) {
            addCriterion("Await_Delivery_Order_Id >", value, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Await_Delivery_Order_Id >=", value, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdLessThan(Integer value) {
            addCriterion("Await_Delivery_Order_Id <", value, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("Await_Delivery_Order_Id <=", value, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdIn(List<Integer> values) {
            addCriterion("Await_Delivery_Order_Id in", values, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdNotIn(List<Integer> values) {
            addCriterion("Await_Delivery_Order_Id not in", values, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("Await_Delivery_Order_Id between", value1, value2, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andAwaitDeliveryOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Await_Delivery_Order_Id not between", value1, value2, "awaitDeliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdIsNull() {
            addCriterion("New_Entrust_Id is null");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdIsNotNull() {
            addCriterion("New_Entrust_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdEqualTo(Integer value) {
            addCriterion("New_Entrust_Id =", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdNotEqualTo(Integer value) {
            addCriterion("New_Entrust_Id <>", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdGreaterThan(Integer value) {
            addCriterion("New_Entrust_Id >", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("New_Entrust_Id >=", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdLessThan(Integer value) {
            addCriterion("New_Entrust_Id <", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdLessThanOrEqualTo(Integer value) {
            addCriterion("New_Entrust_Id <=", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdIn(List<Integer> values) {
            addCriterion("New_Entrust_Id in", values, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdNotIn(List<Integer> values) {
            addCriterion("New_Entrust_Id not in", values, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdBetween(Integer value1, Integer value2) {
            addCriterion("New_Entrust_Id between", value1, value2, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("New_Entrust_Id not between", value1, value2, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdIsNull() {
            addCriterion("New_User_Id is null");
            return (Criteria) this;
        }

        public Criteria andNewUserIdIsNotNull() {
            addCriterion("New_User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserIdEqualTo(Integer value) {
            addCriterion("New_User_Id =", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdNotEqualTo(Integer value) {
            addCriterion("New_User_Id <>", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdGreaterThan(Integer value) {
            addCriterion("New_User_Id >", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("New_User_Id >=", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdLessThan(Integer value) {
            addCriterion("New_User_Id <", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("New_User_Id <=", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdIn(List<Integer> values) {
            addCriterion("New_User_Id in", values, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdNotIn(List<Integer> values) {
            addCriterion("New_User_Id not in", values, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdBetween(Integer value1, Integer value2) {
            addCriterion("New_User_Id between", value1, value2, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("New_User_Id not between", value1, value2, "newUserId");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyIsNull() {
            addCriterion("Entrust_Money is null");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyIsNotNull() {
            addCriterion("Entrust_Money is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyEqualTo(Double value) {
            addCriterion("Entrust_Money =", value, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyNotEqualTo(Double value) {
            addCriterion("Entrust_Money <>", value, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyGreaterThan(Double value) {
            addCriterion("Entrust_Money >", value, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Entrust_Money >=", value, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyLessThan(Double value) {
            addCriterion("Entrust_Money <", value, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyLessThanOrEqualTo(Double value) {
            addCriterion("Entrust_Money <=", value, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyIn(List<Double> values) {
            addCriterion("Entrust_Money in", values, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyNotIn(List<Double> values) {
            addCriterion("Entrust_Money not in", values, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyBetween(Double value1, Double value2) {
            addCriterion("Entrust_Money between", value1, value2, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustMoneyNotBetween(Double value1, Double value2) {
            addCriterion("Entrust_Money not between", value1, value2, "entrustMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeIsNull() {
            addCriterion("Entrust_Grade_Time is null");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeIsNotNull() {
            addCriterion("Entrust_Grade_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeEqualTo(String value) {
            addCriterion("Entrust_Grade_Time =", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotEqualTo(String value) {
            addCriterion("Entrust_Grade_Time <>", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeGreaterThan(String value) {
            addCriterion("Entrust_Grade_Time >", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_Grade_Time >=", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeLessThan(String value) {
            addCriterion("Entrust_Grade_Time <", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeLessThanOrEqualTo(String value) {
            addCriterion("Entrust_Grade_Time <=", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeLike(String value) {
            addCriterion("Entrust_Grade_Time like", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotLike(String value) {
            addCriterion("Entrust_Grade_Time not like", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeIn(List<String> values) {
            addCriterion("Entrust_Grade_Time in", values, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotIn(List<String> values) {
            addCriterion("Entrust_Grade_Time not in", values, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeBetween(String value1, String value2) {
            addCriterion("Entrust_Grade_Time between", value1, value2, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotBetween(String value1, String value2) {
            addCriterion("Entrust_Grade_Time not between", value1, value2, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeIsNull() {
            addCriterion("Entrust_Return_Time is null");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeIsNotNull() {
            addCriterion("Entrust_Return_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeEqualTo(String value) {
            addCriterion("Entrust_Return_Time =", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeNotEqualTo(String value) {
            addCriterion("Entrust_Return_Time <>", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeGreaterThan(String value) {
            addCriterion("Entrust_Return_Time >", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_Return_Time >=", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeLessThan(String value) {
            addCriterion("Entrust_Return_Time <", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeLessThanOrEqualTo(String value) {
            addCriterion("Entrust_Return_Time <=", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeLike(String value) {
            addCriterion("Entrust_Return_Time like", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeNotLike(String value) {
            addCriterion("Entrust_Return_Time not like", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeIn(List<String> values) {
            addCriterion("Entrust_Return_Time in", values, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeNotIn(List<String> values) {
            addCriterion("Entrust_Return_Time not in", values, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeBetween(String value1, String value2) {
            addCriterion("Entrust_Return_Time between", value1, value2, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeNotBetween(String value1, String value2) {
            addCriterion("Entrust_Return_Time not between", value1, value2, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStateIsNull() {
            addCriterion("Entrust_state is null");
            return (Criteria) this;
        }

        public Criteria andEntrustStateIsNotNull() {
            addCriterion("Entrust_state is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustStateEqualTo(String value) {
            addCriterion("Entrust_state =", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateNotEqualTo(String value) {
            addCriterion("Entrust_state <>", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateGreaterThan(String value) {
            addCriterion("Entrust_state >", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_state >=", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateLessThan(String value) {
            addCriterion("Entrust_state <", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateLessThanOrEqualTo(String value) {
            addCriterion("Entrust_state <=", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateLike(String value) {
            addCriterion("Entrust_state like", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateNotLike(String value) {
            addCriterion("Entrust_state not like", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateIn(List<String> values) {
            addCriterion("Entrust_state in", values, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateNotIn(List<String> values) {
            addCriterion("Entrust_state not in", values, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateBetween(String value1, String value2) {
            addCriterion("Entrust_state between", value1, value2, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateNotBetween(String value1, String value2) {
            addCriterion("Entrust_state not between", value1, value2, "entrustState");
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