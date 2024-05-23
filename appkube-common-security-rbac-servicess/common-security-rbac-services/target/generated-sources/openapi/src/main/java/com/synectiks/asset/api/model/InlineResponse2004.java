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
 * InlineResponse2004
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
public class InlineResponse2004  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("organizationId")
  private Integer organizationId;

  @JsonProperty("pendingUsersCount")
  private Integer pendingUsersCount;

  public InlineResponse2004 organizationId(Integer organizationId) {
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

  public InlineResponse2004 pendingUsersCount(Integer pendingUsersCount) {
    this.pendingUsersCount = pendingUsersCount;
    return this;
  }

  /**
   * Total count of pending users.
   * @return pendingUsersCount
  */
  @ApiModelProperty(value = "Total count of pending users.")


  public Integer getPendingUsersCount() {
    return pendingUsersCount;
  }

  public void setPendingUsersCount(Integer pendingUsersCount) {
    this.pendingUsersCount = pendingUsersCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.organizationId, inlineResponse2004.organizationId) &&
        Objects.equals(this.pendingUsersCount, inlineResponse2004.pendingUsersCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, pendingUsersCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    pendingUsersCount: ").append(toIndentedString(pendingUsersCount)).append("\n");
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

