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
import open_cluster_management.io.IoK8sApiCoreV1EndpointAddress;
import open_cluster_management.io.IoK8sApiCoreV1EndpointPort;

/**
 * EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:   {     Addresses: [{\&quot;ip\&quot;: \&quot;10.10.1.1\&quot;}, {\&quot;ip\&quot;: \&quot;10.10.2.2\&quot;}],     Ports:     [{\&quot;name\&quot;: \&quot;a\&quot;, \&quot;port\&quot;: 8675}, {\&quot;name\&quot;: \&quot;b\&quot;, \&quot;port\&quot;: 309}]   } The resulting set of endpoints can be viewed as:     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],     b: [ 10.10.1.1:309, 10.10.2.2:309 ]
 */
@ApiModel(description = "EndpointSubset is a group of addresses with a common set of ports. The expanded set of endpoints is the Cartesian product of Addresses x Ports. For example, given:   {     Addresses: [{\"ip\": \"10.10.1.1\"}, {\"ip\": \"10.10.2.2\"}],     Ports:     [{\"name\": \"a\", \"port\": 8675}, {\"name\": \"b\", \"port\": 309}]   } The resulting set of endpoints can be viewed as:     a: [ 10.10.1.1:8675, 10.10.2.2:8675 ],     b: [ 10.10.1.1:309, 10.10.2.2:309 ]")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1EndpointSubset {
  @SerializedName("addresses")
  private List<IoK8sApiCoreV1EndpointAddress> addresses = null;

  @SerializedName("notReadyAddresses")
  private List<IoK8sApiCoreV1EndpointAddress> notReadyAddresses = null;

  @SerializedName("ports")
  private List<IoK8sApiCoreV1EndpointPort> ports = null;

  public IoK8sApiCoreV1EndpointSubset addresses(List<IoK8sApiCoreV1EndpointAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public IoK8sApiCoreV1EndpointSubset addAddressesItem(IoK8sApiCoreV1EndpointAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.
   * @return addresses
  **/
  @ApiModelProperty(value = "IP addresses which offer the related ports that are marked as ready. These endpoints should be considered safe for load balancers and clients to utilize.")
  public List<IoK8sApiCoreV1EndpointAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<IoK8sApiCoreV1EndpointAddress> addresses) {
    this.addresses = addresses;
  }

  public IoK8sApiCoreV1EndpointSubset notReadyAddresses(List<IoK8sApiCoreV1EndpointAddress> notReadyAddresses) {
    this.notReadyAddresses = notReadyAddresses;
    return this;
  }

  public IoK8sApiCoreV1EndpointSubset addNotReadyAddressesItem(IoK8sApiCoreV1EndpointAddress notReadyAddressesItem) {
    if (this.notReadyAddresses == null) {
      this.notReadyAddresses = new ArrayList<>();
    }
    this.notReadyAddresses.add(notReadyAddressesItem);
    return this;
  }

   /**
   * IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.
   * @return notReadyAddresses
  **/
  @ApiModelProperty(value = "IP addresses which offer the related ports but are not currently marked as ready because they have not yet finished starting, have recently failed a readiness check, or have recently failed a liveness check.")
  public List<IoK8sApiCoreV1EndpointAddress> getNotReadyAddresses() {
    return notReadyAddresses;
  }

  public void setNotReadyAddresses(List<IoK8sApiCoreV1EndpointAddress> notReadyAddresses) {
    this.notReadyAddresses = notReadyAddresses;
  }

  public IoK8sApiCoreV1EndpointSubset ports(List<IoK8sApiCoreV1EndpointPort> ports) {
    this.ports = ports;
    return this;
  }

  public IoK8sApiCoreV1EndpointSubset addPortsItem(IoK8sApiCoreV1EndpointPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Port numbers available on the related IP addresses.
   * @return ports
  **/
  @ApiModelProperty(value = "Port numbers available on the related IP addresses.")
  public List<IoK8sApiCoreV1EndpointPort> getPorts() {
    return ports;
  }

  public void setPorts(List<IoK8sApiCoreV1EndpointPort> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1EndpointSubset ioK8sApiCoreV1EndpointSubset = (IoK8sApiCoreV1EndpointSubset) o;
    return Objects.equals(this.addresses, ioK8sApiCoreV1EndpointSubset.addresses) &&
        Objects.equals(this.notReadyAddresses, ioK8sApiCoreV1EndpointSubset.notReadyAddresses) &&
        Objects.equals(this.ports, ioK8sApiCoreV1EndpointSubset.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, notReadyAddresses, ports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EndpointSubset {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    notReadyAddresses: ").append(toIndentedString(notReadyAddresses)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

