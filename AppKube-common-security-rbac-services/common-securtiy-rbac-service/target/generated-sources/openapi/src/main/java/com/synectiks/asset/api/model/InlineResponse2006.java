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
 * InlineResponse2006
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T08:33:53.267382700-07:00[America/Los_Angeles]")
public class InlineResponse2006  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("organizationId")
  private Integer organizationId;

  @JsonProperty("confirmedUsers")
  @Valid
  private List<User> confirmedUsers = null;

  public InlineResponse2006 organizationId(Integer organizationId) {
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

  public InlineResponse2006 confirmedUsers(List<User> confirmedUsers) {
    this.confirmedUsers = confirmedUsers;
    return this;
  }

  public InlineResponse2006 addConfirmedUsersItem(User confirmedUsersItem) {
    if (this.confirmedUsers == null) {
      this.confirmedUsers = new ArrayList<>();
    }
    this.confirmedUsers.add(confirmedUsersItem);
    return this;
  }

  /**
   * List of confirmed users.
   * @return confirmedUsers
  */
  @ApiModelProperty(value = "List of confirmed users.")

  @Valid

  public List<User> getConfirmedUsers() {
    return confirmedUsers;
  }

  public void setConfirmedUsers(List<User> confirmedUsers) {
    this.confirmedUsers = confirmedUsers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.organizationId, inlineResponse2006.organizationId) &&
        Objects.equals(this.confirmedUsers, inlineResponse2006.confirmedUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, confirmedUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    confirmedUsers: ").append(toIndentedString(confirmedUsers)).append("\n");
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

