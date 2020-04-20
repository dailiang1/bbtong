package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_friend
 * 戴辆
 */
public class Friend implements Serializable {
    /**
     * 主键/ID (好友表)
     */
    private Integer friendId;

    /**
     * 用户的ID
     */
    private Integer userId;

    /**
     * 好友的ID(这个好友的用户ID)
     */
    private Integer friendUserId;

    /**
     * 好友的备注(好友的备注可以为空)
     */
    private String friendRemark;

    /**
     *  好友的姓名
     */
    private String friendName;

    /**
     * 好友的手机电话
     */
    private String friendPhone;

    /**
     *  保险公司的名称(通过保好友的ID查询出来的)
     */
    private String friendCompanyName;

    private static final long serialVersionUID = 1L;

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFriendUserId() {
        return friendUserId;
    }

    public void setFriendUserId(Integer friendUserId) {
        this.friendUserId = friendUserId;
    }

    public String getFriendRemark() {
        return friendRemark;
    }

    public void setFriendRemark(String friendRemark) {
        this.friendRemark = friendRemark;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendPhone() {
        return friendPhone;
    }

    public void setFriendPhone(String friendPhone) {
        this.friendPhone = friendPhone;
    }

    public String getFriendCompanyName() {
        return friendCompanyName;
    }

    public void setFriendCompanyName(String friendCompanyName) {
        this.friendCompanyName = friendCompanyName;
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
        Friend other = (Friend) that;
        return (this.getFriendId() == null ? other.getFriendId() == null : this.getFriendId().equals(other.getFriendId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getFriendUserId() == null ? other.getFriendUserId() == null : this.getFriendUserId().equals(other.getFriendUserId()))
            && (this.getFriendRemark() == null ? other.getFriendRemark() == null : this.getFriendRemark().equals(other.getFriendRemark()))
            && (this.getFriendName() == null ? other.getFriendName() == null : this.getFriendName().equals(other.getFriendName()))
            && (this.getFriendPhone() == null ? other.getFriendPhone() == null : this.getFriendPhone().equals(other.getFriendPhone()))
            && (this.getFriendCompanyName() == null ? other.getFriendCompanyName() == null : this.getFriendCompanyName().equals(other.getFriendCompanyName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFriendId() == null) ? 0 : getFriendId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getFriendUserId() == null) ? 0 : getFriendUserId().hashCode());
        result = prime * result + ((getFriendRemark() == null) ? 0 : getFriendRemark().hashCode());
        result = prime * result + ((getFriendName() == null) ? 0 : getFriendName().hashCode());
        result = prime * result + ((getFriendPhone() == null) ? 0 : getFriendPhone().hashCode());
        result = prime * result + ((getFriendCompanyName() == null) ? 0 : getFriendCompanyName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", friendId=").append(friendId);
        sb.append(", userId=").append(userId);
        sb.append(", friendUserId=").append(friendUserId);
        sb.append(", friendRemark=").append(friendRemark);
        sb.append(", friendName=").append(friendName);
        sb.append(", friendPhone=").append(friendPhone);
        sb.append(", friendCompanyName=").append(friendCompanyName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}