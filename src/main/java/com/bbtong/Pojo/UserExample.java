package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserExample() {
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

        public Criteria andUserNicknameIsNull() {
            addCriterion("User_Nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("User_Nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("User_Nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("User_Nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("User_Nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("User_Nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("User_Nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("User_Nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("User_Nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("User_Nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("User_Nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("User_Nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("User_Nickname not between", value1, value2, "userNickname");
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

        public Criteria andUserIntegrityIsNull() {
            addCriterion("User_Integrity is null");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityIsNotNull() {
            addCriterion("User_Integrity is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityEqualTo(Double value) {
            addCriterion("User_Integrity =", value, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityNotEqualTo(Double value) {
            addCriterion("User_Integrity <>", value, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityGreaterThan(Double value) {
            addCriterion("User_Integrity >", value, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityGreaterThanOrEqualTo(Double value) {
            addCriterion("User_Integrity >=", value, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityLessThan(Double value) {
            addCriterion("User_Integrity <", value, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityLessThanOrEqualTo(Double value) {
            addCriterion("User_Integrity <=", value, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityIn(List<Double> values) {
            addCriterion("User_Integrity in", values, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityNotIn(List<Double> values) {
            addCriterion("User_Integrity not in", values, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityBetween(Double value1, Double value2) {
            addCriterion("User_Integrity between", value1, value2, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserIntegrityNotBetween(Double value1, Double value2) {
            addCriterion("User_Integrity not between", value1, value2, "userIntegrity");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateIsNull() {
            addCriterion("User_Member_State is null");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateIsNotNull() {
            addCriterion("User_Member_State is not null");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateEqualTo(Integer value) {
            addCriterion("User_Member_State =", value, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateNotEqualTo(Integer value) {
            addCriterion("User_Member_State <>", value, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateGreaterThan(Integer value) {
            addCriterion("User_Member_State >", value, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Member_State >=", value, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateLessThan(Integer value) {
            addCriterion("User_Member_State <", value, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateLessThanOrEqualTo(Integer value) {
            addCriterion("User_Member_State <=", value, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateIn(List<Integer> values) {
            addCriterion("User_Member_State in", values, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateNotIn(List<Integer> values) {
            addCriterion("User_Member_State not in", values, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateBetween(Integer value1, Integer value2) {
            addCriterion("User_Member_State between", value1, value2, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberStateNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Member_State not between", value1, value2, "userMemberState");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginIsNull() {
            addCriterion("`User_ Member_Begin` is null");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginIsNotNull() {
            addCriterion("`User_ Member_Begin` is not null");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginEqualTo(String value) {
            addCriterion("`User_ Member_Begin` =", value, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginNotEqualTo(String value) {
            addCriterion("`User_ Member_Begin` <>", value, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginGreaterThan(String value) {
            addCriterion("`User_ Member_Begin` >", value, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginGreaterThanOrEqualTo(String value) {
            addCriterion("`User_ Member_Begin` >=", value, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginLessThan(String value) {
            addCriterion("`User_ Member_Begin` <", value, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginLessThanOrEqualTo(String value) {
            addCriterion("`User_ Member_Begin` <=", value, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginLike(String value) {
            addCriterion("`User_ Member_Begin` like", value, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginNotLike(String value) {
            addCriterion("`User_ Member_Begin` not like", value, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginIn(List<String> values) {
            addCriterion("`User_ Member_Begin` in", values, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginNotIn(List<String> values) {
            addCriterion("`User_ Member_Begin` not in", values, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginBetween(String value1, String value2) {
            addCriterion("`User_ Member_Begin` between", value1, value2, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberBeginNotBetween(String value1, String value2) {
            addCriterion("`User_ Member_Begin` not between", value1, value2, "userMemberBegin");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishIsNull() {
            addCriterion("`User_ Member_Finish` is null");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishIsNotNull() {
            addCriterion("`User_ Member_Finish` is not null");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishEqualTo(String value) {
            addCriterion("`User_ Member_Finish` =", value, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishNotEqualTo(String value) {
            addCriterion("`User_ Member_Finish` <>", value, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishGreaterThan(String value) {
            addCriterion("`User_ Member_Finish` >", value, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishGreaterThanOrEqualTo(String value) {
            addCriterion("`User_ Member_Finish` >=", value, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishLessThan(String value) {
            addCriterion("`User_ Member_Finish` <", value, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishLessThanOrEqualTo(String value) {
            addCriterion("`User_ Member_Finish` <=", value, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishLike(String value) {
            addCriterion("`User_ Member_Finish` like", value, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishNotLike(String value) {
            addCriterion("`User_ Member_Finish` not like", value, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishIn(List<String> values) {
            addCriterion("`User_ Member_Finish` in", values, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishNotIn(List<String> values) {
            addCriterion("`User_ Member_Finish` not in", values, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishBetween(String value1, String value2) {
            addCriterion("`User_ Member_Finish` between", value1, value2, "userMemberFinish");
            return (Criteria) this;
        }

        public Criteria andUserMemberFinishNotBetween(String value1, String value2) {
            addCriterion("`User_ Member_Finish` not between", value1, value2, "userMemberFinish");
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

        public Criteria andUserIdentityCardIsNull() {
            addCriterion("User_Identity_Card is null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIsNotNull() {
            addCriterion("User_Identity_Card is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardEqualTo(String value) {
            addCriterion("User_Identity_Card =", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotEqualTo(String value) {
            addCriterion("User_Identity_Card <>", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardGreaterThan(String value) {
            addCriterion("User_Identity_Card >", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("User_Identity_Card >=", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLessThan(String value) {
            addCriterion("User_Identity_Card <", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("User_Identity_Card <=", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardLike(String value) {
            addCriterion("User_Identity_Card like", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotLike(String value) {
            addCriterion("User_Identity_Card not like", value, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardIn(List<String> values) {
            addCriterion("User_Identity_Card in", values, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotIn(List<String> values) {
            addCriterion("User_Identity_Card not in", values, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardBetween(String value1, String value2) {
            addCriterion("User_Identity_Card between", value1, value2, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardNotBetween(String value1, String value2) {
            addCriterion("User_Identity_Card not between", value1, value2, "userIdentityCard");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontIsNull() {
            addCriterion("User_Identity_Card_Front is null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontIsNotNull() {
            addCriterion("User_Identity_Card_Front is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontEqualTo(String value) {
            addCriterion("User_Identity_Card_Front =", value, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontNotEqualTo(String value) {
            addCriterion("User_Identity_Card_Front <>", value, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontGreaterThan(String value) {
            addCriterion("User_Identity_Card_Front >", value, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("User_Identity_Card_Front >=", value, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontLessThan(String value) {
            addCriterion("User_Identity_Card_Front <", value, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontLessThanOrEqualTo(String value) {
            addCriterion("User_Identity_Card_Front <=", value, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontLike(String value) {
            addCriterion("User_Identity_Card_Front like", value, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontNotLike(String value) {
            addCriterion("User_Identity_Card_Front not like", value, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontIn(List<String> values) {
            addCriterion("User_Identity_Card_Front in", values, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontNotIn(List<String> values) {
            addCriterion("User_Identity_Card_Front not in", values, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontBetween(String value1, String value2) {
            addCriterion("User_Identity_Card_Front between", value1, value2, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardFrontNotBetween(String value1, String value2) {
            addCriterion("User_Identity_Card_Front not between", value1, value2, "userIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoIsNull() {
            addCriterion("User_Identity_Card_Verso is null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoIsNotNull() {
            addCriterion("User_Identity_Card_Verso is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoEqualTo(String value) {
            addCriterion("User_Identity_Card_Verso =", value, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoNotEqualTo(String value) {
            addCriterion("User_Identity_Card_Verso <>", value, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoGreaterThan(String value) {
            addCriterion("User_Identity_Card_Verso >", value, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoGreaterThanOrEqualTo(String value) {
            addCriterion("User_Identity_Card_Verso >=", value, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoLessThan(String value) {
            addCriterion("User_Identity_Card_Verso <", value, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoLessThanOrEqualTo(String value) {
            addCriterion("User_Identity_Card_Verso <=", value, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoLike(String value) {
            addCriterion("User_Identity_Card_Verso like", value, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoNotLike(String value) {
            addCriterion("User_Identity_Card_Verso not like", value, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoIn(List<String> values) {
            addCriterion("User_Identity_Card_Verso in", values, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoNotIn(List<String> values) {
            addCriterion("User_Identity_Card_Verso not in", values, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoBetween(String value1, String value2) {
            addCriterion("User_Identity_Card_Verso between", value1, value2, "userIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andUserIdentityCardVersoNotBetween(String value1, String value2) {
            addCriterion("User_Identity_Card_Verso not between", value1, value2, "userIdentityCardVerso");
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

        public Criteria andUserOpenidIsNull() {
            addCriterion("User_OpenId is null");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIsNotNull() {
            addCriterion("User_OpenId is not null");
            return (Criteria) this;
        }

        public Criteria andUserOpenidEqualTo(String value) {
            addCriterion("User_OpenId =", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotEqualTo(String value) {
            addCriterion("User_OpenId <>", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidGreaterThan(String value) {
            addCriterion("User_OpenId >", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("User_OpenId >=", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLessThan(String value) {
            addCriterion("User_OpenId <", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLessThanOrEqualTo(String value) {
            addCriterion("User_OpenId <=", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidLike(String value) {
            addCriterion("User_OpenId like", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotLike(String value) {
            addCriterion("User_OpenId not like", value, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidIn(List<String> values) {
            addCriterion("User_OpenId in", values, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotIn(List<String> values) {
            addCriterion("User_OpenId not in", values, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidBetween(String value1, String value2) {
            addCriterion("User_OpenId between", value1, value2, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserOpenidNotBetween(String value1, String value2) {
            addCriterion("User_OpenId not between", value1, value2, "userOpenid");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("User_State is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("User_State is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Integer value) {
            addCriterion("User_State =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Integer value) {
            addCriterion("User_State <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Integer value) {
            addCriterion("User_State >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_State >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Integer value) {
            addCriterion("User_State <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Integer value) {
            addCriterion("User_State <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Integer> values) {
            addCriterion("User_State in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Integer> values) {
            addCriterion("User_State not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Integer value1, Integer value2) {
            addCriterion("User_State between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Integer value1, Integer value2) {
            addCriterion("User_State not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberIsNull() {
            addCriterion("User_Entrust_number is null");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberIsNotNull() {
            addCriterion("User_Entrust_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberEqualTo(Integer value) {
            addCriterion("User_Entrust_number =", value, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberNotEqualTo(Integer value) {
            addCriterion("User_Entrust_number <>", value, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberGreaterThan(Integer value) {
            addCriterion("User_Entrust_number >", value, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Entrust_number >=", value, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberLessThan(Integer value) {
            addCriterion("User_Entrust_number <", value, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberLessThanOrEqualTo(Integer value) {
            addCriterion("User_Entrust_number <=", value, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberIn(List<Integer> values) {
            addCriterion("User_Entrust_number in", values, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberNotIn(List<Integer> values) {
            addCriterion("User_Entrust_number not in", values, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberBetween(Integer value1, Integer value2) {
            addCriterion("User_Entrust_number between", value1, value2, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrustNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Entrust_number not between", value1, value2, "userEntrustNumber");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerIsNull() {
            addCriterion("User_Order_numer is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerIsNotNull() {
            addCriterion("User_Order_numer is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerEqualTo(Integer value) {
            addCriterion("User_Order_numer =", value, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerNotEqualTo(Integer value) {
            addCriterion("User_Order_numer <>", value, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerGreaterThan(Integer value) {
            addCriterion("User_Order_numer >", value, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Order_numer >=", value, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerLessThan(Integer value) {
            addCriterion("User_Order_numer <", value, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerLessThanOrEqualTo(Integer value) {
            addCriterion("User_Order_numer <=", value, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerIn(List<Integer> values) {
            addCriterion("User_Order_numer in", values, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerNotIn(List<Integer> values) {
            addCriterion("User_Order_numer not in", values, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerBetween(Integer value1, Integer value2) {
            addCriterion("User_Order_numer between", value1, value2, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserOrderNumerNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Order_numer not between", value1, value2, "userOrderNumer");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyIsNull() {
            addCriterion("User_Entrust_Money is null");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyIsNotNull() {
            addCriterion("User_Entrust_Money is not null");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyEqualTo(Double value) {
            addCriterion("User_Entrust_Money =", value, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyNotEqualTo(Double value) {
            addCriterion("User_Entrust_Money <>", value, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyGreaterThan(Double value) {
            addCriterion("User_Entrust_Money >", value, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("User_Entrust_Money >=", value, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyLessThan(Double value) {
            addCriterion("User_Entrust_Money <", value, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyLessThanOrEqualTo(Double value) {
            addCriterion("User_Entrust_Money <=", value, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyIn(List<Double> values) {
            addCriterion("User_Entrust_Money in", values, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyNotIn(List<Double> values) {
            addCriterion("User_Entrust_Money not in", values, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyBetween(Double value1, Double value2) {
            addCriterion("User_Entrust_Money between", value1, value2, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserEntrustMoneyNotBetween(Double value1, Double value2) {
            addCriterion("User_Entrust_Money not between", value1, value2, "userEntrustMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyIsNull() {
            addCriterion("User_order_Money is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyIsNotNull() {
            addCriterion("User_order_Money is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyEqualTo(Double value) {
            addCriterion("User_order_Money =", value, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyNotEqualTo(Double value) {
            addCriterion("User_order_Money <>", value, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyGreaterThan(Double value) {
            addCriterion("User_order_Money >", value, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("User_order_Money >=", value, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyLessThan(Double value) {
            addCriterion("User_order_Money <", value, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("User_order_Money <=", value, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyIn(List<Double> values) {
            addCriterion("User_order_Money in", values, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyNotIn(List<Double> values) {
            addCriterion("User_order_Money not in", values, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyBetween(Double value1, Double value2) {
            addCriterion("User_order_Money between", value1, value2, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserOrderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("User_order_Money not between", value1, value2, "userOrderMoney");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("User_Number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("User_Number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(String value) {
            addCriterion("User_Number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(String value) {
            addCriterion("User_Number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(String value) {
            addCriterion("User_Number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("User_Number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(String value) {
            addCriterion("User_Number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(String value) {
            addCriterion("User_Number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLike(String value) {
            addCriterion("User_Number like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotLike(String value) {
            addCriterion("User_Number not like", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<String> values) {
            addCriterion("User_Number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<String> values) {
            addCriterion("User_Number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(String value1, String value2) {
            addCriterion("User_Number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(String value1, String value2) {
            addCriterion("User_Number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserPactIsNull() {
            addCriterion("User_Pact is null");
            return (Criteria) this;
        }

        public Criteria andUserPactIsNotNull() {
            addCriterion("User_Pact is not null");
            return (Criteria) this;
        }

        public Criteria andUserPactEqualTo(String value) {
            addCriterion("User_Pact =", value, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactNotEqualTo(String value) {
            addCriterion("User_Pact <>", value, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactGreaterThan(String value) {
            addCriterion("User_Pact >", value, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactGreaterThanOrEqualTo(String value) {
            addCriterion("User_Pact >=", value, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactLessThan(String value) {
            addCriterion("User_Pact <", value, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactLessThanOrEqualTo(String value) {
            addCriterion("User_Pact <=", value, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactLike(String value) {
            addCriterion("User_Pact like", value, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactNotLike(String value) {
            addCriterion("User_Pact not like", value, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactIn(List<String> values) {
            addCriterion("User_Pact in", values, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactNotIn(List<String> values) {
            addCriterion("User_Pact not in", values, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactBetween(String value1, String value2) {
            addCriterion("User_Pact between", value1, value2, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserPactNotBetween(String value1, String value2) {
            addCriterion("User_Pact not between", value1, value2, "userPact");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateIsNull() {
            addCriterion("User_Order_State is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateIsNotNull() {
            addCriterion("User_Order_State is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateEqualTo(String value) {
            addCriterion("User_Order_State =", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateNotEqualTo(String value) {
            addCriterion("User_Order_State <>", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateGreaterThan(String value) {
            addCriterion("User_Order_State >", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("User_Order_State >=", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateLessThan(String value) {
            addCriterion("User_Order_State <", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateLessThanOrEqualTo(String value) {
            addCriterion("User_Order_State <=", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateLike(String value) {
            addCriterion("User_Order_State like", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateNotLike(String value) {
            addCriterion("User_Order_State not like", value, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateIn(List<String> values) {
            addCriterion("User_Order_State in", values, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateNotIn(List<String> values) {
            addCriterion("User_Order_State not in", values, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateBetween(String value1, String value2) {
            addCriterion("User_Order_State between", value1, value2, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserOrderStateNotBetween(String value1, String value2) {
            addCriterion("User_Order_State not between", value1, value2, "userOrderState");
            return (Criteria) this;
        }

        public Criteria andUserTietongIsNull() {
            addCriterion("User_tietong is null");
            return (Criteria) this;
        }

        public Criteria andUserTietongIsNotNull() {
            addCriterion("User_tietong is not null");
            return (Criteria) this;
        }

        public Criteria andUserTietongEqualTo(String value) {
            addCriterion("User_tietong =", value, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongNotEqualTo(String value) {
            addCriterion("User_tietong <>", value, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongGreaterThan(String value) {
            addCriterion("User_tietong >", value, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongGreaterThanOrEqualTo(String value) {
            addCriterion("User_tietong >=", value, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongLessThan(String value) {
            addCriterion("User_tietong <", value, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongLessThanOrEqualTo(String value) {
            addCriterion("User_tietong <=", value, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongLike(String value) {
            addCriterion("User_tietong like", value, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongNotLike(String value) {
            addCriterion("User_tietong not like", value, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongIn(List<String> values) {
            addCriterion("User_tietong in", values, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongNotIn(List<String> values) {
            addCriterion("User_tietong not in", values, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongBetween(String value1, String value2) {
            addCriterion("User_tietong between", value1, value2, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserTietongNotBetween(String value1, String value2) {
            addCriterion("User_tietong not between", value1, value2, "userTietong");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("User_Address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("User_Address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("User_Address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("User_Address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("User_Address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("User_Address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("User_Address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("User_Address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("User_Address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("User_Address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("User_Address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("User_Address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("User_Address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("User_Address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andTietongNumberIsNull() {
            addCriterion("Tietong_Number is null");
            return (Criteria) this;
        }

        public Criteria andTietongNumberIsNotNull() {
            addCriterion("Tietong_Number is not null");
            return (Criteria) this;
        }

        public Criteria andTietongNumberEqualTo(String value) {
            addCriterion("Tietong_Number =", value, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberNotEqualTo(String value) {
            addCriterion("Tietong_Number <>", value, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberGreaterThan(String value) {
            addCriterion("Tietong_Number >", value, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Tietong_Number >=", value, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberLessThan(String value) {
            addCriterion("Tietong_Number <", value, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberLessThanOrEqualTo(String value) {
            addCriterion("Tietong_Number <=", value, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberLike(String value) {
            addCriterion("Tietong_Number like", value, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberNotLike(String value) {
            addCriterion("Tietong_Number not like", value, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberIn(List<String> values) {
            addCriterion("Tietong_Number in", values, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberNotIn(List<String> values) {
            addCriterion("Tietong_Number not in", values, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberBetween(String value1, String value2) {
            addCriterion("Tietong_Number between", value1, value2, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andTietongNumberNotBetween(String value1, String value2) {
            addCriterion("Tietong_Number not between", value1, value2, "tietongNumber");
            return (Criteria) this;
        }

        public Criteria andIntentionStateIsNull() {
            addCriterion("Intention_State is null");
            return (Criteria) this;
        }

        public Criteria andIntentionStateIsNotNull() {
            addCriterion("Intention_State is not null");
            return (Criteria) this;
        }

        public Criteria andIntentionStateEqualTo(Integer value) {
            addCriterion("Intention_State =", value, "intentionState");
            return (Criteria) this;
        }

        public Criteria andIntentionStateNotEqualTo(Integer value) {
            addCriterion("Intention_State <>", value, "intentionState");
            return (Criteria) this;
        }

        public Criteria andIntentionStateGreaterThan(Integer value) {
            addCriterion("Intention_State >", value, "intentionState");
            return (Criteria) this;
        }

        public Criteria andIntentionStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Intention_State >=", value, "intentionState");
            return (Criteria) this;
        }

        public Criteria andIntentionStateLessThan(Integer value) {
            addCriterion("Intention_State <", value, "intentionState");
            return (Criteria) this;
        }

        public Criteria andIntentionStateLessThanOrEqualTo(Integer value) {
            addCriterion("Intention_State <=", value, "intentionState");
            return (Criteria) this;
        }

        public Criteria andIntentionStateIn(List<Integer> values) {
            addCriterion("Intention_State in", values, "intentionState");
            return (Criteria) this;
        }

        public Criteria andIntentionStateNotIn(List<Integer> values) {
            addCriterion("Intention_State not in", values, "intentionState");
            return (Criteria) this;
        }

        public Criteria andIntentionStateBetween(Integer value1, Integer value2) {
            addCriterion("Intention_State between", value1, value2, "intentionState");
            return (Criteria) this;
        }

        public Criteria andIntentionStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Intention_State not between", value1, value2, "intentionState");
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