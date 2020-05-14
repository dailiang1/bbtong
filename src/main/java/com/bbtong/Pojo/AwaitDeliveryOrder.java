package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_await_delivery_order 待还单表
 * @author 
 */
public class AwaitDeliveryOrder implements Serializable {
    /**
     * 主键/ID (待还单表)
     */
    private Integer awaitDeliveryOrderId;

    /**
     * 待还单的ID
     */
    private Integer newEntrustId;

    /**
     * 待还单用户的ID
     */
    private Integer userId;

    /**
     * 还单用户的ID 
     */
    private Integer newUserId;

    /**
     * 需要还单的金额
     */
    private Double entrustReturnMoney;

    /**
     * 委托单完成的时间
     */
    private String entrustGradeTime;

    /**
     * 还单的时间期限(获取委托表中的时间)
     */
    private String entrustReturnTime;

    /**
     * 当前这一单是否交易完成(就是是否还单完成，0表示没有，1表示完成了)默认是0
     */
    private String entrustState;

    private static final long serialVersionUID = 1L;

    public Integer getAwaitDeliveryOrderId() {
        return awaitDeliveryOrderId;
    }

    public void setAwaitDeliveryOrderId(Integer awaitDeliveryOrderId) {
        this.awaitDeliveryOrderId = awaitDeliveryOrderId;
    }

    public Integer getNewEntrustId() {
        return newEntrustId;
    }

    public void setNewEntrustId(Integer newEntrustId) {
        this.newEntrustId = newEntrustId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getNewUserId() {
        return newUserId;
    }

    public void setNewUserId(Integer newUserId) {
        this.newUserId = newUserId;
    }

    public Double getEntrustReturnMoney() {
        return entrustReturnMoney;
    }

    public void setEntrustReturnMoney(Double entrustReturnMoney) {
        this.entrustReturnMoney = entrustReturnMoney;
    }

    public String getEntrustGradeTime() {
        return entrustGradeTime;
    }

    public void setEntrustGradeTime(String entrustGradeTime) {
        this.entrustGradeTime = entrustGradeTime;
    }

    public String getEntrustReturnTime() {
        return entrustReturnTime;
    }

    public void setEntrustReturnTime(String entrustReturnTime) {
        this.entrustReturnTime = entrustReturnTime;
    }

    public String getEntrustState() {
        return entrustState;
    }

    public void setEntrustState(String entrustState) {
        this.entrustState = entrustState;
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
        AwaitDeliveryOrder other = (AwaitDeliveryOrder) that;
        return (this.getAwaitDeliveryOrderId() == null ? other.getAwaitDeliveryOrderId() == null : this.getAwaitDeliveryOrderId().equals(other.getAwaitDeliveryOrderId()))
            && (this.getNewEntrustId() == null ? other.getNewEntrustId() == null : this.getNewEntrustId().equals(other.getNewEntrustId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNewUserId() == null ? other.getNewUserId() == null : this.getNewUserId().equals(other.getNewUserId()))
            && (this.getEntrustReturnMoney() == null ? other.getEntrustReturnMoney() == null : this.getEntrustReturnMoney().equals(other.getEntrustReturnMoney()))
            && (this.getEntrustGradeTime() == null ? other.getEntrustGradeTime() == null : this.getEntrustGradeTime().equals(other.getEntrustGradeTime()))
            && (this.getEntrustReturnTime() == null ? other.getEntrustReturnTime() == null : this.getEntrustReturnTime().equals(other.getEntrustReturnTime()))
            && (this.getEntrustState() == null ? other.getEntrustState() == null : this.getEntrustState().equals(other.getEntrustState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAwaitDeliveryOrderId() == null) ? 0 : getAwaitDeliveryOrderId().hashCode());
        result = prime * result + ((getNewEntrustId() == null) ? 0 : getNewEntrustId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNewUserId() == null) ? 0 : getNewUserId().hashCode());
        result = prime * result + ((getEntrustReturnMoney() == null) ? 0 : getEntrustReturnMoney().hashCode());
        result = prime * result + ((getEntrustGradeTime() == null) ? 0 : getEntrustGradeTime().hashCode());
        result = prime * result + ((getEntrustReturnTime() == null) ? 0 : getEntrustReturnTime().hashCode());
        result = prime * result + ((getEntrustState() == null) ? 0 : getEntrustState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", awaitDeliveryOrderId=").append(awaitDeliveryOrderId);
        sb.append(", newEntrustId=").append(newEntrustId);
        sb.append(", userId=").append(userId);
        sb.append(", newUserId=").append(newUserId);
        sb.append(", entrustReturnMoney=").append(entrustReturnMoney);
        sb.append(", entrustGradeTime=").append(entrustGradeTime);
        sb.append(", entrustReturnTime=").append(entrustReturnTime);
        sb.append(", entrustState=").append(entrustState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}