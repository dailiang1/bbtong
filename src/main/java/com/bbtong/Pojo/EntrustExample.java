package com.bbtong.Pojo;

import java.util.ArrayList;
import java.util.List;

public class EntrustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public EntrustExample() {
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

        public Criteria andNewUserIdIsNull() {
            addCriterion("New_User_Id is null");
            return (Criteria) this;
        }

        public Criteria andNewUserIdIsNotNull() {
            addCriterion("New_User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserIdEqualTo(String value) {
            addCriterion("New_User_Id =", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdNotEqualTo(String value) {
            addCriterion("New_User_Id <>", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdGreaterThan(String value) {
            addCriterion("New_User_Id >", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("New_User_Id >=", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdLessThan(String value) {
            addCriterion("New_User_Id <", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdLessThanOrEqualTo(String value) {
            addCriterion("New_User_Id <=", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdLike(String value) {
            addCriterion("New_User_Id like", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdNotLike(String value) {
            addCriterion("New_User_Id not like", value, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdIn(List<String> values) {
            addCriterion("New_User_Id in", values, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdNotIn(List<String> values) {
            addCriterion("New_User_Id not in", values, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdBetween(String value1, String value2) {
            addCriterion("New_User_Id between", value1, value2, "newUserId");
            return (Criteria) this;
        }

        public Criteria andNewUserIdNotBetween(String value1, String value2) {
            addCriterion("New_User_Id not between", value1, value2, "newUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdIsNull() {
            addCriterion("Finally_User_Id is null");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdIsNotNull() {
            addCriterion("Finally_User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdEqualTo(Integer value) {
            addCriterion("Finally_User_Id =", value, "finallyUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdNotEqualTo(Integer value) {
            addCriterion("Finally_User_Id <>", value, "finallyUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdGreaterThan(Integer value) {
            addCriterion("Finally_User_Id >", value, "finallyUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Finally_User_Id >=", value, "finallyUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdLessThan(Integer value) {
            addCriterion("Finally_User_Id <", value, "finallyUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("Finally_User_Id <=", value, "finallyUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdIn(List<Integer> values) {
            addCriterion("Finally_User_Id in", values, "finallyUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdNotIn(List<Integer> values) {
            addCriterion("Finally_User_Id not in", values, "finallyUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("Finally_User_Id between", value1, value2, "finallyUserId");
            return (Criteria) this;
        }

        public Criteria andFinallyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Finally_User_Id not between", value1, value2, "finallyUserId");
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("Company_Id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("Company_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("Company_Id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("Company_Id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("Company_Id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Company_Id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("Company_Id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("Company_Id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("Company_Id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("Company_Id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("Company_Id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Company_Id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberIsNull() {
            addCriterion("Iicense_Plate_Number is null");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberIsNotNull() {
            addCriterion("Iicense_Plate_Number is not null");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberEqualTo(String value) {
            addCriterion("Iicense_Plate_Number =", value, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberNotEqualTo(String value) {
            addCriterion("Iicense_Plate_Number <>", value, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberGreaterThan(String value) {
            addCriterion("Iicense_Plate_Number >", value, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("Iicense_Plate_Number >=", value, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberLessThan(String value) {
            addCriterion("Iicense_Plate_Number <", value, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberLessThanOrEqualTo(String value) {
            addCriterion("Iicense_Plate_Number <=", value, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberLike(String value) {
            addCriterion("Iicense_Plate_Number like", value, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberNotLike(String value) {
            addCriterion("Iicense_Plate_Number not like", value, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberIn(List<String> values) {
            addCriterion("Iicense_Plate_Number in", values, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberNotIn(List<String> values) {
            addCriterion("Iicense_Plate_Number not in", values, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberBetween(String value1, String value2) {
            addCriterion("Iicense_Plate_Number between", value1, value2, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andIicensePlateNumberNotBetween(String value1, String value2) {
            addCriterion("Iicense_Plate_Number not between", value1, value2, "iicensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandIsNull() {
            addCriterion("Entrust_Car_Brand is null");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandIsNotNull() {
            addCriterion("Entrust_Car_Brand is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandEqualTo(String value) {
            addCriterion("Entrust_Car_Brand =", value, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandNotEqualTo(String value) {
            addCriterion("Entrust_Car_Brand <>", value, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandGreaterThan(String value) {
            addCriterion("Entrust_Car_Brand >", value, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_Car_Brand >=", value, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandLessThan(String value) {
            addCriterion("Entrust_Car_Brand <", value, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandLessThanOrEqualTo(String value) {
            addCriterion("Entrust_Car_Brand <=", value, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandLike(String value) {
            addCriterion("Entrust_Car_Brand like", value, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandNotLike(String value) {
            addCriterion("Entrust_Car_Brand not like", value, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandIn(List<String> values) {
            addCriterion("Entrust_Car_Brand in", values, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandNotIn(List<String> values) {
            addCriterion("Entrust_Car_Brand not in", values, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandBetween(String value1, String value2) {
            addCriterion("Entrust_Car_Brand between", value1, value2, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustCarBrandNotBetween(String value1, String value2) {
            addCriterion("Entrust_Car_Brand not between", value1, value2, "entrustCarBrand");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressIsNull() {
            addCriterion("Entrust_Address is null");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressIsNotNull() {
            addCriterion("Entrust_Address is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressEqualTo(String value) {
            addCriterion("Entrust_Address =", value, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressNotEqualTo(String value) {
            addCriterion("Entrust_Address <>", value, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressGreaterThan(String value) {
            addCriterion("Entrust_Address >", value, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_Address >=", value, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressLessThan(String value) {
            addCriterion("Entrust_Address <", value, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressLessThanOrEqualTo(String value) {
            addCriterion("Entrust_Address <=", value, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressLike(String value) {
            addCriterion("Entrust_Address like", value, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressNotLike(String value) {
            addCriterion("Entrust_Address not like", value, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressIn(List<String> values) {
            addCriterion("Entrust_Address in", values, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressNotIn(List<String> values) {
            addCriterion("Entrust_Address not in", values, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressBetween(String value1, String value2) {
            addCriterion("Entrust_Address between", value1, value2, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustAddressNotBetween(String value1, String value2) {
            addCriterion("Entrust_Address not between", value1, value2, "entrustAddress");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkIsNull() {
            addCriterion("Entrust_Remark is null");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkIsNotNull() {
            addCriterion("Entrust_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkEqualTo(String value) {
            addCriterion("Entrust_Remark =", value, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkNotEqualTo(String value) {
            addCriterion("Entrust_Remark <>", value, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkGreaterThan(String value) {
            addCriterion("Entrust_Remark >", value, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_Remark >=", value, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkLessThan(String value) {
            addCriterion("Entrust_Remark <", value, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkLessThanOrEqualTo(String value) {
            addCriterion("Entrust_Remark <=", value, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkLike(String value) {
            addCriterion("Entrust_Remark like", value, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkNotLike(String value) {
            addCriterion("Entrust_Remark not like", value, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkIn(List<String> values) {
            addCriterion("Entrust_Remark in", values, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkNotIn(List<String> values) {
            addCriterion("Entrust_Remark not in", values, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkBetween(String value1, String value2) {
            addCriterion("Entrust_Remark between", value1, value2, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustRemarkNotBetween(String value1, String value2) {
            addCriterion("Entrust_Remark not between", value1, value2, "entrustRemark");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeIsNull() {
            addCriterion("Entrust_Grade is null");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeIsNotNull() {
            addCriterion("Entrust_Grade is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeEqualTo(Integer value) {
            addCriterion("Entrust_Grade =", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeNotEqualTo(Integer value) {
            addCriterion("Entrust_Grade <>", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeGreaterThan(Integer value) {
            addCriterion("Entrust_Grade >", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Entrust_Grade >=", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeLessThan(Integer value) {
            addCriterion("Entrust_Grade <", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeLessThanOrEqualTo(Integer value) {
            addCriterion("Entrust_Grade <=", value, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeIn(List<Integer> values) {
            addCriterion("Entrust_Grade in", values, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeNotIn(List<Integer> values) {
            addCriterion("Entrust_Grade not in", values, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_Grade between", value1, value2, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_Grade not between", value1, value2, "entrustGrade");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeIsNull() {
            addCriterion("Entrust_Start_Time is null");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeIsNotNull() {
            addCriterion("Entrust_Start_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeEqualTo(String value) {
            addCriterion("Entrust_Start_Time =", value, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeNotEqualTo(String value) {
            addCriterion("Entrust_Start_Time <>", value, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeGreaterThan(String value) {
            addCriterion("Entrust_Start_Time >", value, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_Start_Time >=", value, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeLessThan(String value) {
            addCriterion("Entrust_Start_Time <", value, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeLessThanOrEqualTo(String value) {
            addCriterion("Entrust_Start_Time <=", value, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeLike(String value) {
            addCriterion("Entrust_Start_Time like", value, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeNotLike(String value) {
            addCriterion("Entrust_Start_Time not like", value, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeIn(List<String> values) {
            addCriterion("Entrust_Start_Time in", values, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeNotIn(List<String> values) {
            addCriterion("Entrust_Start_Time not in", values, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeBetween(String value1, String value2) {
            addCriterion("Entrust_Start_Time between", value1, value2, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustStartTimeNotBetween(String value1, String value2) {
            addCriterion("Entrust_Start_Time not between", value1, value2, "entrustStartTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeIsNull() {
            addCriterion("Entrust_End_Time is null");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeIsNotNull() {
            addCriterion("Entrust_End_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeEqualTo(String value) {
            addCriterion("Entrust_End_Time =", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeNotEqualTo(String value) {
            addCriterion("Entrust_End_Time <>", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeGreaterThan(String value) {
            addCriterion("Entrust_End_Time >", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_End_Time >=", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeLessThan(String value) {
            addCriterion("Entrust_End_Time <", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeLessThanOrEqualTo(String value) {
            addCriterion("Entrust_End_Time <=", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeLike(String value) {
            addCriterion("Entrust_End_Time like", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeNotLike(String value) {
            addCriterion("Entrust_End_Time not like", value, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeIn(List<String> values) {
            addCriterion("Entrust_End_Time in", values, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeNotIn(List<String> values) {
            addCriterion("Entrust_End_Time not in", values, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeBetween(String value1, String value2) {
            addCriterion("Entrust_End_Time between", value1, value2, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andEntrustEndTimeNotBetween(String value1, String value2) {
            addCriterion("Entrust_End_Time not between", value1, value2, "entrustEndTime");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNull() {
            addCriterion("Car_Type_Id is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNotNull() {
            addCriterion("Car_Type_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdEqualTo(Integer value) {
            addCriterion("Car_Type_Id =", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotEqualTo(Integer value) {
            addCriterion("Car_Type_Id <>", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThan(Integer value) {
            addCriterion("Car_Type_Id >", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Car_Type_Id >=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThan(Integer value) {
            addCriterion("Car_Type_Id <", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Car_Type_Id <=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIn(List<Integer> values) {
            addCriterion("Car_Type_Id in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotIn(List<Integer> values) {
            addCriterion("Car_Type_Id not in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Car_Type_Id between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Car_Type_Id not between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdIsNull() {
            addCriterion("Amount_Range_Id is null");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdIsNotNull() {
            addCriterion("Amount_Range_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdEqualTo(Integer value) {
            addCriterion("Amount_Range_Id =", value, "amountRangeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdNotEqualTo(Integer value) {
            addCriterion("Amount_Range_Id <>", value, "amountRangeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdGreaterThan(Integer value) {
            addCriterion("Amount_Range_Id >", value, "amountRangeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Amount_Range_Id >=", value, "amountRangeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdLessThan(Integer value) {
            addCriterion("Amount_Range_Id <", value, "amountRangeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Amount_Range_Id <=", value, "amountRangeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdIn(List<Integer> values) {
            addCriterion("Amount_Range_Id in", values, "amountRangeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdNotIn(List<Integer> values) {
            addCriterion("Amount_Range_Id not in", values, "amountRangeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdBetween(Integer value1, Integer value2) {
            addCriterion("Amount_Range_Id between", value1, value2, "amountRangeId");
            return (Criteria) this;
        }

        public Criteria andAmountRangeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Amount_Range_Id not between", value1, value2, "amountRangeId");
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

        public Criteria andEntrustInsureIsNull() {
            addCriterion("Entrust_Insure is null");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureIsNotNull() {
            addCriterion("Entrust_Insure is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureEqualTo(String value) {
            addCriterion("Entrust_Insure =", value, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureNotEqualTo(String value) {
            addCriterion("Entrust_Insure <>", value, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureGreaterThan(String value) {
            addCriterion("Entrust_Insure >", value, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_Insure >=", value, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureLessThan(String value) {
            addCriterion("Entrust_Insure <", value, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureLessThanOrEqualTo(String value) {
            addCriterion("Entrust_Insure <=", value, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureLike(String value) {
            addCriterion("Entrust_Insure like", value, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureNotLike(String value) {
            addCriterion("Entrust_Insure not like", value, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureIn(List<String> values) {
            addCriterion("Entrust_Insure in", values, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureNotIn(List<String> values) {
            addCriterion("Entrust_Insure not in", values, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureBetween(String value1, String value2) {
            addCriterion("Entrust_Insure between", value1, value2, "entrustInsure");
            return (Criteria) this;
        }

        public Criteria andEntrustInsureNotBetween(String value1, String value2) {
            addCriterion("Entrust_Insure not between", value1, value2, "entrustInsure");
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

        public Criteria andEntrustGradeTimeEqualTo(String value) {
            addCriterion("Entrust_Grade_Time =", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotEqualTo(String value) {
            addCriterion("Entrust_Grade_Time <>", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeGreaterThan(String value) {
            addCriterion("Entrust_Grade_Time >", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Entrust_Grade_Time >=", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeLessThan(String value) {
            addCriterion("Entrust_Grade_Time <", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeLessThanOrEqualTo(String value) {
            addCriterion("Entrust_Grade_Time <=", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeLike(String value) {
            addCriterion("Entrust_Grade_Time like", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotLike(String value) {
            addCriterion("Entrust_Grade_Time not like", value, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeIn(List<String> values) {
            addCriterion("Entrust_Grade_Time in", values, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotIn(List<String> values) {
            addCriterion("Entrust_Grade_Time not in", values, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeBetween(String value1, String value2) {
            addCriterion("Entrust_Grade_Time between", value1, value2, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustGradeTimeNotBetween(String value1, String value2) {
            addCriterion("Entrust_Grade_Time not between", value1, value2, "entrustGradeTime");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeIsNull() {
            addCriterion("Entrust_Service_Charge is null");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeIsNotNull() {
            addCriterion("Entrust_Service_Charge is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeEqualTo(Double value) {
            addCriterion("Entrust_Service_Charge =", value, "entrustServiceCharge");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeNotEqualTo(Double value) {
            addCriterion("Entrust_Service_Charge <>", value, "entrustServiceCharge");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeGreaterThan(Double value) {
            addCriterion("Entrust_Service_Charge >", value, "entrustServiceCharge");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeGreaterThanOrEqualTo(Double value) {
            addCriterion("Entrust_Service_Charge >=", value, "entrustServiceCharge");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeLessThan(Double value) {
            addCriterion("Entrust_Service_Charge <", value, "entrustServiceCharge");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeLessThanOrEqualTo(Double value) {
            addCriterion("Entrust_Service_Charge <=", value, "entrustServiceCharge");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeIn(List<Double> values) {
            addCriterion("Entrust_Service_Charge in", values, "entrustServiceCharge");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeNotIn(List<Double> values) {
            addCriterion("Entrust_Service_Charge not in", values, "entrustServiceCharge");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeBetween(Double value1, Double value2) {
            addCriterion("Entrust_Service_Charge between", value1, value2, "entrustServiceCharge");
            return (Criteria) this;
        }

        public Criteria andEntrustServiceChargeNotBetween(Double value1, Double value2) {
            addCriterion("Entrust_Service_Charge not between", value1, value2, "entrustServiceCharge");
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

        public Criteria andEntrustReturnMoneyIsNull() {
            addCriterion("Entrust_Return_Money is null");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyIsNotNull() {
            addCriterion("Entrust_Return_Money is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyEqualTo(Double value) {
            addCriterion("Entrust_Return_Money =", value, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyNotEqualTo(Double value) {
            addCriterion("Entrust_Return_Money <>", value, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyGreaterThan(Double value) {
            addCriterion("Entrust_Return_Money >", value, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Entrust_Return_Money >=", value, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyLessThan(Double value) {
            addCriterion("Entrust_Return_Money <", value, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyLessThanOrEqualTo(Double value) {
            addCriterion("Entrust_Return_Money <=", value, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyIn(List<Double> values) {
            addCriterion("Entrust_Return_Money in", values, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyNotIn(List<Double> values) {
            addCriterion("Entrust_Return_Money not in", values, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyBetween(Double value1, Double value2) {
            addCriterion("Entrust_Return_Money between", value1, value2, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnMoneyNotBetween(Double value1, Double value2) {
            addCriterion("Entrust_Return_Money not between", value1, value2, "entrustReturnMoney");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeIsNull() {
            addCriterion("Entrust_Return_Time is null");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeIsNotNull() {
            addCriterion("Entrust_Return_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeEqualTo(Integer value) {
            addCriterion("Entrust_Return_Time =", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeNotEqualTo(Integer value) {
            addCriterion("Entrust_Return_Time <>", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeGreaterThan(Integer value) {
            addCriterion("Entrust_Return_Time >", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Entrust_Return_Time >=", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeLessThan(Integer value) {
            addCriterion("Entrust_Return_Time <", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeLessThanOrEqualTo(Integer value) {
            addCriterion("Entrust_Return_Time <=", value, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeIn(List<Integer> values) {
            addCriterion("Entrust_Return_Time in", values, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeNotIn(List<Integer> values) {
            addCriterion("Entrust_Return_Time not in", values, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_Return_Time between", value1, value2, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustReturnTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("Entrust_Return_Time not between", value1, value2, "entrustReturnTime");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessIsNull() {
            addCriterion("`Entrust_ Business` is null");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessIsNotNull() {
            addCriterion("`Entrust_ Business` is not null");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessEqualTo(Integer value) {
            addCriterion("`Entrust_ Business` =", value, "entrustBusiness");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessNotEqualTo(Integer value) {
            addCriterion("`Entrust_ Business` <>", value, "entrustBusiness");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessGreaterThan(Integer value) {
            addCriterion("`Entrust_ Business` >", value, "entrustBusiness");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("`Entrust_ Business` >=", value, "entrustBusiness");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessLessThan(Integer value) {
            addCriterion("`Entrust_ Business` <", value, "entrustBusiness");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessLessThanOrEqualTo(Integer value) {
            addCriterion("`Entrust_ Business` <=", value, "entrustBusiness");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessIn(List<Integer> values) {
            addCriterion("`Entrust_ Business` in", values, "entrustBusiness");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessNotIn(List<Integer> values) {
            addCriterion("`Entrust_ Business` not in", values, "entrustBusiness");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessBetween(Integer value1, Integer value2) {
            addCriterion("`Entrust_ Business` between", value1, value2, "entrustBusiness");
            return (Criteria) this;
        }

        public Criteria andEntrustBusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("`Entrust_ Business` not between", value1, value2, "entrustBusiness");
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