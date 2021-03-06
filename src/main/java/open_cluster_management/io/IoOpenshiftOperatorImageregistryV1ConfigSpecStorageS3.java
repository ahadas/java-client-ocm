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
import open_cluster_management.io.IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3CloudFront;

/**
 * s3 represents configuration that uses Amazon Simple Storage Service.
 */
@ApiModel(description = "s3 represents configuration that uses Amazon Simple Storage Service.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 {
  @SerializedName("bucket")
  private String bucket = null;

  @SerializedName("cloudFront")
  private IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3CloudFront cloudFront = null;

  @SerializedName("encrypt")
  private Boolean encrypt = null;

  @SerializedName("keyID")
  private String keyID = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("regionEndpoint")
  private String regionEndpoint = null;

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * bucket is the bucket name in which you want to store the registry&#39;s data. Optional, will be generated if not provided.
   * @return bucket
  **/
  @ApiModelProperty(value = "bucket is the bucket name in which you want to store the registry's data. Optional, will be generated if not provided.")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 cloudFront(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3CloudFront cloudFront) {
    this.cloudFront = cloudFront;
    return this;
  }

   /**
   * Get cloudFront
   * @return cloudFront
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3CloudFront getCloudFront() {
    return cloudFront;
  }

  public void setCloudFront(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3CloudFront cloudFront) {
    this.cloudFront = cloudFront;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 encrypt(Boolean encrypt) {
    this.encrypt = encrypt;
    return this;
  }

   /**
   * encrypt specifies whether the registry stores the image in encrypted format or not. Optional, defaults to false.
   * @return encrypt
  **/
  @ApiModelProperty(value = "encrypt specifies whether the registry stores the image in encrypted format or not. Optional, defaults to false.")
  public Boolean isEncrypt() {
    return encrypt;
  }

  public void setEncrypt(Boolean encrypt) {
    this.encrypt = encrypt;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 keyID(String keyID) {
    this.keyID = keyID;
    return this;
  }

   /**
   * keyID is the KMS key ID to use for encryption. Optional, Encrypt must be true, or this parameter is ignored.
   * @return keyID
  **/
  @ApiModelProperty(value = "keyID is the KMS key ID to use for encryption. Optional, Encrypt must be true, or this parameter is ignored.")
  public String getKeyID() {
    return keyID;
  }

  public void setKeyID(String keyID) {
    this.keyID = keyID;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 region(String region) {
    this.region = region;
    return this;
  }

   /**
   * region is the AWS region in which your bucket exists. Optional, will be set based on the installed AWS Region.
   * @return region
  **/
  @ApiModelProperty(value = "region is the AWS region in which your bucket exists. Optional, will be set based on the installed AWS Region.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 regionEndpoint(String regionEndpoint) {
    this.regionEndpoint = regionEndpoint;
    return this;
  }

   /**
   * regionEndpoint is the endpoint for S3 compatible storage services. Optional, defaults based on the Region that is provided.
   * @return regionEndpoint
  **/
  @ApiModelProperty(value = "regionEndpoint is the endpoint for S3 compatible storage services. Optional, defaults based on the Region that is provided.")
  public String getRegionEndpoint() {
    return regionEndpoint;
  }

  public void setRegionEndpoint(String regionEndpoint) {
    this.regionEndpoint = regionEndpoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 ioOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 = (IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3) o;
    return Objects.equals(this.bucket, ioOpenshiftOperatorImageregistryV1ConfigSpecStorageS3.bucket) &&
        Objects.equals(this.cloudFront, ioOpenshiftOperatorImageregistryV1ConfigSpecStorageS3.cloudFront) &&
        Objects.equals(this.encrypt, ioOpenshiftOperatorImageregistryV1ConfigSpecStorageS3.encrypt) &&
        Objects.equals(this.keyID, ioOpenshiftOperatorImageregistryV1ConfigSpecStorageS3.keyID) &&
        Objects.equals(this.region, ioOpenshiftOperatorImageregistryV1ConfigSpecStorageS3.region) &&
        Objects.equals(this.regionEndpoint, ioOpenshiftOperatorImageregistryV1ConfigSpecStorageS3.regionEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, cloudFront, encrypt, keyID, region, regionEndpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 {\n");
    
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    cloudFront: ").append(toIndentedString(cloudFront)).append("\n");
    sb.append("    encrypt: ").append(toIndentedString(encrypt)).append("\n");
    sb.append("    keyID: ").append(toIndentedString(keyID)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionEndpoint: ").append(toIndentedString(regionEndpoint)).append("\n");
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

