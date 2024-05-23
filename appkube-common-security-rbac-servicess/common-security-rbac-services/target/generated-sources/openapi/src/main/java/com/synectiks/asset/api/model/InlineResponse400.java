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
 * InlineResponse400
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
public class InlineResponse400  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("status")
  private String status;

  @JsonProperty("message")
  private String message;

  public InlineResponse400 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the operation.
   * @return status
  */
  @ApiModelProperty(example = "ERROR", value = "Status of the operation.")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse400 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Description of the error.
   * @return message
  */
  @ApiModelProperty(example = "Invalid organization name.", value = "Description of the error.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return Objects.equals(this.status, inlineResponse400.status) &&
        Objects.equals(this.message, inlineResponse400.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

