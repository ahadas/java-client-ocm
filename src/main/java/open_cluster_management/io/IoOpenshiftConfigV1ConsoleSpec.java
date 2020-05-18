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
import open_cluster_management.io.IoOpenshiftConfigV1ConsoleSpecAuthentication;

/**
 * spec holds user settable values for configuration
 */
@ApiModel(description = "spec holds user settable values for configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1ConsoleSpec {
  @SerializedName("authentication")
  private IoOpenshiftConfigV1ConsoleSpecAuthentication authentication = null;

  public IoOpenshiftConfigV1ConsoleSpec authentication(IoOpenshiftConfigV1ConsoleSpecAuthentication authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1ConsoleSpecAuthentication getAuthentication() {
    return authentication;
  }

  public void setAuthentication(IoOpenshiftConfigV1ConsoleSpecAuthentication authentication) {
    this.authentication = authentication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1ConsoleSpec ioOpenshiftConfigV1ConsoleSpec = (IoOpenshiftConfigV1ConsoleSpec) o;
    return Objects.equals(this.authentication, ioOpenshiftConfigV1ConsoleSpec.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1ConsoleSpec {\n");
    
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
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
