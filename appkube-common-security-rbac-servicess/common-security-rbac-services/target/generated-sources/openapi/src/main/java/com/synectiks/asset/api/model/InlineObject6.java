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
 * InlineObject6
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
public class InlineObject6  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("userName")
  private String userName;

  @JsonProperty("token")
  private String token;

  public InlineObject6 userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Username of the user.
   * @return userName
  */
  @ApiModelProperty(example = "johndoe", value = "Username of the user.")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public InlineObject6 token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Google MFA token.
   * @return token
  */
  @ApiModelProperty(example = "123456", value = "Google MFA token.")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject6 inlineObject6 = (InlineObject6) o;
    return Objects.equals(this.userName, inlineObject6.userName) &&
        Objects.equals(this.token, inlineObject6.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject6 {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

