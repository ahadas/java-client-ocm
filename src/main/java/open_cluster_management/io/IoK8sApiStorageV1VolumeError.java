/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package open_cluster_management.io;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VolumeError captures an error encountered during a volume operation.
 */
@ApiModel(description = "VolumeError captures an error encountered during a volume operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiStorageV1VolumeError {
  @SerializedName("message")
  private String message = null;

  @SerializedName("time")
  private String time = null;

  public IoK8sApiStorageV1VolumeError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.
   * @return message
  **/
  @ApiModelProperty(value = "String detailing the error encountered during Attach or Detach operation. This string may be logged, so it should not contain sensitive information.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiStorageV1VolumeError time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Time the error was encountered.
   * @return time
  **/
  @ApiModelProperty(value = "Time the error was encountered.")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiStorageV1VolumeError ioK8sApiStorageV1VolumeError = (IoK8sApiStorageV1VolumeError) o;
    return Objects.equals(this.message, ioK8sApiStorageV1VolumeError.message) &&
        Objects.equals(this.time, ioK8sApiStorageV1VolumeError.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1VolumeError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

