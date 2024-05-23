package com.synectiks.asset.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.synectiks.asset.api.model.Organization;
import com.synectiks.asset.api.model.Permission;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * PermissionCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
public class PermissionCategory  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("version")
  private Long version;

  @JsonProperty("status")
  private String status;

  @JsonProperty("organization")
  private Organization organization;

  @JsonProperty("permissions")
  @Valid
  private List<Permission> permissions = null;

  public PermissionCategory id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PermissionCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PermissionCategory description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PermissionCategory version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @ApiModelProperty(value = "")


  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public PermissionCategory status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PermissionCategory organization(Organization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
  */
  @ApiModelProperty(value = "")

  @Valid

  public Organization getOrganization() {
    return organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

  public PermissionCategory permissions(List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PermissionCategory addPermissionsItem(Permission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionCategory permissionCategory = (PermissionCategory) o;
    return Objects.equals(this.id, permissionCategory.id) &&
        Objects.equals(this.name, permissionCategory.name) &&
        Objects.equals(this.description, permissionCategory.description) &&
        Objects.equals(this.version, permissionCategory.version) &&
        Objects.equals(this.status, permissionCategory.status) &&
        Objects.equals(this.organization, permissionCategory.organization) &&
        Objects.equals(this.permissions, permissionCategory.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, status, organization, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionCategory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

