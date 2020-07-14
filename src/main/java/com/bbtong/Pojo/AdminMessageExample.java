package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AdminMessageExample() {
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

        public Criteria andAdminMessageIdIsNull() {
            addCriterion("admin_Message_Id is null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdIsNotNull() {
            addCriterion("admin_Message_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdEqualTo(Integer value) {
            addCriterion("admin_Message_Id =", value, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdNotEqualTo(Integer value) {
            addCriterion("admin_Message_Id <>", value, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdGreaterThan(Integer value) {
            addCriterion("admin_Message_Id >", value, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_Message_Id >=", value, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdLessThan(Integer value) {
            addCriterion("admin_Message_Id <", value, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_Message_Id <=", value, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdIn(List<Integer> values) {
            addCriterion("admin_Message_Id in", values, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdNotIn(List<Integer> values) {
            addCriterion("admin_Message_Id not in", values, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_Message_Id between", value1, value2, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_Message_Id not between", value1, value2, "adminMessageId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeIsNull() {
            addCriterion("admin_Message_Time is null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeIsNotNull() {
            addCriterion("admin_Message_Time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeEqualTo(String value) {
            addCriterion("admin_Message_Time =", value, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeNotEqualTo(String value) {
            addCriterion("admin_Message_Time <>", value, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeGreaterThan(String value) {
            addCriterion("admin_Message_Time >", value, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Message_Time >=", value, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeLessThan(String value) {
            addCriterion("admin_Message_Time <", value, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeLessThanOrEqualTo(String value) {
            addCriterion("admin_Message_Time <=", value, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeLike(String value) {
            addCriterion("admin_Message_Time like", value, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeNotLike(String value) {
            addCriterion("admin_Message_Time not like", value, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeIn(List<String> values) {
            addCriterion("admin_Message_Time in", values, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeNotIn(List<String> values) {
            addCriterion("admin_Message_Time not in", values, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeBetween(String value1, String value2) {
            addCriterion("admin_Message_Time between", value1, value2, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageTimeNotBetween(String value1, String value2) {
            addCriterion("admin_Message_Time not between", value1, value2, "adminMessageTime");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkIsNull() {
            addCriterion("admin_Message_Remark is null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkIsNotNull() {
            addCriterion("admin_Message_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkEqualTo(String value) {
            addCriterion("admin_Message_Remark =", value, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkNotEqualTo(String value) {
            addCriterion("admin_Message_Remark <>", value, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkGreaterThan(String value) {
            addCriterion("admin_Message_Remark >", value, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Message_Remark >=", value, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkLessThan(String value) {
            addCriterion("admin_Message_Remark <", value, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkLessThanOrEqualTo(String value) {
            addCriterion("admin_Message_Remark <=", value, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkLike(String value) {
            addCriterion("admin_Message_Remark like", value, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkNotLike(String value) {
            addCriterion("admin_Message_Remark not like", value, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkIn(List<String> values) {
            addCriterion("admin_Message_Remark in", values, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkNotIn(List<String> values) {
            addCriterion("admin_Message_Remark not in", values, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkBetween(String value1, String value2) {
            addCriterion("admin_Message_Remark between", value1, value2, "adminMessageRemark");
            return (Criteria) this;
        }

        public Criteria andAdminMessageRemarkNotBetween(String value1, String value2) {
            addCriterion("admin_Message_Remark not between", value1, value2, "adminMessageRemark");
            return (Criteria) this;
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