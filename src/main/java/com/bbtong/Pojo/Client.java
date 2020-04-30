package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_client
 * @author 
 */
public class Client implements Serializable {
    /**
     * 主键/ID (客户表)
     */
    private Integer clientId;

    /**
     * 客户的联系方式(非必填选项，手机，微信等第三方工具)
     */
    private String clientWay;

    /**
     * 客户的姓名
     */
    private String clientName;

    /**
     * 客户需要出的保单公司(对应选择对应的保单公司ID)
     */
    private Integer insuranceCompanyId;

    /**
     * 客户的身份证号码
     */
    private String clientIdentityCard;

    /**
     * 客户身份证的正面
     */
    private String clientIdentityCardFront;

    /**
     * 客户身份证的反面
     */
    private String clientIdentityCardVerso;

    /**
     *  客户投保城市(前端传过来的值)
     */
    private String clientAddress;

    /**
     * 客户出保日期
     */
    private String clientComeTime;

    /**
     * 客户到保时间
     */
    private String clientExpirationTime;

    /**
     * 客户的行驶证副本图片
     */
    private String clientDrivingLicense;

    /**
     * 客户的生日(客户的生日，自动截取身份证的日期)
     */
    private String clientBirthday;

    /**
     * 客户车型(自己备注客户车的类型)
     */
    private String clientType;

    /**
     * 客户类型表的ID
     */
    private Integer typeId;

    /**
     * 用户的ID，这是属于哪个用户的客户
     */
    private Integer userId;

    /**
     * 给客户的备注
     */
    private String clientRemark;

    private static final long serialVersionUID = 1L;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientWay() {
        return clientWay;
    }

    public void setClientWay(String clientWay) {
        this.clientWay = clientWay;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getInsuranceCompanyId() {
        return insuranceCompanyId;
    }

    public void setInsuranceCompanyId(Integer insuranceCompanyId) {
        this.insuranceCompanyId = insuranceCompanyId;
    }

    public String getClientIdentityCard() {
        return clientIdentityCard;
    }

    public void setClientIdentityCard(String clientIdentityCard) {
        this.clientIdentityCard = clientIdentityCard;
    }

    public String getClientIdentityCardFront() {
        return clientIdentityCardFront;
    }

    public void setClientIdentityCardFront(String clientIdentityCardFront) {
        this.clientIdentityCardFront = clientIdentityCardFront;
    }

    public String getClientIdentityCardVerso() {
        return clientIdentityCardVerso;
    }

    public void setClientIdentityCardVerso(String clientIdentityCardVerso) {
        this.clientIdentityCardVerso = clientIdentityCardVerso;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientComeTime() {
        return clientComeTime;
    }

    public void setClientComeTime(String clientComeTime) {
        this.clientComeTime = clientComeTime;
    }

    public String getClientExpirationTime() {
        return clientExpirationTime;
    }

    public void setClientExpirationTime(String clientExpirationTime) {
        this.clientExpirationTime = clientExpirationTime;
    }

    public String getClientDrivingLicense() {
        return clientDrivingLicense;
    }

    public void setClientDrivingLicense(String clientDrivingLicense) {
        this.clientDrivingLicense = clientDrivingLicense;
    }

    public String getClientBirthday() {
        return clientBirthday;
    }

    public void setClientBirthday(String clientBirthday) {
        this.clientBirthday = clientBirthday;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getClientRemark() {
        return clientRemark;
    }

    public void setClientRemark(String clientRemark) {
        this.clientRemark = clientRemark;
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
        Client other = (Client) that;
        return (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getClientWay() == null ? other.getClientWay() == null : this.getClientWay().equals(other.getClientWay()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getInsuranceCompanyId() == null ? other.getInsuranceCompanyId() == null : this.getInsuranceCompanyId().equals(other.getInsuranceCompanyId()))
            && (this.getClientIdentityCard() == null ? other.getClientIdentityCard() == null : this.getClientIdentityCard().equals(other.getClientIdentityCard()))
            && (this.getClientIdentityCardFront() == null ? other.getClientIdentityCardFront() == null : this.getClientIdentityCardFront().equals(other.getClientIdentityCardFront()))
            && (this.getClientIdentityCardVerso() == null ? other.getClientIdentityCardVerso() == null : this.getClientIdentityCardVerso().equals(other.getClientIdentityCardVerso()))
            && (this.getClientAddress() == null ? other.getClientAddress() == null : this.getClientAddress().equals(other.getClientAddress()))
            && (this.getClientComeTime() == null ? other.getClientComeTime() == null : this.getClientComeTime().equals(other.getClientComeTime()))
            && (this.getClientExpirationTime() == null ? other.getClientExpirationTime() == null : this.getClientExpirationTime().equals(other.getClientExpirationTime()))
            && (this.getClientDrivingLicense() == null ? other.getClientDrivingLicense() == null : this.getClientDrivingLicense().equals(other.getClientDrivingLicense()))
            && (this.getClientBirthday() == null ? other.getClientBirthday() == null : this.getClientBirthday().equals(other.getClientBirthday()))
            && (this.getClientType() == null ? other.getClientType() == null : this.getClientType().equals(other.getClientType()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getClientRemark() == null ? other.getClientRemark() == null : this.getClientRemark().equals(other.getClientRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getClientWay() == null) ? 0 : getClientWay().hashCode());
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getInsuranceCompanyId() == null) ? 0 : getInsuranceCompanyId().hashCode());
        result = prime * result + ((getClientIdentityCard() == null) ? 0 : getClientIdentityCard().hashCode());
        result = prime * result + ((getClientIdentityCardFront() == null) ? 0 : getClientIdentityCardFront().hashCode());
        result = prime * result + ((getClientIdentityCardVerso() == null) ? 0 : getClientIdentityCardVerso().hashCode());
        result = prime * result + ((getClientAddress() == null) ? 0 : getClientAddress().hashCode());
        result = prime * result + ((getClientComeTime() == null) ? 0 : getClientComeTime().hashCode());
        result = prime * result + ((getClientExpirationTime() == null) ? 0 : getClientExpirationTime().hashCode());
        result = prime * result + ((getClientDrivingLicense() == null) ? 0 : getClientDrivingLicense().hashCode());
        result = prime * result + ((getClientBirthday() == null) ? 0 : getClientBirthday().hashCode());
        result = prime * result + ((getClientType() == null) ? 0 : getClientType().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getClientRemark() == null) ? 0 : getClientRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientId=").append(clientId);
        sb.append(", clientWay=").append(clientWay);
        sb.append(", clientName=").append(clientName);
        sb.append(", insuranceCompanyId=").append(insuranceCompanyId);
        sb.append(", clientIdentityCard=").append(clientIdentityCard);
        sb.append(", clientIdentityCardFront=").append(clientIdentityCardFront);
        sb.append(", clientIdentityCardVerso=").append(clientIdentityCardVerso);
        sb.append(", clientAddress=").append(clientAddress);
        sb.append(", clientComeTime=").append(clientComeTime);
        sb.append(", clientExpirationTime=").append(clientExpirationTime);
        sb.append(", clientDrivingLicense=").append(clientDrivingLicense);
        sb.append(", clientBirthday=").append(clientBirthday);
        sb.append(", clientType=").append(clientType);
        sb.append(", typeId=").append(typeId);
        sb.append(", userId=").append(userId);
        sb.append(", clientRemark=").append(clientRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}