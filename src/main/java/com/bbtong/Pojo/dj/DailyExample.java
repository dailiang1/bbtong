package com.bbtong.Pojo.dj;

import java.util.ArrayList;
import java.util.List;

public class DailyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DailyExample() {
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

        public Criteria andDailyIdIsNull() {
            addCriterion("daily_Id is null");
            return (Criteria) this;
        }

        public Criteria andDailyIdIsNotNull() {
            addCriterion("daily_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDailyIdEqualTo(Integer value) {
            addCriterion("daily_Id =", value, "dailyId");
            return (Criteria) this;
        }

        public Criteria andDailyIdNotEqualTo(Integer value) {
            addCriterion("daily_Id <>", value, "dailyId");
            return (Criteria) this;
        }

        public Criteria andDailyIdGreaterThan(Integer value) {
            addCriterion("daily_Id >", value, "dailyId");
            return (Criteria) this;
        }

        public Criteria andDailyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("daily_Id >=", value, "dailyId");
            return (Criteria) this;
        }

        public Criteria andDailyIdLessThan(Integer value) {
            addCriterion("daily_Id <", value, "dailyId");
            return (Criteria) this;
        }

        public Criteria andDailyIdLessThanOrEqualTo(Integer value) {
            addCriterion("daily_Id <=", value, "dailyId");
            return (Criteria) this;
        }

        public Criteria andDailyIdIn(List<Integer> values) {
            addCriterion("daily_Id in", values, "dailyId");
            return (Criteria) this;
        }

        public Criteria andDailyIdNotIn(List<Integer> values) {
            addCriterion("daily_Id not in", values, "dailyId");
            return (Criteria) this;
        }

        public Criteria andDailyIdBetween(Integer value1, Integer value2) {
            addCriterion("daily_Id between", value1, value2, "dailyId");
            return (Criteria) this;
        }

