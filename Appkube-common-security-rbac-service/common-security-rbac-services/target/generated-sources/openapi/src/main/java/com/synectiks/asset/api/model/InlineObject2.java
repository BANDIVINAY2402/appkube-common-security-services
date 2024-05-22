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
 * InlineObject2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T21:34:23.682367100-07:00[America/Los_Angeles]")
public class InlineObject2  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("type")
  private String type;

  @JsonProperty("organization")
  private String organization;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("email")
  private String email;

  @JsonProperty("ownerId")
  private Integer ownerId;

  @JsonProperty("targetService")
  private String targetService;

  @JsonProperty("roleId")
  private String roleId;

  @JsonProperty("errorOnOrgFound")
  private Boolean errorOnOrgFound;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("file")
  private org.springframework.core.io.Resource file;

  @JsonProperty("orgProfileFile")
  private org.springframework.core.io.Resource orgProfileFile;

  public InlineObject2 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InlineObject2 organization(String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
  */
  @ApiModelProperty(value = "")


  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public InlineObject2 username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @ApiModelProperty(value = "")


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public InlineObject2 password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @ApiModelProperty(value = "")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public InlineObject2 email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineObject2 ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  */
  @ApiModelProperty(value = "")


  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public InlineObject2 targetService(String targetService) {
    this.targetService = targetService;
    return this;
  }

  /**
   * Get targetService
   * @return targetService
  */
  @ApiModelProperty(value = "")


  public String getTargetService() {
    return targetService;
  }

  public void setTargetService(String targetService) {
    this.targetService = targetService;
  }

  public InlineObject2 roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * Get roleId
   * @return roleId
  */
  @ApiModelProperty(value = "")


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  public InlineObject2 errorOnOrgFound(Boolean errorOnOrgFound) {
    this.errorOnOrgFound = errorOnOrgFound;
    return this;
  }

  /**
   * Get errorOnOrgFound
   * @return errorOnOrgFound
  */
  @ApiModelProperty(value = "")


  public Boolean getErrorOnOrgFound() {
    return errorOnOrgFound;
  }

  public void setErrorOnOrgFound(Boolean errorOnOrgFound) {
    this.errorOnOrgFound = errorOnOrgFound;
  }

  public InlineObject2 firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InlineObject2 middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Get middleName
   * @return middleName
  */
  @ApiModelProperty(value = "")


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public InlineObject2 lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public InlineObject2 file(org.springframework.core.io.Resource file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
  @ApiModelProperty(value = "")

  @Valid

  public org.springframework.core.io.Resource getFile() {
    return file;
  }

  public void setFile(org.springframework.core.io.Resource file) {
    this.file = file;
  }

  public InlineObject2 orgProfileFile(org.springframework.core.io.Resource orgProfileFile) {
    this.orgProfileFile = orgProfileFile;
    return this;
  }

  /**
   * Get orgProfileFile
   * @return orgProfileFile
  */
  @ApiModelProperty(value = "")

  @Valid

  public org.springframework.core.io.Resource getOrgProfileFile() {
    return orgProfileFile;
  }

  public void setOrgProfileFile(org.springframework.core.io.Resource orgProfileFile) {
    this.orgProfileFile = orgProfileFile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(this.type, inlineObject2.type) &&
        Objects.equals(this.organization, inlineObject2.organization) &&
        Objects.equals(this.username, inlineObject2.username) &&
        Objects.equals(this.password, inlineObject2.password) &&
        Objects.equals(this.email, inlineObject2.email) &&
        Objects.equals(this.ownerId, inlineObject2.ownerId) &&
        Objects.equals(this.targetService, inlineObject2.targetService) &&
        Objects.equals(this.roleId, inlineObject2.roleId) &&
        Objects.equals(this.errorOnOrgFound, inlineObject2.errorOnOrgFound) &&
        Objects.equals(this.firstName, inlineObject2.firstName) &&
        Objects.equals(this.middleName, inlineObject2.middleName) &&
        Objects.equals(this.lastName, inlineObject2.lastName) &&
        Objects.equals(this.file, inlineObject2.file) &&
        Objects.equals(this.orgProfileFile, inlineObject2.orgProfileFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, organization, username, password, email, ownerId, targetService, roleId, errorOnOrgFound, firstName, middleName, lastName, file, orgProfileFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    targetService: ").append(toIndentedString(targetService)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    errorOnOrgFound: ").append(toIndentedString(errorOnOrgFound)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    orgProfileFile: ").append(toIndentedString(orgProfileFile)).append("\n");
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

