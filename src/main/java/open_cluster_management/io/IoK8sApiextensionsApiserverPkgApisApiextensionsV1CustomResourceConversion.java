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
import open_cluster_management.io.IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion;

/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 */
@ApiModel(description = "CustomResourceConversion describes how to convert different versions of a CR.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion {
  @SerializedName("strategy")
  private String strategy = null;

  @SerializedName("webhook")
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion webhook = null;

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * strategy specifies how custom resources are converted between versions. Allowed values are: - &#x60;None&#x60;: The converter only change the apiVersion and would not touch any other field in the custom resource. - &#x60;Webhook&#x60;: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
   * @return strategy
  **/
  @ApiModelProperty(required = true, value = "strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion webhook(IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion webhook) {
    this.webhook = webhook;
    return this;
  }

   /**
   * webhook describes how to call the conversion webhook. Required when &#x60;strategy&#x60; is set to &#x60;Webhook&#x60;.
   * @return webhook
  **/
  @ApiModelProperty(value = "webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion getWebhook() {
    return webhook;
  }

  public void setWebhook(IoK8sApiextensionsApiserverPkgApisApiextensionsV1WebhookConversion webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion = (IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion) o;
    return Objects.equals(this.strategy, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion.strategy) &&
        Objects.equals(this.webhook, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion {\n");
    
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

