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
 * azure represents configuration that uses Azure Blob Storage.
 */
@ApiModel(description = "azure represents configuration that uses Azure Blob Storage.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure {
  @SerializedName("accountName")
  private String accountName = null;

  @SerializedName("container")
  private String container = null;

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * accountName defines the account to be used by the registry.
   * @return accountName
  **/
  @ApiModelProperty(value = "accountName defines the account to be used by the registry.")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure container(String container) {
    this.container = container;
    return this;
  }

   /**
   * container defines Azure&#39;s container to be used by registry.
   * @return container
  **/
  @ApiModelProperty(value = "container defines Azure's container to be used by registry.")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure ioOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure = (IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure) o;
    return Objects.equals(this.accountName, ioOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure.accountName) &&
        Objects.equals(this.container, ioOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, container);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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
