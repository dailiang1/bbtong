package com.bbtong.Pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * bbt_entrust 委托订单表
 *
 * @author
 */

@Data
public class Entrust implements Serializable {
    /**
     * 主键ID (委托订单表)
     */
    private Integer entrustId;

    /**
     * 发布委托人的ID
     */
    private Integer userId;

    /**
     * 有意向接单人的ID(是一个字符串来接受这些人，用逗号来分割)
     */
    private String newUserId;

    /**
     * 最终接单人的ID(根据ID，显示其的满意度，委托数，联系电话)
     */
    private Integer finallyUserId;

    /**
     * 保险公司名称(发布委托用户的保险公司的名称，用来显示是哪家保险的代理人)
     */
    private String insuranceCompanyName;

    /**
     * 指定对应要出的保单公司(可以为空) 默认是1表示所有公司
     */
    private Integer insuranceCompanyId;

    /**
     * 必填选项，车牌号码
     */
    private String licensePlateNumber;

    /**
     * 车的品牌(如：大众，奔驰等)
     */
    private String entrustCarBrand;

    /**
     * 前端选择对应的城市，直接存储城市的字符串
     */
    private String entrustAddress;

    /**
     * 委托的备注
     */
    private String entrustRemark;

    /**
     * 订单的评定(0满意，1一般，2不满意)
     */
    private Integer entrustGrade;

    /**
     * 委托单开始的时间(获取下单时候的时间)
     */
    private String entrustStartTime;

    /**
     * 委托单结束的时间
     */
    private String entrustEndTime;

    /**
     * 车类型表的ID(表示新车或旧车)
     */
    private Integer carTypeId;

    /**
     * 车保类型的价格范围表ID
     */
    private Integer amountRangeId;

    /**
     * 表示委托是否被接(0表示未接单，1表示已接单，2表示待确认完成，3表示已完成，4表示没人接单，5表示委托人主动撤单,6表示委托还单结束)
     */
    private Integer entrustState;

    /**
     * 需要投保些什么类型的保险，自己语言描述
     */
    private String entrustInsure;

    /**
     * 订单的评分的时间(表示这一单正式结束的时间)
     */
    private String entrustGradeTime;

    /**
     * 期望委托的服务费(可以为空，私下交易联系)
     */
    private Double entrustServiceCharge;

    /**
     * 委托的金额
     */
    private Double entrustMoney;

    /**
     * 需要还单的金额(默认为委托订单的百分之50)但是也可以自己手动设置
     */
    private Double entrustReturnMoney;

    /**
     * 还单的时间，多久之内把单给还了(用天来做单位)
     */
    private Integer entrustReturnTime;


    /**
     * 是否投保商业车损险(0表示不投，1表示投。默认选择是1)
     */
    private Integer entrustBusiness;

    /**
     * 订单最后归还的日期(在写了评分之后获取当前的时间，然后再加上归还的期限，来确定最后归还的时间）
     */
    private String entrustTime;

    private static final long serialVersionUID = 1L;

    public Integer getEntrustId() {
        return entrustId;
    }

