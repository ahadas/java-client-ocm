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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import open_cluster_management.io.ComGithubOpenshiftApiTemplateV1Parameter;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;
import open_cluster_management.io.IoK8sApimachineryPkgRuntimeRawExtension;

/**
 * Template contains the inputs needed to produce a Config.
 */
@ApiModel(description = "Template contains the inputs needed to produce a Config.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiTemplateV1Template {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  @SerializedName("objects")
  private List<IoK8sApimachineryPkgRuntimeRawExtension> objects = new ArrayList<>();

  @SerializedName("parameters")
  private List<ComGithubOpenshiftApiTemplateV1Parameter> parameters = null;

  public ComGithubOpenshiftApiTemplateV1Template apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ComGithubOpenshiftApiTemplateV1Template kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComGithubOpenshiftApiTemplateV1Template labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ComGithubOpenshiftApiTemplateV1Template putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * labels is a optional set of labels that are applied to every object during the Template to Config transformation.
   * @return labels
  **/
  @ApiModelProperty(value = "labels is a optional set of labels that are applied to every object during the Template to Config transformation.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ComGithubOpenshiftApiTemplateV1Template message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message is an optional instructional message that will be displayed when this template is instantiated. This field should inform the user how to utilize the newly created resources. Parameter substitution will be performed on the message before being displayed so that generated credentials and other parameters can be included in the output.
   * @return message
  **/
  @ApiModelProperty(value = "message is an optional instructional message that will be displayed when this template is instantiated. This field should inform the user how to utilize the newly created resources. Parameter substitution will be performed on the message before being displayed so that generated credentials and other parameters can be included in the output.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ComGithubOpenshiftApiTemplateV1Template metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    this.metadata = metadata;
  }

  public ComGithubOpenshiftApiTemplateV1Template objects(List<IoK8sApimachineryPkgRuntimeRawExtension> objects) {
    this.objects = objects;
    return this;
  }

  public ComGithubOpenshiftApiTemplateV1Template addObjectsItem(IoK8sApimachineryPkgRuntimeRawExtension objectsItem) {
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * objects is an array of resources to include in this template. If a namespace value is hardcoded in the object, it will be removed during template instantiation, however if the namespace value is, or contains, a ${PARAMETER_REFERENCE}, the resolved value after parameter substitution will be respected and the object will be created in that namespace.
   * @return objects
  **/
  @ApiModelProperty(required = true, value = "objects is an array of resources to include in this template. If a namespace value is hardcoded in the object, it will be removed during template instantiation, however if the namespace value is, or contains, a ${PARAMETER_REFERENCE}, the resolved value after parameter substitution will be respected and the object will be created in that namespace.")
  public List<IoK8sApimachineryPkgRuntimeRawExtension> getObjects() {
    return objects;
  }

  public void setObjects(List<IoK8sApimachineryPkgRuntimeRawExtension> objects) {
    this.objects = objects;
  }

  public ComGithubOpenshiftApiTemplateV1Template parameters(List<ComGithubOpenshiftApiTemplateV1Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public ComGithubOpenshiftApiTemplateV1Template addParametersItem(ComGithubOpenshiftApiTemplateV1Parameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * parameters is an optional array of Parameters used during the Template to Config transformation.
   * @return parameters
  **/
  @ApiModelProperty(value = "parameters is an optional array of Parameters used during the Template to Config transformation.")
  public List<ComGithubOpenshiftApiTemplateV1Parameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<ComGithubOpenshiftApiTemplateV1Parameter> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiTemplateV1Template comGithubOpenshiftApiTemplateV1Template = (ComGithubOpenshiftApiTemplateV1Template) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiTemplateV1Template.apiVersion) &&
        Objects.equals(this.kind, comGithubOpenshiftApiTemplateV1Template.kind) &&
        Objects.equals(this.labels, comGithubOpenshiftApiTemplateV1Template.labels) &&
        Objects.equals(this.message, comGithubOpenshiftApiTemplateV1Template.message) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiTemplateV1Template.metadata) &&
        Objects.equals(this.objects, comGithubOpenshiftApiTemplateV1Template.objects) &&
        Objects.equals(this.parameters, comGithubOpenshiftApiTemplateV1Template.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, labels, message, metadata, objects, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiTemplateV1Template {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

