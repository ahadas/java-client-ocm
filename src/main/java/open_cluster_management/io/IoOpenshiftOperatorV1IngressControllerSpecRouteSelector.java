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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import open_cluster_management.io.ComCoreosOperatorsV1OperatorGroupSpecSelectorMatchExpressions;

/**
 * routeSelector is used to filter the set of Routes serviced by the ingress controller. This is useful for implementing shards.   If unset, the default is no filtering.
 */
@ApiModel(description = "routeSelector is used to filter the set of Routes serviced by the ingress controller. This is useful for implementing shards.   If unset, the default is no filtering.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorV1IngressControllerSpecRouteSelector {
  @SerializedName("matchExpressions")
  private List<ComCoreosOperatorsV1OperatorGroupSpecSelectorMatchExpressions> matchExpressions = null;

  @SerializedName("matchLabels")
  private Map<String, String> matchLabels = null;

  public IoOpenshiftOperatorV1IngressControllerSpecRouteSelector matchExpressions(List<ComCoreosOperatorsV1OperatorGroupSpecSelectorMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  public IoOpenshiftOperatorV1IngressControllerSpecRouteSelector addMatchExpressionsItem(ComCoreosOperatorsV1OperatorGroupSpecSelectorMatchExpressions matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   * @return matchExpressions
  **/
  @ApiModelProperty(value = "matchExpressions is a list of label selector requirements. The requirements are ANDed.")
  public List<ComCoreosOperatorsV1OperatorGroupSpecSelectorMatchExpressions> getMatchExpressions() {
    return matchExpressions;
  }

  public void setMatchExpressions(List<ComCoreosOperatorsV1OperatorGroupSpecSelectorMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  public IoOpenshiftOperatorV1IngressControllerSpecRouteSelector matchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
    return this;
  }

  public IoOpenshiftOperatorV1IngressControllerSpecRouteSelector putMatchLabelsItem(String key, String matchLabelsItem) {
    if (this.matchLabels == null) {
      this.matchLabels = new HashMap<>();
    }
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }

   /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \&quot;key\&quot;, the operator is \&quot;In\&quot;, and the values array contains only \&quot;value\&quot;. The requirements are ANDed.
   * @return matchLabels
  **/
  @ApiModelProperty(value = "matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }

  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorV1IngressControllerSpecRouteSelector ioOpenshiftOperatorV1IngressControllerSpecRouteSelector = (IoOpenshiftOperatorV1IngressControllerSpecRouteSelector) o;
    return Objects.equals(this.matchExpressions, ioOpenshiftOperatorV1IngressControllerSpecRouteSelector.matchExpressions) &&
        Objects.equals(this.matchLabels, ioOpenshiftOperatorV1IngressControllerSpecRouteSelector.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorV1IngressControllerSpecRouteSelector {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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

