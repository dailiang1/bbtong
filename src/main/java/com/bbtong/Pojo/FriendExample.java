package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class FriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FriendExample() {
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

        public Criteria andFriendIdIsNull() {
            addCriterion("Friend_Id is null");
            return (Criteria) this;
        }

        public Criteria andFriendIdIsNotNull() {
            addCriterion("Friend_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFriendIdEqualTo(Integer value) {
            addCriterion("Friend_Id =", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotEqualTo(Integer value) {
            addCriterion("Friend_Id <>", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdGreaterThan(Integer value) {
            addCriterion("Friend_Id >", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Friend_Id >=", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdLessThan(Integer value) {
            addCriterion("Friend_Id <", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdLessThanOrEqualTo(Integer value) {
            addCriterion("Friend_Id <=", value, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdIn(List<Integer> values) {
            addCriterion("Friend_Id in", values, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotIn(List<Integer> values) {
            addCriterion("Friend_Id not in", values, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdBetween(Integer value1, Integer value2) {
            addCriterion("Friend_Id between", value1, value2, "friendId");
            return (Criteria) this;
        }

        public Criteria andFriendIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Friend_Id not between", value1, value2, "friendId");
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

        public Criteria andFriendUserIdIsNull() {
            addCriterion("Friend_User_Id is null");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdIsNotNull() {
            addCriterion("Friend_User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdEqualTo(Integer value) {
            addCriterion("Friend_User_Id =", value, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdNotEqualTo(Integer value) {
            addCriterion("Friend_User_Id <>", value, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdGreaterThan(Integer value) {
            addCriterion("Friend_User_Id >", value, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Friend_User_Id >=", value, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdLessThan(Integer value) {
            addCriterion("Friend_User_Id <", value, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("Friend_User_Id <=", value, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdIn(List<Integer> values) {
            addCriterion("Friend_User_Id in", values, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdNotIn(List<Integer> values) {
            addCriterion("Friend_User_Id not in", values, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdBetween(Integer value1, Integer value2) {
            addCriterion("Friend_User_Id between", value1, value2, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Friend_User_Id not between", value1, value2, "friendUserId");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkIsNull() {
            addCriterion("Friend_Remark is null");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkIsNotNull() {
            addCriterion("Friend_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkEqualTo(String value) {
            addCriterion("Friend_Remark =", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkNotEqualTo(String value) {
            addCriterion("Friend_Remark <>", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkGreaterThan(String value) {
            addCriterion("Friend_Remark >", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Friend_Remark >=", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkLessThan(String value) {
            addCriterion("Friend_Remark <", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkLessThanOrEqualTo(String value) {
            addCriterion("Friend_Remark <=", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkLike(String value) {
            addCriterion("Friend_Remark like", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkNotLike(String value) {
            addCriterion("Friend_Remark not like", value, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkIn(List<String> values) {
            addCriterion("Friend_Remark in", values, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkNotIn(List<String> values) {
            addCriterion("Friend_Remark not in", values, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkBetween(String value1, String value2) {
            addCriterion("Friend_Remark between", value1, value2, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendRemarkNotBetween(String value1, String value2) {
            addCriterion("Friend_Remark not between", value1, value2, "friendRemark");
            return (Criteria) this;
        }

        public Criteria andFriendNameIsNull() {
            addCriterion("Friend_Name is null");
            return (Criteria) this;
        }

        public Criteria andFriendNameIsNotNull() {
            addCriterion("Friend_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFriendNameEqualTo(String value) {
            addCriterion("Friend_Name =", value, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameNotEqualTo(String value) {
            addCriterion("Friend_Name <>", value, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameGreaterThan(String value) {
            addCriterion("Friend_Name >", value, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameGreaterThanOrEqualTo(String value) {
            addCriterion("Friend_Name >=", value, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameLessThan(String value) {
            addCriterion("Friend_Name <", value, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameLessThanOrEqualTo(String value) {
            addCriterion("Friend_Name <=", value, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameLike(String value) {
            addCriterion("Friend_Name like", value, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameNotLike(String value) {
            addCriterion("Friend_Name not like", value, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameIn(List<String> values) {
            addCriterion("Friend_Name in", values, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameNotIn(List<String> values) {
            addCriterion("Friend_Name not in", values, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameBetween(String value1, String value2) {
            addCriterion("Friend_Name between", value1, value2, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendNameNotBetween(String value1, String value2) {
            addCriterion("Friend_Name not between", value1, value2, "friendName");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneIsNull() {
            addCriterion("Friend_phone is null");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneIsNotNull() {
            addCriterion("Friend_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneEqualTo(String value) {
            addCriterion("Friend_phone =", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneNotEqualTo(String value) {
            addCriterion("Friend_phone <>", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneGreaterThan(String value) {
            addCriterion("Friend_phone >", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Friend_phone >=", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneLessThan(String value) {
            addCriterion("Friend_phone <", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneLessThanOrEqualTo(String value) {
            addCriterion("Friend_phone <=", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneLike(String value) {
            addCriterion("Friend_phone like", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneNotLike(String value) {
            addCriterion("Friend_phone not like", value, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneIn(List<String> values) {
            addCriterion("Friend_phone in", values, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneNotIn(List<String> values) {
            addCriterion("Friend_phone not in", values, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneBetween(String value1, String value2) {
            addCriterion("Friend_phone between", value1, value2, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendPhoneNotBetween(String value1, String value2) {
            addCriterion("Friend_phone not between", value1, value2, "friendPhone");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameIsNull() {
            addCriterion("Friend_Company_Name is null");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameIsNotNull() {
            addCriterion("Friend_Company_Name is not null");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameEqualTo(String value) {
            addCriterion("Friend_Company_Name =", value, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameNotEqualTo(String value) {
            addCriterion("Friend_Company_Name <>", value, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameGreaterThan(String value) {
            addCriterion("Friend_Company_Name >", value, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("Friend_Company_Name >=", value, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameLessThan(String value) {
            addCriterion("Friend_Company_Name <", value, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("Friend_Company_Name <=", value, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameLike(String value) {
            addCriterion("Friend_Company_Name like", value, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameNotLike(String value) {
            addCriterion("Friend_Company_Name not like", value, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameIn(List<String> values) {
            addCriterion("Friend_Company_Name in", values, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameNotIn(List<String> values) {
            addCriterion("Friend_Company_Name not in", values, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameBetween(String value1, String value2) {
            addCriterion("Friend_Company_Name between", value1, value2, "friendCompanyName");
            return (Criteria) this;
        }

        public Criteria andFriendCompanyNameNotBetween(String value1, String value2) {
            addCriterion("Friend_Company_Name not between", value1, value2, "friendCompanyName");
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