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
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1SecretLocalReference;

/**
 * WebHookTrigger is a trigger that gets invoked using a webhook type of post
 */
@ApiModel(description = "WebHookTrigger is a trigger that gets invoked using a webhook type of post")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1WebHookTrigger {
  @SerializedName("allowEnv")
  private Boolean allowEnv = null;

  @SerializedName("secret")
  private String secret = null;

  @SerializedName("secretReference")
  private ComGithubOpenshiftApiBuildV1SecretLocalReference secretReference = null;

  public ComGithubOpenshiftApiBuildV1WebHookTrigger allowEnv(Boolean allowEnv) {
    this.allowEnv = allowEnv;
    return this;
  }

   /**
   * allowEnv determines whether the webhook can set environment variables; can only be set to true for GenericWebHook.
   * @return allowEnv
  **/
  @ApiModelProperty(value = "allowEnv determines whether the webhook can set environment variables; can only be set to true for GenericWebHook.")
  public Boolean isAllowEnv() {
    return allowEnv;
  }

  public void setAllowEnv(Boolean allowEnv) {
    this.allowEnv = allowEnv;
  }

  public ComGithubOpenshiftApiBuildV1WebHookTrigger secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * secret used to validate requests. Deprecated: use SecretReference instead.
   * @return secret
  **/
  @ApiModelProperty(value = "secret used to validate requests. Deprecated: use SecretReference instead.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public ComGithubOpenshiftApiBuildV1WebHookTrigger secretReference(ComGithubOpenshiftApiBuildV1SecretLocalReference secretReference) {
    this.secretReference = secretReference;
    return this;
  }

   /**
   * secretReference is a reference to a secret in the same namespace, containing the value to be validated when the webhook is invoked. The secret being referenced must contain a key named \&quot;WebHookSecretKey\&quot;, the value of which will be checked against the value supplied in the webhook invocation.
   * @return secretReference
  **/
  @ApiModelProperty(value = "secretReference is a reference to a secret in the same namespace, containing the value to be validated when the webhook is invoked. The secret being referenced must contain a key named \"WebHookSecretKey\", the value of which will be checked against the value supplied in the webhook invocation.")
  public ComGithubOpenshiftApiBuildV1SecretLocalReference getSecretReference() {
    return secretReference;
  }

  public void setSecretReference(ComGithubOpenshiftApiBuildV1SecretLocalReference secretReference) {
    this.secretReference = secretReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1WebHookTrigger comGithubOpenshiftApiBuildV1WebHookTrigger = (ComGithubOpenshiftApiBuildV1WebHookTrigger) o;
    return Objects.equals(this.allowEnv, comGithubOpenshiftApiBuildV1WebHookTrigger.allowEnv) &&
        Objects.equals(this.secret, comGithubOpenshiftApiBuildV1WebHookTrigger.secret) &&
        Objects.equals(this.secretReference, comGithubOpenshiftApiBuildV1WebHookTrigger.secretReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEnv, secret, secretReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1WebHookTrigger {\n");
    
    sb.append("    allowEnv: ").append(toIndentedString(allowEnv)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    secretReference: ").append(toIndentedString(secretReference)).append("\n");
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

