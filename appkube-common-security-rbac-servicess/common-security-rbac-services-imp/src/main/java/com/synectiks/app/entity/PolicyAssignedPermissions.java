package com.synectiks.app.entity;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PolicyAssignedPermissions {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private Long policyId;

private String policyName;

private Long permissionCategoryId;

private String permissionCategoryName;

private Long permissionId;

private String permissionName;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getPolicyId() {
	return policyId;
}

public void setPolicyId(Long policyId) {
	this.policyId = policyId;
}

public String getPolicyName() {
	return policyName;
}

public void setPolicyName(String policyName) {
	this.policyName = policyName;
}

public Long getPermissionCategoryId() {
	return permissionCategoryId;
}

public void setPermissionCategoryId(Long permissionCategoryId) {
	this.permissionCategoryId = permissionCategoryId;
}

public String getPermissionCategoryName() {
	return permissionCategoryName;
}

public void setPermissionCategoryName(String permissionCategoryName) {
	this.permissionCategoryName = permissionCategoryName;
}

public Long getPermissionId() {
	return permissionId;
}

public void setPermissionId(Long permissionId) {
	this.permissionId = permissionId;
}

public String getPermissionName() {
	return permissionName;
}

public void setPermissionName(String permissionName) {
	this.permissionName = permissionName;
}

@Override
public String toString() {
	return "PolicyAssignedPermissions [id=" + id + ", policyId=" + policyId + ", policyName=" + policyName
			+ ", permissionCategoryId=" + permissionCategoryId + ", permissionCategoryName=" + permissionCategoryName
			+ ", permissionId=" + permissionId + ", permissionName=" + permissionName + "]";
}



}
