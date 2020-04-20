package com.bbtong.Pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * bbt_delivery_order
 * 戴辆
 */
public class DeliveryOrder implements Serializable {
    /**
     * 主键/ID (还单表)
     */
    private Integer deliveryOrderId;

    /**
     * 上次接的最后一次委托单的ID(用来记录还单)
     */
    private Integer newEntrustId;

    /**
     * 自己提交的委托ID
     */
    private Integer entrustId;

    /**
     *  获取发布委托的金额
     */
    private Double entrustMoney;

    /**
     *  表示这一单结束的时间
     */
    private Date entrustGradeTime;

    /**
     *  提交委托人的ID
     */
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getDeliveryOrderId() {
        return deliveryOrderId;
    }

    public void setDeliveryOrderId(Integer deliveryOrderId) {
        this.deliveryOrderId = deliveryOrderId;
    }

    public Integer getNewEntrustId() {
        return newEntrustId;
    }

    public void setNewEntrustId(Integer newEntrustId) {
        this.newEntrustId = newEntrustId;
    }

    public Integer getEntrustId() {
        return entrustId;
    }

    public void setEntrustId(Integer entrustId) {
        this.entrustId = entrustId;
    }

    public Double getEntrustMoney() {
        return entrustMoney;
    }

    public void setEntrustMoney(Double entrustMoney) {
        this.entrustMoney = entrustMoney;
    }

    public Date getEntrustGradeTime() {
        return entrustGradeTime;
    }

    public void setEntrustGradeTime(Date entrustGradeTime) {
        this.entrustGradeTime = entrustGradeTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        DeliveryOrder other = (DeliveryOrder) that;
        return (this.getDeliveryOrderId() == null ? other.getDeliveryOrderId() == null : this.getDeliveryOrderId().equals(other.getDeliveryOrderId()))
            && (this.getNewEntrustId() == null ? other.getNewEntrustId() == null : this.getNewEntrustId().equals(other.getNewEntrustId()))
            && (this.getEntrustId() == null ? other.getEntrustId() == null : this.getEntrustId().equals(other.getEntrustId()))
            && (this.getEntrustMoney() == null ? other.getEntrustMoney() == null : this.getEntrustMoney().equals(other.getEntrustMoney()))
            && (this.getEntrustGradeTime() == null ? other.getEntrustGradeTime() == null : this.getEntrustGradeTime().equals(other.getEntrustGradeTime()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeliveryOrderId() == null) ? 0 : getDeliveryOrderId().hashCode());
        result = prime * result + ((getNewEntrustId() == null) ? 0 : getNewEntrustId().hashCode());
        result = prime * result + ((getEntrustId() == null) ? 0 : getEntrustId().hashCode());
        result = prime * result + ((getEntrustMoney() == null) ? 0 : getEntrustMoney().hashCode());
        result = prime * result + ((getEntrustGradeTime() == null) ? 0 : getEntrustGradeTime().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deliveryOrderId=").append(deliveryOrderId);
        sb.append(", newEntrustId=").append(newEntrustId);
        sb.append(", entrustId=").append(entrustId);
        sb.append(", entrustMoney=").append(entrustMoney);
        sb.append(", entrustGradeTime=").append(entrustGradeTime);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}