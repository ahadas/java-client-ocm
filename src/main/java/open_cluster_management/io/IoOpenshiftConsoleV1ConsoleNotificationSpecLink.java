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
 * link is an object that holds notification link details.
 */
@ApiModel(description = "link is an object that holds notification link details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConsoleV1ConsoleNotificationSpecLink {
  @SerializedName("href")
  private String href = null;

  @SerializedName("text")
  private String text = null;

  public IoOpenshiftConsoleV1ConsoleNotificationSpecLink href(String href) {
    this.href = href;
    return this;
  }

   /**
   * href is the absolute secure URL for the link (must use https)
   * @return href
  **/
  @ApiModelProperty(required = true, value = "href is the absolute secure URL for the link (must use https)")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public IoOpenshiftConsoleV1ConsoleNotificationSpecLink text(String text) {
    this.text = text;
    return this;
  }

   /**
   * text is the display text for the link
   * @return text
  **/
  @ApiModelProperty(required = true, value = "text is the display text for the link")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConsoleV1ConsoleNotificationSpecLink ioOpenshiftConsoleV1ConsoleNotificationSpecLink = (IoOpenshiftConsoleV1ConsoleNotificationSpecLink) o;
    return Objects.equals(this.href, ioOpenshiftConsoleV1ConsoleNotificationSpecLink.href) &&
        Objects.equals(this.text, ioOpenshiftConsoleV1ConsoleNotificationSpecLink.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConsoleV1ConsoleNotificationSpecLink {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
