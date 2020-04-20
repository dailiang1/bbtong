package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class IntentionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public IntentionExample() {
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

        public Criteria andIntentionIdIsNull() {
            addCriterion("Intention_Id is null");
            return (Criteria) this;
        }

        public Criteria andIntentionIdIsNotNull() {
            addCriterion("Intention_Id is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionIdEqualTo(Integer value) {
            addCriterion("Intention_Id =", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdNotEqualTo(Integer value) {
            addCriterion("Intention_Id <>", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdGreaterThan(Integer value) {
            addCriterion("Intention_Id >", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Intention_Id >=", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdLessThan(Integer value) {
            addCriterion("Intention_Id <", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdLessThanOrEqualTo(Integer value) {
            addCriterion("Intention_Id <=", value, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdIn(List<Integer> values) {
            addCriterion("Intention_Id in", values, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdNotIn(List<Integer> values) {
            addCriterion("Intention_Id not in", values, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdBetween(Integer value1, Integer value2) {
            addCriterion("Intention_Id between", value1, value2, "intentionId");
            return (Criteria) this;
        }

        public Criteria andIntentionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Intention_Id not between", value1, value2, "intentionId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIsNull() {
            addCriterion("Entrust_Id is null");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIsNotNull() {
            addCriterion("Entrust_Id is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustIdEqualTo(Integer value) {
            addCriterion("Entrust_Id =", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotEqualTo(Integer value) {
            addCriterion("Entrust_Id <>", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdGreaterThan(Integer value) {
            addCriterion("Entrust_Id >", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Entrust_Id >=", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdLessThan(Integer value) {
            addCriterion("Entrust_Id <", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdLessThanOrEqualTo(Integer value) {
            addCriterion("Entrust_Id <=", value, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdIn(List<Integer> values) {
            addCriterion("Entrust_Id in", values, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotIn(List<Integer> values) {
            addCriterion("Entrust_Id not in", values, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_Id between", value1, value2, "entrustId");
            return (Criteria) this;
        }

        public Criteria andEntrustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_Id not between", value1, value2, "entrustId");
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

        public Criteria andEntrustStateIsNull() {
            addCriterion("Entrust_state is null");
            return (Criteria) this;
        }

        public Criteria andEntrustStateIsNotNull() {
            addCriterion("Entrust_state is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustStateEqualTo(Integer value) {
            addCriterion("Entrust_state =", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateNotEqualTo(Integer value) {
            addCriterion("Entrust_state <>", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateGreaterThan(Integer value) {
            addCriterion("Entrust_state >", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Entrust_state >=", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateLessThan(Integer value) {
            addCriterion("Entrust_state <", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateLessThanOrEqualTo(Integer value) {
            addCriterion("Entrust_state <=", value, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateIn(List<Integer> values) {
            addCriterion("Entrust_state in", values, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateNotIn(List<Integer> values) {
            addCriterion("Entrust_state not in", values, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_state between", value1, value2, "entrustState");
            return (Criteria) this;
        }

        public Criteria andEntrustStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_state not between", value1, value2, "entrustState");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("User_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("User_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("User_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("User_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("User_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("User_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("User_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("User_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("User_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("User_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("User_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("User_Name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("User_Phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("User_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("User_Phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("User_Phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("User_Phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("User_Phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("User_Phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("User_Phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("User_Phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("User_Phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("User_Phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("User_Phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("User_Phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("User_Phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameIsNull() {
            addCriterion("Insurance_Company_Name is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameIsNotNull() {
            addCriterion("Insurance_Company_Name is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameEqualTo(String value) {
            addCriterion("Insurance_Company_Name =", value, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameNotEqualTo(String value) {
            addCriterion("Insurance_Company_Name <>", value, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameGreaterThan(String value) {
            addCriterion("Insurance_Company_Name >", value, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("Insurance_Company_Name >=", value, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameLessThan(String value) {
            addCriterion("Insurance_Company_Name <", value, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("Insurance_Company_Name <=", value, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameLike(String value) {
            addCriterion("Insurance_Company_Name like", value, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameNotLike(String value) {
            addCriterion("Insurance_Company_Name not like", value, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameIn(List<String> values) {
            addCriterion("Insurance_Company_Name in", values, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameNotIn(List<String> values) {
            addCriterion("Insurance_Company_Name not in", values, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameBetween(String value1, String value2) {
            addCriterion("Insurance_Company_Name between", value1, value2, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNameNotBetween(String value1, String value2) {
            addCriterion("Insurance_Company_Name not between", value1, value2, "insuranceCompanyName");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionIsNull() {
            addCriterion("User_Satisfaction is null");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionIsNotNull() {
            addCriterion("User_Satisfaction is not null");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionEqualTo(Integer value) {
            addCriterion("User_Satisfaction =", value, "userSatisfaction");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionNotEqualTo(Integer value) {
            addCriterion("User_Satisfaction <>", value, "userSatisfaction");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionGreaterThan(Integer value) {
            addCriterion("User_Satisfaction >", value, "userSatisfaction");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Satisfaction >=", value, "userSatisfaction");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionLessThan(Integer value) {
            addCriterion("User_Satisfaction <", value, "userSatisfaction");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionLessThanOrEqualTo(Integer value) {
            addCriterion("User_Satisfaction <=", value, "userSatisfaction");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionIn(List<Integer> values) {
            addCriterion("User_Satisfaction in", values, "userSatisfaction");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionNotIn(List<Integer> values) {
            addCriterion("User_Satisfaction not in", values, "userSatisfaction");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionBetween(Integer value1, Integer value2) {
            addCriterion("User_Satisfaction between", value1, value2, "userSatisfaction");
            return (Criteria) this;
        }

        public Criteria andUserSatisfactionNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Satisfaction not between", value1, value2, "userSatisfaction");
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