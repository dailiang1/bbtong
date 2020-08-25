package com.bbtong.Pojo.dj;

import java.io.Serializable;

/**
 * dj_daily
 * @author 
 */
public class Daily implements Serializable {
    /**
     * 日结表主键id
     */
    private Integer dailyId;

    /**
     * 用户id(对应的就是用户表中的数据)
     */
    private Integer userId;

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 代理人id
     */
    private Integer agentId;

    /**
     * 代理人姓名
     */
    private String agentName;

    /**
     * 车商名称
     */
    private String dealerName;

    /**
     * 部门的id
     */
    private Integer departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 车牌号
     */
    private String licensePlateNumber;

    /**
     * 交强险金额
     */
    private Double compulsory;

    /**
     * 商业险金额
     */
    private Double commercial;

    /**
     * 出单的时间
     */
    private String dailyTime;

    private static final long serialVersionUID = 1L;

    public Integer getDailyId() {
        return dailyId;
    }

    public void setDailyId(Integer dailyId) {
        this.dailyId = dailyId;
    }

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

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public Double getCompulsory() {
        return compulsory;
    }

    public void setCompulsory(Double compulsory) {
        this.compulsory = compulsory;
    }

    public Double getCommercial() {
        return commercial;
    }

    public void setCommercial(Double commercial) {
        this.commercial = commercial;
    }

    public String getDailyTime() {
        return dailyTime;
    }

    public void setDailyTime(String dailyTime) {
        this.dailyTime = dailyTime;
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
        Daily other = (Daily) that;
        return (this.getDailyId() == null ? other.getDailyId() == null : this.getDailyId().equals(other.getDailyId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getAgentName() == null ? other.getAgentName() == null : this.getAgentName().equals(other.getAgentName()))
            && (this.getDealerName() == null ? other.getDealerName() == null : this.getDealerName().equals(other.getDealerName()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getDepartmentName() == null ? other.getDepartmentName() == null : this.getDepartmentName().equals(other.getDepartmentName()))
            && (this.getLicensePlateNumber() == null ? other.getLicensePlateNumber() == null : this.getLicensePlateNumber().equals(other.getLicensePlateNumber()))
            && (this.getCompulsory() == null ? other.getCompulsory() == null : this.getCompulsory().equals(other.getCompulsory()))
            && (this.getCommercial() == null ? other.getCommercial() == null : this.getCommercial().equals(other.getCommercial()))
            && (this.getDailyTime() == null ? other.getDailyTime() == null : this.getDailyTime().equals(other.getDailyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDailyId() == null) ? 0 : getDailyId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        result = prime * result + ((getDealerName() == null) ? 0 : getDealerName().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getDepartmentName() == null) ? 0 : getDepartmentName().hashCode());
        result = prime * result + ((getLicensePlateNumber() == null) ? 0 : getLicensePlateNumber().hashCode());
        result = prime * result + ((getCompulsory() == null) ? 0 : getCompulsory().hashCode());
        result = prime * result + ((getCommercial() == null) ? 0 : getCommercial().hashCode());
        result = prime * result + ((getDailyTime() == null) ? 0 : getDailyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dailyId=").append(dailyId);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", agentId=").append(agentId);
        sb.append(", agentName=").append(agentName);
        sb.append(", dealerName=").append(dealerName);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", departmentName=").append(departmentName);
        sb.append(", licensePlateNumber=").append(licensePlateNumber);
        sb.append(", compulsory=").append(compulsory);
        sb.append(", commercial=").append(commercial);
        sb.append(", dailyTime=").append(dailyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}