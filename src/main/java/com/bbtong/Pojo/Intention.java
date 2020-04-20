package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_intention
 * 戴辆
 */
public class Intention implements Serializable {
    /**
     * 主键/ID (有意向的委托表)
     */
    private Integer intentionId;

    /**
     * 委托的ID
     */
    private Integer entrustId;

    /**
     * 有意向的用户的ID
     */
    private Integer userId;

    /**
     *  表示委托是否被接(0表示未接单，1表示已接单，2表示已完成)
     */
    private Integer entrustState;

    /**
     * 用户的姓名
     */
    private String userName;

    /**
     * 用户的电话
     */
    private String userPhone;

    /**
     * 保险公司的名称
     */
    private String insuranceCompanyName;

    /**
     * 服务积分(用户的满意度),只有三种状态(0满意，1一般，2不满意) 一开始注册之后每个人都是满意
     */
    private Integer userSatisfaction;

    private static final long serialVersionUID = 1L;

    public Integer getIntentionId() {
        return intentionId;
    }

    public void setIntentionId(Integer intentionId) {
        this.intentionId = intentionId;
    }

    public Integer getEntrustId() {
        return entrustId;
    }

    public void setEntrustId(Integer entrustId) {
        this.entrustId = entrustId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getEntrustState() {
        return entrustState;
    }

    public void setEntrustState(Integer entrustState) {
        this.entrustState = entrustState;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    public Integer getUserSatisfaction() {
        return userSatisfaction;
    }

    public void setUserSatisfaction(Integer userSatisfaction) {
        this.userSatisfaction = userSatisfaction;
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
        Intention other = (Intention) that;
        return (this.getIntentionId() == null ? other.getIntentionId() == null : this.getIntentionId().equals(other.getIntentionId()))
            && (this.getEntrustId() == null ? other.getEntrustId() == null : this.getEntrustId().equals(other.getEntrustId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getEntrustState() == null ? other.getEntrustState() == null : this.getEntrustState().equals(other.getEntrustState()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getInsuranceCompanyName() == null ? other.getInsuranceCompanyName() == null : this.getInsuranceCompanyName().equals(other.getInsuranceCompanyName()))
            && (this.getUserSatisfaction() == null ? other.getUserSatisfaction() == null : this.getUserSatisfaction().equals(other.getUserSatisfaction()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIntentionId() == null) ? 0 : getIntentionId().hashCode());
        result = prime * result + ((getEntrustId() == null) ? 0 : getEntrustId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getEntrustState() == null) ? 0 : getEntrustState().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getInsuranceCompanyName() == null) ? 0 : getInsuranceCompanyName().hashCode());
        result = prime * result + ((getUserSatisfaction() == null) ? 0 : getUserSatisfaction().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", intentionId=").append(intentionId);
        sb.append(", entrustId=").append(entrustId);
        sb.append(", userId=").append(userId);
        sb.append(", entrustState=").append(entrustState);
        sb.append(", userName=").append(userName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", insuranceCompanyName=").append(insuranceCompanyName);
        sb.append(", userSatisfaction=").append(userSatisfaction);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}