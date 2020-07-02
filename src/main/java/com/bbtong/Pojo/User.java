package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_user
 * @author 
 */
public class User implements Serializable {
    /**
     * 主键/ID 为自增的 (代理人表)
     */
    private Integer userId;

    /**
     * 用户名字
     */
    private String userName;

    /**
     * 用户的昵称
     */
    private String userNickname;

    /**
     *  保险公司的名称(通过保险公司的ID查询出来的)
     */
    private String insuranceCompanyName;

    /**
     * 对应保险公司的ID(用来查询用户是什么保险公司的)
     */
    private Integer insuranceCompanyId;

    /**
     * 个人的诚信等级
     */
    private Double userIntegrity;

    /**
     * 开通年费的状态(1,表示已经开通。0表示没有开通)
     */
    private Integer userMemberState;

    /**
     * 年费开始的时间
     */
    private String userMemberBegin;

    /**
     * 年费截止的时间
     */
    private String userMemberFinish;

    /**
     * 电话号码(需要验证)
     */
    private String userPhone;

    /**
     * 用户的身份证号码
     */
    private String userIdentityCard;

    /**
     * 身份证的正面图片
     */
    private String userIdentityCardFront;

    /**
     * 身份证的反面图片
     */
    private String userIdentityCardVerso;

    /**
     * 服务积分(用户的满意度),只有三种状态(0满意，1一般，2不满意) 一开始注册之后每个人都是满意
     */
    private Integer userSatisfaction;

    /**
     * 微信的openid(每个用户唯一，不能为空)
     */
    private String userOpenid;

    /**
     * 用户的状态(0表示没有实名，1表示待审核，2表示审核没通过，3表示实名认证了)
     */
    private Integer userState;

    /**
     * 委托单的总数量
     */
    private Integer userEntrustNumber;

    /**
     * 接单的总数量
     */
    private Integer userOrderNumer;

    /**
     * 委托单的总金额
     */
    private Double userEntrustMoney;

    /**
     * 接单的总金额
     */
    private Double userOrderMoney;

    /**
     * 代理人的编号
     */
    private String userNumber;

    /**
     * 首次访问需确认统一委托公约(0表示未同意，1表示已同意)
     */
    private Integer userPact;

    /**
     *  用来判断他当前是否还能接单(0表示可以接单，1表示不可以)
     */
    private Integer userOrderState;

    /**
     * A类表示：大保险代理(铁通员工)，B类表示大家保险代理(非铁通员工)，C类表示非大家保险代理。分别用0，1， 2表示
     */
    private Integer userTietong;

    /**
     *  委托人所在的城市(需自己选择，精确到县级即可)
     */
    private String userAddress;

    /**
     * 表示铁通员工的编号
     */
    private String tietongNumber;

    /**
     * 表示当前委托人是否可以。选择有意向委托(0表示可以，1表示不可以)
     */
    private Integer intentionState;

    /**
     * 表示第一次测试的时候，注册的人是否审核了(0为待审核，1已审核)
     */
    private Integer testState;

    /**
     * 表示用户注册的时间
     */
    private String userTime;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    public Integer getInsuranceCompanyId() {
        return insuranceCompanyId;
    }

    public void setInsuranceCompanyId(Integer insuranceCompanyId) {
        this.insuranceCompanyId = insuranceCompanyId;
    }

    public Double getUserIntegrity() {
        return userIntegrity;
    }

    public void setUserIntegrity(Double userIntegrity) {
        this.userIntegrity = userIntegrity;
    }

    public Integer getUserMemberState() {
        return userMemberState;
    }

    public void setUserMemberState(Integer userMemberState) {
        this.userMemberState = userMemberState;
    }

    public String getUserMemberBegin() {
        return userMemberBegin;
    }

    public void setUserMemberBegin(String userMemberBegin) {
        this.userMemberBegin = userMemberBegin;
    }

    public String getUserMemberFinish() {
        return userMemberFinish;
    }

