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
 * RouteTargetReference specifies the target that resolve into endpoints. Only the &#39;Service&#39; kind is allowed. Use &#39;weight&#39; field to emphasize one over others.
 */
@ApiModel(description = "RouteTargetReference specifies the target that resolve into endpoints. Only the 'Service' kind is allowed. Use 'weight' field to emphasize one over others.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiRouteV1RouteTargetReference {
  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("weight")
  private Integer weight = null;

  public ComGithubOpenshiftApiRouteV1RouteTargetReference kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The kind of target that the route is referring to. Currently, only &#39;Service&#39; is allowed
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "The kind of target that the route is referring to. Currently, only 'Service' is allowed")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComGithubOpenshiftApiRouteV1RouteTargetReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the service/target that is being referred to. e.g. name of the service
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name of the service/target that is being referred to. e.g. name of the service")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComGithubOpenshiftApiRouteV1RouteTargetReference weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * weight as an integer between 0 and 256, default 100, that specifies the target&#39;s relative weight against other target reference objects. 0 suppresses requests to this backend.
   * @return weight
  **/
  @ApiModelProperty(value = "weight as an integer between 0 and 256, default 100, that specifies the target's relative weight against other target reference objects. 0 suppresses requests to this backend.")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiRouteV1RouteTargetReference comGithubOpenshiftApiRouteV1RouteTargetReference = (ComGithubOpenshiftApiRouteV1RouteTargetReference) o;
    return Objects.equals(this.kind, comGithubOpenshiftApiRouteV1RouteTargetReference.kind) &&
        Objects.equals(this.name, comGithubOpenshiftApiRouteV1RouteTargetReference.name) &&
        Objects.equals(this.weight, comGithubOpenshiftApiRouteV1RouteTargetReference.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, name, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiRouteV1RouteTargetReference {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

