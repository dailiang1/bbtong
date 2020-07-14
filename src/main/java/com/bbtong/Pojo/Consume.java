package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_consume
 * @author 
 */
public class Consume implements Serializable {
    /**
     * 主键/ID (消费卡申请表)
     */
    private Integer consumeId;

    /**
     * 用来记录是那个代理人提交的
     */
    private Integer userId;

    /**
     * 提交大家保险保单号
     */
    private String consumeNumber;

    /**
     *  用来记录消费卡申请是否完成(0表示未处理，1表示已处理)
     */
    private String consumeState;

    /**
     * 代理人的编号
     */
    private String userNumber;

    /**
     * 提交消费卡申请的时间
     */
    private String consumeTime;

    /**
     * 消费卡申请审核的时间
     */
    private String newconsumeTime;

    /**
     * 审核这条信息的管理员姓名
     */
    private String adminName;

    private static final long serialVersionUID = 1L;

    public Integer getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(Integer consumeId) {
        this.consumeId = consumeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getConsumeNumber() {
        return consumeNumber;
    }

    public void setConsumeNumber(String consumeNumber) {
        this.consumeNumber = consumeNumber;
    }

    public String getConsumeState() {
        return consumeState;
    }

    public void setConsumeState(String consumeState) {
        this.consumeState = consumeState;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getNewconsumeTime() {
        return newconsumeTime;
    }

    public void setNewconsumeTime(String newconsumeTime) {
        this.newconsumeTime = newconsumeTime;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
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
        Consume other = (Consume) that;
        return (this.getConsumeId() == null ? other.getConsumeId() == null : this.getConsumeId().equals(other.getConsumeId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getConsumeNumber() == null ? other.getConsumeNumber() == null : this.getConsumeNumber().equals(other.getConsumeNumber()))
            && (this.getConsumeState() == null ? other.getConsumeState() == null : this.getConsumeState().equals(other.getConsumeState()))
            && (this.getUserNumber() == null ? other.getUserNumber() == null : this.getUserNumber().equals(other.getUserNumber()))
            && (this.getConsumeTime() == null ? other.getConsumeTime() == null : this.getConsumeTime().equals(other.getConsumeTime()))
            && (this.getNewconsumeTime() == null ? other.getNewconsumeTime() == null : this.getNewconsumeTime().equals(other.getNewconsumeTime()))
            && (this.getAdminName() == null ? other.getAdminName() == null : this.getAdminName().equals(other.getAdminName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getConsumeId() == null) ? 0 : getConsumeId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getConsumeNumber() == null) ? 0 : getConsumeNumber().hashCode());
        result = prime * result + ((getConsumeState() == null) ? 0 : getConsumeState().hashCode());
        result = prime * result + ((getUserNumber() == null) ? 0 : getUserNumber().hashCode());
        result = prime * result + ((getConsumeTime() == null) ? 0 : getConsumeTime().hashCode());
        result = prime * result + ((getNewconsumeTime() == null) ? 0 : getNewconsumeTime().hashCode());
        result = prime * result + ((getAdminName() == null) ? 0 : getAdminName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", consumeId=").append(consumeId);
        sb.append(", userId=").append(userId);
        sb.append(", consumeNumber=").append(consumeNumber);
        sb.append(", consumeState=").append(consumeState);
        sb.append(", userNumber=").append(userNumber);
        sb.append(", consumeTime=").append(consumeTime);
        sb.append(", newconsumeTime=").append(newconsumeTime);
        sb.append(", adminName=").append(adminName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}