    public void setUserMemberFinish(String userMemberFinish) {
        this.userMemberFinish = userMemberFinish;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserIdentityCard() {
        return userIdentityCard;
    }

    public void setUserIdentityCard(String userIdentityCard) {
        this.userIdentityCard = userIdentityCard;
    }

    public String getUserIdentityCardFront() {
        return userIdentityCardFront;
    }

    public void setUserIdentityCardFront(String userIdentityCardFront) {
        this.userIdentityCardFront = userIdentityCardFront;
    }

    public String getUserIdentityCardVerso() {
        return userIdentityCardVerso;
    }

    public void setUserIdentityCardVerso(String userIdentityCardVerso) {
        this.userIdentityCardVerso = userIdentityCardVerso;
    }

    public Integer getUserSatisfaction() {
        return userSatisfaction;
    }

    public void setUserSatisfaction(Integer userSatisfaction) {
        this.userSatisfaction = userSatisfaction;
    }

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Integer getUserEntrustNumber() {
        return userEntrustNumber;
    }

    public void setUserEntrustNumber(Integer userEntrustNumber) {
        this.userEntrustNumber = userEntrustNumber;
    }

    public Integer getUserOrderNumer() {
        return userOrderNumer;
    }

    public void setUserOrderNumer(Integer userOrderNumer) {
        this.userOrderNumer = userOrderNumer;
    }

    public Double getUserEntrustMoney() {
        return userEntrustMoney;
    }

    public void setUserEntrustMoney(Double userEntrustMoney) {
        this.userEntrustMoney = userEntrustMoney;
    }

    public Double getUserOrderMoney() {
        return userOrderMoney;
    }

    public void setUserOrderMoney(Double userOrderMoney) {
        this.userOrderMoney = userOrderMoney;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public Integer getUserPact() {
        return userPact;
    }

    public void setUserPact(Integer userPact) {
        this.userPact = userPact;
    }

    public Integer getUserOrderState() {
        return userOrderState;
    }

    public void setUserOrderState(Integer userOrderState) {
        this.userOrderState = userOrderState;
    }

    public Integer getUserTietong() {
        return userTietong;
    }

    public void setUserTietong(Integer userTietong) {
        this.userTietong = userTietong;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getTietongNumber() {
        return tietongNumber;
    }

    public void setTietongNumber(String tietongNumber) {
        this.tietongNumber = tietongNumber;
    }

    public Integer getIntentionState() {
        return intentionState;
    }

    public void setIntentionState(Integer intentionState) {
        this.intentionState = intentionState;
    }

    public Integer getTestState() {
        return testState;
    }

    public void setTestState(Integer testState) {
        this.testState = testState;
    }

    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
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
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserNickname() == null ? other.getUserNickname() == null : this.getUserNickname().equals(other.getUserNickname()))
            && (this.getInsuranceCompanyName() == null ? other.getInsuranceCompanyName() == null : this.getInsuranceCompanyName().equals(other.getInsuranceCompanyName()))
            && (this.getInsuranceCompanyId() == null ? other.getInsuranceCompanyId() == null : this.getInsuranceCompanyId().equals(other.getInsuranceCompanyId()))
            && (this.getUserIntegrity() == null ? other.getUserIntegrity() == null : this.getUserIntegrity().equals(other.getUserIntegrity()))
            && (this.getUserMemberState() == null ? other.getUserMemberState() == null : this.getUserMemberState().equals(other.getUserMemberState()))
            && (this.getUserMemberBegin() == null ? other.getUserMemberBegin() == null : this.getUserMemberBegin().equals(other.getUserMemberBegin()))
            && (this.getUserMemberFinish() == null ? other.getUserMemberFinish() == null : this.getUserMemberFinish().equals(other.getUserMemberFinish()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getUserIdentityCard() == null ? other.getUserIdentityCard() == null : this.getUserIdentityCard().equals(other.getUserIdentityCard()))
            && (this.getUserIdentityCardFront() == null ? other.getUserIdentityCardFront() == null : this.getUserIdentityCardFront().equals(other.getUserIdentityCardFront()))
            && (this.getUserIdentityCardVerso() == null ? other.getUserIdentityCardVerso() == null : this.getUserIdentityCardVerso().equals(other.getUserIdentityCardVerso()))
            && (this.getUserSatisfaction() == null ? other.getUserSatisfaction() == null : this.getUserSatisfaction().equals(other.getUserSatisfaction()))
            && (this.getUserOpenid() == null ? other.getUserOpenid() == null : this.getUserOpenid().equals(other.getUserOpenid()))
            && (this.getUserState() == null ? other.getUserState() == null : this.getUserState().equals(other.getUserState()))
            && (this.getUserEntrustNumber() == null ? other.getUserEntrustNumber() == null : this.getUserEntrustNumber().equals(other.getUserEntrustNumber()))
            && (this.getUserOrderNumer() == null ? other.getUserOrderNumer() == null : this.getUserOrderNumer().equals(other.getUserOrderNumer()))
            && (this.getUserEntrustMoney() == null ? other.getUserEntrustMoney() == null : this.getUserEntrustMoney().equals(other.getUserEntrustMoney()))
            && (this.getUserOrderMoney() == null ? other.getUserOrderMoney() == null : this.getUserOrderMoney().equals(other.getUserOrderMoney()))
            && (this.getUserNumber() == null ? other.getUserNumber() == null : this.getUserNumber().equals(other.getUserNumber()))
            && (this.getUserPact() == null ? other.getUserPact() == null : this.getUserPact().equals(other.getUserPact()))
            && (this.getUserOrderState() == null ? other.getUserOrderState() == null : this.getUserOrderState().equals(other.getUserOrderState()))
            && (this.getUserTietong() == null ? other.getUserTietong() == null : this.getUserTietong().equals(other.getUserTietong()))
            && (this.getUserAddress() == null ? other.getUserAddress() == null : this.getUserAddress().equals(other.getUserAddress()))
            && (this.getTietongNumber() == null ? other.getTietongNumber() == null : this.getTietongNumber().equals(other.getTietongNumber()))
            && (this.getIntentionState() == null ? other.getIntentionState() == null : this.getIntentionState().equals(other.getIntentionState()))
            && (this.getTestState() == null ? other.getTestState() == null : this.getTestState().equals(other.getTestState()))
            && (this.getUserTime() == null ? other.getUserTime() == null : this.getUserTime().equals(other.getUserTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserNickname() == null) ? 0 : getUserNickname().hashCode());
        result = prime * result + ((getInsuranceCompanyName() == null) ? 0 : getInsuranceCompanyName().hashCode());
        result = prime * result + ((getInsuranceCompanyId() == null) ? 0 : getInsuranceCompanyId().hashCode());
        result = prime * result + ((getUserIntegrity() == null) ? 0 : getUserIntegrity().hashCode());
        result = prime * result + ((getUserMemberState() == null) ? 0 : getUserMemberState().hashCode());
        result = prime * result + ((getUserMemberBegin() == null) ? 0 : getUserMemberBegin().hashCode());
        result = prime * result + ((getUserMemberFinish() == null) ? 0 : getUserMemberFinish().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getUserIdentityCard() == null) ? 0 : getUserIdentityCard().hashCode());
        result = prime * result + ((getUserIdentityCardFront() == null) ? 0 : getUserIdentityCardFront().hashCode());
        result = prime * result + ((getUserIdentityCardVerso() == null) ? 0 : getUserIdentityCardVerso().hashCode());
        result = prime * result + ((getUserSatisfaction() == null) ? 0 : getUserSatisfaction().hashCode());
        result = prime * result + ((getUserOpenid() == null) ? 0 : getUserOpenid().hashCode());
        result = prime * result + ((getUserState() == null) ? 0 : getUserState().hashCode());
        result = prime * result + ((getUserEntrustNumber() == null) ? 0 : getUserEntrustNumber().hashCode());
        result = prime * result + ((getUserOrderNumer() == null) ? 0 : getUserOrderNumer().hashCode());
        result = prime * result + ((getUserEntrustMoney() == null) ? 0 : getUserEntrustMoney().hashCode());
        result = prime * result + ((getUserOrderMoney() == null) ? 0 : getUserOrderMoney().hashCode());
        result = prime * result + ((getUserNumber() == null) ? 0 : getUserNumber().hashCode());
        result = prime * result + ((getUserPact() == null) ? 0 : getUserPact().hashCode());
        result = prime * result + ((getUserOrderState() == null) ? 0 : getUserOrderState().hashCode());
        result = prime * result + ((getUserTietong() == null) ? 0 : getUserTietong().hashCode());
        result = prime * result + ((getUserAddress() == null) ? 0 : getUserAddress().hashCode());
        result = prime * result + ((getTietongNumber() == null) ? 0 : getTietongNumber().hashCode());
        result = prime * result + ((getIntentionState() == null) ? 0 : getIntentionState().hashCode());
        result = prime * result + ((getTestState() == null) ? 0 : getTestState().hashCode());
        result = prime * result + ((getUserTime() == null) ? 0 : getUserTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", insuranceCompanyName=").append(insuranceCompanyName);
        sb.append(", insuranceCompanyId=").append(insuranceCompanyId);
        sb.append(", userIntegrity=").append(userIntegrity);
        sb.append(", userMemberState=").append(userMemberState);
        sb.append(", userMemberBegin=").append(userMemberBegin);
        sb.append(", userMemberFinish=").append(userMemberFinish);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userIdentityCard=").append(userIdentityCard);
        sb.append(", userIdentityCardFront=").append(userIdentityCardFront);
        sb.append(", userIdentityCardVerso=").append(userIdentityCardVerso);
        sb.append(", userSatisfaction=").append(userSatisfaction);
        sb.append(", userOpenid=").append(userOpenid);
        sb.append(", userState=").append(userState);
        sb.append(", userEntrustNumber=").append(userEntrustNumber);
        sb.append(", userOrderNumer=").append(userOrderNumer);
        sb.append(", userEntrustMoney=").append(userEntrustMoney);
        sb.append(", userOrderMoney=").append(userOrderMoney);
        sb.append(", userNumber=").append(userNumber);
        sb.append(", userPact=").append(userPact);
        sb.append(", userOrderState=").append(userOrderState);
        sb.append(", userTietong=").append(userTietong);
        sb.append(", userAddress=").append(userAddress);
        sb.append(", tietongNumber=").append(tietongNumber);
        sb.append(", intentionState=").append(intentionState);
        sb.append(", testState=").append(testState);
        sb.append(", userTime=").append(userTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}