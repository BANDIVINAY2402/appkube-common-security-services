package com.synectiks.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.synectiks.asset.api.model.Organization;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "con")
public class Config {
       @Id
 	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;


	  private String key;

	  private String value;

	  private String status;

	  private Boolean isEncrypted;
	    @OneToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "organization_id")
	  private com.synectiks.app.entity.Organization organization;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Boolean getIsEncrypted() {
			return isEncrypted;
		}
		public void setIsEncrypted(Boolean isEncrypted) {
			this.isEncrypted = isEncrypted;
		}
		
		public com.synectiks.app.entity.Organization getOrganization() {
			return organization;
		}
		public void setOrganization(com.synectiks.app.entity.Organization organization) {
			this.organization = organization;
		}
		@Override
		public String toString() {
			return "Config [id=" + id + ", key=" + key + ", value=" + value + ", status=" + status + ", isEncrypted="
					+ isEncrypted + ", organization=" + organization + "]";
		}
	    
	    
	    

}
