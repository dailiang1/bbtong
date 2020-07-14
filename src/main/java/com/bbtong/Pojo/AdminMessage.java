package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_admin_message
 * @author 
 */
public class AdminMessage implements Serializable {
    /**
     * 管理员信息记录表Id
     */
    private Integer adminMessageId;

    /**
     * 修改用户id
     */
    private Integer userId;

    /**
     * 修改的时间
     */
    private String adminMessageTime;

    /**
     * 管理员对于操作的备注
     */
    private String adminMessageRemark;

    /**
     * 本次操作的管理员的id
     */
    private Integer adminId;

    private static final long serialVersionUID = 1L;

    public Integer getAdminMessageId() {
        return adminMessageId;
    }

    public void setAdminMessageId(Integer adminMessageId) {
        this.adminMessageId = adminMessageId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAdminMessageTime() {
        return adminMessageTime;
    }

    public void setAdminMessageTime(String adminMessageTime) {
        this.adminMessageTime = adminMessageTime;
    }

    public String getAdminMessageRemark() {
        return adminMessageRemark;
    }

    public void setAdminMessageRemark(String adminMessageRemark) {
        this.adminMessageRemark = adminMessageRemark;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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
        AdminMessage other = (AdminMessage) that;
        return (this.getAdminMessageId() == null ? other.getAdminMessageId() == null : this.getAdminMessageId().equals(other.getAdminMessageId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAdminMessageTime() == null ? other.getAdminMessageTime() == null : this.getAdminMessageTime().equals(other.getAdminMessageTime()))
            && (this.getAdminMessageRemark() == null ? other.getAdminMessageRemark() == null : this.getAdminMessageRemark().equals(other.getAdminMessageRemark()))
            && (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminMessageId() == null) ? 0 : getAdminMessageId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAdminMessageTime() == null) ? 0 : getAdminMessageTime().hashCode());
        result = prime * result + ((getAdminMessageRemark() == null) ? 0 : getAdminMessageRemark().hashCode());
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminMessageId=").append(adminMessageId);
        sb.append(", userId=").append(userId);
        sb.append(", adminMessageTime=").append(adminMessageTime);
        sb.append(", adminMessageRemark=").append(adminMessageRemark);
        sb.append(", adminId=").append(adminId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}