package com.bbtong.Pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * bbt_beans
 * 戴辆
 */
public class Beans implements Serializable {
    /**
     * 主键/ID（和豆申请表）
     */
    private Integer beansId;

    /**
     * 用来记录是那个代理人提交的
     */
    private Integer userId;

    /**
     *  人.车生活卡号，赠送和豆给卡激活人
     */
    private String cardNumber;

    /**
     *  用来记录和豆申请是否完成(0表示未处理，1表示已处理)
     */
    private String beansState;

    /**
     * 代理人的编号
     */
    private String userNumber;

    /**
     * 和豆订单申请的时间
     */
    private Date beansTime;

    /**
     * 和豆订单申请审核的时间
     */
    private Date newbeansTime;

    private static final long serialVersionUID = 1L;

    public Integer getBeansId() {
        return beansId;
    }

    public void setBeansId(Integer beansId) {
        this.beansId = beansId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBeansState() {
        return beansState;
    }

    public void setBeansState(String beansState) {
        this.beansState = beansState;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public Date getBeansTime() {
        return beansTime;
    }

    public void setBeansTime(Date beansTime) {
        this.beansTime = beansTime;
    }

    public Date getNewbeansTime() {
        return newbeansTime;
    }

    public void setNewbeansTime(Date newbeansTime) {
        this.newbeansTime = newbeansTime;
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
        Beans other = (Beans) that;
        return (this.getBeansId() == null ? other.getBeansId() == null : this.getBeansId().equals(other.getBeansId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getBeansState() == null ? other.getBeansState() == null : this.getBeansState().equals(other.getBeansState()))
            && (this.getUserNumber() == null ? other.getUserNumber() == null : this.getUserNumber().equals(other.getUserNumber()))
            && (this.getBeansTime() == null ? other.getBeansTime() == null : this.getBeansTime().equals(other.getBeansTime()))
            && (this.getNewbeansTime() == null ? other.getNewbeansTime() == null : this.getNewbeansTime().equals(other.getNewbeansTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBeansId() == null) ? 0 : getBeansId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getBeansState() == null) ? 0 : getBeansState().hashCode());
        result = prime * result + ((getUserNumber() == null) ? 0 : getUserNumber().hashCode());
        result = prime * result + ((getBeansTime() == null) ? 0 : getBeansTime().hashCode());
        result = prime * result + ((getNewbeansTime() == null) ? 0 : getNewbeansTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", beansId=").append(beansId);
        sb.append(", userId=").append(userId);
        sb.append(", cardNumber=").append(cardNumber);
        sb.append(", beansState=").append(beansState);
        sb.append(", userNumber=").append(userNumber);
        sb.append(", beansTime=").append(beansTime);
        sb.append(", newbeansTime=").append(newbeansTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}