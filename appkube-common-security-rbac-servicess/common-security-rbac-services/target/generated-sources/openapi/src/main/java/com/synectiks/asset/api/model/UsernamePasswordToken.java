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
 * UsernamePasswordToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
public class UsernamePasswordToken  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("rememberMe")
  private Boolean rememberMe;

  @JsonProperty("host")
  private String host;

  public UsernamePasswordToken username(String username) {
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

  public UsernamePasswordToken password(String password) {
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

  public UsernamePasswordToken rememberMe(Boolean rememberMe) {
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

  public UsernamePasswordToken host(String host) {
    this.host = host;
    return this;
  }

  /**
   * Get host
   * @return host
  */
  @ApiModelProperty(value = "")


  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) o;
    return Objects.equals(this.username, usernamePasswordToken.username) &&
        Objects.equals(this.password, usernamePasswordToken.password) &&
        Objects.equals(this.rememberMe, usernamePasswordToken.rememberMe) &&
        Objects.equals(this.host, usernamePasswordToken.host);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, rememberMe, host);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsernamePasswordToken {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    rememberMe: ").append(toIndentedString(rememberMe)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
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

