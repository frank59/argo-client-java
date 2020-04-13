/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.workflow.models.S3Bucket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * S3Artifact
 */

public class S3Artifact {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_S3_BUCKET = "s3Bucket";
  @SerializedName(SERIALIZED_NAME_S3_BUCKET)
  private S3Bucket s3Bucket;


  public S3Artifact key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public S3Artifact s3Bucket(S3Bucket s3Bucket) {
    
    this.s3Bucket = s3Bucket;
    return this;
  }

   /**
   * Get s3Bucket
   * @return s3Bucket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public S3Bucket getS3Bucket() {
    return s3Bucket;
  }


  public void setS3Bucket(S3Bucket s3Bucket) {
    this.s3Bucket = s3Bucket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3Artifact s3Artifact = (S3Artifact) o;
    return Objects.equals(this.key, s3Artifact.key) &&
        Objects.equals(this.s3Bucket, s3Artifact.s3Bucket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, s3Bucket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3Artifact {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    s3Bucket: ").append(toIndentedString(s3Bucket)).append("\n");
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

