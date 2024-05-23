package com.synectiks.app.entity;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.asset.api.model.Organization;
import com.synectiks.asset.api.model.Permission;
import com.synectiks.asset.api.model.Policy;
import com.synectiks.asset.api.model.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RoleEntity {

	 @Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long Id;
	 
	  private String name;

	  private Integer version;
 
	  private Boolean grp;

	  private Boolean isDefault;

	  @jakarta.persistence.OneToOne(targetEntity = com.synectiks.app.entity.Organization.class, fetch = jakarta.persistence.FetchType.EAGER)
	    @JsonIgnoreProperties(value = "organizations", allowSetters = true)
	  private com.synectiks.app.entity.Organization organization;

	  @JsonProperty("description")
	  private String description;
	  
	  @jakarta.persistence.ManyToMany(targetEntity = RoleEntity.class, fetch = jakarta.persistence.FetchType.EAGER)
	  private List<RoleEntity> roles = null;

	  @jakarta.persistence.ManyToMany(targetEntity = PolicyEntity.class, fetch = jakarta.persistence.FetchType.LAZY)
	  private List<PolicyEntity> policies = null;

	  @jakarta.persistence.Transient
	    @JsonProperty
	  private List<Object> users = null;

	   @jakarta.persistence.Transient
	    @JsonProperty
	  private List<com.synectiks.app.entity.Permission> disAllowedPermissions = null;
	   @jakarta.persistence.Transient
	    @JsonProperty
	  private List<com.synectiks.app.entity.Permission> allowedPermissions = null;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Boolean getGrp() {
		return grp;
	}
	public void setGrp(Boolean grp) {
		this.grp = grp;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	public com.synectiks.app.entity.Organization getOrganization() {
		return organization;
	}
	public void setOrganization(com.synectiks.app.entity.Organization organization) {
		this.organization = organization;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<RoleEntity> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleEntity> roles) {
		this.roles = roles;
	}
	public List<PolicyEntity> getPolicies() {
		return policies;
	}
	public void setPolicies(List<PolicyEntity> policies) {
		this.policies = policies;
	}
	public List<Object> getUsers() {
		return users;
	}
	public void setUsers(List<Object> users) {
		this.users = users;
	}
	
	public List<com.synectiks.app.entity.Permission> getDisAllowedPermissions() {
		return disAllowedPermissions;
	}
	public void setDisAllowedPermissions(List<com.synectiks.app.entity.Permission> disAllowedPermissions) {
		this.disAllowedPermissions = disAllowedPermissions;
	}
	public List<com.synectiks.app.entity.Permission> getAllowedPermissions() {
		return allowedPermissions;
	}
	public void setAllowedPermissions(List<com.synectiks.app.entity.Permission> allowedPermissions) {
		this.allowedPermissions = allowedPermissions;
	}
	@Override
	public String toString() {
		return "RoleEntity [Id=" + Id + ", name=" + name + ", version=" + version + ", grp=" + grp + ", isDefault="
				+ isDefault + ", organization=" + organization + ", description=" + description + ", roles=" + roles
				+ ", policies=" + policies + ", users=" + users + ", disAllowedPermissions=" + disAllowedPermissions
				+ ", allowedPermissions=" + allowedPermissions + "]";
	}

	   
	   

}
