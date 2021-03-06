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
 * cloudConfig is a reference to a ConfigMap containing the cloud provider configuration file. This configuration file is used to configure the Kubernetes cloud provider integration when using the built-in cloud provider integration or the external cloud controller manager. The namespace for this config map is openshift-config.
 */
@ApiModel(description = "cloudConfig is a reference to a ConfigMap containing the cloud provider configuration file. This configuration file is used to configure the Kubernetes cloud provider integration when using the built-in cloud provider integration or the external cloud controller manager. The namespace for this config map is openshift-config.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1InfrastructureSpecCloudConfig {
  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  public IoOpenshiftConfigV1InfrastructureSpecCloudConfig key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key allows pointing to a specific key/value inside of the configmap.  This is useful for logical file references.
   * @return key
  **/
  @ApiModelProperty(value = "Key allows pointing to a specific key/value inside of the configmap.  This is useful for logical file references.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public IoOpenshiftConfigV1InfrastructureSpecCloudConfig name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1InfrastructureSpecCloudConfig ioOpenshiftConfigV1InfrastructureSpecCloudConfig = (IoOpenshiftConfigV1InfrastructureSpecCloudConfig) o;
    return Objects.equals(this.key, ioOpenshiftConfigV1InfrastructureSpecCloudConfig.key) &&
        Objects.equals(this.name, ioOpenshiftConfigV1InfrastructureSpecCloudConfig.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1InfrastructureSpecCloudConfig {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

