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
 * WindowsSecurityContextOptions contain Windows-specific options and credentials.
 */
@ApiModel(description = "WindowsSecurityContextOptions contain Windows-specific options and credentials.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1WindowsSecurityContextOptions {
  @SerializedName("gmsaCredentialSpec")
  private String gmsaCredentialSpec = null;

  @SerializedName("gmsaCredentialSpecName")
  private String gmsaCredentialSpecName = null;

  @SerializedName("runAsUserName")
  private String runAsUserName = null;

  public IoK8sApiCoreV1WindowsSecurityContextOptions gmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return this;
  }

   /**
   * GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
   * @return gmsaCredentialSpec
  **/
  @ApiModelProperty(value = "GMSACredentialSpec is where the GMSA admission webhook (https://github.com/kubernetes-sigs/windows-gmsa) inlines the contents of the GMSA credential spec named by the GMSACredentialSpecName field. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.")
  public String getGmsaCredentialSpec() {
    return gmsaCredentialSpec;
  }

  public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
  }

  public IoK8sApiCoreV1WindowsSecurityContextOptions gmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return this;
  }

   /**
   * GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.
   * @return gmsaCredentialSpecName
  **/
  @ApiModelProperty(value = "GMSACredentialSpecName is the name of the GMSA credential spec to use. This field is alpha-level and is only honored by servers that enable the WindowsGMSA feature flag.")
  public String getGmsaCredentialSpecName() {
    return gmsaCredentialSpecName;
  }

  public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
  }

  public IoK8sApiCoreV1WindowsSecurityContextOptions runAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
    return this;
  }

   /**
   * The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.
   * @return runAsUserName
  **/
  @ApiModelProperty(value = "The UserName in Windows to run the entrypoint of the container process. Defaults to the user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. This field is alpha-level and it is only honored by servers that enable the WindowsRunAsUserName feature flag.")
  public String getRunAsUserName() {
    return runAsUserName;
  }

  public void setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1WindowsSecurityContextOptions ioK8sApiCoreV1WindowsSecurityContextOptions = (IoK8sApiCoreV1WindowsSecurityContextOptions) o;
    return Objects.equals(this.gmsaCredentialSpec, ioK8sApiCoreV1WindowsSecurityContextOptions.gmsaCredentialSpec) &&
        Objects.equals(this.gmsaCredentialSpecName, ioK8sApiCoreV1WindowsSecurityContextOptions.gmsaCredentialSpecName) &&
        Objects.equals(this.runAsUserName, ioK8sApiCoreV1WindowsSecurityContextOptions.runAsUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmsaCredentialSpec, gmsaCredentialSpecName, runAsUserName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1WindowsSecurityContextOptions {\n");
    
    sb.append("    gmsaCredentialSpec: ").append(toIndentedString(gmsaCredentialSpec)).append("\n");
    sb.append("    gmsaCredentialSpecName: ").append(toIndentedString(gmsaCredentialSpecName)).append("\n");
    sb.append("    runAsUserName: ").append(toIndentedString(runAsUserName)).append("\n");
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
