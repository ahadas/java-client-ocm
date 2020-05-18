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
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;

/**
 * DeploymentTriggerImageChangeParams represents the parameters to the ImageChange trigger.
 */
@ApiModel(description = "DeploymentTriggerImageChangeParams represents the parameters to the ImageChange trigger.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams {
  @SerializedName("automatic")
  private Boolean automatic = null;

  @SerializedName("containerNames")
  private List<String> containerNames = null;

  @SerializedName("from")
  private IoK8sApiCoreV1ObjectReference from = null;

  @SerializedName("lastTriggeredImage")
  private String lastTriggeredImage = null;

  public ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams automatic(Boolean automatic) {
    this.automatic = automatic;
    return this;
  }

   /**
   * Automatic means that the detection of a new tag value should result in an image update inside the pod template.
   * @return automatic
  **/
  @ApiModelProperty(value = "Automatic means that the detection of a new tag value should result in an image update inside the pod template.")
  public Boolean isAutomatic() {
    return automatic;
  }

  public void setAutomatic(Boolean automatic) {
    this.automatic = automatic;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams containerNames(List<String> containerNames) {
    this.containerNames = containerNames;
    return this;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams addContainerNamesItem(String containerNamesItem) {
    if (this.containerNames == null) {
      this.containerNames = new ArrayList<>();
    }
    this.containerNames.add(containerNamesItem);
    return this;
  }

   /**
   * ContainerNames is used to restrict tag updates to the specified set of container names in a pod. If multiple triggers point to the same containers, the resulting behavior is undefined. Future API versions will make this a validation error. If ContainerNames does not point to a valid container, the trigger will be ignored. Future API versions will make this a validation error.
   * @return containerNames
  **/
  @ApiModelProperty(value = "ContainerNames is used to restrict tag updates to the specified set of container names in a pod. If multiple triggers point to the same containers, the resulting behavior is undefined. Future API versions will make this a validation error. If ContainerNames does not point to a valid container, the trigger will be ignored. Future API versions will make this a validation error.")
  public List<String> getContainerNames() {
    return containerNames;
  }

  public void setContainerNames(List<String> containerNames) {
    this.containerNames = containerNames;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams from(IoK8sApiCoreV1ObjectReference from) {
    this.from = from;
    return this;
  }

   /**
   * From is a reference to an image stream tag to watch for changes. From.Name is the only required subfield - if From.Namespace is blank, the namespace of the current deployment trigger will be used.
   * @return from
  **/
  @ApiModelProperty(required = true, value = "From is a reference to an image stream tag to watch for changes. From.Name is the only required subfield - if From.Namespace is blank, the namespace of the current deployment trigger will be used.")
  public IoK8sApiCoreV1ObjectReference getFrom() {
    return from;
  }

  public void setFrom(IoK8sApiCoreV1ObjectReference from) {
    this.from = from;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams lastTriggeredImage(String lastTriggeredImage) {
    this.lastTriggeredImage = lastTriggeredImage;
    return this;
  }

   /**
   * LastTriggeredImage is the last image to be triggered.
   * @return lastTriggeredImage
  **/
  @ApiModelProperty(value = "LastTriggeredImage is the last image to be triggered.")
  public String getLastTriggeredImage() {
    return lastTriggeredImage;
  }

  public void setLastTriggeredImage(String lastTriggeredImage) {
    this.lastTriggeredImage = lastTriggeredImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams comGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams = (ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams) o;
    return Objects.equals(this.automatic, comGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams.automatic) &&
        Objects.equals(this.containerNames, comGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams.containerNames) &&
        Objects.equals(this.from, comGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams.from) &&
        Objects.equals(this.lastTriggeredImage, comGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams.lastTriggeredImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automatic, containerNames, from, lastTriggeredImage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAppsV1DeploymentTriggerImageChangeParams {\n");
    
    sb.append("    automatic: ").append(toIndentedString(automatic)).append("\n");
    sb.append("    containerNames: ").append(toIndentedString(containerNames)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    lastTriggeredImage: ").append(toIndentedString(lastTriggeredImage)).append("\n");
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
