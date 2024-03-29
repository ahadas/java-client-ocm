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
import open_cluster_management.io.IoK8sApiAuthenticationV1TokenReviewSpec;
import open_cluster_management.io.IoK8sApiAuthenticationV1TokenReviewStatus;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMeta;

/**
 * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may be cached by the webhook token authenticator plugin in the kube-apiserver.
 */
@ApiModel(description = "TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may be cached by the webhook token authenticator plugin in the kube-apiserver.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAuthenticationV1TokenReview {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @SerializedName("spec")
  private IoK8sApiAuthenticationV1TokenReviewSpec spec = null;

  @SerializedName("status")
  private IoK8sApiAuthenticationV1TokenReviewStatus status = null;

  public IoK8sApiAuthenticationV1TokenReview apiVersion(String apiVersion) {
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

  public IoK8sApiAuthenticationV1TokenReview kind(String kind) {
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

  public IoK8sApiAuthenticationV1TokenReview metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiAuthenticationV1TokenReview spec(IoK8sApiAuthenticationV1TokenReviewSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec holds information about the request being evaluated
   * @return spec
  **/
  @ApiModelProperty(required = true, value = "Spec holds information about the request being evaluated")
  public IoK8sApiAuthenticationV1TokenReviewSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sApiAuthenticationV1TokenReviewSpec spec) {
    this.spec = spec;
  }

  public IoK8sApiAuthenticationV1TokenReview status(IoK8sApiAuthenticationV1TokenReviewStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status is filled in by the server and indicates whether the request can be authenticated.
   * @return status
  **/
  @ApiModelProperty(value = "Status is filled in by the server and indicates whether the request can be authenticated.")
  public IoK8sApiAuthenticationV1TokenReviewStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sApiAuthenticationV1TokenReviewStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAuthenticationV1TokenReview ioK8sApiAuthenticationV1TokenReview = (IoK8sApiAuthenticationV1TokenReview) o;
    return Objects.equals(this.apiVersion, ioK8sApiAuthenticationV1TokenReview.apiVersion) &&
        Objects.equals(this.kind, ioK8sApiAuthenticationV1TokenReview.kind) &&
        Objects.equals(this.metadata, ioK8sApiAuthenticationV1TokenReview.metadata) &&
        Objects.equals(this.spec, ioK8sApiAuthenticationV1TokenReview.spec) &&
        Objects.equals(this.status, ioK8sApiAuthenticationV1TokenReview.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthenticationV1TokenReview {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

