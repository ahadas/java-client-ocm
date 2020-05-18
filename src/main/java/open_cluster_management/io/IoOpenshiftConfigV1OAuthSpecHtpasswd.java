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
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecHtpasswdFileData;

/**
 * htpasswd enables user authentication using an HTPasswd file to validate credentials
 */
@ApiModel(description = "htpasswd enables user authentication using an HTPasswd file to validate credentials")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1OAuthSpecHtpasswd {
  @SerializedName("fileData")
  private IoOpenshiftConfigV1OAuthSpecHtpasswdFileData fileData = null;

  public IoOpenshiftConfigV1OAuthSpecHtpasswd fileData(IoOpenshiftConfigV1OAuthSpecHtpasswdFileData fileData) {
    this.fileData = fileData;
    return this;
  }

   /**
   * Get fileData
   * @return fileData
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecHtpasswdFileData getFileData() {
    return fileData;
  }

  public void setFileData(IoOpenshiftConfigV1OAuthSpecHtpasswdFileData fileData) {
    this.fileData = fileData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1OAuthSpecHtpasswd ioOpenshiftConfigV1OAuthSpecHtpasswd = (IoOpenshiftConfigV1OAuthSpecHtpasswd) o;
    return Objects.equals(this.fileData, ioOpenshiftConfigV1OAuthSpecHtpasswd.fileData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1OAuthSpecHtpasswd {\n");
    
    sb.append("    fileData: ").append(toIndentedString(fileData)).append("\n");
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

