package com.synectiks.asset.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-21T22:29:14.661605200-07:00[America/Los_Angeles]")
public class InlineResponse2001  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("status")
  private String status;

  @JsonProperty("message")
  private String message;

  @JsonProperty("qrCode")
  private byte[] qrCode;

  public InlineResponse2001 status(String status) {
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

  public InlineResponse2001 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Description of the result.
   * @return message
  */
  @ApiModelProperty(example = "Google MFA QR code created successfully.", value = "Description of the result.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse2001 qrCode(byte[] qrCode) {
    this.qrCode = qrCode;
    return this;
  }

  /**
   * Byte representation of the QR code image.
   * @return qrCode
  */
  @ApiModelProperty(value = "Byte representation of the QR code image.")


  public byte[] getQrCode() {
    return qrCode;
  }

  public void setQrCode(byte[] qrCode) {
    this.qrCode = qrCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.status, inlineResponse2001.status) &&
        Objects.equals(this.message, inlineResponse2001.message) &&
        Arrays.equals(this.qrCode, inlineResponse2001.qrCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, Arrays.hashCode(qrCode));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
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