    public void setEntrustId(Integer entrustId) {
        this.entrustId = entrustId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNewUserId() {
        return newUserId;
    }

    public void setNewUserId(String newUserId) {
        this.newUserId = newUserId;
    }

    public Integer getFinallyUserId() {
        return finallyUserId;
    }

    public void setFinallyUserId(Integer finallyUserId) {
        this.finallyUserId = finallyUserId;
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

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getEntrustCarBrand() {
        return entrustCarBrand;
    }

    public void setEntrustCarBrand(String entrustCarBrand) {
        this.entrustCarBrand = entrustCarBrand;
    }

    public String getEntrustAddress() {
        return entrustAddress;
    }

    public void setEntrustAddress(String entrustAddress) {
        this.entrustAddress = entrustAddress;
    }

    public String getEntrustRemark() {
        return entrustRemark;
    }

    public void setEntrustRemark(String entrustRemark) {
        this.entrustRemark = entrustRemark;
    }

    public Integer getEntrustGrade() {
        return entrustGrade;
    }

    public void setEntrustGrade(Integer entrustGrade) {
        this.entrustGrade = entrustGrade;
    }

    public String getEntrustStartTime() {
        return entrustStartTime;
    }

    public void setEntrustStartTime(String entrustStartTime) {
        this.entrustStartTime = entrustStartTime;
    }

    public String getEntrustEndTime() {
        return entrustEndTime;
    }

    public void setEntrustEndTime(String entrustEndTime) {
        this.entrustEndTime = entrustEndTime;
    }

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public Integer getAmountRangeId() {
        return amountRangeId;
    }

    public void setAmountRangeId(Integer amountRangeId) {
        this.amountRangeId = amountRangeId;
    }

    public Integer getEntrustState() {
        return entrustState;
    }

    public void setEntrustState(Integer entrustState) {
        this.entrustState = entrustState;
    }

    public String getEntrustInsure() {
        return entrustInsure;
    }

    public void setEntrustInsure(String entrustInsure) {
        this.entrustInsure = entrustInsure;
    }

    public String getEntrustGradeTime() {
        return entrustGradeTime;
    }

    public void setEntrustGradeTime(String entrustGradeTime) {
        this.entrustGradeTime = entrustGradeTime;
    }

    public Double getEntrustServiceCharge() {
        return entrustServiceCharge;
    }

    public void setEntrustServiceCharge(Double entrustServiceCharge) {
        this.entrustServiceCharge = entrustServiceCharge;
    }

    public Double getEntrustMoney() {
        return entrustMoney;
    }

    public void setEntrustMoney(Double entrustMoney) {
        this.entrustMoney = entrustMoney;
    }

    public Double getEntrustReturnMoney() {
        return entrustReturnMoney;
    }

    public void setEntrustReturnMoney(Double entrustReturnMoney) {
        this.entrustReturnMoney = entrustReturnMoney;
    }

    public Integer getEntrustReturnTime() {
        return entrustReturnTime;
    }

    public void setEntrustReturnTime(Integer entrustReturnTime) {
        this.entrustReturnTime = entrustReturnTime;
    }

    public Integer getEntrustBusiness() {
        return entrustBusiness;
    }

    public void setEntrustBusiness(Integer entrustBusiness) {
        this.entrustBusiness = entrustBusiness;
    }

    public String getEntrustTime() {
        return entrustTime;
    }

    public void setEntrustTime(String entrustTime) {
        this.entrustTime = entrustTime;
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
        Entrust other = (Entrust) that;
        return (this.getEntrustId() == null ? other.getEntrustId() == null : this.getEntrustId().equals(other.getEntrustId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getNewUserId() == null ? other.getNewUserId() == null : this.getNewUserId().equals(other.getNewUserId()))
                && (this.getFinallyUserId() == null ? other.getFinallyUserId() == null : this.getFinallyUserId().equals(other.getFinallyUserId()))
                && (this.getInsuranceCompanyName() == null ? other.getInsuranceCompanyName() == null : this.getInsuranceCompanyName().equals(other.getInsuranceCompanyName()))
                && (this.getInsuranceCompanyId() == null ? other.getInsuranceCompanyId() == null : this.getInsuranceCompanyId().equals(other.getInsuranceCompanyId()))
                && (this.getLicensePlateNumber() == null ? other.getLicensePlateNumber() == null : this.getLicensePlateNumber().equals(other.getLicensePlateNumber()))
                && (this.getEntrustCarBrand() == null ? other.getEntrustCarBrand() == null : this.getEntrustCarBrand().equals(other.getEntrustCarBrand()))
                && (this.getEntrustAddress() == null ? other.getEntrustAddress() == null : this.getEntrustAddress().equals(other.getEntrustAddress()))
                && (this.getEntrustRemark() == null ? other.getEntrustRemark() == null : this.getEntrustRemark().equals(other.getEntrustRemark()))
                && (this.getEntrustGrade() == null ? other.getEntrustGrade() == null : this.getEntrustGrade().equals(other.getEntrustGrade()))
                && (this.getEntrustStartTime() == null ? other.getEntrustStartTime() == null : this.getEntrustStartTime().equals(other.getEntrustStartTime()))
                && (this.getEntrustEndTime() == null ? other.getEntrustEndTime() == null : this.getEntrustEndTime().equals(other.getEntrustEndTime()))
                && (this.getCarTypeId() == null ? other.getCarTypeId() == null : this.getCarTypeId().equals(other.getCarTypeId()))
                && (this.getAmountRangeId() == null ? other.getAmountRangeId() == null : this.getAmountRangeId().equals(other.getAmountRangeId()))
                && (this.getEntrustState() == null ? other.getEntrustState() == null : this.getEntrustState().equals(other.getEntrustState()))
                && (this.getEntrustInsure() == null ? other.getEntrustInsure() == null : this.getEntrustInsure().equals(other.getEntrustInsure()))
                && (this.getEntrustGradeTime() == null ? other.getEntrustGradeTime() == null : this.getEntrustGradeTime().equals(other.getEntrustGradeTime()))
                && (this.getEntrustServiceCharge() == null ? other.getEntrustServiceCharge() == null : this.getEntrustServiceCharge().equals(other.getEntrustServiceCharge()))
                && (this.getEntrustMoney() == null ? other.getEntrustMoney() == null : this.getEntrustMoney().equals(other.getEntrustMoney()))
                && (this.getEntrustReturnMoney() == null ? other.getEntrustReturnMoney() == null : this.getEntrustReturnMoney().equals(other.getEntrustReturnMoney()))
                && (this.getEntrustReturnTime() == null ? other.getEntrustReturnTime() == null : this.getEntrustReturnTime().equals(other.getEntrustReturnTime()))
                && (this.getEntrustBusiness() == null ? other.getEntrustBusiness() == null : this.getEntrustBusiness().equals(other.getEntrustBusiness()))
                && (this.getEntrustTime() == null ? other.getEntrustTime() == null : this.getEntrustTime().equals(other.getEntrustTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEntrustId() == null) ? 0 : getEntrustId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNewUserId() == null) ? 0 : getNewUserId().hashCode());
        result = prime * result + ((getFinallyUserId() == null) ? 0 : getFinallyUserId().hashCode());
        result = prime * result + ((getInsuranceCompanyName() == null) ? 0 : getInsuranceCompanyName().hashCode());
        result = prime * result + ((getInsuranceCompanyId() == null) ? 0 : getInsuranceCompanyId().hashCode());
        result = prime * result + ((getLicensePlateNumber() == null) ? 0 : getLicensePlateNumber().hashCode());
        result = prime * result + ((getEntrustCarBrand() == null) ? 0 : getEntrustCarBrand().hashCode());
        result = prime * result + ((getEntrustAddress() == null) ? 0 : getEntrustAddress().hashCode());
        result = prime * result + ((getEntrustRemark() == null) ? 0 : getEntrustRemark().hashCode());
        result = prime * result + ((getEntrustGrade() == null) ? 0 : getEntrustGrade().hashCode());
        result = prime * result + ((getEntrustStartTime() == null) ? 0 : getEntrustStartTime().hashCode());
        result = prime * result + ((getEntrustEndTime() == null) ? 0 : getEntrustEndTime().hashCode());
        result = prime * result + ((getCarTypeId() == null) ? 0 : getCarTypeId().hashCode());
        result = prime * result + ((getAmountRangeId() == null) ? 0 : getAmountRangeId().hashCode());
        result = prime * result + ((getEntrustState() == null) ? 0 : getEntrustState().hashCode());
        result = prime * result + ((getEntrustInsure() == null) ? 0 : getEntrustInsure().hashCode());
        result = prime * result + ((getEntrustGradeTime() == null) ? 0 : getEntrustGradeTime().hashCode());
        result = prime * result + ((getEntrustServiceCharge() == null) ? 0 : getEntrustServiceCharge().hashCode());
        result = prime * result + ((getEntrustMoney() == null) ? 0 : getEntrustMoney().hashCode());
        result = prime * result + ((getEntrustReturnMoney() == null) ? 0 : getEntrustReturnMoney().hashCode());
        result = prime * result + ((getEntrustReturnTime() == null) ? 0 : getEntrustReturnTime().hashCode());
        result = prime * result + ((getEntrustBusiness() == null) ? 0 : getEntrustBusiness().hashCode());
        result = prime * result + ((getEntrustTime() == null) ? 0 : getEntrustTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", entrustId=").append(entrustId);
        sb.append(", userId=").append(userId);
        sb.append(", newUserId=").append(newUserId);
        sb.append(", finallyUserId=").append(finallyUserId);
        sb.append(", insuranceCompanyName=").append(insuranceCompanyName);
        sb.append(", insuranceCompanyId=").append(insuranceCompanyId);
        sb.append(", licensePlateNumber=").append(licensePlateNumber);
        sb.append(", entrustCarBrand=").append(entrustCarBrand);
        sb.append(", entrustAddress=").append(entrustAddress);
        sb.append(", entrustRemark=").append(entrustRemark);
        sb.append(", entrustGrade=").append(entrustGrade);
        sb.append(", entrustStartTime=").append(entrustStartTime);
        sb.append(", entrustEndTime=").append(entrustEndTime);
        sb.append(", carTypeId=").append(carTypeId);
        sb.append(", amountRangeId=").append(amountRangeId);
        sb.append(", entrustState=").append(entrustState);
        sb.append(", entrustInsure=").append(entrustInsure);
        sb.append(", entrustGradeTime=").append(entrustGradeTime);
        sb.append(", entrustServiceCharge=").append(entrustServiceCharge);
        sb.append(", entrustMoney=").append(entrustMoney);
        sb.append(", entrustReturnMoney=").append(entrustReturnMoney);
        sb.append(", entrustReturnTime=").append(entrustReturnTime);
        sb.append(", entrustBusiness=").append(entrustBusiness);
        sb.append(", entrustTime=").append(entrustTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}