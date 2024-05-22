package com.synectiks.asset.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.synectiks.asset.api.model.InlineResponse200UserPendingInviteList;
import com.synectiks.asset.api.model.InlineResponse200UserTeamList;
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
 * User object with team details.
 */
@ApiModel(description = "User object with team details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T21:34:23.682367100-07:00[America/Los_Angeles]")
public class InlineResponse200User  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("teamList")
  @Valid
  private List<InlineResponse200UserTeamList> teamList = null;

  @JsonProperty("pendingInviteList")
  @Valid
  private List<InlineResponse200UserPendingInviteList> pendingInviteList = null;

  public InlineResponse200User id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the user.
   * @return id
  */
  @ApiModelProperty(example = "123", value = "ID of the user.")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse200User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the user.
   * @return email
  */
  @ApiModelProperty(example = "johndoe@example.com", value = "Email address of the user.")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineResponse200User teamList(List<InlineResponse200UserTeamList> teamList) {
    this.teamList = teamList;
    return this;
  }

  public InlineResponse200User addTeamListItem(InlineResponse200UserTeamList teamListItem) {
    if (this.teamList == null) {
      this.teamList = new ArrayList<>();
    }
    this.teamList.add(teamListItem);
    return this;
  }

  /**
   * List of active team members.
   * @return teamList
  */
  @ApiModelProperty(value = "List of active team members.")

  @Valid

  public List<InlineResponse200UserTeamList> getTeamList() {
    return teamList;
  }

  public void setTeamList(List<InlineResponse200UserTeamList> teamList) {
    this.teamList = teamList;
  }

  public InlineResponse200User pendingInviteList(List<InlineResponse200UserPendingInviteList> pendingInviteList) {
    this.pendingInviteList = pendingInviteList;
    return this;
  }

  public InlineResponse200User addPendingInviteListItem(InlineResponse200UserPendingInviteList pendingInviteListItem) {
    if (this.pendingInviteList == null) {
      this.pendingInviteList = new ArrayList<>();
    }
    this.pendingInviteList.add(pendingInviteListItem);
    return this;
  }

  /**
   * List of users with pending invitations.
   * @return pendingInviteList
  */
  @ApiModelProperty(value = "List of users with pending invitations.")

  @Valid

  public List<InlineResponse200UserPendingInviteList> getPendingInviteList() {
    return pendingInviteList;
  }

  public void setPendingInviteList(List<InlineResponse200UserPendingInviteList> pendingInviteList) {
    this.pendingInviteList = pendingInviteList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200User inlineResponse200User = (InlineResponse200User) o;
    return Objects.equals(this.id, inlineResponse200User.id) &&
        Objects.equals(this.email, inlineResponse200User.email) &&
        Objects.equals(this.teamList, inlineResponse200User.teamList) &&
        Objects.equals(this.pendingInviteList, inlineResponse200User.pendingInviteList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, teamList, pendingInviteList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    teamList: ").append(toIndentedString(teamList)).append("\n");
    sb.append("    pendingInviteList: ").append(toIndentedString(pendingInviteList)).append("\n");
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

