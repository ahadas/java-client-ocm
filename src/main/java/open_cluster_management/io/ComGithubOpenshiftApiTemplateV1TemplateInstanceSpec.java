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
import open_cluster_management.io.ComGithubOpenshiftApiTemplateV1Template;
import open_cluster_management.io.ComGithubOpenshiftApiTemplateV1TemplateInstanceRequester;
import open_cluster_management.io.IoK8sApiCoreV1LocalObjectReference;

/**
 * TemplateInstanceSpec describes the desired state of a TemplateInstance.
 */
@ApiModel(description = "TemplateInstanceSpec describes the desired state of a TemplateInstance.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiTemplateV1TemplateInstanceSpec {
  @SerializedName("requester")
  private ComGithubOpenshiftApiTemplateV1TemplateInstanceRequester requester = null;

  @SerializedName("secret")
  private IoK8sApiCoreV1LocalObjectReference secret = null;

  @SerializedName("template")
  private ComGithubOpenshiftApiTemplateV1Template template = null;

  public ComGithubOpenshiftApiTemplateV1TemplateInstanceSpec requester(ComGithubOpenshiftApiTemplateV1TemplateInstanceRequester requester) {
    this.requester = requester;
    return this;
  }

   /**
   * requester holds the identity of the agent requesting the template instantiation.
   * @return requester
  **/
  @ApiModelProperty(value = "requester holds the identity of the agent requesting the template instantiation.")
  public ComGithubOpenshiftApiTemplateV1TemplateInstanceRequester getRequester() {
    return requester;
  }

  public void setRequester(ComGithubOpenshiftApiTemplateV1TemplateInstanceRequester requester) {
    this.requester = requester;
  }

  public ComGithubOpenshiftApiTemplateV1TemplateInstanceSpec secret(IoK8sApiCoreV1LocalObjectReference secret) {
    this.secret = secret;
    return this;
  }

   /**
   * secret is a reference to a Secret object containing the necessary template parameters.
   * @return secret
  **/
  @ApiModelProperty(value = "secret is a reference to a Secret object containing the necessary template parameters.")
  public IoK8sApiCoreV1LocalObjectReference getSecret() {
    return secret;
  }

  public void setSecret(IoK8sApiCoreV1LocalObjectReference secret) {
    this.secret = secret;
  }

  public ComGithubOpenshiftApiTemplateV1TemplateInstanceSpec template(ComGithubOpenshiftApiTemplateV1Template template) {
    this.template = template;
    return this;
  }

   /**
   * template is a full copy of the template for instantiation.
   * @return template
  **/
  @ApiModelProperty(required = true, value = "template is a full copy of the template for instantiation.")
  public ComGithubOpenshiftApiTemplateV1Template getTemplate() {
    return template;
  }

  public void setTemplate(ComGithubOpenshiftApiTemplateV1Template template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiTemplateV1TemplateInstanceSpec comGithubOpenshiftApiTemplateV1TemplateInstanceSpec = (ComGithubOpenshiftApiTemplateV1TemplateInstanceSpec) o;
    return Objects.equals(this.requester, comGithubOpenshiftApiTemplateV1TemplateInstanceSpec.requester) &&
        Objects.equals(this.secret, comGithubOpenshiftApiTemplateV1TemplateInstanceSpec.secret) &&
        Objects.equals(this.template, comGithubOpenshiftApiTemplateV1TemplateInstanceSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requester, secret, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiTemplateV1TemplateInstanceSpec {\n");
    
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

