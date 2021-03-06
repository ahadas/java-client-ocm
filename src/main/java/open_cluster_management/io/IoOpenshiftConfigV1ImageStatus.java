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

/**
 * status holds observed values from the cluster. They may not be overridden.
 */
@ApiModel(description = "status holds observed values from the cluster. They may not be overridden.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1ImageStatus {
  @SerializedName("externalRegistryHostnames")
  private List<String> externalRegistryHostnames = null;

  @SerializedName("internalRegistryHostname")
  private String internalRegistryHostname = null;

  public IoOpenshiftConfigV1ImageStatus externalRegistryHostnames(List<String> externalRegistryHostnames) {
    this.externalRegistryHostnames = externalRegistryHostnames;
    return this;
  }

  public IoOpenshiftConfigV1ImageStatus addExternalRegistryHostnamesItem(String externalRegistryHostnamesItem) {
    if (this.externalRegistryHostnames == null) {
      this.externalRegistryHostnames = new ArrayList<>();
    }
    this.externalRegistryHostnames.add(externalRegistryHostnamesItem);
    return this;
  }

   /**
   * externalRegistryHostnames provides the hostnames for the default external image registry. The external hostname should be set only when the image registry is exposed externally. The first value is used in &#39;publicDockerImageRepository&#39; field in ImageStreams. The value must be in \&quot;hostname[:port]\&quot; format.
   * @return externalRegistryHostnames
  **/
  @ApiModelProperty(value = "externalRegistryHostnames provides the hostnames for the default external image registry. The external hostname should be set only when the image registry is exposed externally. The first value is used in 'publicDockerImageRepository' field in ImageStreams. The value must be in \"hostname[:port]\" format.")
  public List<String> getExternalRegistryHostnames() {
    return externalRegistryHostnames;
  }

  public void setExternalRegistryHostnames(List<String> externalRegistryHostnames) {
    this.externalRegistryHostnames = externalRegistryHostnames;
  }

  public IoOpenshiftConfigV1ImageStatus internalRegistryHostname(String internalRegistryHostname) {
    this.internalRegistryHostname = internalRegistryHostname;
    return this;
  }

   /**
   * internalRegistryHostname sets the hostname for the default internal image registry. The value must be in \&quot;hostname[:port]\&quot; format. This value is set by the image registry operator which controls the internal registry hostname. For backward compatibility, users can still use OPENSHIFT_DEFAULT_REGISTRY environment variable but this setting overrides the environment variable.
   * @return internalRegistryHostname
  **/
  @ApiModelProperty(value = "internalRegistryHostname sets the hostname for the default internal image registry. The value must be in \"hostname[:port]\" format. This value is set by the image registry operator which controls the internal registry hostname. For backward compatibility, users can still use OPENSHIFT_DEFAULT_REGISTRY environment variable but this setting overrides the environment variable.")
  public String getInternalRegistryHostname() {
    return internalRegistryHostname;
  }

  public void setInternalRegistryHostname(String internalRegistryHostname) {
    this.internalRegistryHostname = internalRegistryHostname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1ImageStatus ioOpenshiftConfigV1ImageStatus = (IoOpenshiftConfigV1ImageStatus) o;
    return Objects.equals(this.externalRegistryHostnames, ioOpenshiftConfigV1ImageStatus.externalRegistryHostnames) &&
        Objects.equals(this.internalRegistryHostname, ioOpenshiftConfigV1ImageStatus.internalRegistryHostname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalRegistryHostnames, internalRegistryHostname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1ImageStatus {\n");
    
    sb.append("    externalRegistryHostnames: ").append(toIndentedString(externalRegistryHostnames)).append("\n");
    sb.append("    internalRegistryHostname: ").append(toIndentedString(internalRegistryHostname)).append("\n");
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

