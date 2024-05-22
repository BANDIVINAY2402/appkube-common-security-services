package com.synectiks.asset.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.synectiks.asset.api.model.User;
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
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T21:34:23.682367100-07:00[America/Los_Angeles]")
public class InlineResponse2003  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("organizationId")
  private Integer organizationId;

  @JsonProperty("pendingUsers")
  @Valid
  private List<User> pendingUsers = null;

  public InlineResponse2003 organizationId(Integer organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * ID of the organization.
   * @return organizationId
  */
  @ApiModelProperty(value = "ID of the organization.")


  public Integer getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }

  public InlineResponse2003 pendingUsers(List<User> pendingUsers) {
    this.pendingUsers = pendingUsers;
    return this;
  }

  public InlineResponse2003 addPendingUsersItem(User pendingUsersItem) {
    if (this.pendingUsers == null) {
      this.pendingUsers = new ArrayList<>();
    }
    this.pendingUsers.add(pendingUsersItem);
    return this;
  }

  /**
   * List of pending users.
   * @return pendingUsers
  */
  @ApiModelProperty(value = "List of pending users.")

  @Valid

  public List<User> getPendingUsers() {
    return pendingUsers;
  }

  public void setPendingUsers(List<User> pendingUsers) {
    this.pendingUsers = pendingUsers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.organizationId, inlineResponse2003.organizationId) &&
        Objects.equals(this.pendingUsers, inlineResponse2003.pendingUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, pendingUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    pendingUsers: ").append(toIndentedString(pendingUsers)).append("\n");
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

