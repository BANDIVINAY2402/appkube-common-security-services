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
 * LoginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T21:34:23.682367100-07:00[America/Los_Angeles]")
public class LoginRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("rememberMe")
  private Boolean rememberMe;

  @JsonProperty("redirectTo")
  private String redirectTo;

  public LoginRequest username(String username) {
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

  public LoginRequest password(String password) {
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

  public LoginRequest rememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
    return this;
  }

  /**
   * Get rememberMe
   * @return rememberMe
  */
  @ApiModelProperty(value = "")


  public Boolean getRememberMe() {
    return rememberMe;
  }

  public void setRememberMe(Boolean rememberMe) {
    this.rememberMe = rememberMe;
  }

  public LoginRequest redirectTo(String redirectTo) {
    this.redirectTo = redirectTo;
    return this;
  }

  /**
   * Get redirectTo
   * @return redirectTo
  */
  @ApiModelProperty(value = "")


  public String getRedirectTo() {
    return redirectTo;
  }

  public void setRedirectTo(String redirectTo) {
    this.redirectTo = redirectTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequest loginRequest = (LoginRequest) o;
    return Objects.equals(this.username, loginRequest.username) &&
        Objects.equals(this.password, loginRequest.password) &&
        Objects.equals(this.rememberMe, loginRequest.rememberMe) &&
        Objects.equals(this.redirectTo, loginRequest.redirectTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, rememberMe, redirectTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequest {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
    sb.append("    redirectTo: ").append(toIndentedString(redirectTo)).append("\n");
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

