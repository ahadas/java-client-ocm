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
 * SELinuxOptions are the labels to be applied to the container
 */
@ApiModel(description = "SELinuxOptions are the labels to be applied to the container")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1SELinuxOptions {
  @SerializedName("level")
  private String level = null;

  @SerializedName("role")
  private String role = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("user")
  private String user = null;

  public IoK8sApiCoreV1SELinuxOptions level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Level is SELinux level label that applies to the container.
   * @return level
  **/
  @ApiModelProperty(value = "Level is SELinux level label that applies to the container.")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public IoK8sApiCoreV1SELinuxOptions role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Role is a SELinux role label that applies to the container.
   * @return role
  **/
  @ApiModelProperty(value = "Role is a SELinux role label that applies to the container.")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public IoK8sApiCoreV1SELinuxOptions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type is a SELinux type label that applies to the container.
   * @return type
  **/
  @ApiModelProperty(value = "Type is a SELinux type label that applies to the container.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoK8sApiCoreV1SELinuxOptions user(String user) {
    this.user = user;
    return this;
  }

   /**
   * User is a SELinux user label that applies to the container.
   * @return user
  **/
  @ApiModelProperty(value = "User is a SELinux user label that applies to the container.")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1SELinuxOptions ioK8sApiCoreV1SELinuxOptions = (IoK8sApiCoreV1SELinuxOptions) o;
    return Objects.equals(this.level, ioK8sApiCoreV1SELinuxOptions.level) &&
        Objects.equals(this.role, ioK8sApiCoreV1SELinuxOptions.role) &&
        Objects.equals(this.type, ioK8sApiCoreV1SELinuxOptions.type) &&
        Objects.equals(this.user, ioK8sApiCoreV1SELinuxOptions.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, role, type, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SELinuxOptions {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

