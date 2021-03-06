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
import open_cluster_management.io.ComGithubOpenshiftApiImageV1ImageImportStatus;
import open_cluster_management.io.ComGithubOpenshiftApiImageV1ImageStream;
import open_cluster_management.io.ComGithubOpenshiftApiImageV1RepositoryImportStatus;

/**
 * ImageStreamImportStatus contains information about the status of an image stream import.
 */
@ApiModel(description = "ImageStreamImportStatus contains information about the status of an image stream import.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiImageV1ImageStreamImportStatus {
  @SerializedName("images")
  private List<ComGithubOpenshiftApiImageV1ImageImportStatus> images = null;

  @SerializedName("import")
  private ComGithubOpenshiftApiImageV1ImageStream _import = null;

  @SerializedName("repository")
  private ComGithubOpenshiftApiImageV1RepositoryImportStatus repository = null;

  public ComGithubOpenshiftApiImageV1ImageStreamImportStatus images(List<ComGithubOpenshiftApiImageV1ImageImportStatus> images) {
    this.images = images;
    return this;
  }

  public ComGithubOpenshiftApiImageV1ImageStreamImportStatus addImagesItem(ComGithubOpenshiftApiImageV1ImageImportStatus imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Images is set with the result of importing spec.images
   * @return images
  **/
  @ApiModelProperty(value = "Images is set with the result of importing spec.images")
  public List<ComGithubOpenshiftApiImageV1ImageImportStatus> getImages() {
    return images;
  }

  public void setImages(List<ComGithubOpenshiftApiImageV1ImageImportStatus> images) {
    this.images = images;
  }

  public ComGithubOpenshiftApiImageV1ImageStreamImportStatus _import(ComGithubOpenshiftApiImageV1ImageStream _import) {
    this._import = _import;
    return this;
  }

   /**
   * Import is the image stream that was successfully updated or created when &#39;to&#39; was set.
   * @return _import
  **/
  @ApiModelProperty(value = "Import is the image stream that was successfully updated or created when 'to' was set.")
  public ComGithubOpenshiftApiImageV1ImageStream getImport() {
    return _import;
  }

  public void setImport(ComGithubOpenshiftApiImageV1ImageStream _import) {
    this._import = _import;
  }

  public ComGithubOpenshiftApiImageV1ImageStreamImportStatus repository(ComGithubOpenshiftApiImageV1RepositoryImportStatus repository) {
    this.repository = repository;
    return this;
  }

   /**
   * Repository is set if spec.repository was set to the outcome of the import
   * @return repository
  **/
  @ApiModelProperty(value = "Repository is set if spec.repository was set to the outcome of the import")
  public ComGithubOpenshiftApiImageV1RepositoryImportStatus getRepository() {
    return repository;
  }

  public void setRepository(ComGithubOpenshiftApiImageV1RepositoryImportStatus repository) {
    this.repository = repository;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiImageV1ImageStreamImportStatus comGithubOpenshiftApiImageV1ImageStreamImportStatus = (ComGithubOpenshiftApiImageV1ImageStreamImportStatus) o;
    return Objects.equals(this.images, comGithubOpenshiftApiImageV1ImageStreamImportStatus.images) &&
        Objects.equals(this._import, comGithubOpenshiftApiImageV1ImageStreamImportStatus._import) &&
        Objects.equals(this.repository, comGithubOpenshiftApiImageV1ImageStreamImportStatus.repository);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, _import, repository);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiImageV1ImageStreamImportStatus {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    _import: ").append(toIndentedString(_import)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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

