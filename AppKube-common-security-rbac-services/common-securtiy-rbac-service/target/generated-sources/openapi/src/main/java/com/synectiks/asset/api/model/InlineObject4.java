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
 * InlineObject4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T08:33:53.267382700-07:00[America/Los_Angeles]")
public class InlineObject4  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("roleId")
  private Integer roleId;

  @JsonProperty("userIds")
  private String userIds;

  public InlineObject4 roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * ID of the role group to assign
   * @return roleId
  */
  @ApiModelProperty(value = "ID of the role group to assign")


  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public InlineObject4 userIds(String userIds) {
    this.userIds = userIds;
    return this;
  }

  /**
   * Comma-separated list of user IDs to assign the role group to
   * @return userIds
  */
  @ApiModelProperty(value = "Comma-separated list of user IDs to assign the role group to")


  public String getUserIds() {
    return userIds;
  }

  public void setUserIds(String userIds) {
    this.userIds = userIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject4 inlineObject4 = (InlineObject4) o;
    return Objects.equals(this.roleId, inlineObject4.roleId) &&
        Objects.equals(this.userIds, inlineObject4.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject4 {\n");
    
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

