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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromConfigMapKeyRef;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromFieldRef;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromResourceFieldRef;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromSecretKeyRef;

/**
 * Source for the environment variable&#39;s value. Cannot be used if value is not empty.
 */
@ApiModel(description = "Source for the environment variable's value. Cannot be used if value is not empty.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom {
  @SerializedName("configMapKeyRef")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromConfigMapKeyRef configMapKeyRef = null;

  @SerializedName("fieldRef")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromFieldRef fieldRef = null;

  @SerializedName("resourceFieldRef")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromResourceFieldRef resourceFieldRef = null;

  @SerializedName("secretKeyRef")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromSecretKeyRef secretKeyRef = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom configMapKeyRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromConfigMapKeyRef configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

   /**
   * Get configMapKeyRef
   * @return configMapKeyRef
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromConfigMapKeyRef getConfigMapKeyRef() {
    return configMapKeyRef;
  }

  public void setConfigMapKeyRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromConfigMapKeyRef configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom fieldRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromFieldRef getFieldRef() {
    return fieldRef;
  }

  public void setFieldRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom resourceFieldRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromResourceFieldRef resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromResourceFieldRef getResourceFieldRef() {
    return resourceFieldRef;
  }

  public void setResourceFieldRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromResourceFieldRef resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom secretKeyRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromSecretKeyRef secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromSecretKeyRef getSecretKeyRef() {
    return secretKeyRef;
  }

  public void setSecretKeyRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFromSecretKeyRef secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom) o;
    return Objects.equals(this.configMapKeyRef, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom.configMapKeyRef) &&
        Objects.equals(this.fieldRef, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom.fieldRef) &&
        Objects.equals(this.resourceFieldRef, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom.resourceFieldRef) &&
        Objects.equals(this.secretKeyRef, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecValueFrom {\n");
    
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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

