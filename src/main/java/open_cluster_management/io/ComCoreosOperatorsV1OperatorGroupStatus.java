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
import java.util.ArrayList;
import java.util.List;
import open_cluster_management.io.ComCoreosOperatorsV1OperatorGroupStatusServiceAccountRef;

/**
 * OperatorGroupStatus is the status for an OperatorGroupResource.
 */
@ApiModel(description = "OperatorGroupStatus is the status for an OperatorGroupResource.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1OperatorGroupStatus {
  @SerializedName("lastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("namespaces")
  private List<String> namespaces = null;

  @SerializedName("serviceAccountRef")
  private ComCoreosOperatorsV1OperatorGroupStatusServiceAccountRef serviceAccountRef = null;

  public ComCoreosOperatorsV1OperatorGroupStatus lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * LastUpdated is a timestamp of the last time the OperatorGroup&#39;s status was Updated.
   * @return lastUpdated
  **/
  @ApiModelProperty(required = true, value = "LastUpdated is a timestamp of the last time the OperatorGroup's status was Updated.")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public ComCoreosOperatorsV1OperatorGroupStatus namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public ComCoreosOperatorsV1OperatorGroupStatus addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * Namespaces is the set of target namespaces for the OperatorGroup.
   * @return namespaces
  **/
  @ApiModelProperty(value = "Namespaces is the set of target namespaces for the OperatorGroup.")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public ComCoreosOperatorsV1OperatorGroupStatus serviceAccountRef(ComCoreosOperatorsV1OperatorGroupStatusServiceAccountRef serviceAccountRef) {
    this.serviceAccountRef = serviceAccountRef;
    return this;
  }

   /**
   * Get serviceAccountRef
   * @return serviceAccountRef
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1OperatorGroupStatusServiceAccountRef getServiceAccountRef() {
    return serviceAccountRef;
  }

  public void setServiceAccountRef(ComCoreosOperatorsV1OperatorGroupStatusServiceAccountRef serviceAccountRef) {
    this.serviceAccountRef = serviceAccountRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1OperatorGroupStatus comCoreosOperatorsV1OperatorGroupStatus = (ComCoreosOperatorsV1OperatorGroupStatus) o;
    return Objects.equals(this.lastUpdated, comCoreosOperatorsV1OperatorGroupStatus.lastUpdated) &&
        Objects.equals(this.namespaces, comCoreosOperatorsV1OperatorGroupStatus.namespaces) &&
        Objects.equals(this.serviceAccountRef, comCoreosOperatorsV1OperatorGroupStatus.serviceAccountRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, namespaces, serviceAccountRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1OperatorGroupStatus {\n");
    
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    serviceAccountRef: ").append(toIndentedString(serviceAccountRef)).append("\n");
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
