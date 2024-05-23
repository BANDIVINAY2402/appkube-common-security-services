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
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
public class InlineResponse2002  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("status")
  private String status;

  @JsonProperty("message")
  private String message;

  @JsonProperty("isAuthenticated")
  private Boolean isAuthenticated;

  public InlineResponse2002 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the operation.
   * @return status
  */
  @ApiModelProperty(example = "SUCCESS", value = "Status of the operation.")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse2002 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Description of the result.
   * @return message
  */
  @ApiModelProperty(example = "Google MFA token authenticated.", value = "Description of the result.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse2002 isAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
    return this;
  }

  /**
   * Indicates if the token authentication succeeded.
   * @return isAuthenticated
  */
  @ApiModelProperty(example = "true", value = "Indicates if the token authentication succeeded.")


  public Boolean getIsAuthenticated() {
    return isAuthenticated;
  }

  public void setIsAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.status, inlineResponse2002.status) &&
        Objects.equals(this.message, inlineResponse2002.message) &&
        Objects.equals(this.isAuthenticated, inlineResponse2002.isAuthenticated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, isAuthenticated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    isAuthenticated: ").append(toIndentedString(isAuthenticated)).append("\n");
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

