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
import java.util.ArrayList;
import java.util.List;
import open_cluster_management.io.ComCoreosOperatorsV1OperatorGroupSpecSelector;

/**
 * OperatorGroupSpec is the spec for an OperatorGroup resource.
 */
@ApiModel(description = "OperatorGroupSpec is the spec for an OperatorGroup resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1OperatorGroupSpec {
  @SerializedName("selector")
  private ComCoreosOperatorsV1OperatorGroupSpecSelector selector = null;

  @SerializedName("serviceAccountName")
  private String serviceAccountName = null;

  @SerializedName("staticProvidedAPIs")
  private Boolean staticProvidedAPIs = null;

  @SerializedName("targetNamespaces")
  private List<String> targetNamespaces = null;

  public ComCoreosOperatorsV1OperatorGroupSpec selector(ComCoreosOperatorsV1OperatorGroupSpecSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1OperatorGroupSpecSelector getSelector() {
    return selector;
  }

  public void setSelector(ComCoreosOperatorsV1OperatorGroupSpecSelector selector) {
    this.selector = selector;
  }

  public ComCoreosOperatorsV1OperatorGroupSpec serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName is the admin specified service account which will be used to deploy operator(s) in this operator group.
   * @return serviceAccountName
  **/
  @ApiModelProperty(value = "ServiceAccountName is the admin specified service account which will be used to deploy operator(s) in this operator group.")
  public String getServiceAccountName() {
    return serviceAccountName;
  }

  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  public ComCoreosOperatorsV1OperatorGroupSpec staticProvidedAPIs(Boolean staticProvidedAPIs) {
    this.staticProvidedAPIs = staticProvidedAPIs;
    return this;
  }

   /**
   * Static tells OLM not to update the OperatorGroup&#39;s providedAPIs annotation
   * @return staticProvidedAPIs
  **/
  @ApiModelProperty(value = "Static tells OLM not to update the OperatorGroup's providedAPIs annotation")
  public Boolean isStaticProvidedAPIs() {
    return staticProvidedAPIs;
  }

  public void setStaticProvidedAPIs(Boolean staticProvidedAPIs) {
    this.staticProvidedAPIs = staticProvidedAPIs;
  }

  public ComCoreosOperatorsV1OperatorGroupSpec targetNamespaces(List<String> targetNamespaces) {
    this.targetNamespaces = targetNamespaces;
    return this;
  }

  public ComCoreosOperatorsV1OperatorGroupSpec addTargetNamespacesItem(String targetNamespacesItem) {
    if (this.targetNamespaces == null) {
      this.targetNamespaces = new ArrayList<>();
    }
    this.targetNamespaces.add(targetNamespacesItem);
    return this;
  }

   /**
   * TargetNamespaces is an explicit set of namespaces to target. If it is set, Selector is ignored.
   * @return targetNamespaces
  **/
  @ApiModelProperty(value = "TargetNamespaces is an explicit set of namespaces to target. If it is set, Selector is ignored.")
  public List<String> getTargetNamespaces() {
    return targetNamespaces;
  }

  public void setTargetNamespaces(List<String> targetNamespaces) {
    this.targetNamespaces = targetNamespaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1OperatorGroupSpec comCoreosOperatorsV1OperatorGroupSpec = (ComCoreosOperatorsV1OperatorGroupSpec) o;
    return Objects.equals(this.selector, comCoreosOperatorsV1OperatorGroupSpec.selector) &&
        Objects.equals(this.serviceAccountName, comCoreosOperatorsV1OperatorGroupSpec.serviceAccountName) &&
        Objects.equals(this.staticProvidedAPIs, comCoreosOperatorsV1OperatorGroupSpec.staticProvidedAPIs) &&
        Objects.equals(this.targetNamespaces, comCoreosOperatorsV1OperatorGroupSpec.targetNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selector, serviceAccountName, staticProvidedAPIs, targetNamespaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1OperatorGroupSpec {\n");
    
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    staticProvidedAPIs: ").append(toIndentedString(staticProvidedAPIs)).append("\n");
    sb.append("    targetNamespaces: ").append(toIndentedString(targetNamespaces)).append("\n");
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

