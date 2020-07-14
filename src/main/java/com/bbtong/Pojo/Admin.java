package com.bbtong.Pojo;

import java.io.Serializable;

/**
 * bbt_admin
 * @author 
 */
public class Admin implements Serializable {
    /**
     * 管理员表的id
     */
    private Integer adminId;

    /**
     * 管理员的姓名
     */
    private String adminName;

    /**
     * 管理员的电话
     */
    private String adminPhone;

    /**
     * 管理员的账号
     */
    private String adminAccount;

    /**
     * 管理员的密码
     */
    private String adminPassword;

    /**
     * 权限表的id
     */
    private Integer adminRoleId;

    /**
     * 权限对应的名称
     */
    private String adminRoleName;

    /**
     * 管理员账号是否正常(0正常，1冻结)
     */
    private Integer adminState;

    private static final long serialVersionUID = 1L;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

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

    public Integer getAdminState() {
        return adminState;
    }

    public void setAdminState(Integer adminState) {
        this.adminState = adminState;
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
        Admin other = (Admin) that;
        return (this.getAdminId() == null ? other.getAdminId() == null : this.getAdminId().equals(other.getAdminId()))
            && (this.getAdminName() == null ? other.getAdminName() == null : this.getAdminName().equals(other.getAdminName()))
            && (this.getAdminPhone() == null ? other.getAdminPhone() == null : this.getAdminPhone().equals(other.getAdminPhone()))
            && (this.getAdminAccount() == null ? other.getAdminAccount() == null : this.getAdminAccount().equals(other.getAdminAccount()))
            && (this.getAdminPassword() == null ? other.getAdminPassword() == null : this.getAdminPassword().equals(other.getAdminPassword()))
            && (this.getAdminRoleId() == null ? other.getAdminRoleId() == null : this.getAdminRoleId().equals(other.getAdminRoleId()))
            && (this.getAdminRoleName() == null ? other.getAdminRoleName() == null : this.getAdminRoleName().equals(other.getAdminRoleName()))
            && (this.getAdminState() == null ? other.getAdminState() == null : this.getAdminState().equals(other.getAdminState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminId() == null) ? 0 : getAdminId().hashCode());
        result = prime * result + ((getAdminName() == null) ? 0 : getAdminName().hashCode());
        result = prime * result + ((getAdminPhone() == null) ? 0 : getAdminPhone().hashCode());
        result = prime * result + ((getAdminAccount() == null) ? 0 : getAdminAccount().hashCode());
        result = prime * result + ((getAdminPassword() == null) ? 0 : getAdminPassword().hashCode());
        result = prime * result + ((getAdminRoleId() == null) ? 0 : getAdminRoleId().hashCode());
        result = prime * result + ((getAdminRoleName() == null) ? 0 : getAdminRoleName().hashCode());
        result = prime * result + ((getAdminState() == null) ? 0 : getAdminState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", adminName=").append(adminName);
        sb.append(", adminPhone=").append(adminPhone);
        sb.append(", adminAccount=").append(adminAccount);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", adminRoleId=").append(adminRoleId);
        sb.append(", adminRoleName=").append(adminRoleName);
        sb.append(", adminState=").append(adminState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}