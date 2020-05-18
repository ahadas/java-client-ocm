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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityPodAffinityTermLabelSelector;

/**
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key &lt;topologyKey&gt; matches that of any node on which a pod of the set of pods is running
 */
@ApiModel(description = "Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution {
  @SerializedName("labelSelector")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityPodAffinityTermLabelSelector labelSelector = null;

  @SerializedName("namespaces")
  private List<String> namespaces = null;

  @SerializedName("topologyKey")
  private String topologyKey = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution labelSelector(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityPodAffinityTermLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityPodAffinityTermLabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityPodAffinityTermLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means \&quot;this pod&#39;s namespace\&quot;
   * @return namespaces
  **/
  @ApiModelProperty(value = "namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means \"this pod's namespace\"")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution topologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
   * @return topologyKey
  **/
  @ApiModelProperty(required = true, value = "This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.")
  public String getTopologyKey() {
    return topologyKey;
  }

  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution) o;
    return Objects.equals(this.labelSelector, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution.labelSelector) &&
        Objects.equals(this.namespaces, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution.namespaces) &&
        Objects.equals(this.topologyKey, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution.topologyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, namespaces, topologyKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution {\n");
    
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
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

