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
 * ConsoleExternalLogLinkSpec is the desired log link configuration. The log link will appear on the logs tab of the pod details page.
 */
@ApiModel(description = "ConsoleExternalLogLinkSpec is the desired log link configuration. The log link will appear on the logs tab of the pod details page.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConsoleV1ConsoleExternalLogLinkSpec {
  @SerializedName("hrefTemplate")
  private String hrefTemplate = null;

  @SerializedName("namespaceFilter")
  private String namespaceFilter = null;

  @SerializedName("text")
  private String text = null;

  public IoOpenshiftConsoleV1ConsoleExternalLogLinkSpec hrefTemplate(String hrefTemplate) {
    this.hrefTemplate = hrefTemplate;
    return this;
  }

   /**
   * hrefTemplate is an absolute secure URL (must use https) for the log link including variables to be replaced. Variables are specified in the URL with the format ${variableName}, for instance, ${containerName} and will be replaced with the corresponding values from the resource. Resource is a pod. Supported variables are: - ${resourceName} - name of the resource which containes the logs - ${resourceUID} - UID of the resource which contains the logs               - e.g. &#x60;11111111-2222-3333-4444-555555555555&#x60; - ${containerName} - name of the resource&#39;s container that contains the logs - ${resourceNamespace} - namespace of the resource that contains the logs - ${resourceNamespaceUID} - namespace UID of the resource that contains the logs - ${podLabels} - JSON representation of labels matching the pod with the logs             - e.g. &#x60;{\&quot;key1\&quot;:\&quot;value1\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;}&#x60;   e.g., https://example.com/logs?resourceName&#x3D;${resourceName}&amp;containerName&#x3D;${containerName}&amp;resourceNamespace&#x3D;${resourceNamespace}&amp;podLabels&#x3D;${podLabels}
   * @return hrefTemplate
  **/
  @ApiModelProperty(required = true, value = "hrefTemplate is an absolute secure URL (must use https) for the log link including variables to be replaced. Variables are specified in the URL with the format ${variableName}, for instance, ${containerName} and will be replaced with the corresponding values from the resource. Resource is a pod. Supported variables are: - ${resourceName} - name of the resource which containes the logs - ${resourceUID} - UID of the resource which contains the logs               - e.g. `11111111-2222-3333-4444-555555555555` - ${containerName} - name of the resource's container that contains the logs - ${resourceNamespace} - namespace of the resource that contains the logs - ${resourceNamespaceUID} - namespace UID of the resource that contains the logs - ${podLabels} - JSON representation of labels matching the pod with the logs             - e.g. `{\"key1\":\"value1\",\"key2\":\"value2\"}`   e.g., https://example.com/logs?resourceName=${resourceName}&containerName=${containerName}&resourceNamespace=${resourceNamespace}&podLabels=${podLabels}")
  public String getHrefTemplate() {
    return hrefTemplate;
  }

  public void setHrefTemplate(String hrefTemplate) {
    this.hrefTemplate = hrefTemplate;
  }

  public IoOpenshiftConsoleV1ConsoleExternalLogLinkSpec namespaceFilter(String namespaceFilter) {
    this.namespaceFilter = namespaceFilter;
    return this;
  }

   /**
   * namespaceFilter is a regular expression used to restrict a log link to a matching set of namespaces (e.g., &#x60;^openshift-&#x60;). The string is converted into a regular expression using the JavaScript RegExp constructor. If not specified, links will be displayed for all the namespaces.
   * @return namespaceFilter
  **/
  @ApiModelProperty(value = "namespaceFilter is a regular expression used to restrict a log link to a matching set of namespaces (e.g., `^openshift-`). The string is converted into a regular expression using the JavaScript RegExp constructor. If not specified, links will be displayed for all the namespaces.")
  public String getNamespaceFilter() {
    return namespaceFilter;
  }

  public void setNamespaceFilter(String namespaceFilter) {
    this.namespaceFilter = namespaceFilter;
  }

  public IoOpenshiftConsoleV1ConsoleExternalLogLinkSpec text(String text) {
    this.text = text;
    return this;
  }

   /**
   * text is the display text for the link
   * @return text
  **/
  @ApiModelProperty(required = true, value = "text is the display text for the link")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConsoleV1ConsoleExternalLogLinkSpec ioOpenshiftConsoleV1ConsoleExternalLogLinkSpec = (IoOpenshiftConsoleV1ConsoleExternalLogLinkSpec) o;
    return Objects.equals(this.hrefTemplate, ioOpenshiftConsoleV1ConsoleExternalLogLinkSpec.hrefTemplate) &&
        Objects.equals(this.namespaceFilter, ioOpenshiftConsoleV1ConsoleExternalLogLinkSpec.namespaceFilter) &&
        Objects.equals(this.text, ioOpenshiftConsoleV1ConsoleExternalLogLinkSpec.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hrefTemplate, namespaceFilter, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConsoleV1ConsoleExternalLogLinkSpec {\n");
    
    sb.append("    hrefTemplate: ").append(toIndentedString(hrefTemplate)).append("\n");
    sb.append("    namespaceFilter: ").append(toIndentedString(namespaceFilter)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
