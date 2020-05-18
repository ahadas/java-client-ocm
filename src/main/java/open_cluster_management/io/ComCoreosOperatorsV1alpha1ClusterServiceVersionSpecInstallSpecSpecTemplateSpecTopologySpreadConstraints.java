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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLabelSelector;

/**
 * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
 */
@ApiModel(description = "TopologySpreadConstraint specifies how to spread matching pods among the given topology.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints {
  @SerializedName("labelSelector")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLabelSelector labelSelector = null;

  @SerializedName("maxSkew")
  private Integer maxSkew = null;

  @SerializedName("topologyKey")
  private String topologyKey = null;

  @SerializedName("whenUnsatisfiable")
  private String whenUnsatisfiable = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints labelSelector(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLabelSelector getLabelSelector() {
    return labelSelector;
  }

  public void setLabelSelector(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints maxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
    return this;
  }

   /**
   * MaxSkew describes the degree to which pods may be unevenly distributed. It&#39;s the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It&#39;s a required field. Default value is 1 and 0 is not allowed.
   * @return maxSkew
  **/
  @ApiModelProperty(required = true, value = "MaxSkew describes the degree to which pods may be unevenly distributed. It's the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It's a required field. Default value is 1 and 0 is not allowed.")
  public Integer getMaxSkew() {
    return maxSkew;
  }

  public void setMaxSkew(Integer maxSkew) {
    this.maxSkew = maxSkew;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints topologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a \&quot;bucket\&quot;, and try to put balanced number of pods into each bucket. It&#39;s a required field.
   * @return topologyKey
  **/
  @ApiModelProperty(required = true, value = "TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a \"bucket\", and try to put balanced number of pods into each bucket. It's a required field.")
  public String getTopologyKey() {
    return topologyKey;
  }

  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints whenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
    return this;
  }

   /**
   * WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It&#39;s considered as \&quot;Unsatisfiable\&quot; if and only if placing incoming pod on any topology violates \&quot;MaxSkew\&quot;. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won&#39;t make it *more* imbalanced. It&#39;s a required field.
   * @return whenUnsatisfiable
  **/
  @ApiModelProperty(required = true, value = "WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It's considered as \"Unsatisfiable\" if and only if placing incoming pod on any topology violates \"MaxSkew\". For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.")
  public String getWhenUnsatisfiable() {
    return whenUnsatisfiable;
  }

  public void setWhenUnsatisfiable(String whenUnsatisfiable) {
    this.whenUnsatisfiable = whenUnsatisfiable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints) o;
    return Objects.equals(this.labelSelector, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints.labelSelector) &&
        Objects.equals(this.maxSkew, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints.maxSkew) &&
        Objects.equals(this.topologyKey, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints.topologyKey) &&
        Objects.equals(this.whenUnsatisfiable, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints.whenUnsatisfiable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, maxSkew, topologyKey, whenUnsatisfiable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints {\n");
    
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    maxSkew: ").append(toIndentedString(maxSkew)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
    sb.append("    whenUnsatisfiable: ").append(toIndentedString(whenUnsatisfiable)).append("\n");
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

