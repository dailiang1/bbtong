package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_news
 * @author 
 */
public class News implements Serializable {
    /**
     * 消息表的id
     */
    private Integer newsId;

    /**
     * 用户的id
     */
    private Integer newsUserId;

    /**
     * 委托的id
     */
    private Integer newsEntrustId;

    /**
     * 委托的车牌号
     */
    private String newsLicenseNumber;

    /**
     * 对消息结果的说明
     */
    private String newsMessage;

    /**
     * 表示当前消息的状态(0未读,1已读,2删除)
     */
    private Integer newsState;

    /**
     * 表示是什么消息，1意向消息，2接单消息
     */
    private Integer state;

    private static final long serialVersionUID = 1L;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Integer getNewsUserId() {
        return newsUserId;
    }

    public void setNewsUserId(Integer newsUserId) {
        this.newsUserId = newsUserId;
    }

    public Integer getNewsEntrustId() {
        return newsEntrustId;
    }

    public void setNewsEntrustId(Integer newsEntrustId) {
        this.newsEntrustId = newsEntrustId;
    }

    public String getNewsLicenseNumber() {
        return newsLicenseNumber;
    }

    public void setNewsLicenseNumber(String newsLicenseNumber) {
        this.newsLicenseNumber = newsLicenseNumber;
    }

    public String getNewsMessage() {
        return newsMessage;
    }

    public void setNewsMessage(String newsMessage) {
        this.newsMessage = newsMessage;
    }

    public Integer getNewsState() {
        return newsState;
    }

    public void setNewsState(Integer newsState) {
        this.newsState = newsState;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        News other = (News) that;
        return (this.getNewsId() == null ? other.getNewsId() == null : this.getNewsId().equals(other.getNewsId()))
            && (this.getNewsUserId() == null ? other.getNewsUserId() == null : this.getNewsUserId().equals(other.getNewsUserId()))
            && (this.getNewsEntrustId() == null ? other.getNewsEntrustId() == null : this.getNewsEntrustId().equals(other.getNewsEntrustId()))
            && (this.getNewsLicenseNumber() == null ? other.getNewsLicenseNumber() == null : this.getNewsLicenseNumber().equals(other.getNewsLicenseNumber()))
            && (this.getNewsMessage() == null ? other.getNewsMessage() == null : this.getNewsMessage().equals(other.getNewsMessage()))
            && (this.getNewsState() == null ? other.getNewsState() == null : this.getNewsState().equals(other.getNewsState()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNewsId() == null) ? 0 : getNewsId().hashCode());
        result = prime * result + ((getNewsUserId() == null) ? 0 : getNewsUserId().hashCode());
        result = prime * result + ((getNewsEntrustId() == null) ? 0 : getNewsEntrustId().hashCode());
        result = prime * result + ((getNewsLicenseNumber() == null) ? 0 : getNewsLicenseNumber().hashCode());
        result = prime * result + ((getNewsMessage() == null) ? 0 : getNewsMessage().hashCode());
        result = prime * result + ((getNewsState() == null) ? 0 : getNewsState().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", newsId=").append(newsId);
        sb.append(", newsUserId=").append(newsUserId);
        sb.append(", newsEntrustId=").append(newsEntrustId);
        sb.append(", newsLicenseNumber=").append(newsLicenseNumber);
        sb.append(", newsMessage=").append(newsMessage);
        sb.append(", newsState=").append(newsState);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}