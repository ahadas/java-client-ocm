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
 * statuspage contains ID for statuspage.io page that provides status info about.
 */
@ApiModel(description = "statuspage contains ID for statuspage.io page that provides status info about.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorV1ConsoleSpecProvidersStatuspage {
  @SerializedName("pageID")
  private String pageID = null;

  public IoOpenshiftOperatorV1ConsoleSpecProvidersStatuspage pageID(String pageID) {
    this.pageID = pageID;
    return this;
  }

   /**
   * pageID is the unique ID assigned by Statuspage for your page. This must be a public page.
   * @return pageID
  **/
  @ApiModelProperty(value = "pageID is the unique ID assigned by Statuspage for your page. This must be a public page.")
  public String getPageID() {
    return pageID;
  }

  public void setPageID(String pageID) {
    this.pageID = pageID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorV1ConsoleSpecProvidersStatuspage ioOpenshiftOperatorV1ConsoleSpecProvidersStatuspage = (IoOpenshiftOperatorV1ConsoleSpecProvidersStatuspage) o;
    return Objects.equals(this.pageID, ioOpenshiftOperatorV1ConsoleSpecProvidersStatuspage.pageID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorV1ConsoleSpecProvidersStatuspage {\n");
    
    sb.append("    pageID: ").append(toIndentedString(pageID)).append("\n");
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
