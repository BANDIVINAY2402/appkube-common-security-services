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
 * InlineObject11
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T21:34:23.682367100-07:00[America/Los_Angeles]")
public class InlineObject11  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("userName")
  private String userName;

  @JsonProperty("ownerId")
  private Integer ownerId;

  @JsonProperty("newPassword")
  private String newPassword;

  public InlineObject11 userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Username of the user.
   * @return userName
  */
  @ApiModelProperty(value = "Username of the user.")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public InlineObject11 ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * ID of the admin user resetting the password.
   * @return ownerId
  */
  @ApiModelProperty(value = "ID of the admin user resetting the password.")


  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public InlineObject11 newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * New password to set.
   * @return newPassword
  */
  @ApiModelProperty(value = "New password to set.")


  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject11 inlineObject11 = (InlineObject11) o;
    return Objects.equals(this.userName, inlineObject11.userName) &&
        Objects.equals(this.ownerId, inlineObject11.ownerId) &&
        Objects.equals(this.newPassword, inlineObject11.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, ownerId, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject11 {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

