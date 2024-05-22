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
 * InlineObject8
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T21:34:23.682367100-07:00[America/Los_Angeles]")
public class InlineObject8  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("userName")
  private String userName;

  @JsonProperty("password")
  private String password;

  public InlineObject8 userName(String userName) {
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

  public InlineObject8 password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password of the user.
   * @return password
  */
  @ApiModelProperty(value = "Password of the user.")


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
    InlineObject8 inlineObject8 = (InlineObject8) o;
    return Objects.equals(this.userName, inlineObject8.userName) &&
        Objects.equals(this.password, inlineObject8.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject8 {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

