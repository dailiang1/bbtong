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
     * 待还单用户的ID
     */
    private Integer userId;

    /**
     * 还单用户的ID 
     */
    private Integer newUserId;

    /**
     * 车牌号码
     */
    private String deliveryOrderNumber;

    /**
     *  获取发布委托的金额
     */
    private Double deliveryOrderMoney;

    /**
     *  表示这一单结束的时间
     */
    private Date entrustGradeTime;

    /**
     * 表示待还单用户是否确认了信息(0未确认，1确定(表示订单结束)，2驳回订单信息有误，请重新提交)
     */
    private Integer deliveryOrderState;

    /**
     * 表示当前表示还单的满意度(0表示满意，1表示一般，2表示不满意)
     */
    private Integer entrustGrade;

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

    public String getDeliveryOrderNumber() {
        return deliveryOrderNumber;
    }

    public void setDeliveryOrderNumber(String deliveryOrderNumber) {
        this.deliveryOrderNumber = deliveryOrderNumber;
    }

    public Double getDeliveryOrderMoney() {
        return deliveryOrderMoney;
    }

    public void setDeliveryOrderMoney(Double deliveryOrderMoney) {
        this.deliveryOrderMoney = deliveryOrderMoney;
    }

    public Date getEntrustGradeTime() {
        return entrustGradeTime;
    }

    public void setEntrustGradeTime(Date entrustGradeTime) {
        this.entrustGradeTime = entrustGradeTime;
    }

    public Integer getDeliveryOrderState() {
        return deliveryOrderState;
    }

    public void setDeliveryOrderState(Integer deliveryOrderState) {
        this.deliveryOrderState = deliveryOrderState;
    }

    public Integer getEntrustGrade() {
        return entrustGrade;
    }

    public void setEntrustGrade(Integer entrustGrade) {
        this.entrustGrade = entrustGrade;
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
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNewUserId() == null ? other.getNewUserId() == null : this.getNewUserId().equals(other.getNewUserId()))
            && (this.getDeliveryOrderNumber() == null ? other.getDeliveryOrderNumber() == null : this.getDeliveryOrderNumber().equals(other.getDeliveryOrderNumber()))
            && (this.getDeliveryOrderMoney() == null ? other.getDeliveryOrderMoney() == null : this.getDeliveryOrderMoney().equals(other.getDeliveryOrderMoney()))
            && (this.getEntrustGradeTime() == null ? other.getEntrustGradeTime() == null : this.getEntrustGradeTime().equals(other.getEntrustGradeTime()))
            && (this.getDeliveryOrderState() == null ? other.getDeliveryOrderState() == null : this.getDeliveryOrderState().equals(other.getDeliveryOrderState()))
            && (this.getEntrustGrade() == null ? other.getEntrustGrade() == null : this.getEntrustGrade().equals(other.getEntrustGrade()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeliveryOrderId() == null) ? 0 : getDeliveryOrderId().hashCode());
        result = prime * result + ((getNewEntrustId() == null) ? 0 : getNewEntrustId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNewUserId() == null) ? 0 : getNewUserId().hashCode());
        result = prime * result + ((getDeliveryOrderNumber() == null) ? 0 : getDeliveryOrderNumber().hashCode());
        result = prime * result + ((getDeliveryOrderMoney() == null) ? 0 : getDeliveryOrderMoney().hashCode());
        result = prime * result + ((getEntrustGradeTime() == null) ? 0 : getEntrustGradeTime().hashCode());
        result = prime * result + ((getDeliveryOrderState() == null) ? 0 : getDeliveryOrderState().hashCode());
        result = prime * result + ((getEntrustGrade() == null) ? 0 : getEntrustGrade().hashCode());
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
        sb.append(", userId=").append(userId);
        sb.append(", newUserId=").append(newUserId);
        sb.append(", deliveryOrderNumber=").append(deliveryOrderNumber);
        sb.append(", deliveryOrderMoney=").append(deliveryOrderMoney);
        sb.append(", entrustGradeTime=").append(entrustGradeTime);
        sb.append(", deliveryOrderState=").append(deliveryOrderState);
        sb.append(", entrustGrade=").append(entrustGrade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}