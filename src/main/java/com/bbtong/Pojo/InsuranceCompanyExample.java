package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class InsuranceCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public InsuranceCompanyExample() {
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

        public Criteria andInsuranceCompanyIdIsNull() {
            addCriterion("Insurance_Company_Id is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdIsNotNull() {
            addCriterion("Insurance_Company_Id is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdEqualTo(Integer value) {
            addCriterion("Insurance_Company_Id =", value, "insuranceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdNotEqualTo(Integer value) {
            addCriterion("Insurance_Company_Id <>", value, "insuranceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdGreaterThan(Integer value) {
            addCriterion("Insurance_Company_Id >", value, "insuranceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Insurance_Company_Id >=", value, "insuranceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdLessThan(Integer value) {
            addCriterion("Insurance_Company_Id <", value, "insuranceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("Insurance_Company_Id <=", value, "insuranceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdIn(List<Integer> values) {
            addCriterion("Insurance_Company_Id in", values, "insuranceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdNotIn(List<Integer> values) {
            addCriterion("Insurance_Company_Id not in", values, "insuranceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("Insurance_Company_Id between", value1, value2, "insuranceCompanyId");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Insurance_Company_Id not between", value1, value2, "insuranceCompanyId");
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