package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public NewsExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("News_Id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("News_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("News_Id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("News_Id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("News_Id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("News_Id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("News_Id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("News_Id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("News_Id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("News_Id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("News_Id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("News_Id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdIsNull() {
            addCriterion("News_User_Id is null");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdIsNotNull() {
            addCriterion("News_User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdEqualTo(Integer value) {
            addCriterion("News_User_Id =", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdNotEqualTo(Integer value) {
            addCriterion("News_User_Id <>", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdGreaterThan(Integer value) {
            addCriterion("News_User_Id >", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("News_User_Id >=", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdLessThan(Integer value) {
            addCriterion("News_User_Id <", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("News_User_Id <=", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdIn(List<Integer> values) {
            addCriterion("News_User_Id in", values, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdNotIn(List<Integer> values) {
            addCriterion("News_User_Id not in", values, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdBetween(Integer value1, Integer value2) {
            addCriterion("News_User_Id between", value1, value2, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("News_User_Id not between", value1, value2, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdIsNull() {
            addCriterion("News_Entrust_Id is null");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdIsNotNull() {
            addCriterion("News_Entrust_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdEqualTo(Integer value) {
            addCriterion("News_Entrust_Id =", value, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdNotEqualTo(Integer value) {
            addCriterion("News_Entrust_Id <>", value, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdGreaterThan(Integer value) {
            addCriterion("News_Entrust_Id >", value, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("News_Entrust_Id >=", value, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdLessThan(Integer value) {
            addCriterion("News_Entrust_Id <", value, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdLessThanOrEqualTo(Integer value) {
            addCriterion("News_Entrust_Id <=", value, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdIn(List<Integer> values) {
            addCriterion("News_Entrust_Id in", values, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdNotIn(List<Integer> values) {
            addCriterion("News_Entrust_Id not in", values, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdBetween(Integer value1, Integer value2) {
            addCriterion("News_Entrust_Id between", value1, value2, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsEntrustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("News_Entrust_Id not between", value1, value2, "newsEntrustId");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberIsNull() {
            addCriterion("News_license_Number is null");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberIsNotNull() {
            addCriterion("News_license_Number is not null");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberEqualTo(String value) {
            addCriterion("News_license_Number =", value, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberNotEqualTo(String value) {
            addCriterion("News_license_Number <>", value, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberGreaterThan(String value) {
            addCriterion("News_license_Number >", value, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("News_license_Number >=", value, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberLessThan(String value) {
            addCriterion("News_license_Number <", value, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("News_license_Number <=", value, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberLike(String value) {
            addCriterion("News_license_Number like", value, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberNotLike(String value) {
            addCriterion("News_license_Number not like", value, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberIn(List<String> values) {
            addCriterion("News_license_Number in", values, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberNotIn(List<String> values) {
            addCriterion("News_license_Number not in", values, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberBetween(String value1, String value2) {
            addCriterion("News_license_Number between", value1, value2, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("News_license_Number not between", value1, value2, "newsLicenseNumber");
            return (Criteria) this;
        }

        public Criteria andNewsMessageIsNull() {
            addCriterion("News_Message is null");
            return (Criteria) this;
        }

        public Criteria andNewsMessageIsNotNull() {
            addCriterion("News_Message is not null");
            return (Criteria) this;
        }

        public Criteria andNewsMessageEqualTo(String value) {
            addCriterion("News_Message =", value, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageNotEqualTo(String value) {
            addCriterion("News_Message <>", value, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageGreaterThan(String value) {
            addCriterion("News_Message >", value, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageGreaterThanOrEqualTo(String value) {
            addCriterion("News_Message >=", value, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageLessThan(String value) {
            addCriterion("News_Message <", value, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageLessThanOrEqualTo(String value) {
            addCriterion("News_Message <=", value, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageLike(String value) {
            addCriterion("News_Message like", value, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageNotLike(String value) {
            addCriterion("News_Message not like", value, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageIn(List<String> values) {
            addCriterion("News_Message in", values, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageNotIn(List<String> values) {
            addCriterion("News_Message not in", values, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageBetween(String value1, String value2) {
            addCriterion("News_Message between", value1, value2, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsMessageNotBetween(String value1, String value2) {
            addCriterion("News_Message not between", value1, value2, "newsMessage");
            return (Criteria) this;
        }

        public Criteria andNewsStateIsNull() {
            addCriterion("News_State is null");
            return (Criteria) this;
        }

        public Criteria andNewsStateIsNotNull() {
            addCriterion("News_State is not null");
            return (Criteria) this;
        }

        public Criteria andNewsStateEqualTo(Integer value) {
            addCriterion("News_State =", value, "newsState");
            return (Criteria) this;
        }

        public Criteria andNewsStateNotEqualTo(Integer value) {
            addCriterion("News_State <>", value, "newsState");
            return (Criteria) this;
        }

        public Criteria andNewsStateGreaterThan(Integer value) {
            addCriterion("News_State >", value, "newsState");
            return (Criteria) this;
        }

        public Criteria andNewsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("News_State >=", value, "newsState");
            return (Criteria) this;
        }

        public Criteria andNewsStateLessThan(Integer value) {
            addCriterion("News_State <", value, "newsState");
            return (Criteria) this;
        }

        public Criteria andNewsStateLessThanOrEqualTo(Integer value) {
            addCriterion("News_State <=", value, "newsState");
            return (Criteria) this;
        }

        public Criteria andNewsStateIn(List<Integer> values) {
            addCriterion("News_State in", values, "newsState");
            return (Criteria) this;
        }

        public Criteria andNewsStateNotIn(List<Integer> values) {
            addCriterion("News_State not in", values, "newsState");
            return (Criteria) this;
        }

        public Criteria andNewsStateBetween(Integer value1, Integer value2) {
            addCriterion("News_State between", value1, value2, "newsState");
            return (Criteria) this;
        }

        public Criteria andNewsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("News_State not between", value1, value2, "newsState");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`State` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`State` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("`State` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("`State` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("`State` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("`State` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("`State` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("`State` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("`State` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("`State` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("`State` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("`State` not between", value1, value2, "state");
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