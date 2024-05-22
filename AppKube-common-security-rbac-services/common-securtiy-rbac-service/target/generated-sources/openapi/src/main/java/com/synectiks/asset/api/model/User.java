package com.synectiks.asset.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.synectiks.asset.api.model.Organization;
import com.synectiks.asset.api.model.Role;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T08:33:53.267382700-07:00[America/Los_Angeles]")
public class User  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("email")
  private String email;

  @JsonProperty("roles")
  @Valid
  private List<Role> roles = null;

  @JsonProperty("organization")
  private Organization organization;

  @JsonProperty("owner")
  private User owner;

  @JsonProperty("googleMfaKey")
  private String googleMfaKey;

  @JsonProperty("isMfaEnable")
  private String isMfaEnable;

  @JsonProperty("mfaQrImageFilePath")
  private String mfaQrImageFilePath;

  @JsonProperty("inviteStatus")
  private String inviteStatus;

  @JsonProperty("inviteLink")
  private String inviteLink;

  @JsonProperty("inviteCode")
  private String inviteCode;

  @JsonProperty("inviteSentOn")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime inviteSentOn;

  @JsonProperty("tempPassword")
  private String tempPassword;

  @JsonProperty("encPassword")
  private String encPassword;

  @JsonProperty("loginCount")
  private Integer loginCount;

  @JsonProperty("lastLoginAt")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastLoginAt;

  @JsonProperty("mfaQrCode")
  private byte[] mfaQrCode;

  @JsonProperty("pendingInviteList")
  @Valid
  private List<User> pendingInviteList = null;

  @JsonProperty("teamList")
  @Valid
  private List<User> teamList = null;

  @JsonProperty("profileImage")
  private byte[] profileImage;

  @JsonProperty("isAuthenticatedByUserName")
  private Boolean isAuthenticatedByUserName;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("fileStorageLocationType")
  private String fileStorageLocationType;

  @JsonProperty("status")
  private String status;

  @JsonProperty("requestType")
  private String requestType;

  @JsonProperty("comments")
  private String comments;

  public User id(Long id) {
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

  public User type(String type) {
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

  public User username(String username) {
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

  public User password(String password) {
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

  public User active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  @ApiModelProperty(value = "")


  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public User email(String email) {
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

  public User roles(List<Role> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(Role rolesItem) {
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

  public User organization(Organization organization) {
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

  public User owner(User owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @ApiModelProperty(value = "")

  @Valid

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public User googleMfaKey(String googleMfaKey) {
    this.googleMfaKey = googleMfaKey;
    return this;
  }

  /**
   * Get googleMfaKey
   * @return googleMfaKey
  */
  @ApiModelProperty(value = "")


  public String getGoogleMfaKey() {
    return googleMfaKey;
  }

  public void setGoogleMfaKey(String googleMfaKey) {
    this.googleMfaKey = googleMfaKey;
  }

  public User isMfaEnable(String isMfaEnable) {
    this.isMfaEnable = isMfaEnable;
    return this;
  }

  /**
   * Get isMfaEnable
   * @return isMfaEnable
  */
  @ApiModelProperty(value = "")


  public String getIsMfaEnable() {
    return isMfaEnable;
  }

  public void setIsMfaEnable(String isMfaEnable) {
    this.isMfaEnable = isMfaEnable;
  }

  public User mfaQrImageFilePath(String mfaQrImageFilePath) {
    this.mfaQrImageFilePath = mfaQrImageFilePath;
    return this;
  }

  /**
   * Get mfaQrImageFilePath
   * @return mfaQrImageFilePath
  */
  @ApiModelProperty(value = "")


  public String getMfaQrImageFilePath() {
    return mfaQrImageFilePath;
  }

  public void setMfaQrImageFilePath(String mfaQrImageFilePath) {
    this.mfaQrImageFilePath = mfaQrImageFilePath;
  }

  public User inviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
    return this;
  }

  /**
   * Get inviteStatus
   * @return inviteStatus
  */
  @ApiModelProperty(value = "")


  public String getInviteStatus() {
    return inviteStatus;
  }

  public void setInviteStatus(String inviteStatus) {
    this.inviteStatus = inviteStatus;
  }

  public User inviteLink(String inviteLink) {
    this.inviteLink = inviteLink;
    return this;
  }

  /**
   * Get inviteLink
   * @return inviteLink
  */
  @ApiModelProperty(value = "")


  public String getInviteLink() {
    return inviteLink;
  }

  public void setInviteLink(String inviteLink) {
    this.inviteLink = inviteLink;
  }

  public User inviteCode(String inviteCode) {
    this.inviteCode = inviteCode;
    return this;
  }

  /**
   * Get inviteCode
   * @return inviteCode
  */
  @ApiModelProperty(value = "")


  public String getInviteCode() {
    return inviteCode;
  }

  public void setInviteCode(String inviteCode) {
    this.inviteCode = inviteCode;
  }

  public User inviteSentOn(OffsetDateTime inviteSentOn) {
    this.inviteSentOn = inviteSentOn;
    return this;
  }

  /**
   * Get inviteSentOn
   * @return inviteSentOn
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getInviteSentOn() {
    return inviteSentOn;
  }

  public void setInviteSentOn(OffsetDateTime inviteSentOn) {
    this.inviteSentOn = inviteSentOn;
  }

  public User tempPassword(String tempPassword) {
    this.tempPassword = tempPassword;
    return this;
  }

  /**
   * Get tempPassword
   * @return tempPassword
  */
  @ApiModelProperty(value = "")


  public String getTempPassword() {
    return tempPassword;
  }

  public void setTempPassword(String tempPassword) {
    this.tempPassword = tempPassword;
  }

  public User encPassword(String encPassword) {
    this.encPassword = encPassword;
    return this;
  }

  /**
   * Get encPassword
   * @return encPassword
  */
  @ApiModelProperty(value = "")


  public String getEncPassword() {
    return encPassword;
  }

  public void setEncPassword(String encPassword) {
    this.encPassword = encPassword;
  }

  public User loginCount(Integer loginCount) {
    this.loginCount = loginCount;
    return this;
  }

  /**
   * Get loginCount
   * @return loginCount
  */
  @ApiModelProperty(value = "")


  public Integer getLoginCount() {
    return loginCount;
  }

  public void setLoginCount(Integer loginCount) {
    this.loginCount = loginCount;
  }

  public User lastLoginAt(OffsetDateTime lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }

  /**
   * Get lastLoginAt
   * @return lastLoginAt
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(OffsetDateTime lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }

  public User mfaQrCode(byte[] mfaQrCode) {
    this.mfaQrCode = mfaQrCode;
    return this;
  }

  /**
   * Get mfaQrCode
   * @return mfaQrCode
  */
  @ApiModelProperty(value = "")


  public byte[] getMfaQrCode() {
    return mfaQrCode;
  }

  public void setMfaQrCode(byte[] mfaQrCode) {
    this.mfaQrCode = mfaQrCode;
  }

  public User pendingInviteList(List<User> pendingInviteList) {
    this.pendingInviteList = pendingInviteList;
    return this;
  }

  public User addPendingInviteListItem(User pendingInviteListItem) {
    if (this.pendingInviteList == null) {
      this.pendingInviteList = new ArrayList<>();
    }
    this.pendingInviteList.add(pendingInviteListItem);
    return this;
  }

  /**
   * Get pendingInviteList
   * @return pendingInviteList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<User> getPendingInviteList() {
    return pendingInviteList;
  }

  public void setPendingInviteList(List<User> pendingInviteList) {
    this.pendingInviteList = pendingInviteList;
  }

  public User teamList(List<User> teamList) {
    this.teamList = teamList;
    return this;
  }

  public User addTeamListItem(User teamListItem) {
    if (this.teamList == null) {
      this.teamList = new ArrayList<>();
    }
    this.teamList.add(teamListItem);
    return this;
  }

  /**
   * Get teamList
   * @return teamList
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<User> getTeamList() {
    return teamList;
  }

  public void setTeamList(List<User> teamList) {
    this.teamList = teamList;
  }

  public User profileImage(byte[] profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  /**
   * Get profileImage
   * @return profileImage
  */
  @ApiModelProperty(value = "")


  public byte[] getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(byte[] profileImage) {
    this.profileImage = profileImage;
  }

  public User isAuthenticatedByUserName(Boolean isAuthenticatedByUserName) {
    this.isAuthenticatedByUserName = isAuthenticatedByUserName;
    return this;
  }

  /**
   * Get isAuthenticatedByUserName
   * @return isAuthenticatedByUserName
  */
  @ApiModelProperty(value = "")


  public Boolean getIsAuthenticatedByUserName() {
    return isAuthenticatedByUserName;
  }

  public void setIsAuthenticatedByUserName(Boolean isAuthenticatedByUserName) {
    this.isAuthenticatedByUserName = isAuthenticatedByUserName;
  }

  public User firstName(String firstName) {
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

  public User middleName(String middleName) {
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

  public User lastName(String lastName) {
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

  public User fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  */
  @ApiModelProperty(value = "")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public User fileStorageLocationType(String fileStorageLocationType) {
    this.fileStorageLocationType = fileStorageLocationType;
    return this;
  }

  /**
   * Get fileStorageLocationType
   * @return fileStorageLocationType
  */
  @ApiModelProperty(value = "")


  public String getFileStorageLocationType() {
    return fileStorageLocationType;
  }

  public void setFileStorageLocationType(String fileStorageLocationType) {
    this.fileStorageLocationType = fileStorageLocationType;
  }

  public User status(String status) {
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

  public User requestType(String requestType) {
    this.requestType = requestType;
    return this;
  }

  /**
   * Get requestType
   * @return requestType
  */
  @ApiModelProperty(value = "")


  public String getRequestType() {
    return requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }

  public User comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
  */
  @ApiModelProperty(value = "")


  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.type, user.type) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.active, user.active) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.roles, user.roles) &&
        Objects.equals(this.organization, user.organization) &&
        Objects.equals(this.owner, user.owner) &&
        Objects.equals(this.googleMfaKey, user.googleMfaKey) &&
        Objects.equals(this.isMfaEnable, user.isMfaEnable) &&
        Objects.equals(this.mfaQrImageFilePath, user.mfaQrImageFilePath) &&
        Objects.equals(this.inviteStatus, user.inviteStatus) &&
        Objects.equals(this.inviteLink, user.inviteLink) &&
        Objects.equals(this.inviteCode, user.inviteCode) &&
        Objects.equals(this.inviteSentOn, user.inviteSentOn) &&
        Objects.equals(this.tempPassword, user.tempPassword) &&
        Objects.equals(this.encPassword, user.encPassword) &&
        Objects.equals(this.loginCount, user.loginCount) &&
        Objects.equals(this.lastLoginAt, user.lastLoginAt) &&
        Arrays.equals(this.mfaQrCode, user.mfaQrCode) &&
        Objects.equals(this.pendingInviteList, user.pendingInviteList) &&
        Objects.equals(this.teamList, user.teamList) &&
        Arrays.equals(this.profileImage, user.profileImage) &&
        Objects.equals(this.isAuthenticatedByUserName, user.isAuthenticatedByUserName) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.middleName, user.middleName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.fileName, user.fileName) &&
        Objects.equals(this.fileStorageLocationType, user.fileStorageLocationType) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.requestType, user.requestType) &&
        Objects.equals(this.comments, user.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, username, password, active, email, roles, organization, owner, googleMfaKey, isMfaEnable, mfaQrImageFilePath, inviteStatus, inviteLink, inviteCode, inviteSentOn, tempPassword, encPassword, loginCount, lastLoginAt, Arrays.hashCode(mfaQrCode), pendingInviteList, teamList, Arrays.hashCode(profileImage), isAuthenticatedByUserName, firstName, middleName, lastName, fileName, fileStorageLocationType, status, requestType, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    googleMfaKey: ").append(toIndentedString(googleMfaKey)).append("\n");
    sb.append("    isMfaEnable: ").append(toIndentedString(isMfaEnable)).append("\n");
    sb.append("    mfaQrImageFilePath: ").append(toIndentedString(mfaQrImageFilePath)).append("\n");
    sb.append("    inviteStatus: ").append(toIndentedString(inviteStatus)).append("\n");
    sb.append("    inviteLink: ").append(toIndentedString(inviteLink)).append("\n");
    sb.append("    inviteCode: ").append(toIndentedString(inviteCode)).append("\n");
    sb.append("    inviteSentOn: ").append(toIndentedString(inviteSentOn)).append("\n");
    sb.append("    tempPassword: ").append(toIndentedString(tempPassword)).append("\n");
    sb.append("    encPassword: ").append(toIndentedString(encPassword)).append("\n");
    sb.append("    loginCount: ").append(toIndentedString(loginCount)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
    sb.append("    mfaQrCode: ").append(toIndentedString(mfaQrCode)).append("\n");
    sb.append("    pendingInviteList: ").append(toIndentedString(pendingInviteList)).append("\n");
    sb.append("    teamList: ").append(toIndentedString(teamList)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    isAuthenticatedByUserName: ").append(toIndentedString(isAuthenticatedByUserName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileStorageLocationType: ").append(toIndentedString(fileStorageLocationType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

