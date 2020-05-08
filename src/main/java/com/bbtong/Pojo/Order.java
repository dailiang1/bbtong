package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_order
 * @author 
 */
public class Order implements Serializable {
    /**
     * 接单表的ID
     */
    private Integer orderId;

    /**
     * 发布委托人的ID
     */
    private Integer userId;

    /**
     * 接单人的ID
     */
    private Integer newUserId;

    /**
     * 委托完成的状态(0待处理，1表示已完成，2表示放弃，3表示取消)
     */
    private Integer orderState;

    /**
     * 表示订单更新的时间
     */
    private String orderTime;

    /**
     * 表示委托的ID
     */
    private Integer entrustId;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getEntrustId() {
        return entrustId;
    }

    public void setEntrustId(Integer entrustId) {
        this.entrustId = entrustId;
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
        Order other = (Order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getNewUserId() == null ? other.getNewUserId() == null : this.getNewUserId().equals(other.getNewUserId()))
            && (this.getOrderState() == null ? other.getOrderState() == null : this.getOrderState().equals(other.getOrderState()))
            && (this.getOrderTime() == null ? other.getOrderTime() == null : this.getOrderTime().equals(other.getOrderTime()))
            && (this.getEntrustId() == null ? other.getEntrustId() == null : this.getEntrustId().equals(other.getEntrustId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNewUserId() == null) ? 0 : getNewUserId().hashCode());
        result = prime * result + ((getOrderState() == null) ? 0 : getOrderState().hashCode());
        result = prime * result + ((getOrderTime() == null) ? 0 : getOrderTime().hashCode());
        result = prime * result + ((getEntrustId() == null) ? 0 : getEntrustId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", newUserId=").append(newUserId);
        sb.append(", orderState=").append(orderState);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", entrustId=").append(entrustId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}