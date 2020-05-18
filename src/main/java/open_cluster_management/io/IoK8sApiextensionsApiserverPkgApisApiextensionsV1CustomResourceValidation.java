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
import open_cluster_management.io.IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps;

/**
 * CustomResourceValidation is a list of validation methods for CustomResources.
 */
@ApiModel(description = "CustomResourceValidation is a list of validation methods for CustomResources.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation {
  @SerializedName("openAPIV3Schema")
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps openAPIV3Schema = null;

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation openAPIV3Schema(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
    return this;
  }

   /**
   * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
   * @return openAPIV3Schema
  **/
  @ApiModelProperty(value = "openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps getOpenAPIV3Schema() {
    return openAPIV3Schema;
  }

  public void setOpenAPIV3Schema(IoK8sApiextensionsApiserverPkgApisApiextensionsV1JSONSchemaProps openAPIV3Schema) {
    this.openAPIV3Schema = openAPIV3Schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation = (IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation) o;
    return Objects.equals(this.openAPIV3Schema, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation.openAPIV3Schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openAPIV3Schema);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceValidation {\n");
    
    sb.append("    openAPIV3Schema: ").append(toIndentedString(openAPIV3Schema)).append("\n");
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

