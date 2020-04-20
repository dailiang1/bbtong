package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andEntrustIdIsNull() {
            addCriterion("Entrust_id is null");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIsNotNull() {
            addCriterion("Entrust_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustIdEqualTo(Integer value) {
            addCriterion("Entrust_id =", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotEqualTo(Integer value) {
            addCriterion("Entrust_id <>", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdGreaterThan(Integer value) {
            addCriterion("Entrust_id >", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Entrust_id >=", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdLessThan(Integer value) {
            addCriterion("Entrust_id <", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdLessThanOrEqualTo(Integer value) {
            addCriterion("Entrust_id <=", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIn(List<Integer> values) {
            addCriterion("Entrust_id in", values, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotIn(List<Integer> values) {
            addCriterion("Entrust_id not in", values, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_id between", value1, value2, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_id not between", value1, value2, "entrustId");
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

        public Criteria andEntrustGradeTimeEqualTo(Date value) {
            addCriterion("Entrust_Grade_Time =", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotEqualTo(Date value) {
            addCriterion("Entrust_Grade_Time <>", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeGreaterThan(Date value) {
            addCriterion("Entrust_Grade_Time >", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Entrust_Grade_Time >=", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeLessThan(Date value) {
            addCriterion("Entrust_Grade_Time <", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeLessThanOrEqualTo(Date value) {
            addCriterion("Entrust_Grade_Time <=", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeIn(List<Date> values) {
            addCriterion("Entrust_Grade_Time in", values, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotIn(List<Date> values) {
            addCriterion("Entrust_Grade_Time not in", values, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeBetween(Date value1, Date value2) {
            addCriterion("Entrust_Grade_Time between", value1, value2, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotBetween(Date value1, Date value2) {
            addCriterion("Entrust_Grade_Time not between", value1, value2, "entrustGradeTime");
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