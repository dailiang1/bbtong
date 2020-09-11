package com.bbtong.Pojo.dj;

import java.io.Serializable;

/**
 * dj_agent
 * @author 
 */
public class Agent implements Serializable {
    /**
     * 代理人表主键
     */
    private Integer agentId;

    /**
     * 代理人姓名
     */
    private String agentName;

    /**
     * 车商表id
     */
    private Integer dealerId;

    /**
     * 车商的名称
     */
    private String dealerName;

    /**
     * 车商返修码
     */
    private String dealerRepair;

    /**
     * 表示代理人的身份(0表示个人，1代表车商)
     */
    private Integer dealerState;

    private static final long serialVersionUID = 1L;

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerRepair() {
        return dealerRepair;
    }

    public void setDealerRepair(String dealerRepair) {
        this.dealerRepair = dealerRepair;
    }

    public Integer getDealerState() {
        return dealerState;
    }

    public void setDealerState(Integer dealerState) {
        this.dealerState = dealerState;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Agent other = (Agent) that;
        return (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getAgentName() == null ? other.getAgentName() == null : this.getAgentName().equals(other.getAgentName()))
            && (this.getDealerId() == null ? other.getDealerId() == null : this.getDealerId().equals(other.getDealerId()))
            && (this.getDealerName() == null ? other.getDealerName() == null : this.getDealerName().equals(other.getDealerName()))
            && (this.getDealerRepair() == null ? other.getDealerRepair() == null : this.getDealerRepair().equals(other.getDealerRepair()))
            && (this.getDealerState() == null ? other.getDealerState() == null : this.getDealerState().equals(other.getDealerState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        result = prime * result + ((getDealerId() == null) ? 0 : getDealerId().hashCode());
        result = prime * result + ((getDealerName() == null) ? 0 : getDealerName().hashCode());
        result = prime * result + ((getDealerRepair() == null) ? 0 : getDealerRepair().hashCode());
        result = prime * result + ((getDealerState() == null) ? 0 : getDealerState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agentId=").append(agentId);
        sb.append(", agentName=").append(agentName);
        sb.append(", dealerId=").append(dealerId);
        sb.append(", dealerName=").append(dealerName);
        sb.append(", dealerRepair=").append(dealerRepair);
        sb.append(", dealerState=").append(dealerState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}