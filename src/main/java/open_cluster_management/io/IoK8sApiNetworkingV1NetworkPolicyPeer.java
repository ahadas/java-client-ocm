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
import open_cluster_management.io.IoK8sApiNetworkingV1IPBlock;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1LabelSelector;

/**
 * NetworkPolicyPeer describes a peer to allow traffic from. Only certain combinations of fields are allowed
 */
@ApiModel(description = "NetworkPolicyPeer describes a peer to allow traffic from. Only certain combinations of fields are allowed")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiNetworkingV1NetworkPolicyPeer {
  @SerializedName("ipBlock")
  private IoK8sApiNetworkingV1IPBlock ipBlock = null;

  @SerializedName("namespaceSelector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector = null;

  @SerializedName("podSelector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector = null;

  public IoK8sApiNetworkingV1NetworkPolicyPeer ipBlock(IoK8sApiNetworkingV1IPBlock ipBlock) {
    this.ipBlock = ipBlock;
    return this;
  }

   /**
   * IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
   * @return ipBlock
  **/
  @ApiModelProperty(value = "IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.")
  public IoK8sApiNetworkingV1IPBlock getIpBlock() {
    return ipBlock;
  }

  public void setIpBlock(IoK8sApiNetworkingV1IPBlock ipBlock) {
    this.ipBlock = ipBlock;
  }

  public IoK8sApiNetworkingV1NetworkPolicyPeer namespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.  If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
   * @return namespaceSelector
  **/
  @ApiModelProperty(value = "Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.  If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getNamespaceSelector() {
    return namespaceSelector;
  }

  public void setNamespaceSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }

  public IoK8sApiNetworkingV1NetworkPolicyPeer podSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector) {
    this.podSelector = podSelector;
    return this;
  }

   /**
   * This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.  If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy&#39;s own Namespace.
   * @return podSelector
  **/
  @ApiModelProperty(value = "This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.  If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy's own Namespace.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getPodSelector() {
    return podSelector;
  }

  public void setPodSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector podSelector) {
    this.podSelector = podSelector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiNetworkingV1NetworkPolicyPeer ioK8sApiNetworkingV1NetworkPolicyPeer = (IoK8sApiNetworkingV1NetworkPolicyPeer) o;
    return Objects.equals(this.ipBlock, ioK8sApiNetworkingV1NetworkPolicyPeer.ipBlock) &&
        Objects.equals(this.namespaceSelector, ioK8sApiNetworkingV1NetworkPolicyPeer.namespaceSelector) &&
        Objects.equals(this.podSelector, ioK8sApiNetworkingV1NetworkPolicyPeer.podSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipBlock, namespaceSelector, podSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiNetworkingV1NetworkPolicyPeer {\n");
    
    sb.append("    ipBlock: ").append(toIndentedString(ipBlock)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    podSelector: ").append(toIndentedString(podSelector)).append("\n");
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

