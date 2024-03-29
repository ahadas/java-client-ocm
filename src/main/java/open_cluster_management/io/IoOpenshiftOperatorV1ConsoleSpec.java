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
import open_cluster_management.io.IoOpenshiftOperatorV1ConsoleSpecCustomization;
import open_cluster_management.io.IoOpenshiftOperatorV1ConsoleSpecProviders;

/**
 * ConsoleSpec is the specification of the desired behavior of the Console.
 */
@ApiModel(description = "ConsoleSpec is the specification of the desired behavior of the Console.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorV1ConsoleSpec {
  @SerializedName("customization")
  private IoOpenshiftOperatorV1ConsoleSpecCustomization customization = null;

  @SerializedName("logLevel")
  private String logLevel = null;

  @SerializedName("managementState")
  private String managementState = null;

  @SerializedName("observedConfig")
  private Object observedConfig = null;

  @SerializedName("operatorLogLevel")
  private String operatorLogLevel = null;

  @SerializedName("providers")
  private IoOpenshiftOperatorV1ConsoleSpecProviders providers = null;

  @SerializedName("unsupportedConfigOverrides")
  private Object unsupportedConfigOverrides = null;

  public IoOpenshiftOperatorV1ConsoleSpec customization(IoOpenshiftOperatorV1ConsoleSpecCustomization customization) {
    this.customization = customization;
    return this;
  }

   /**
   * Get customization
   * @return customization
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorV1ConsoleSpecCustomization getCustomization() {
    return customization;
  }

  public void setCustomization(IoOpenshiftOperatorV1ConsoleSpecCustomization customization) {
    this.customization = customization;
  }

  public IoOpenshiftOperatorV1ConsoleSpec logLevel(String logLevel) {
    this.logLevel = logLevel;
    return this;
  }

   /**
   * logLevel is an intent based logging for an overall component.  It does not give fine grained control, but it is a simple way to manage coarse grained logging choices that operators have to interpret for their operands.
   * @return logLevel
  **/
  @ApiModelProperty(value = "logLevel is an intent based logging for an overall component.  It does not give fine grained control, but it is a simple way to manage coarse grained logging choices that operators have to interpret for their operands.")
  public String getLogLevel() {
    return logLevel;
  }

  public void setLogLevel(String logLevel) {
    this.logLevel = logLevel;
  }

  public IoOpenshiftOperatorV1ConsoleSpec managementState(String managementState) {
    this.managementState = managementState;
    return this;
  }

   /**
   * managementState indicates whether and how the operator should manage the component
   * @return managementState
  **/
  @ApiModelProperty(value = "managementState indicates whether and how the operator should manage the component")
  public String getManagementState() {
    return managementState;
  }

  public void setManagementState(String managementState) {
    this.managementState = managementState;
  }

  public IoOpenshiftOperatorV1ConsoleSpec observedConfig(Object observedConfig) {
    this.observedConfig = observedConfig;
    return this;
  }

   /**
   * observedConfig holds a sparse config that controller has observed from the cluster state.  It exists in spec because it is an input to the level for the operator
   * @return observedConfig
  **/
  @ApiModelProperty(value = "observedConfig holds a sparse config that controller has observed from the cluster state.  It exists in spec because it is an input to the level for the operator")
  public Object getObservedConfig() {
    return observedConfig;
  }

  public void setObservedConfig(Object observedConfig) {
    this.observedConfig = observedConfig;
  }

  public IoOpenshiftOperatorV1ConsoleSpec operatorLogLevel(String operatorLogLevel) {
    this.operatorLogLevel = operatorLogLevel;
    return this;
  }

   /**
   * operatorLogLevel is an intent based logging for the operator itself.  It does not give fine grained control, but it is a simple way to manage coarse grained logging choices that operators have to interpret for themselves.
   * @return operatorLogLevel
  **/
  @ApiModelProperty(value = "operatorLogLevel is an intent based logging for the operator itself.  It does not give fine grained control, but it is a simple way to manage coarse grained logging choices that operators have to interpret for themselves.")
  public String getOperatorLogLevel() {
    return operatorLogLevel;
  }

  public void setOperatorLogLevel(String operatorLogLevel) {
    this.operatorLogLevel = operatorLogLevel;
  }

  public IoOpenshiftOperatorV1ConsoleSpec providers(IoOpenshiftOperatorV1ConsoleSpecProviders providers) {
    this.providers = providers;
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorV1ConsoleSpecProviders getProviders() {
    return providers;
  }

  public void setProviders(IoOpenshiftOperatorV1ConsoleSpecProviders providers) {
    this.providers = providers;
  }

  public IoOpenshiftOperatorV1ConsoleSpec unsupportedConfigOverrides(Object unsupportedConfigOverrides) {
    this.unsupportedConfigOverrides = unsupportedConfigOverrides;
    return this;
  }

   /**
   * unsupportedConfigOverrides holds a sparse config that will override any previously set options.  It only needs to be the fields to override it will end up overlaying in the following order: 1. hardcoded defaults 2. observedConfig 3. unsupportedConfigOverrides
   * @return unsupportedConfigOverrides
  **/
  @ApiModelProperty(value = "unsupportedConfigOverrides holds a sparse config that will override any previously set options.  It only needs to be the fields to override it will end up overlaying in the following order: 1. hardcoded defaults 2. observedConfig 3. unsupportedConfigOverrides")
  public Object getUnsupportedConfigOverrides() {
    return unsupportedConfigOverrides;
  }

  public void setUnsupportedConfigOverrides(Object unsupportedConfigOverrides) {
    this.unsupportedConfigOverrides = unsupportedConfigOverrides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorV1ConsoleSpec ioOpenshiftOperatorV1ConsoleSpec = (IoOpenshiftOperatorV1ConsoleSpec) o;
    return Objects.equals(this.customization, ioOpenshiftOperatorV1ConsoleSpec.customization) &&
        Objects.equals(this.logLevel, ioOpenshiftOperatorV1ConsoleSpec.logLevel) &&
        Objects.equals(this.managementState, ioOpenshiftOperatorV1ConsoleSpec.managementState) &&
        Objects.equals(this.observedConfig, ioOpenshiftOperatorV1ConsoleSpec.observedConfig) &&
        Objects.equals(this.operatorLogLevel, ioOpenshiftOperatorV1ConsoleSpec.operatorLogLevel) &&
        Objects.equals(this.providers, ioOpenshiftOperatorV1ConsoleSpec.providers) &&
        Objects.equals(this.unsupportedConfigOverrides, ioOpenshiftOperatorV1ConsoleSpec.unsupportedConfigOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customization, logLevel, managementState, observedConfig, operatorLogLevel, providers, unsupportedConfigOverrides);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorV1ConsoleSpec {\n");
    
    sb.append("    customization: ").append(toIndentedString(customization)).append("\n");
    sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
    sb.append("    managementState: ").append(toIndentedString(managementState)).append("\n");
    sb.append("    observedConfig: ").append(toIndentedString(observedConfig)).append("\n");
    sb.append("    operatorLogLevel: ").append(toIndentedString(operatorLogLevel)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    unsupportedConfigOverrides: ").append(toIndentedString(unsupportedConfigOverrides)).append("\n");
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

