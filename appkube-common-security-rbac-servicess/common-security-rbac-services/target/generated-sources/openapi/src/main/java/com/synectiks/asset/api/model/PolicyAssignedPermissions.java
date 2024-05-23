package com.synectiks.asset.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * PolicyAssignedPermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
public class PolicyAssignedPermissions  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("policyId")
  private Long policyId;

  @JsonProperty("policyName")
  private String policyName;

  @JsonProperty("permissionCategoryId")
  private Long permissionCategoryId;

  @JsonProperty("permissionCategoryName")
  private String permissionCategoryName;

  @JsonProperty("permissionId")
  private Long permissionId;

  @JsonProperty("permissionName")
  private String permissionName;

  public PolicyAssignedPermissions id(Long id) {
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

  public PolicyAssignedPermissions policyId(Long policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Get policyId
   * @return policyId
  */
  @ApiModelProperty(value = "")


  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public PolicyAssignedPermissions policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Get policyName
   * @return policyName
  */
  @ApiModelProperty(value = "")


  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public PolicyAssignedPermissions permissionCategoryId(Long permissionCategoryId) {
    this.permissionCategoryId = permissionCategoryId;
    return this;
  }

  /**
   * Get permissionCategoryId
   * @return permissionCategoryId
  */
  @ApiModelProperty(value = "")


  public Long getPermissionCategoryId() {
    return permissionCategoryId;
  }

  public void setPermissionCategoryId(Long permissionCategoryId) {
    this.permissionCategoryId = permissionCategoryId;
  }

  public PolicyAssignedPermissions permissionCategoryName(String permissionCategoryName) {
    this.permissionCategoryName = permissionCategoryName;
    return this;
  }

  /**
   * Get permissionCategoryName
   * @return permissionCategoryName
  */
  @ApiModelProperty(value = "")


  public String getPermissionCategoryName() {
    return permissionCategoryName;
  }

  public void setPermissionCategoryName(String permissionCategoryName) {
    this.permissionCategoryName = permissionCategoryName;
  }

  public PolicyAssignedPermissions permissionId(Long permissionId) {
    this.permissionId = permissionId;
    return this;
  }

  /**
   * Get permissionId
   * @return permissionId
  */
  @ApiModelProperty(value = "")


  public Long getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(Long permissionId) {
    this.permissionId = permissionId;
  }

  public PolicyAssignedPermissions permissionName(String permissionName) {
    this.permissionName = permissionName;
    return this;
  }

  /**
   * Get permissionName
   * @return permissionName
  */
  @ApiModelProperty(value = "")


  public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyAssignedPermissions policyAssignedPermissions = (PolicyAssignedPermissions) o;
    return Objects.equals(this.id, policyAssignedPermissions.id) &&
        Objects.equals(this.policyId, policyAssignedPermissions.policyId) &&
        Objects.equals(this.policyName, policyAssignedPermissions.policyName) &&
        Objects.equals(this.permissionCategoryId, policyAssignedPermissions.permissionCategoryId) &&
        Objects.equals(this.permissionCategoryName, policyAssignedPermissions.permissionCategoryName) &&
        Objects.equals(this.permissionId, policyAssignedPermissions.permissionId) &&
        Objects.equals(this.permissionName, policyAssignedPermissions.permissionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, policyId, policyName, permissionCategoryId, permissionCategoryName, permissionId, permissionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyAssignedPermissions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    permissionCategoryId: ").append(toIndentedString(permissionCategoryId)).append("\n");
    sb.append("    permissionCategoryName: ").append(toIndentedString(permissionCategoryName)).append("\n");
    sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
    sb.append("    permissionName: ").append(toIndentedString(permissionName)).append("\n");
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

