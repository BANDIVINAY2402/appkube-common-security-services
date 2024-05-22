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
 * InlineResponse2007
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T08:33:53.267382700-07:00[America/Los_Angeles]")
public class InlineResponse2007  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("user")
  private String user;

  @JsonProperty("isActive")
  private String isActive;

  @JsonProperty("password")
  private String password;

  public InlineResponse2007 user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Username of the user.
   * @return user
  */
  @ApiModelProperty(value = "Username of the user.")


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public InlineResponse2007 isActive(String isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Indicates if the user is active.
   * @return isActive
  */
  @ApiModelProperty(value = "Indicates if the user is active.")


  public String getIsActive() {
    return isActive;
  }

  public void setIsActive(String isActive) {
    this.isActive = isActive;
  }

  public InlineResponse2007 password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Decrypted password of the user.
   * @return password
  */
  @ApiModelProperty(value = "Decrypted password of the user.")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.user, inlineResponse2007.user) &&
        Objects.equals(this.isActive, inlineResponse2007.isActive) &&
        Objects.equals(this.password, inlineResponse2007.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, isActive, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

