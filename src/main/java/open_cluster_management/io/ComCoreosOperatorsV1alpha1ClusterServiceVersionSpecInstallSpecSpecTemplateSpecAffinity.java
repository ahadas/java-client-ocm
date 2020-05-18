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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityNodeAffinity;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinity;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAntiAffinity;

/**
 * If specified, the pod&#39;s scheduling constraints
 */
@ApiModel(description = "If specified, the pod's scheduling constraints")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity {
  @SerializedName("nodeAffinity")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityNodeAffinity nodeAffinity = null;

  @SerializedName("podAffinity")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinity podAffinity = null;

  @SerializedName("podAntiAffinity")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity nodeAffinity(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

   /**
   * Get nodeAffinity
   * @return nodeAffinity
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityNodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity podAffinity(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinity podAffinity) {
    this.podAffinity = podAffinity;
    return this;
  }

   /**
   * Get podAffinity
   * @return podAffinity
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinity getPodAffinity() {
    return podAffinity;
  }

  public void setPodAffinity(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinity podAffinity) {
    this.podAffinity = podAffinity;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity podAntiAffinity(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
    return this;
  }

   /**
   * Get podAntiAffinity
   * @return podAntiAffinity
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAntiAffinity getPodAntiAffinity() {
    return podAntiAffinity;
  }

  public void setPodAntiAffinity(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity) o;
    return Objects.equals(this.nodeAffinity, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity.nodeAffinity) &&
        Objects.equals(this.podAffinity, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity.podAffinity) &&
        Objects.equals(this.podAntiAffinity, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity.podAntiAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinity {\n");
    
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
    sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
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

