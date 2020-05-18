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
import open_cluster_management.io.IoOpenshiftConsoleV1ConsoleNotificationSpecLink;

/**
 * ConsoleNotificationSpec is the desired console notification configuration.
 */
@ApiModel(description = "ConsoleNotificationSpec is the desired console notification configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConsoleV1ConsoleNotificationSpec {
  @SerializedName("backgroundColor")
  private String backgroundColor = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("link")
  private IoOpenshiftConsoleV1ConsoleNotificationSpecLink link = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("text")
  private String text = null;

  public IoOpenshiftConsoleV1ConsoleNotificationSpec backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * backgroundColor is the color of the background for the notification as CSS data type color.
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "backgroundColor is the color of the background for the notification as CSS data type color.")
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public IoOpenshiftConsoleV1ConsoleNotificationSpec color(String color) {
    this.color = color;
    return this;
  }

   /**
   * color is the color of the text for the notification as CSS data type color.
   * @return color
  **/
  @ApiModelProperty(value = "color is the color of the text for the notification as CSS data type color.")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public IoOpenshiftConsoleV1ConsoleNotificationSpec link(IoOpenshiftConsoleV1ConsoleNotificationSpecLink link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConsoleV1ConsoleNotificationSpecLink getLink() {
    return link;
  }

  public void setLink(IoOpenshiftConsoleV1ConsoleNotificationSpecLink link) {
    this.link = link;
  }

  public IoOpenshiftConsoleV1ConsoleNotificationSpec location(String location) {
    this.location = location;
    return this;
  }

   /**
   * location is the location of the notification in the console.
   * @return location
  **/
  @ApiModelProperty(value = "location is the location of the notification in the console.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public IoOpenshiftConsoleV1ConsoleNotificationSpec text(String text) {
    this.text = text;
    return this;
  }

   /**
   * text is the visible text of the notification.
   * @return text
  **/
  @ApiModelProperty(required = true, value = "text is the visible text of the notification.")
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
    IoOpenshiftConsoleV1ConsoleNotificationSpec ioOpenshiftConsoleV1ConsoleNotificationSpec = (IoOpenshiftConsoleV1ConsoleNotificationSpec) o;
    return Objects.equals(this.backgroundColor, ioOpenshiftConsoleV1ConsoleNotificationSpec.backgroundColor) &&
        Objects.equals(this.color, ioOpenshiftConsoleV1ConsoleNotificationSpec.color) &&
        Objects.equals(this.link, ioOpenshiftConsoleV1ConsoleNotificationSpec.link) &&
        Objects.equals(this.location, ioOpenshiftConsoleV1ConsoleNotificationSpec.location) &&
        Objects.equals(this.text, ioOpenshiftConsoleV1ConsoleNotificationSpec.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, color, link, location, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConsoleV1ConsoleNotificationSpec {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
