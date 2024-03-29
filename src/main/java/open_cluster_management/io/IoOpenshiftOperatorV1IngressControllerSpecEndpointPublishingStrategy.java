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
import open_cluster_management.io.IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer;

/**
 * endpointPublishingStrategy is used to publish the ingress controller endpoints to other networks, enable load balancer integrations, etc.   If unset, the default is based on infrastructure.config.openshift.io/cluster .status.platform:     AWS:      LoadBalancerService (with External scope)   Azure:    LoadBalancerService (with External scope)   GCP:      LoadBalancerService (with External scope)   IBMCloud: LoadBalancerService (with External scope)   Libvirt:  HostNetwork   Any other platform types (including None) default to HostNetwork.   endpointPublishingStrategy cannot be updated.
 */
@ApiModel(description = "endpointPublishingStrategy is used to publish the ingress controller endpoints to other networks, enable load balancer integrations, etc.   If unset, the default is based on infrastructure.config.openshift.io/cluster .status.platform:     AWS:      LoadBalancerService (with External scope)   Azure:    LoadBalancerService (with External scope)   GCP:      LoadBalancerService (with External scope)   IBMCloud: LoadBalancerService (with External scope)   Libvirt:  HostNetwork   Any other platform types (including None) default to HostNetwork.   endpointPublishingStrategy cannot be updated.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy {
  @SerializedName("hostNetwork")
  private Object hostNetwork = null;

  @SerializedName("loadBalancer")
  private IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer loadBalancer = null;

  @SerializedName("private")
  private Object _private = null;

  @SerializedName("type")
  private String type = null;

  public IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy hostNetwork(Object hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

   /**
   * hostNetwork holds parameters for the HostNetwork endpoint publishing strategy. Present only if type is HostNetwork.
   * @return hostNetwork
  **/
  @ApiModelProperty(value = "hostNetwork holds parameters for the HostNetwork endpoint publishing strategy. Present only if type is HostNetwork.")
  public Object getHostNetwork() {
    return hostNetwork;
  }

  public void setHostNetwork(Object hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  public IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy loadBalancer(IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer loadBalancer) {
    this.loadBalancer = loadBalancer;
    return this;
  }

   /**
   * Get loadBalancer
   * @return loadBalancer
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer getLoadBalancer() {
    return loadBalancer;
  }

  public void setLoadBalancer(IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer loadBalancer) {
    this.loadBalancer = loadBalancer;
  }

  public IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy _private(Object _private) {
    this._private = _private;
    return this;
  }

   /**
   * private holds parameters for the Private endpoint publishing strategy. Present only if type is Private.
   * @return _private
  **/
  @ApiModelProperty(value = "private holds parameters for the Private endpoint publishing strategy. Present only if type is Private.")
  public Object getPrivate() {
    return _private;
  }

  public void setPrivate(Object _private) {
    this._private = _private;
  }

  public IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type is the publishing strategy to use. Valid values are:   * LoadBalancerService   Publishes the ingress controller using a Kubernetes LoadBalancer Service.   In this configuration, the ingress controller deployment uses container networking. A LoadBalancer Service is created to publish the deployment.   See: https://kubernetes.io/docs/concepts/services-networking/service/#loadbalancer   If domain is set, a wildcard DNS record will be managed to point at the LoadBalancer Service&#39;s external name. DNS records are managed only in DNS zones defined by dns.config.openshift.io/cluster .spec.publicZone and .spec.privateZone.   Wildcard DNS management is currently supported only on the AWS, Azure, and GCP platforms.   * HostNetwork   Publishes the ingress controller on node ports where the ingress controller is deployed.   In this configuration, the ingress controller deployment uses host networking, bound to node ports 80 and 443. The user is responsible for configuring an external load balancer to publish the ingress controller via the node ports.   * Private   Does not publish the ingress controller.   In this configuration, the ingress controller deployment uses container networking, and is not explicitly published. The user must manually publish the ingress controller.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type is the publishing strategy to use. Valid values are:   * LoadBalancerService   Publishes the ingress controller using a Kubernetes LoadBalancer Service.   In this configuration, the ingress controller deployment uses container networking. A LoadBalancer Service is created to publish the deployment.   See: https://kubernetes.io/docs/concepts/services-networking/service/#loadbalancer   If domain is set, a wildcard DNS record will be managed to point at the LoadBalancer Service's external name. DNS records are managed only in DNS zones defined by dns.config.openshift.io/cluster .spec.publicZone and .spec.privateZone.   Wildcard DNS management is currently supported only on the AWS, Azure, and GCP platforms.   * HostNetwork   Publishes the ingress controller on node ports where the ingress controller is deployed.   In this configuration, the ingress controller deployment uses host networking, bound to node ports 80 and 443. The user is responsible for configuring an external load balancer to publish the ingress controller via the node ports.   * Private   Does not publish the ingress controller.   In this configuration, the ingress controller deployment uses container networking, and is not explicitly published. The user must manually publish the ingress controller.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy ioOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy = (IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy) o;
    return Objects.equals(this.hostNetwork, ioOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy.hostNetwork) &&
        Objects.equals(this.loadBalancer, ioOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy.loadBalancer) &&
        Objects.equals(this._private, ioOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy._private) &&
        Objects.equals(this.type, ioOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostNetwork, loadBalancer, _private, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategy {\n");
    
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

