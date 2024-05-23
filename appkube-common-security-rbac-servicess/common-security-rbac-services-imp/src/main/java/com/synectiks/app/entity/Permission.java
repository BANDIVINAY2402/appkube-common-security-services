package com.synectiks.app.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.asset.api.model.Organization;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Permission {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;

	  private Integer version;

	  private String name;

	  private String description;

	  private String status;

	    @jakarta.persistence.OneToOne(fetch =jakarta.persistence.FetchType.EAGER)
	    @JsonIgnoreProperties(value = "organizations", allowSetters = true)
	  private com.synectiks.app.entity.Organization organization;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getVersion() {
			return version;
		}

		public void setVersion(Integer version) {
			this.version = version;
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

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public com.synectiks.app.entity.Organization getOrganization() {
			return organization;
		}

		public void setOrganization(com.synectiks.app.entity.Organization organization) {
			this.organization = organization;
		}

		@Override
		public String toString() {
			return "Permission [id=" + id + ", version=" + version + ", name=" + name + ", description=" + description
					+ ", status=" + status + ", organization=" + organization + "]";
		}
	    
}
