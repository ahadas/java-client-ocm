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
import open_cluster_management.io.ComGithubOpenshiftApiRouteV1RouteIngressCondition;

/**
 * RouteIngress holds information about the places where a route is exposed.
 */
@ApiModel(description = "RouteIngress holds information about the places where a route is exposed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiRouteV1RouteIngress {
  @SerializedName("conditions")
  private List<ComGithubOpenshiftApiRouteV1RouteIngressCondition> conditions = null;

  @SerializedName("host")
  private String host = null;

  @SerializedName("routerCanonicalHostname")
  private String routerCanonicalHostname = null;

  @SerializedName("routerName")
  private String routerName = null;

  @SerializedName("wildcardPolicy")
  private String wildcardPolicy = null;

  public ComGithubOpenshiftApiRouteV1RouteIngress conditions(List<ComGithubOpenshiftApiRouteV1RouteIngressCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ComGithubOpenshiftApiRouteV1RouteIngress addConditionsItem(ComGithubOpenshiftApiRouteV1RouteIngressCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is the state of the route, may be empty.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions is the state of the route, may be empty.")
  public List<ComGithubOpenshiftApiRouteV1RouteIngressCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<ComGithubOpenshiftApiRouteV1RouteIngressCondition> conditions) {
    this.conditions = conditions;
  }

  public ComGithubOpenshiftApiRouteV1RouteIngress host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Host is the host string under which the route is exposed; this value is required
   * @return host
  **/
  @ApiModelProperty(value = "Host is the host string under which the route is exposed; this value is required")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public ComGithubOpenshiftApiRouteV1RouteIngress routerCanonicalHostname(String routerCanonicalHostname) {
    this.routerCanonicalHostname = routerCanonicalHostname;
    return this;
  }

   /**
   * CanonicalHostname is the external host name for the router that can be used as a CNAME for the host requested for this route. This value is optional and may not be set in all cases.
   * @return routerCanonicalHostname
  **/
  @ApiModelProperty(value = "CanonicalHostname is the external host name for the router that can be used as a CNAME for the host requested for this route. This value is optional and may not be set in all cases.")
  public String getRouterCanonicalHostname() {
    return routerCanonicalHostname;
  }

  public void setRouterCanonicalHostname(String routerCanonicalHostname) {
    this.routerCanonicalHostname = routerCanonicalHostname;
  }

  public ComGithubOpenshiftApiRouteV1RouteIngress routerName(String routerName) {
    this.routerName = routerName;
    return this;
  }

   /**
   * Name is a name chosen by the router to identify itself; this value is required
   * @return routerName
  **/
  @ApiModelProperty(value = "Name is a name chosen by the router to identify itself; this value is required")
  public String getRouterName() {
    return routerName;
  }

  public void setRouterName(String routerName) {
    this.routerName = routerName;
  }

  public ComGithubOpenshiftApiRouteV1RouteIngress wildcardPolicy(String wildcardPolicy) {
    this.wildcardPolicy = wildcardPolicy;
    return this;
  }

   /**
   * Wildcard policy is the wildcard policy that was allowed where this route is exposed.
   * @return wildcardPolicy
  **/
  @ApiModelProperty(value = "Wildcard policy is the wildcard policy that was allowed where this route is exposed.")
  public String getWildcardPolicy() {
    return wildcardPolicy;
  }

  public void setWildcardPolicy(String wildcardPolicy) {
    this.wildcardPolicy = wildcardPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiRouteV1RouteIngress comGithubOpenshiftApiRouteV1RouteIngress = (ComGithubOpenshiftApiRouteV1RouteIngress) o;
    return Objects.equals(this.conditions, comGithubOpenshiftApiRouteV1RouteIngress.conditions) &&
        Objects.equals(this.host, comGithubOpenshiftApiRouteV1RouteIngress.host) &&
        Objects.equals(this.routerCanonicalHostname, comGithubOpenshiftApiRouteV1RouteIngress.routerCanonicalHostname) &&
        Objects.equals(this.routerName, comGithubOpenshiftApiRouteV1RouteIngress.routerName) &&
        Objects.equals(this.wildcardPolicy, comGithubOpenshiftApiRouteV1RouteIngress.wildcardPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, host, routerCanonicalHostname, routerName, wildcardPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiRouteV1RouteIngress {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    routerCanonicalHostname: ").append(toIndentedString(routerCanonicalHostname)).append("\n");
    sb.append("    routerName: ").append(toIndentedString(routerName)).append("\n");
    sb.append("    wildcardPolicy: ").append(toIndentedString(wildcardPolicy)).append("\n");
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

