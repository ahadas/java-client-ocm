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
 * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
 */
@ApiModel(description = "NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAuthorizationV1beta1NonResourceAttributes {
  @SerializedName("path")
  private String path = null;

  @SerializedName("verb")
  private String verb = null;

  public IoK8sApiAuthorizationV1beta1NonResourceAttributes path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path is the URL path of the request
   * @return path
  **/
  @ApiModelProperty(value = "Path is the URL path of the request")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public IoK8sApiAuthorizationV1beta1NonResourceAttributes verb(String verb) {
    this.verb = verb;
    return this;
  }

   /**
   * Verb is the standard HTTP verb
   * @return verb
  **/
  @ApiModelProperty(value = "Verb is the standard HTTP verb")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAuthorizationV1beta1NonResourceAttributes ioK8sApiAuthorizationV1beta1NonResourceAttributes = (IoK8sApiAuthorizationV1beta1NonResourceAttributes) o;
    return Objects.equals(this.path, ioK8sApiAuthorizationV1beta1NonResourceAttributes.path) &&
        Objects.equals(this.verb, ioK8sApiAuthorizationV1beta1NonResourceAttributes.verb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, verb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1beta1NonResourceAttributes {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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

