package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_insurance_company
 * 戴辆
 */
public class InsuranceCompany implements Serializable {
    /**
     * 主键/ID (保险公司表)
     */
    private Integer insuranceCompanyId;

    /**
     * 保险公司名称(如大家保险，平安保险)
     */
    private String insuranceCompanyName;

    private static final long serialVersionUID = 1L;

    public Integer getInsuranceCompanyId() {
        return insuranceCompanyId;
    }

    public void setInsuranceCompanyId(Integer insuranceCompanyId) {
        this.insuranceCompanyId = insuranceCompanyId;
    }

    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
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
        InsuranceCompany other = (InsuranceCompany) that;
        return (this.getInsuranceCompanyId() == null ? other.getInsuranceCompanyId() == null : this.getInsuranceCompanyId().equals(other.getInsuranceCompanyId()))
            && (this.getInsuranceCompanyName() == null ? other.getInsuranceCompanyName() == null : this.getInsuranceCompanyName().equals(other.getInsuranceCompanyName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInsuranceCompanyId() == null) ? 0 : getInsuranceCompanyId().hashCode());
        result = prime * result + ((getInsuranceCompanyName() == null) ? 0 : getInsuranceCompanyName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", insuranceCompanyId=").append(insuranceCompanyId);
        sb.append(", insuranceCompanyName=").append(insuranceCompanyName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}