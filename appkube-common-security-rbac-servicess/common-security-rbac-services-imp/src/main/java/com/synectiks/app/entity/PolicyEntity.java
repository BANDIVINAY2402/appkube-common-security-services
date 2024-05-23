package com.synectiks.app.entity;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PolicyTable")
public class PolicyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	  private String name;

	  private String description;

	  private Long version;

	  private String status;

	  @jakarta.persistence.ManyToMany(targetEntity = PolicyAssignedPermissions.class, fetch = jakarta.persistence.FetchType.LAZY)
	  private List<PolicyAssignedPermissions> permissions = null;

	  @jakarta.persistence.OneToOne(targetEntity = com.synectiks.app.entity.Organization.class, fetch = jakarta.persistence.FetchType.EAGER)
	    @JsonIgnoreProperties(value = "organizations", allowSetters = true)
	  private com.synectiks.app.entity.Organization organization;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public List<PolicyAssignedPermissions> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<PolicyAssignedPermissions> permissions) {
		this.permissions = permissions;
	}

	public com.synectiks.app.entity.Organization getOrganization() {
		return organization;
	}

	public void setOrganization(com.synectiks.app.entity.Organization organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "PolicyEntity [id=" + id + ", name=" + name + ", description=" + description + ", version=" + version
				+ ", status=" + status + ", permissions=" + permissions + ", organization=" + organization + "]";
	}



	

 
	  
}
