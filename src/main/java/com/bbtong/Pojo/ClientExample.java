package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ClientExample() {
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

        public Criteria andClientIdIsNull() {
            addCriterion("Client_Id is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("Client_Id is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(Integer value) {
            addCriterion("Client_Id =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(Integer value) {
            addCriterion("Client_Id <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(Integer value) {
            addCriterion("Client_Id >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Client_Id >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(Integer value) {
            addCriterion("Client_Id <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Integer value) {
            addCriterion("Client_Id <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<Integer> values) {
            addCriterion("Client_Id in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<Integer> values) {
            addCriterion("Client_Id not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(Integer value1, Integer value2) {
            addCriterion("Client_Id between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Client_Id not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientWayIsNull() {
            addCriterion("Client_way is null");
            return (Criteria) this;
        }

        public Criteria andClientWayIsNotNull() {
            addCriterion("Client_way is not null");
            return (Criteria) this;
        }

        public Criteria andClientWayEqualTo(String value) {
            addCriterion("Client_way =", value, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayNotEqualTo(String value) {
            addCriterion("Client_way <>", value, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayGreaterThan(String value) {
            addCriterion("Client_way >", value, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayGreaterThanOrEqualTo(String value) {
            addCriterion("Client_way >=", value, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayLessThan(String value) {
            addCriterion("Client_way <", value, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayLessThanOrEqualTo(String value) {
            addCriterion("Client_way <=", value, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayLike(String value) {
            addCriterion("Client_way like", value, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayNotLike(String value) {
            addCriterion("Client_way not like", value, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayIn(List<String> values) {
            addCriterion("Client_way in", values, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayNotIn(List<String> values) {
            addCriterion("Client_way not in", values, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayBetween(String value1, String value2) {
            addCriterion("Client_way between", value1, value2, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientWayNotBetween(String value1, String value2) {
            addCriterion("Client_way not between", value1, value2, "clientWay");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("Client_Name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("Client_Name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("Client_Name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("Client_Name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("Client_Name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("Client_Name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("Client_Name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("Client_Name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("Client_Name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("Client_Name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("Client_Name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("Client_Name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("Client_Name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("Client_Name not between", value1, value2, "clientName");
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

        public Criteria andClientIdentityCardIsNull() {
            addCriterion("Client_Identity_Card is null");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardIsNotNull() {
            addCriterion("Client_Identity_Card is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardEqualTo(String value) {
            addCriterion("Client_Identity_Card =", value, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardNotEqualTo(String value) {
            addCriterion("Client_Identity_Card <>", value, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardGreaterThan(String value) {
            addCriterion("Client_Identity_Card >", value, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("Client_Identity_Card >=", value, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardLessThan(String value) {
            addCriterion("Client_Identity_Card <", value, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("Client_Identity_Card <=", value, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardLike(String value) {
            addCriterion("Client_Identity_Card like", value, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardNotLike(String value) {
            addCriterion("Client_Identity_Card not like", value, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardIn(List<String> values) {
            addCriterion("Client_Identity_Card in", values, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardNotIn(List<String> values) {
            addCriterion("Client_Identity_Card not in", values, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardBetween(String value1, String value2) {
            addCriterion("Client_Identity_Card between", value1, value2, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardNotBetween(String value1, String value2) {
            addCriterion("Client_Identity_Card not between", value1, value2, "clientIdentityCard");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontIsNull() {
            addCriterion("Client_Identity_Card_Front is null");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontIsNotNull() {
            addCriterion("Client_Identity_Card_Front is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontEqualTo(String value) {
            addCriterion("Client_Identity_Card_Front =", value, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontNotEqualTo(String value) {
            addCriterion("Client_Identity_Card_Front <>", value, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontGreaterThan(String value) {
            addCriterion("Client_Identity_Card_Front >", value, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontGreaterThanOrEqualTo(String value) {
            addCriterion("Client_Identity_Card_Front >=", value, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontLessThan(String value) {
            addCriterion("Client_Identity_Card_Front <", value, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontLessThanOrEqualTo(String value) {
            addCriterion("Client_Identity_Card_Front <=", value, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontLike(String value) {
            addCriterion("Client_Identity_Card_Front like", value, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontNotLike(String value) {
            addCriterion("Client_Identity_Card_Front not like", value, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontIn(List<String> values) {
            addCriterion("Client_Identity_Card_Front in", values, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontNotIn(List<String> values) {
            addCriterion("Client_Identity_Card_Front not in", values, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontBetween(String value1, String value2) {
            addCriterion("Client_Identity_Card_Front between", value1, value2, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardFrontNotBetween(String value1, String value2) {
            addCriterion("Client_Identity_Card_Front not between", value1, value2, "clientIdentityCardFront");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoIsNull() {
            addCriterion("Client_Identity_Card_Verso is null");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoIsNotNull() {
            addCriterion("Client_Identity_Card_Verso is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoEqualTo(String value) {
            addCriterion("Client_Identity_Card_Verso =", value, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoNotEqualTo(String value) {
            addCriterion("Client_Identity_Card_Verso <>", value, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoGreaterThan(String value) {
            addCriterion("Client_Identity_Card_Verso >", value, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoGreaterThanOrEqualTo(String value) {
            addCriterion("Client_Identity_Card_Verso >=", value, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoLessThan(String value) {
            addCriterion("Client_Identity_Card_Verso <", value, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoLessThanOrEqualTo(String value) {
            addCriterion("Client_Identity_Card_Verso <=", value, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoLike(String value) {
            addCriterion("Client_Identity_Card_Verso like", value, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoNotLike(String value) {
            addCriterion("Client_Identity_Card_Verso not like", value, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoIn(List<String> values) {
            addCriterion("Client_Identity_Card_Verso in", values, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoNotIn(List<String> values) {
            addCriterion("Client_Identity_Card_Verso not in", values, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoBetween(String value1, String value2) {
            addCriterion("Client_Identity_Card_Verso between", value1, value2, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientIdentityCardVersoNotBetween(String value1, String value2) {
            addCriterion("Client_Identity_Card_Verso not between", value1, value2, "clientIdentityCardVerso");
            return (Criteria) this;
        }

        public Criteria andClientAddressIsNull() {
            addCriterion("Client_Address is null");
            return (Criteria) this;
        }

        public Criteria andClientAddressIsNotNull() {
            addCriterion("Client_Address is not null");
            return (Criteria) this;
        }

        public Criteria andClientAddressEqualTo(String value) {
            addCriterion("Client_Address =", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotEqualTo(String value) {
            addCriterion("Client_Address <>", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressGreaterThan(String value) {
            addCriterion("Client_Address >", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Client_Address >=", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLessThan(String value) {
            addCriterion("Client_Address <", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLessThanOrEqualTo(String value) {
            addCriterion("Client_Address <=", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLike(String value) {
            addCriterion("Client_Address like", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotLike(String value) {
            addCriterion("Client_Address not like", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressIn(List<String> values) {
            addCriterion("Client_Address in", values, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotIn(List<String> values) {
            addCriterion("Client_Address not in", values, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressBetween(String value1, String value2) {
            addCriterion("Client_Address between", value1, value2, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotBetween(String value1, String value2) {
            addCriterion("Client_Address not between", value1, value2, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeIsNull() {
            addCriterion("Client_Come_Time is null");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeIsNotNull() {
            addCriterion("Client_Come_Time is not null");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeEqualTo(Date value) {
            addCriterion("Client_Come_Time =", value, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeNotEqualTo(Date value) {
            addCriterion("Client_Come_Time <>", value, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeGreaterThan(Date value) {
            addCriterion("Client_Come_Time >", value, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Client_Come_Time >=", value, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeLessThan(Date value) {
            addCriterion("Client_Come_Time <", value, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeLessThanOrEqualTo(Date value) {
            addCriterion("Client_Come_Time <=", value, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeIn(List<Date> values) {
            addCriterion("Client_Come_Time in", values, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeNotIn(List<Date> values) {
            addCriterion("Client_Come_Time not in", values, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeBetween(Date value1, Date value2) {
            addCriterion("Client_Come_Time between", value1, value2, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientComeTimeNotBetween(Date value1, Date value2) {
            addCriterion("Client_Come_Time not between", value1, value2, "clientComeTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeIsNull() {
            addCriterion("Client_Expiration_Time is null");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeIsNotNull() {
            addCriterion("Client_Expiration_Time is not null");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeEqualTo(Date value) {
            addCriterion("Client_Expiration_Time =", value, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeNotEqualTo(Date value) {
            addCriterion("Client_Expiration_Time <>", value, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeGreaterThan(Date value) {
            addCriterion("Client_Expiration_Time >", value, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Client_Expiration_Time >=", value, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeLessThan(Date value) {
            addCriterion("Client_Expiration_Time <", value, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeLessThanOrEqualTo(Date value) {
            addCriterion("Client_Expiration_Time <=", value, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeIn(List<Date> values) {
            addCriterion("Client_Expiration_Time in", values, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeNotIn(List<Date> values) {
            addCriterion("Client_Expiration_Time not in", values, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeBetween(Date value1, Date value2) {
            addCriterion("Client_Expiration_Time between", value1, value2, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientExpirationTimeNotBetween(Date value1, Date value2) {
            addCriterion("Client_Expiration_Time not between", value1, value2, "clientExpirationTime");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseIsNull() {
            addCriterion("Client_Driving_License is null");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseIsNotNull() {
            addCriterion("Client_Driving_License is not null");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseEqualTo(String value) {
            addCriterion("Client_Driving_License =", value, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseNotEqualTo(String value) {
            addCriterion("Client_Driving_License <>", value, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseGreaterThan(String value) {
            addCriterion("Client_Driving_License >", value, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("Client_Driving_License >=", value, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseLessThan(String value) {
            addCriterion("Client_Driving_License <", value, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseLessThanOrEqualTo(String value) {
            addCriterion("Client_Driving_License <=", value, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseLike(String value) {
            addCriterion("Client_Driving_License like", value, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseNotLike(String value) {
            addCriterion("Client_Driving_License not like", value, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseIn(List<String> values) {
            addCriterion("Client_Driving_License in", values, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseNotIn(List<String> values) {
            addCriterion("Client_Driving_License not in", values, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseBetween(String value1, String value2) {
            addCriterion("Client_Driving_License between", value1, value2, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientDrivingLicenseNotBetween(String value1, String value2) {
            addCriterion("Client_Driving_License not between", value1, value2, "clientDrivingLicense");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayIsNull() {
            addCriterion("Client_Birthday is null");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayIsNotNull() {
            addCriterion("Client_Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayEqualTo(String value) {
            addCriterion("Client_Birthday =", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayNotEqualTo(String value) {
            addCriterion("Client_Birthday <>", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayGreaterThan(String value) {
            addCriterion("Client_Birthday >", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("Client_Birthday >=", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayLessThan(String value) {
            addCriterion("Client_Birthday <", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayLessThanOrEqualTo(String value) {
            addCriterion("Client_Birthday <=", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayLike(String value) {
            addCriterion("Client_Birthday like", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayNotLike(String value) {
            addCriterion("Client_Birthday not like", value, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayIn(List<String> values) {
            addCriterion("Client_Birthday in", values, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayNotIn(List<String> values) {
            addCriterion("Client_Birthday not in", values, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayBetween(String value1, String value2) {
            addCriterion("Client_Birthday between", value1, value2, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientBirthdayNotBetween(String value1, String value2) {
            addCriterion("Client_Birthday not between", value1, value2, "clientBirthday");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("Client_Type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("Client_Type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("Client_Type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("Client_Type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("Client_Type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Client_Type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("Client_Type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("Client_Type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("Client_Type like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("Client_Type not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("Client_Type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("Client_Type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("Client_Type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("Client_Type not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("Type_Id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("Type_Id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("Type_Id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("Type_Id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("Type_Id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type_Id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("Type_Id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Type_Id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("Type_Id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("Type_Id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Type_Id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Type_Id not between", value1, value2, "typeId");
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