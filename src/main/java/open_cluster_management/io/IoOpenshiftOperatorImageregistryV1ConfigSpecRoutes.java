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
 * ImageRegistryConfigRoute holds information on external route access to image registry.
 */
@ApiModel(description = "ImageRegistryConfigRoute holds information on external route access to image registry.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorImageregistryV1ConfigSpecRoutes {
  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("secretName")
  private String secretName = null;

  public IoOpenshiftOperatorImageregistryV1ConfigSpecRoutes hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * hostname for the route.
   * @return hostname
  **/
  @ApiModelProperty(value = "hostname for the route.")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecRoutes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the route to be created.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name of the route to be created.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecRoutes secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

   /**
   * secretName points to secret containing the certificates to be used by the route.
   * @return secretName
  **/
  @ApiModelProperty(value = "secretName points to secret containing the certificates to be used by the route.")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorImageregistryV1ConfigSpecRoutes ioOpenshiftOperatorImageregistryV1ConfigSpecRoutes = (IoOpenshiftOperatorImageregistryV1ConfigSpecRoutes) o;
    return Objects.equals(this.hostname, ioOpenshiftOperatorImageregistryV1ConfigSpecRoutes.hostname) &&
        Objects.equals(this.name, ioOpenshiftOperatorImageregistryV1ConfigSpecRoutes.name) &&
        Objects.equals(this.secretName, ioOpenshiftOperatorImageregistryV1ConfigSpecRoutes.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, name, secretName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorImageregistryV1ConfigSpecRoutes {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
