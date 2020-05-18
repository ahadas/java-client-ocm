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
 * ConfigSpec contains the desired configuration and state for the Samples Operator, controlling various behavior around the imagestreams and templates it creates/updates in the openshift namespace.
 */
@ApiModel(description = "ConfigSpec contains the desired configuration and state for the Samples Operator, controlling various behavior around the imagestreams and templates it creates/updates in the openshift namespace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorSamplesV1ConfigSpec {
  @SerializedName("architectures")
  private List<String> architectures = null;

  @SerializedName("managementState")
  private String managementState = null;

  @SerializedName("samplesRegistry")
  private String samplesRegistry = null;

  @SerializedName("skippedImagestreams")
  private List<String> skippedImagestreams = null;

  @SerializedName("skippedTemplates")
  private List<String> skippedTemplates = null;

  public IoOpenshiftOperatorSamplesV1ConfigSpec architectures(List<String> architectures) {
    this.architectures = architectures;
    return this;
  }

  public IoOpenshiftOperatorSamplesV1ConfigSpec addArchitecturesItem(String architecturesItem) {
    if (this.architectures == null) {
      this.architectures = new ArrayList<>();
    }
    this.architectures.add(architecturesItem);
    return this;
  }

   /**
   * architectures determine which hardware architecture(s) to install, where x86_64, ppc64le, and s390x are the only supported choices currently.
   * @return architectures
  **/
  @ApiModelProperty(value = "architectures determine which hardware architecture(s) to install, where x86_64, ppc64le, and s390x are the only supported choices currently.")
  public List<String> getArchitectures() {
    return architectures;
  }

  public void setArchitectures(List<String> architectures) {
    this.architectures = architectures;
  }

  public IoOpenshiftOperatorSamplesV1ConfigSpec managementState(String managementState) {
    this.managementState = managementState;
    return this;
  }

   /**
   * managementState is top level on/off type of switch for all operators. When \&quot;Managed\&quot;, this operator processes config and manipulates the samples accordingly. When \&quot;Unmanaged\&quot;, this operator ignores any updates to the resources it watches. When \&quot;Removed\&quot;, it reacts that same wasy as it does if the Config object is deleted, meaning any ImageStreams or Templates it manages (i.e. it honors the skipped lists) and the registry secret are deleted, along with the ConfigMap in the operator&#39;s namespace that represents the last config used to manipulate the samples,
   * @return managementState
  **/
  @ApiModelProperty(value = "managementState is top level on/off type of switch for all operators. When \"Managed\", this operator processes config and manipulates the samples accordingly. When \"Unmanaged\", this operator ignores any updates to the resources it watches. When \"Removed\", it reacts that same wasy as it does if the Config object is deleted, meaning any ImageStreams or Templates it manages (i.e. it honors the skipped lists) and the registry secret are deleted, along with the ConfigMap in the operator's namespace that represents the last config used to manipulate the samples,")
  public String getManagementState() {
    return managementState;
  }

  public void setManagementState(String managementState) {
    this.managementState = managementState;
  }

  public IoOpenshiftOperatorSamplesV1ConfigSpec samplesRegistry(String samplesRegistry) {
    this.samplesRegistry = samplesRegistry;
    return this;
  }

   /**
   * samplesRegistry allows for the specification of which registry is accessed by the ImageStreams for their image content.  Defaults on the content in https://github.com/openshift/library that are pulled into this github repository, but based on our pulling only ocp content it typically defaults to registry.redhat.io.
   * @return samplesRegistry
  **/
  @ApiModelProperty(value = "samplesRegistry allows for the specification of which registry is accessed by the ImageStreams for their image content.  Defaults on the content in https://github.com/openshift/library that are pulled into this github repository, but based on our pulling only ocp content it typically defaults to registry.redhat.io.")
  public String getSamplesRegistry() {
    return samplesRegistry;
  }

  public void setSamplesRegistry(String samplesRegistry) {
    this.samplesRegistry = samplesRegistry;
  }

  public IoOpenshiftOperatorSamplesV1ConfigSpec skippedImagestreams(List<String> skippedImagestreams) {
    this.skippedImagestreams = skippedImagestreams;
    return this;
  }

  public IoOpenshiftOperatorSamplesV1ConfigSpec addSkippedImagestreamsItem(String skippedImagestreamsItem) {
    if (this.skippedImagestreams == null) {
      this.skippedImagestreams = new ArrayList<>();
    }
    this.skippedImagestreams.add(skippedImagestreamsItem);
    return this;
  }

   /**
   * skippedImagestreams specifies names of image streams that should NOT be created/updated.  Admins can use this to allow them to delete content they don’t want.  They will still have to manually delete the content but the operator will not recreate(or update) anything listed here.
   * @return skippedImagestreams
  **/
  @ApiModelProperty(value = "skippedImagestreams specifies names of image streams that should NOT be created/updated.  Admins can use this to allow them to delete content they don’t want.  They will still have to manually delete the content but the operator will not recreate(or update) anything listed here.")
  public List<String> getSkippedImagestreams() {
    return skippedImagestreams;
  }

  public void setSkippedImagestreams(List<String> skippedImagestreams) {
    this.skippedImagestreams = skippedImagestreams;
  }

  public IoOpenshiftOperatorSamplesV1ConfigSpec skippedTemplates(List<String> skippedTemplates) {
    this.skippedTemplates = skippedTemplates;
    return this;
  }

  public IoOpenshiftOperatorSamplesV1ConfigSpec addSkippedTemplatesItem(String skippedTemplatesItem) {
    if (this.skippedTemplates == null) {
      this.skippedTemplates = new ArrayList<>();
    }
    this.skippedTemplates.add(skippedTemplatesItem);
    return this;
  }

   /**
   * skippedTemplates specifies names of templates that should NOT be created/updated.  Admins can use this to allow them to delete content they don’t want.  They will still have to manually delete the content but the operator will not recreate(or update) anything listed here.
   * @return skippedTemplates
  **/
  @ApiModelProperty(value = "skippedTemplates specifies names of templates that should NOT be created/updated.  Admins can use this to allow them to delete content they don’t want.  They will still have to manually delete the content but the operator will not recreate(or update) anything listed here.")
  public List<String> getSkippedTemplates() {
    return skippedTemplates;
  }

  public void setSkippedTemplates(List<String> skippedTemplates) {
    this.skippedTemplates = skippedTemplates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorSamplesV1ConfigSpec ioOpenshiftOperatorSamplesV1ConfigSpec = (IoOpenshiftOperatorSamplesV1ConfigSpec) o;
    return Objects.equals(this.architectures, ioOpenshiftOperatorSamplesV1ConfigSpec.architectures) &&
        Objects.equals(this.managementState, ioOpenshiftOperatorSamplesV1ConfigSpec.managementState) &&
        Objects.equals(this.samplesRegistry, ioOpenshiftOperatorSamplesV1ConfigSpec.samplesRegistry) &&
        Objects.equals(this.skippedImagestreams, ioOpenshiftOperatorSamplesV1ConfigSpec.skippedImagestreams) &&
        Objects.equals(this.skippedTemplates, ioOpenshiftOperatorSamplesV1ConfigSpec.skippedTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architectures, managementState, samplesRegistry, skippedImagestreams, skippedTemplates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorSamplesV1ConfigSpec {\n");
    
    sb.append("    architectures: ").append(toIndentedString(architectures)).append("\n");
    sb.append("    managementState: ").append(toIndentedString(managementState)).append("\n");
    sb.append("    samplesRegistry: ").append(toIndentedString(samplesRegistry)).append("\n");
    sb.append("    skippedImagestreams: ").append(toIndentedString(skippedImagestreams)).append("\n");
    sb.append("    skippedTemplates: ").append(toIndentedString(skippedTemplates)).append("\n");
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

