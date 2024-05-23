package com.synectiks.app.entity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.synectiks.asset.api.model.Organization;
import com.synectiks.asset.api.model.Permission;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Permissioncatogories")
public class PermissionCategory {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	  private String name;
	  private String description;
	  private Long version;
	  private String status;
	    @OneToOne(targetEntity = com.synectiks.app.entity.Organization.class, fetch = jakarta.persistence.FetchType.EAGER)
	    @JsonIgnoreProperties(value = "organizations", allowSetters = true)
	  private com.synectiks.app.entity.Organization organization;
	    
	    @jakarta.persistence.ManyToMany(targetEntity = com.synectiks.app.entity.Permission.class, fetch = jakarta.persistence.FetchType.LAZY)
	  private List<com.synectiks.app.entity.Permission> permissions = null;

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

		

		public List<com.synectiks.app.entity.Permission> getPermissions() {
			return permissions;
		}

		public void setPermissions(List<com.synectiks.app.entity.Permission> permissions) {
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
			return "PermissionCategory [id=" + id + ", name=" + name + ", description=" + description + ", version="
					+ version + ", status=" + status + ", organization=" + organization + ", permissions=" + permissions
					+ "]";
		}

		
	    
	    
	    
}