        public Criteria andDailyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("daily_Id not between", value1, value2, "dailyId");
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_Name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_Id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_Id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_Id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_Id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_Id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_Id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_Id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_Id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_Id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_Id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_Id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_Name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_Name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_Name =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_Name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_Name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_Name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_Name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_Name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_Name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_Name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_Name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_Name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_Name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_Name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNull() {
            addCriterion("dealer_Name is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("dealer_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("dealer_Name =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("dealer_Name <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("dealer_Name >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_Name >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("dealer_Name <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("dealer_Name <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("dealer_Name like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("dealer_Name not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("dealer_Name in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("dealer_Name not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("dealer_Name between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("dealer_Name not between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_Id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_Id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_Id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_Id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_Id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_Id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_Id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_Id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_Id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_Id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_Id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_Name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_Name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_Name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_Name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_Name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_Name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_Name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_Name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_Name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_Name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_Name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_Name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_Name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberIsNull() {
            addCriterion("license_Plate_Number is null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberIsNotNull() {
            addCriterion("license_Plate_Number is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberEqualTo(String value) {
            addCriterion("license_Plate_Number =", value, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberNotEqualTo(String value) {
            addCriterion("license_Plate_Number <>", value, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberGreaterThan(String value) {
            addCriterion("license_Plate_Number >", value, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_Plate_Number >=", value, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberLessThan(String value) {
            addCriterion("license_Plate_Number <", value, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberLessThanOrEqualTo(String value) {
            addCriterion("license_Plate_Number <=", value, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberLike(String value) {
            addCriterion("license_Plate_Number like", value, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberNotLike(String value) {
            addCriterion("license_Plate_Number not like", value, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberIn(List<String> values) {
            addCriterion("license_Plate_Number in", values, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberNotIn(List<String> values) {
            addCriterion("license_Plate_Number not in", values, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberBetween(String value1, String value2) {
            addCriterion("license_Plate_Number between", value1, value2, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNumberNotBetween(String value1, String value2) {
            addCriterion("license_Plate_Number not between", value1, value2, "licensePlateNumber");
            return (Criteria) this;
        }

        public Criteria andCompulsoryIsNull() {
            addCriterion("compulsory is null");
            return (Criteria) this;
        }

        public Criteria andCompulsoryIsNotNull() {
            addCriterion("compulsory is not null");
            return (Criteria) this;
        }

        public Criteria andCompulsoryEqualTo(Double value) {
            addCriterion("compulsory =", value, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCompulsoryNotEqualTo(Double value) {
            addCriterion("compulsory <>", value, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCompulsoryGreaterThan(Double value) {
            addCriterion("compulsory >", value, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCompulsoryGreaterThanOrEqualTo(Double value) {
            addCriterion("compulsory >=", value, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCompulsoryLessThan(Double value) {
            addCriterion("compulsory <", value, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCompulsoryLessThanOrEqualTo(Double value) {
            addCriterion("compulsory <=", value, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCompulsoryIn(List<Double> values) {
            addCriterion("compulsory in", values, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCompulsoryNotIn(List<Double> values) {
            addCriterion("compulsory not in", values, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCompulsoryBetween(Double value1, Double value2) {
            addCriterion("compulsory between", value1, value2, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCompulsoryNotBetween(Double value1, Double value2) {
            addCriterion("compulsory not between", value1, value2, "compulsory");
            return (Criteria) this;
        }

        public Criteria andCommercialIsNull() {
            addCriterion("commercial is null");
            return (Criteria) this;
        }

        public Criteria andCommercialIsNotNull() {
            addCriterion("commercial is not null");
            return (Criteria) this;
        }

        public Criteria andCommercialEqualTo(Double value) {
            addCriterion("commercial =", value, "commercial");
            return (Criteria) this;
        }

        public Criteria andCommercialNotEqualTo(Double value) {
            addCriterion("commercial <>", value, "commercial");
            return (Criteria) this;
        }

        public Criteria andCommercialGreaterThan(Double value) {
            addCriterion("commercial >", value, "commercial");
            return (Criteria) this;
        }

        public Criteria andCommercialGreaterThanOrEqualTo(Double value) {
            addCriterion("commercial >=", value, "commercial");
            return (Criteria) this;
        }

        public Criteria andCommercialLessThan(Double value) {
            addCriterion("commercial <", value, "commercial");
            return (Criteria) this;
        }

        public Criteria andCommercialLessThanOrEqualTo(Double value) {
            addCriterion("commercial <=", value, "commercial");
            return (Criteria) this;
        }

        public Criteria andCommercialIn(List<Double> values) {
            addCriterion("commercial in", values, "commercial");
            return (Criteria) this;
        }

        public Criteria andCommercialNotIn(List<Double> values) {
            addCriterion("commercial not in", values, "commercial");
            return (Criteria) this;
        }

        public Criteria andCommercialBetween(Double value1, Double value2) {
            addCriterion("commercial between", value1, value2, "commercial");
            return (Criteria) this;
        }

        public Criteria andCommercialNotBetween(Double value1, Double value2) {
            addCriterion("commercial not between", value1, value2, "commercial");
            return (Criteria) this;
        }

        public Criteria andDailyTimeIsNull() {
            addCriterion("daily_Time is null");
            return (Criteria) this;
        }

        public Criteria andDailyTimeIsNotNull() {
            addCriterion("daily_Time is not null");
            return (Criteria) this;
        }

        public Criteria andDailyTimeEqualTo(String value) {
            addCriterion("daily_Time =", value, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeNotEqualTo(String value) {
            addCriterion("daily_Time <>", value, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeGreaterThan(String value) {
            addCriterion("daily_Time >", value, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("daily_Time >=", value, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeLessThan(String value) {
            addCriterion("daily_Time <", value, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeLessThanOrEqualTo(String value) {
            addCriterion("daily_Time <=", value, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeLike(String value) {
            addCriterion("daily_Time like", value, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeNotLike(String value) {
            addCriterion("daily_Time not like", value, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeIn(List<String> values) {
            addCriterion("daily_Time in", values, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeNotIn(List<String> values) {
            addCriterion("daily_Time not in", values, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeBetween(String value1, String value2) {
            addCriterion("daily_Time between", value1, value2, "dailyTime");
            return (Criteria) this;
        }

        public Criteria andDailyTimeNotBetween(String value1, String value2) {
            addCriterion("daily_Time not between", value1, value2, "dailyTime");
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