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
 * InlineObject9
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
public class InlineObject9  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("userName")
  private String userName;

  @JsonProperty("token")
  private String token;

  @JsonProperty("newPassword")
  private String newPassword;

  public InlineObject9 userName(String userName) {
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

  public InlineObject9 token(String token) {
    this.token = token;
    return this;
  }

  /**
   * One-time password (OTP) for verification.
   * @return token
  */
  @ApiModelProperty(value = "One-time password (OTP) for verification.")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public InlineObject9 newPassword(String newPassword) {
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
    InlineObject9 inlineObject9 = (InlineObject9) o;
    return Objects.equals(this.userName, inlineObject9.userName) &&
        Objects.equals(this.token, inlineObject9.token) &&
        Objects.equals(this.newPassword, inlineObject9.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, token, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject9 {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

