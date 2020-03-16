/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: v2.6.3
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ObjectFieldSelector selects an APIVersioned field of an object.
 */
@ApiModel(description = "ObjectFieldSelector selects an APIVersioned field of an object.")

public class ObjectFieldSelector {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_FIELD_PATH = "fieldPath";
  @SerializedName(SERIALIZED_NAME_FIELD_PATH)
  private String fieldPath;


  public ObjectFieldSelector apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Get apiVersion
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public ObjectFieldSelector fieldPath(String fieldPath) {
    
    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * Path of the field to select in the specified API version.
   * @return fieldPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path of the field to select in the specified API version.")

  public String getFieldPath() {
    return fieldPath;
  }


  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectFieldSelector objectFieldSelector = (ObjectFieldSelector) o;
    return Objects.equals(this.apiVersion, objectFieldSelector.apiVersion) &&
        Objects.equals(this.fieldPath, objectFieldSelector.fieldPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectFieldSelector {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
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

