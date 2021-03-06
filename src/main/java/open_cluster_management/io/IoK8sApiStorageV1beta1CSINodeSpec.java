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
import open_cluster_management.io.IoK8sApiStorageV1beta1CSINodeDriver;

/**
 * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
 */
@ApiModel(description = "CSINodeSpec holds information about the specification of all CSI drivers installed on a node")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiStorageV1beta1CSINodeSpec {
  @SerializedName("drivers")
  private List<IoK8sApiStorageV1beta1CSINodeDriver> drivers = new ArrayList<>();

  public IoK8sApiStorageV1beta1CSINodeSpec drivers(List<IoK8sApiStorageV1beta1CSINodeDriver> drivers) {
    this.drivers = drivers;
    return this;
  }

  public IoK8sApiStorageV1beta1CSINodeSpec addDriversItem(IoK8sApiStorageV1beta1CSINodeDriver driversItem) {
    this.drivers.add(driversItem);
    return this;
  }

   /**
   * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
   * @return drivers
  **/
  @ApiModelProperty(required = true, value = "drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.")
  public List<IoK8sApiStorageV1beta1CSINodeDriver> getDrivers() {
    return drivers;
  }

  public void setDrivers(List<IoK8sApiStorageV1beta1CSINodeDriver> drivers) {
    this.drivers = drivers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiStorageV1beta1CSINodeSpec ioK8sApiStorageV1beta1CSINodeSpec = (IoK8sApiStorageV1beta1CSINodeSpec) o;
    return Objects.equals(this.drivers, ioK8sApiStorageV1beta1CSINodeSpec.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1beta1CSINodeSpec {\n");
    
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
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

