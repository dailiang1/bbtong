package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_Id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_Id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_Id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_Id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_Id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_Id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_Id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_Id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_Id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_Id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_Id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_Name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_Name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_Name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_Name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_Name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_Name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_Name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_Name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_Name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_Name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_Name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_Name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_Phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_Phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_Phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_Phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_Phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_Phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_Phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_Phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_Phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_Phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_Phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_Phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNull() {
            addCriterion("admin_Account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("admin_Account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("admin_Account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("admin_Account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("admin_Account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("admin_Account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("admin_Account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("admin_Account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("admin_Account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("admin_Account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("admin_Account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("admin_Account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("admin_Account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_Password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_Password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_Password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_Password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_Password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_Password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_Password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_Password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_Password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_Password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_Password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_Password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_Password not between", value1, value2, "adminPassword");
            return (Criteria) this;
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

        public Criteria andAdminStateIsNull() {
            addCriterion("admin_State is null");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNotNull() {
            addCriterion("admin_State is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStateEqualTo(Integer value) {
            addCriterion("admin_State =", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotEqualTo(Integer value) {
            addCriterion("admin_State <>", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThan(Integer value) {
            addCriterion("admin_State >", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_State >=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThan(Integer value) {
            addCriterion("admin_State <", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThanOrEqualTo(Integer value) {
            addCriterion("admin_State <=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateIn(List<Integer> values) {
            addCriterion("admin_State in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotIn(List<Integer> values) {
            addCriterion("admin_State not in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateBetween(Integer value1, Integer value2) {
            addCriterion("admin_State between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_State not between", value1, value2, "adminState");
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