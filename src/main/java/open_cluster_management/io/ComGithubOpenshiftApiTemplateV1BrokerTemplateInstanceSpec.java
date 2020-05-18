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
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;

/**
 * BrokerTemplateInstanceSpec describes the state of a BrokerTemplateInstance.
 */
@ApiModel(description = "BrokerTemplateInstanceSpec describes the state of a BrokerTemplateInstance.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec {
  @SerializedName("bindingIDs")
  private List<String> bindingIDs = null;

  @SerializedName("secret")
  private IoK8sApiCoreV1ObjectReference secret = null;

  @SerializedName("templateInstance")
  private IoK8sApiCoreV1ObjectReference templateInstance = null;

  public ComGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec bindingIDs(List<String> bindingIDs) {
    this.bindingIDs = bindingIDs;
    return this;
  }

  public ComGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec addBindingIDsItem(String bindingIDsItem) {
    if (this.bindingIDs == null) {
      this.bindingIDs = new ArrayList<>();
    }
    this.bindingIDs.add(bindingIDsItem);
    return this;
  }

   /**
   * bindingids is a list of &#39;binding_id&#39;s provided during successive bind calls to the template service broker.
   * @return bindingIDs
  **/
  @ApiModelProperty(value = "bindingids is a list of 'binding_id's provided during successive bind calls to the template service broker.")
  public List<String> getBindingIDs() {
    return bindingIDs;
  }

  public void setBindingIDs(List<String> bindingIDs) {
    this.bindingIDs = bindingIDs;
  }

  public ComGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec secret(IoK8sApiCoreV1ObjectReference secret) {
    this.secret = secret;
    return this;
  }

   /**
   * secret is a reference to a Secret object residing in a namespace, containing the necessary template parameters.
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "secret is a reference to a Secret object residing in a namespace, containing the necessary template parameters.")
  public IoK8sApiCoreV1ObjectReference getSecret() {
    return secret;
  }

  public void setSecret(IoK8sApiCoreV1ObjectReference secret) {
    this.secret = secret;
  }

  public ComGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec templateInstance(IoK8sApiCoreV1ObjectReference templateInstance) {
    this.templateInstance = templateInstance;
    return this;
  }

   /**
   * templateinstance is a reference to a TemplateInstance object residing in a namespace.
   * @return templateInstance
  **/
  @ApiModelProperty(required = true, value = "templateinstance is a reference to a TemplateInstance object residing in a namespace.")
  public IoK8sApiCoreV1ObjectReference getTemplateInstance() {
    return templateInstance;
  }

  public void setTemplateInstance(IoK8sApiCoreV1ObjectReference templateInstance) {
    this.templateInstance = templateInstance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec comGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec = (ComGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec) o;
    return Objects.equals(this.bindingIDs, comGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec.bindingIDs) &&
        Objects.equals(this.secret, comGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec.secret) &&
        Objects.equals(this.templateInstance, comGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec.templateInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingIDs, secret, templateInstance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec {\n");
    
    sb.append("    bindingIDs: ").append(toIndentedString(bindingIDs)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    templateInstance: ").append(toIndentedString(templateInstance)).append("\n");
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
