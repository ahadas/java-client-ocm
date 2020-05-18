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
import java.time.OffsetDateTime;

/**
 * ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService {
  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("port")
  private String port = null;

  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("serviceName")
  private String serviceName = null;

  @SerializedName("serviceNamespace")
  private String serviceNamespace = null;

  public ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService port(String port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService serviceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
    return this;
  }

   /**
   * Get serviceNamespace
   * @return serviceNamespace
  **/
  @ApiModelProperty(value = "")
  public String getServiceNamespace() {
    return serviceNamespace;
  }

  public void setServiceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService comCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService = (ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService) o;
    return Objects.equals(this.createdAt, comCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService.createdAt) &&
        Objects.equals(this.port, comCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService.port) &&
        Objects.equals(this.protocol, comCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService.protocol) &&
        Objects.equals(this.serviceName, comCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService.serviceName) &&
        Objects.equals(this.serviceNamespace, comCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService.serviceNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, port, protocol, serviceName, serviceNamespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1CatalogSourceStatusRegistryService {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceNamespace: ").append(toIndentedString(serviceNamespace)).append("\n");
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

