package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class DeliveryOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DeliveryOrderExample() {
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

        public Criteria andDeliveryOrderIdIsNull() {
            addCriterion("Delivery_Order_Id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdIsNotNull() {
            addCriterion("Delivery_Order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdEqualTo(Integer value) {
            addCriterion("Delivery_Order_Id =", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdNotEqualTo(Integer value) {
            addCriterion("Delivery_Order_Id <>", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdGreaterThan(Integer value) {
            addCriterion("Delivery_Order_Id >", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Delivery_Order_Id >=", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdLessThan(Integer value) {
            addCriterion("Delivery_Order_Id <", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("Delivery_Order_Id <=", value, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdIn(List<Integer> values) {
            addCriterion("Delivery_Order_Id in", values, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdNotIn(List<Integer> values) {
            addCriterion("Delivery_Order_Id not in", values, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("Delivery_Order_Id between", value1, value2, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Delivery_Order_Id not between", value1, value2, "deliveryOrderId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdIsNull() {
            addCriterion("New_Entrust_id is null");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdIsNotNull() {
            addCriterion("New_Entrust_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdEqualTo(Integer value) {
            addCriterion("New_Entrust_id =", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdNotEqualTo(Integer value) {
            addCriterion("New_Entrust_id <>", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdGreaterThan(Integer value) {
            addCriterion("New_Entrust_id >", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("New_Entrust_id >=", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdLessThan(Integer value) {
            addCriterion("New_Entrust_id <", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdLessThanOrEqualTo(Integer value) {
            addCriterion("New_Entrust_id <=", value, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdIn(List<Integer> values) {
            addCriterion("New_Entrust_id in", values, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdNotIn(List<Integer> values) {
            addCriterion("New_Entrust_id not in", values, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdBetween(Integer value1, Integer value2) {
            addCriterion("New_Entrust_id between", value1, value2, "newEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewEntrustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("New_Entrust_id not between", value1, value2, "newEntrustId");
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

        public Criteria andDeliveryOrderNumberIsNull() {
            addCriterion("Delivery_Order_Number is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberIsNotNull() {
            addCriterion("Delivery_Order_Number is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberEqualTo(String value) {
            addCriterion("Delivery_Order_Number =", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberNotEqualTo(String value) {
            addCriterion("Delivery_Order_Number <>", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberGreaterThan(String value) {
            addCriterion("Delivery_Order_Number >", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Delivery_Order_Number >=", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberLessThan(String value) {
            addCriterion("Delivery_Order_Number <", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("Delivery_Order_Number <=", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberLike(String value) {
            addCriterion("Delivery_Order_Number like", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberNotLike(String value) {
            addCriterion("Delivery_Order_Number not like", value, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberIn(List<String> values) {
            addCriterion("Delivery_Order_Number in", values, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberNotIn(List<String> values) {
            addCriterion("Delivery_Order_Number not in", values, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberBetween(String value1, String value2) {
            addCriterion("Delivery_Order_Number between", value1, value2, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderNumberNotBetween(String value1, String value2) {
            addCriterion("Delivery_Order_Number not between", value1, value2, "deliveryOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyIsNull() {
            addCriterion("Delivery_Order_Money is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyIsNotNull() {
            addCriterion("Delivery_Order_Money is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyEqualTo(Double value) {
            addCriterion("Delivery_Order_Money =", value, "deliveryOrderMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyNotEqualTo(Double value) {
            addCriterion("Delivery_Order_Money <>", value, "deliveryOrderMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyGreaterThan(Double value) {
            addCriterion("Delivery_Order_Money >", value, "deliveryOrderMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Delivery_Order_Money >=", value, "deliveryOrderMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyLessThan(Double value) {
            addCriterion("Delivery_Order_Money <", value, "deliveryOrderMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("Delivery_Order_Money <=", value, "deliveryOrderMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyIn(List<Double> values) {
            addCriterion("Delivery_Order_Money in", values, "deliveryOrderMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyNotIn(List<Double> values) {
            addCriterion("Delivery_Order_Money not in", values, "deliveryOrderMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyBetween(Double value1, Double value2) {
            addCriterion("Delivery_Order_Money between", value1, value2, "deliveryOrderMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("Delivery_Order_Money not between", value1, value2, "deliveryOrderMoney");
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

        public Criteria andDeliveryOrderStateIsNull() {
            addCriterion("Delivery_Order_state is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateIsNotNull() {
            addCriterion("Delivery_Order_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateEqualTo(Integer value) {
            addCriterion("Delivery_Order_state =", value, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateNotEqualTo(Integer value) {
            addCriterion("Delivery_Order_state <>", value, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateGreaterThan(Integer value) {
            addCriterion("Delivery_Order_state >", value, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Delivery_Order_state >=", value, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateLessThan(Integer value) {
            addCriterion("Delivery_Order_state <", value, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("Delivery_Order_state <=", value, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateIn(List<Integer> values) {
            addCriterion("Delivery_Order_state in", values, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateNotIn(List<Integer> values) {
            addCriterion("Delivery_Order_state not in", values, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("Delivery_Order_state between", value1, value2, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andDeliveryOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Delivery_Order_state not between", value1, value2, "deliveryOrderState");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeIsNull() {
            addCriterion("Entrust_Grade is null");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeIsNotNull() {
            addCriterion("Entrust_Grade is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeEqualTo(Integer value) {
            addCriterion("Entrust_Grade =", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeNotEqualTo(Integer value) {
            addCriterion("Entrust_Grade <>", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeGreaterThan(Integer value) {
            addCriterion("Entrust_Grade >", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Entrust_Grade >=", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeLessThan(Integer value) {
            addCriterion("Entrust_Grade <", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeLessThanOrEqualTo(Integer value) {
            addCriterion("Entrust_Grade <=", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeIn(List<Integer> values) {
            addCriterion("Entrust_Grade in", values, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeNotIn(List<Integer> values) {
            addCriterion("Entrust_Grade not in", values, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_Grade between", value1, value2, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_Grade not between", value1, value2, "entrustGrade");
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