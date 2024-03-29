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
import open_cluster_management.io.IoOpenshiftConfigV1AuthenticationSpecKubeConfig;

/**
 * webhookTokenAuthenticator holds the necessary configuration options for a remote token authenticator
 */
@ApiModel(description = "webhookTokenAuthenticator holds the necessary configuration options for a remote token authenticator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1AuthenticationSpecWebhookTokenAuthenticators {
  @SerializedName("kubeConfig")
  private IoOpenshiftConfigV1AuthenticationSpecKubeConfig kubeConfig = null;

  public IoOpenshiftConfigV1AuthenticationSpecWebhookTokenAuthenticators kubeConfig(IoOpenshiftConfigV1AuthenticationSpecKubeConfig kubeConfig) {
    this.kubeConfig = kubeConfig;
    return this;
  }

   /**
   * Get kubeConfig
   * @return kubeConfig
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1AuthenticationSpecKubeConfig getKubeConfig() {
    return kubeConfig;
  }

  public void setKubeConfig(IoOpenshiftConfigV1AuthenticationSpecKubeConfig kubeConfig) {
    this.kubeConfig = kubeConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1AuthenticationSpecWebhookTokenAuthenticators ioOpenshiftConfigV1AuthenticationSpecWebhookTokenAuthenticators = (IoOpenshiftConfigV1AuthenticationSpecWebhookTokenAuthenticators) o;
    return Objects.equals(this.kubeConfig, ioOpenshiftConfigV1AuthenticationSpecWebhookTokenAuthenticators.kubeConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubeConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1AuthenticationSpecWebhookTokenAuthenticators {\n");
    
    sb.append("    kubeConfig: ").append(toIndentedString(kubeConfig)).append("\n");
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

