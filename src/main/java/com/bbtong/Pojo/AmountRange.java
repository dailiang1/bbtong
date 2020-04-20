package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_amount_range
 * 戴辆
 */
public class AmountRange implements Serializable {
    /**
     * 主键/ID (车保金额类)
     */
    private Integer amountRangeId;

    /**
     * 车保金额的范围(如：低于30万，30-50万)
     */
    private String amountRangeName;

    private static final long serialVersionUID = 1L;

    public Integer getAmountRangeId() {
        return amountRangeId;
    }

    public void setAmountRangeId(Integer amountRangeId) {
        this.amountRangeId = amountRangeId;
    }

    public String getAmountRangeName() {
        return amountRangeName;
    }

    public void setAmountRangeName(String amountRangeName) {
        this.amountRangeName = amountRangeName;
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
        AmountRange other = (AmountRange) that;
        return (this.getAmountRangeId() == null ? other.getAmountRangeId() == null : this.getAmountRangeId().equals(other.getAmountRangeId()))
            && (this.getAmountRangeName() == null ? other.getAmountRangeName() == null : this.getAmountRangeName().equals(other.getAmountRangeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAmountRangeId() == null) ? 0 : getAmountRangeId().hashCode());
        result = prime * result + ((getAmountRangeName() == null) ? 0 : getAmountRangeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", amountRangeId=").append(amountRangeId);
        sb.append(", amountRangeName=").append(amountRangeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}