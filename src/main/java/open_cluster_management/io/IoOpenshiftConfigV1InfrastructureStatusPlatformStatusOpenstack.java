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

/**
 * OpenStack contains settings specific to the OpenStack infrastructure provider.
 */
@ApiModel(description = "OpenStack contains settings specific to the OpenStack infrastructure provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack {
  @SerializedName("apiServerInternalIP")
  private String apiServerInternalIP = null;

  @SerializedName("cloudName")
  private String cloudName = null;

  @SerializedName("ingressIP")
  private String ingressIP = null;

  @SerializedName("nodeDNSIP")
  private String nodeDNSIP = null;

  public IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack apiServerInternalIP(String apiServerInternalIP) {
    this.apiServerInternalIP = apiServerInternalIP;
    return this;
  }

   /**
   * apiServerInternalIP is an IP address to contact the Kubernetes API server that can be used by components inside the cluster, like kubelets using the infrastructure rather than Kubernetes networking. It is the IP that the Infrastructure.status.apiServerInternalURI points to. It is the IP for a self-hosted load balancer in front of the API servers.
   * @return apiServerInternalIP
  **/
  @ApiModelProperty(value = "apiServerInternalIP is an IP address to contact the Kubernetes API server that can be used by components inside the cluster, like kubelets using the infrastructure rather than Kubernetes networking. It is the IP that the Infrastructure.status.apiServerInternalURI points to. It is the IP for a self-hosted load balancer in front of the API servers.")
  public String getApiServerInternalIP() {
    return apiServerInternalIP;
  }

  public void setApiServerInternalIP(String apiServerInternalIP) {
    this.apiServerInternalIP = apiServerInternalIP;
  }

  public IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack cloudName(String cloudName) {
    this.cloudName = cloudName;
    return this;
  }

   /**
   * cloudName is the name of the desired OpenStack cloud in the client configuration file (&#x60;clouds.yaml&#x60;).
   * @return cloudName
  **/
  @ApiModelProperty(value = "cloudName is the name of the desired OpenStack cloud in the client configuration file (`clouds.yaml`).")
  public String getCloudName() {
    return cloudName;
  }

  public void setCloudName(String cloudName) {
    this.cloudName = cloudName;
  }

  public IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack ingressIP(String ingressIP) {
    this.ingressIP = ingressIP;
    return this;
  }

   /**
   * ingressIP is an external IP which routes to the default ingress controller. The IP is a suitable target of a wildcard DNS record used to resolve default route host names.
   * @return ingressIP
  **/
  @ApiModelProperty(value = "ingressIP is an external IP which routes to the default ingress controller. The IP is a suitable target of a wildcard DNS record used to resolve default route host names.")
  public String getIngressIP() {
    return ingressIP;
  }

  public void setIngressIP(String ingressIP) {
    this.ingressIP = ingressIP;
  }

  public IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack nodeDNSIP(String nodeDNSIP) {
    this.nodeDNSIP = nodeDNSIP;
    return this;
  }

   /**
   * nodeDNSIP is the IP address for the internal DNS used by the nodes. Unlike the one managed by the DNS operator, &#x60;NodeDNSIP&#x60; provides name resolution for the nodes themselves. There is no DNS-as-a-service for OpenStack deployments. In order to minimize necessary changes to the datacenter DNS, a DNS service is hosted as a static pod to serve those hostnames to the nodes in the cluster.
   * @return nodeDNSIP
  **/
  @ApiModelProperty(value = "nodeDNSIP is the IP address for the internal DNS used by the nodes. Unlike the one managed by the DNS operator, `NodeDNSIP` provides name resolution for the nodes themselves. There is no DNS-as-a-service for OpenStack deployments. In order to minimize necessary changes to the datacenter DNS, a DNS service is hosted as a static pod to serve those hostnames to the nodes in the cluster.")
  public String getNodeDNSIP() {
    return nodeDNSIP;
  }

  public void setNodeDNSIP(String nodeDNSIP) {
    this.nodeDNSIP = nodeDNSIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack ioOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack = (IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack) o;
    return Objects.equals(this.apiServerInternalIP, ioOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack.apiServerInternalIP) &&
        Objects.equals(this.cloudName, ioOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack.cloudName) &&
        Objects.equals(this.ingressIP, ioOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack.ingressIP) &&
        Objects.equals(this.nodeDNSIP, ioOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack.nodeDNSIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiServerInternalIP, cloudName, ingressIP, nodeDNSIP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1InfrastructureStatusPlatformStatusOpenstack {\n");
    
    sb.append("    apiServerInternalIP: ").append(toIndentedString(apiServerInternalIP)).append("\n");
    sb.append("    cloudName: ").append(toIndentedString(cloudName)).append("\n");
    sb.append("    ingressIP: ").append(toIndentedString(ingressIP)).append("\n");
    sb.append("    nodeDNSIP: ").append(toIndentedString(nodeDNSIP)).append("\n");
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

