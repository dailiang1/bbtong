package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_admin_role
 * @author 
 */
public class AdminRole implements Serializable {
    /**
     * 权限表的id
     */
    private Integer adminRoleId;

    /**
     * 权限名称
     */
    private String adminRoleName;

    private static final long serialVersionUID = 1L;

    public Integer getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(Integer adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public String getAdminRoleName() {
        return adminRoleName;
    }

    public void setAdminRoleName(String adminRoleName) {
        this.adminRoleName = adminRoleName;
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
        AdminRole other = (AdminRole) that;
        return (this.getAdminRoleId() == null ? other.getAdminRoleId() == null : this.getAdminRoleId().equals(other.getAdminRoleId()))
            && (this.getAdminRoleName() == null ? other.getAdminRoleName() == null : this.getAdminRoleName().equals(other.getAdminRoleName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminRoleId() == null) ? 0 : getAdminRoleId().hashCode());
        result = prime * result + ((getAdminRoleName() == null) ? 0 : getAdminRoleName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminRoleId=").append(adminRoleId);
        sb.append(", adminRoleName=").append(adminRoleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}