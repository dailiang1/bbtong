package com.bbtong.Pojo.dj;

import java.util.ArrayList;
import java.util.List;

public class AgentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AgentExample() {
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

        public Criteria andDealerIdIsNull() {
            addCriterion("dealer_Id is null");
            return (Criteria) this;
        }

        public Criteria andDealerIdIsNotNull() {
            addCriterion("dealer_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIdEqualTo(Integer value) {
            addCriterion("dealer_Id =", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotEqualTo(Integer value) {
            addCriterion("dealer_Id <>", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThan(Integer value) {
            addCriterion("dealer_Id >", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dealer_Id >=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThan(Integer value) {
            addCriterion("dealer_Id <", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdLessThanOrEqualTo(Integer value) {
            addCriterion("dealer_Id <=", value, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdIn(List<Integer> values) {
            addCriterion("dealer_Id in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotIn(List<Integer> values) {
            addCriterion("dealer_Id not in", values, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdBetween(Integer value1, Integer value2) {
            addCriterion("dealer_Id between", value1, value2, "dealerId");
            return (Criteria) this;
        }

        public Criteria andDealerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dealer_Id not between", value1, value2, "dealerId");
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

        public Criteria andDealerRepairIsNull() {
            addCriterion("dealer_Repair is null");
            return (Criteria) this;
        }

        public Criteria andDealerRepairIsNotNull() {
            addCriterion("dealer_Repair is not null");
            return (Criteria) this;
        }

        public Criteria andDealerRepairEqualTo(String value) {
            addCriterion("dealer_Repair =", value, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairNotEqualTo(String value) {
            addCriterion("dealer_Repair <>", value, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairGreaterThan(String value) {
            addCriterion("dealer_Repair >", value, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_Repair >=", value, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairLessThan(String value) {
            addCriterion("dealer_Repair <", value, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairLessThanOrEqualTo(String value) {
            addCriterion("dealer_Repair <=", value, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairLike(String value) {
            addCriterion("dealer_Repair like", value, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairNotLike(String value) {
            addCriterion("dealer_Repair not like", value, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairIn(List<String> values) {
            addCriterion("dealer_Repair in", values, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairNotIn(List<String> values) {
            addCriterion("dealer_Repair not in", values, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairBetween(String value1, String value2) {
            addCriterion("dealer_Repair between", value1, value2, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerRepairNotBetween(String value1, String value2) {
            addCriterion("dealer_Repair not between", value1, value2, "dealerRepair");
            return (Criteria) this;
        }

        public Criteria andDealerStateIsNull() {
            addCriterion("dealer_State is null");
            return (Criteria) this;
        }

        public Criteria andDealerStateIsNotNull() {
            addCriterion("dealer_State is not null");
            return (Criteria) this;
        }

        public Criteria andDealerStateEqualTo(Integer value) {
            addCriterion("dealer_State =", value, "dealerState");
            return (Criteria) this;
        }

        public Criteria andDealerStateNotEqualTo(Integer value) {
            addCriterion("dealer_State <>", value, "dealerState");
            return (Criteria) this;
        }

        public Criteria andDealerStateGreaterThan(Integer value) {
            addCriterion("dealer_State >", value, "dealerState");
            return (Criteria) this;
        }

        public Criteria andDealerStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("dealer_State >=", value, "dealerState");
            return (Criteria) this;
        }

        public Criteria andDealerStateLessThan(Integer value) {
            addCriterion("dealer_State <", value, "dealerState");
            return (Criteria) this;
        }

        public Criteria andDealerStateLessThanOrEqualTo(Integer value) {
            addCriterion("dealer_State <=", value, "dealerState");
            return (Criteria) this;
        }

        public Criteria andDealerStateIn(List<Integer> values) {
            addCriterion("dealer_State in", values, "dealerState");
            return (Criteria) this;
        }

        public Criteria andDealerStateNotIn(List<Integer> values) {
            addCriterion("dealer_State not in", values, "dealerState");
            return (Criteria) this;
        }

        public Criteria andDealerStateBetween(Integer value1, Integer value2) {
            addCriterion("dealer_State between", value1, value2, "dealerState");
            return (Criteria) this;
        }

        public Criteria andDealerStateNotBetween(Integer value1, Integer value2) {
            addCriterion("dealer_State not between", value1, value2, "dealerState");
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