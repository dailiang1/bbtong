package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AdminRoleExample() {
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

        public Criteria andAdminRoleIdIsNull() {
            addCriterion("admin_Role_Id is null");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdIsNotNull() {
            addCriterion("admin_Role_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdEqualTo(Integer value) {
            addCriterion("admin_Role_Id =", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdNotEqualTo(Integer value) {
            addCriterion("admin_Role_Id <>", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdGreaterThan(Integer value) {
            addCriterion("admin_Role_Id >", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_Role_Id >=", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdLessThan(Integer value) {
            addCriterion("admin_Role_Id <", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_Role_Id <=", value, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdIn(List<Integer> values) {
            addCriterion("admin_Role_Id in", values, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdNotIn(List<Integer> values) {
            addCriterion("admin_Role_Id not in", values, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_Role_Id between", value1, value2, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_Role_Id not between", value1, value2, "adminRoleId");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameIsNull() {
            addCriterion("admin_Role_Name is null");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameIsNotNull() {
            addCriterion("admin_Role_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameEqualTo(String value) {
            addCriterion("admin_Role_Name =", value, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameNotEqualTo(String value) {
            addCriterion("admin_Role_Name <>", value, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameGreaterThan(String value) {
            addCriterion("admin_Role_Name >", value, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Role_Name >=", value, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameLessThan(String value) {
            addCriterion("admin_Role_Name <", value, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameLessThanOrEqualTo(String value) {
            addCriterion("admin_Role_Name <=", value, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameLike(String value) {
            addCriterion("admin_Role_Name like", value, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameNotLike(String value) {
            addCriterion("admin_Role_Name not like", value, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameIn(List<String> values) {
            addCriterion("admin_Role_Name in", values, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameNotIn(List<String> values) {
            addCriterion("admin_Role_Name not in", values, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameBetween(String value1, String value2) {
            addCriterion("admin_Role_Name between", value1, value2, "adminRoleName");
            return (Criteria) this;
        }

        public Criteria andAdminRoleNameNotBetween(String value1, String value2) {
            addCriterion("admin_Role_Name not between", value1, value2, "adminRoleName");
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