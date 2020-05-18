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
 * ServiceReference holds a reference to Service.legacy.k8s.io
 */
@ApiModel(description = "ServiceReference holds a reference to Service.legacy.k8s.io")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference {
  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("port")
  private Integer port = null;

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the service
   * @return name
  **/
  @ApiModelProperty(value = "Name is the name of the service")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the namespace of the service
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace is the namespace of the service")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. &#x60;port&#x60; should be a valid port number (1-65535, inclusive).
   * @return port
  **/
  @ApiModelProperty(value = "If specified, the port on the service that hosting webhook. Default to 443 for backward compatibility. `port` should be a valid port number (1-65535, inclusive).")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference ioK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference = (IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference) o;
    return Objects.equals(this.name, ioK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference.name) &&
        Objects.equals(this.namespace, ioK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference.namespace) &&
        Objects.equals(this.port, ioK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubeAggregatorPkgApisApiregistrationV1beta1ServiceReference {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

