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
 * Maps a string key to a path within a volume.
 */
@ApiModel(description = "Maps a string key to a path within a volume.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems {
  @SerializedName("key")
  private String key = null;

  @SerializedName("mode")
  private Integer mode = null;

  @SerializedName("path")
  private String path = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key to project.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The key to project.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems mode(Integer mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return mode
  **/
  @ApiModelProperty(value = "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems) o;
    return Objects.equals(this.key, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems.key) &&
        Objects.equals(this.mode, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems.mode) &&
        Objects.equals(this.path, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, mode, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecConfigMapItems {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

