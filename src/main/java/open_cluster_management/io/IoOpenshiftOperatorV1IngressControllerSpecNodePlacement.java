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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations;
import open_cluster_management.io.IoOpenshiftOperatorV1IngressControllerSpecNodePlacementNodeSelector;

/**
 * nodePlacement enables explicit control over the scheduling of the ingress controller.   If unset, defaults are used. See NodePlacement for more details.
 */
@ApiModel(description = "nodePlacement enables explicit control over the scheduling of the ingress controller.   If unset, defaults are used. See NodePlacement for more details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorV1IngressControllerSpecNodePlacement {
  @SerializedName("nodeSelector")
  private IoOpenshiftOperatorV1IngressControllerSpecNodePlacementNodeSelector nodeSelector = null;

  @SerializedName("tolerations")
  private List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations> tolerations = null;

  public IoOpenshiftOperatorV1IngressControllerSpecNodePlacement nodeSelector(IoOpenshiftOperatorV1IngressControllerSpecNodePlacementNodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

   /**
   * Get nodeSelector
   * @return nodeSelector
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorV1IngressControllerSpecNodePlacementNodeSelector getNodeSelector() {
    return nodeSelector;
  }

  public void setNodeSelector(IoOpenshiftOperatorV1IngressControllerSpecNodePlacementNodeSelector nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  public IoOpenshiftOperatorV1IngressControllerSpecNodePlacement tolerations(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  public IoOpenshiftOperatorV1IngressControllerSpecNodePlacement addTolerationsItem(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * tolerations is a list of tolerations applied to ingress controller deployments.   The default is an empty list.   See https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
   * @return tolerations
  **/
  @ApiModelProperty(value = "tolerations is a list of tolerations applied to ingress controller deployments.   The default is an empty list.   See https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/")
  public List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations> getTolerations() {
    return tolerations;
  }

  public void setTolerations(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTolerations> tolerations) {
    this.tolerations = tolerations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorV1IngressControllerSpecNodePlacement ioOpenshiftOperatorV1IngressControllerSpecNodePlacement = (IoOpenshiftOperatorV1IngressControllerSpecNodePlacement) o;
    return Objects.equals(this.nodeSelector, ioOpenshiftOperatorV1IngressControllerSpecNodePlacement.nodeSelector) &&
        Objects.equals(this.tolerations, ioOpenshiftOperatorV1IngressControllerSpecNodePlacement.tolerations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeSelector, tolerations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorV1IngressControllerSpecNodePlacement {\n");
    
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
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
