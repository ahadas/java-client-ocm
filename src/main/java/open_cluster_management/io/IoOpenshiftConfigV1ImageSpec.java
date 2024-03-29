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
import open_cluster_management.io.IoOpenshiftConfigV1ImageSpecAdditionalTrustedCA;
import open_cluster_management.io.IoOpenshiftConfigV1ImageSpecAllowedRegistriesForImport;
import open_cluster_management.io.IoOpenshiftConfigV1ImageSpecRegistrySources;

/**
 * spec holds user settable values for configuration
 */
@ApiModel(description = "spec holds user settable values for configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1ImageSpec {
  @SerializedName("additionalTrustedCA")
  private IoOpenshiftConfigV1ImageSpecAdditionalTrustedCA additionalTrustedCA = null;

  @SerializedName("allowedRegistriesForImport")
  private List<IoOpenshiftConfigV1ImageSpecAllowedRegistriesForImport> allowedRegistriesForImport = null;

  @SerializedName("externalRegistryHostnames")
  private List<String> externalRegistryHostnames = null;

  @SerializedName("registrySources")
  private IoOpenshiftConfigV1ImageSpecRegistrySources registrySources = null;

  public IoOpenshiftConfigV1ImageSpec additionalTrustedCA(IoOpenshiftConfigV1ImageSpecAdditionalTrustedCA additionalTrustedCA) {
    this.additionalTrustedCA = additionalTrustedCA;
    return this;
  }

   /**
   * Get additionalTrustedCA
   * @return additionalTrustedCA
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1ImageSpecAdditionalTrustedCA getAdditionalTrustedCA() {
    return additionalTrustedCA;
  }

  public void setAdditionalTrustedCA(IoOpenshiftConfigV1ImageSpecAdditionalTrustedCA additionalTrustedCA) {
    this.additionalTrustedCA = additionalTrustedCA;
  }

  public IoOpenshiftConfigV1ImageSpec allowedRegistriesForImport(List<IoOpenshiftConfigV1ImageSpecAllowedRegistriesForImport> allowedRegistriesForImport) {
    this.allowedRegistriesForImport = allowedRegistriesForImport;
    return this;
  }

  public IoOpenshiftConfigV1ImageSpec addAllowedRegistriesForImportItem(IoOpenshiftConfigV1ImageSpecAllowedRegistriesForImport allowedRegistriesForImportItem) {
    if (this.allowedRegistriesForImport == null) {
      this.allowedRegistriesForImport = new ArrayList<>();
    }
    this.allowedRegistriesForImport.add(allowedRegistriesForImportItem);
    return this;
  }

   /**
   * allowedRegistriesForImport limits the container image registries that normal users may import images from. Set this list to the registries that you trust to contain valid Docker images and that you want applications to be able to import from. Users with permission to create Images or ImageStreamMappings via the API are not affected by this policy - typically only administrators or system integrations will have those permissions.
   * @return allowedRegistriesForImport
  **/
  @ApiModelProperty(value = "allowedRegistriesForImport limits the container image registries that normal users may import images from. Set this list to the registries that you trust to contain valid Docker images and that you want applications to be able to import from. Users with permission to create Images or ImageStreamMappings via the API are not affected by this policy - typically only administrators or system integrations will have those permissions.")
  public List<IoOpenshiftConfigV1ImageSpecAllowedRegistriesForImport> getAllowedRegistriesForImport() {
    return allowedRegistriesForImport;
  }

  public void setAllowedRegistriesForImport(List<IoOpenshiftConfigV1ImageSpecAllowedRegistriesForImport> allowedRegistriesForImport) {
    this.allowedRegistriesForImport = allowedRegistriesForImport;
  }

  public IoOpenshiftConfigV1ImageSpec externalRegistryHostnames(List<String> externalRegistryHostnames) {
    this.externalRegistryHostnames = externalRegistryHostnames;
    return this;
  }

  public IoOpenshiftConfigV1ImageSpec addExternalRegistryHostnamesItem(String externalRegistryHostnamesItem) {
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

  public IoOpenshiftConfigV1ImageSpec registrySources(IoOpenshiftConfigV1ImageSpecRegistrySources registrySources) {
    this.registrySources = registrySources;
    return this;
  }

   /**
   * Get registrySources
   * @return registrySources
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1ImageSpecRegistrySources getRegistrySources() {
    return registrySources;
  }

  public void setRegistrySources(IoOpenshiftConfigV1ImageSpecRegistrySources registrySources) {
    this.registrySources = registrySources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1ImageSpec ioOpenshiftConfigV1ImageSpec = (IoOpenshiftConfigV1ImageSpec) o;
    return Objects.equals(this.additionalTrustedCA, ioOpenshiftConfigV1ImageSpec.additionalTrustedCA) &&
        Objects.equals(this.allowedRegistriesForImport, ioOpenshiftConfigV1ImageSpec.allowedRegistriesForImport) &&
        Objects.equals(this.externalRegistryHostnames, ioOpenshiftConfigV1ImageSpec.externalRegistryHostnames) &&
        Objects.equals(this.registrySources, ioOpenshiftConfigV1ImageSpec.registrySources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalTrustedCA, allowedRegistriesForImport, externalRegistryHostnames, registrySources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1ImageSpec {\n");
    
    sb.append("    additionalTrustedCA: ").append(toIndentedString(additionalTrustedCA)).append("\n");
    sb.append("    allowedRegistriesForImport: ").append(toIndentedString(allowedRegistriesForImport)).append("\n");
    sb.append("    externalRegistryHostnames: ").append(toIndentedString(externalRegistryHostnames)).append("\n");
    sb.append("    registrySources: ").append(toIndentedString(registrySources)).append("\n");
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

