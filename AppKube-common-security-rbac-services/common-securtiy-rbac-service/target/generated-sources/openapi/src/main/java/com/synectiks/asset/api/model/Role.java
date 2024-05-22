package com.synectiks.asset.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.synectiks.asset.api.model.Organization;
import com.synectiks.asset.api.model.Permission;
import com.synectiks.asset.api.model.Policy;
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
 * Role
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T08:33:53.267382700-07:00[America/Los_Angeles]")
public class Role  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;

  @JsonProperty("version")
  private Integer version;

  @JsonProperty("grp")
  private Boolean grp;

  @JsonProperty("isDefault")
  private Boolean isDefault;

  @JsonProperty("organization")
  private Organization organization;

  @JsonProperty("description")
  private String description;

  @JsonProperty("roles")
  @Valid
  private List<Role> roles = null;

  @JsonProperty("policies")
  @Valid
  private List<Policy> policies = null;

  @JsonProperty("users")
  @Valid
  private List<Object> users = null;

  @JsonProperty("disAllowedPermissions")
  @Valid
  private List<Permission> disAllowedPermissions = null;

  @JsonProperty("allowedPermissions")
  @Valid
  private List<Permission> allowedPermissions = null;

  public Role name(String name) {
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

  public Role version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @ApiModelProperty(value = "")


  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Role grp(Boolean grp) {
    this.grp = grp;
    return this;
  }

  /**
   * Get grp
   * @return grp
  */
  @ApiModelProperty(value = "")


  public Boolean getGrp() {
    return grp;
  }

  public void setGrp(Boolean grp) {
    this.grp = grp;
  }

  public Role isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
  */
  @ApiModelProperty(value = "")


  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public Role organization(Organization organization) {
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

  public Role description(String description) {
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

  public Role roles(List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public Role addRolesItem(Role rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public Role policies(List<Policy> policies) {
    this.policies = policies;
    return this;
  }

  public Role addPoliciesItem(Policy policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

  /**
   * Get policies
   * @return policies
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Policy> getPolicies() {
    return policies;
  }

  public void setPolicies(List<Policy> policies) {
    this.policies = policies;
  }

  public Role users(List<Object> users) {
    this.users = users;
    return this;
  }

  public Role addUsersItem(Object usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @ApiModelProperty(value = "")


  public List<Object> getUsers() {
    return users;
  }

  public void setUsers(List<Object> users) {
    this.users = users;
  }

  public Role disAllowedPermissions(List<Permission> disAllowedPermissions) {
    this.disAllowedPermissions = disAllowedPermissions;
    return this;
  }

  public Role addDisAllowedPermissionsItem(Permission disAllowedPermissionsItem) {
    if (this.disAllowedPermissions == null) {
      this.disAllowedPermissions = new ArrayList<>();
    }
    this.disAllowedPermissions.add(disAllowedPermissionsItem);
    return this;
  }

  /**
   * Get disAllowedPermissions
   * @return disAllowedPermissions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Permission> getDisAllowedPermissions() {
    return disAllowedPermissions;
  }

  public void setDisAllowedPermissions(List<Permission> disAllowedPermissions) {
    this.disAllowedPermissions = disAllowedPermissions;
  }

  public Role allowedPermissions(List<Permission> allowedPermissions) {
    this.allowedPermissions = allowedPermissions;
    return this;
  }

  public Role addAllowedPermissionsItem(Permission allowedPermissionsItem) {
    if (this.allowedPermissions == null) {
      this.allowedPermissions = new ArrayList<>();
    }
    this.allowedPermissions.add(allowedPermissionsItem);
    return this;
  }

  /**
   * Get allowedPermissions
   * @return allowedPermissions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Permission> getAllowedPermissions() {
    return allowedPermissions;
  }

  public void setAllowedPermissions(List<Permission> allowedPermissions) {
    this.allowedPermissions = allowedPermissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.name, role.name) &&
        Objects.equals(this.version, role.version) &&
        Objects.equals(this.grp, role.grp) &&
        Objects.equals(this.isDefault, role.isDefault) &&
        Objects.equals(this.organization, role.organization) &&
        Objects.equals(this.description, role.description) &&
        Objects.equals(this.roles, role.roles) &&
        Objects.equals(this.policies, role.policies) &&
        Objects.equals(this.users, role.users) &&
        Objects.equals(this.disAllowedPermissions, role.disAllowedPermissions) &&
        Objects.equals(this.allowedPermissions, role.allowedPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, grp, isDefault, organization, description, roles, policies, users, disAllowedPermissions, allowedPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    grp: ").append(toIndentedString(grp)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    disAllowedPermissions: ").append(toIndentedString(disAllowedPermissions)).append("\n");
    sb.append("    allowedPermissions: ").append(toIndentedString(allowedPermissions)).append("\n");
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

