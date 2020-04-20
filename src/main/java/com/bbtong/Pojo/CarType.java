package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_car_type
 * 戴辆
 */
public class CarType implements Serializable {
    /**
     * 主键/ID (车类型表)
     */
    private Integer carTypeId;

    /**
     * 车的类型(新车或续保)
     */
    private String carTypeName;

    private static final long serialVersionUID = 1L;

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
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
        CarType other = (CarType) that;
        return (this.getCarTypeId() == null ? other.getCarTypeId() == null : this.getCarTypeId().equals(other.getCarTypeId()))
            && (this.getCarTypeName() == null ? other.getCarTypeName() == null : this.getCarTypeName().equals(other.getCarTypeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCarTypeId() == null) ? 0 : getCarTypeId().hashCode());
        result = prime * result + ((getCarTypeName() == null) ? 0 : getCarTypeName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carTypeId=").append(carTypeId);
        sb.append(", carTypeName=").append(carTypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}