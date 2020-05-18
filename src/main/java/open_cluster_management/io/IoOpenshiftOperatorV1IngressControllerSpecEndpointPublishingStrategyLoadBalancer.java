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
 * loadBalancer holds parameters for the load balancer. Present only if type is LoadBalancerService.
 */
@ApiModel(description = "loadBalancer holds parameters for the load balancer. Present only if type is LoadBalancerService.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer {
  @SerializedName("scope")
  private String scope = null;

  public IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * scope indicates the scope at which the load balancer is exposed. Possible values are \&quot;External\&quot; and \&quot;Internal\&quot;.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "scope indicates the scope at which the load balancer is exposed. Possible values are \"External\" and \"Internal\".")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer ioOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer = (IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer) o;
    return Objects.equals(this.scope, ioOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorV1IngressControllerSpecEndpointPublishingStrategyLoadBalancer {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

