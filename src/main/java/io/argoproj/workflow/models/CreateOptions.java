/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v3.0.0
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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateOptions may be provided when creating an API object.
 */
@ApiModel(description = "CreateOptions may be provided when creating an API object.")

public class CreateOptions {
  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private List<String> dryRun = null;

  public static final String SERIALIZED_NAME_FIELD_MANAGER = "fieldManager";
  @SerializedName(SERIALIZED_NAME_FIELD_MANAGER)
  private String fieldManager;


  public CreateOptions dryRun(List<String> dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

  public CreateOptions addDryRunItem(String dryRunItem) {
    if (this.dryRun == null) {
      this.dryRun = new ArrayList<String>();
    }
    this.dryRun.add(dryRunItem);
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDryRun() {
    return dryRun;
  }


  public void setDryRun(List<String> dryRun) {
    this.dryRun = dryRun;
  }


  public CreateOptions fieldManager(String fieldManager) {
    
    this.fieldManager = fieldManager;
    return this;
  }

   /**
   * Get fieldManager
   * @return fieldManager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFieldManager() {
    return fieldManager;
  }


  public void setFieldManager(String fieldManager) {
    this.fieldManager = fieldManager;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOptions createOptions = (CreateOptions) o;
    return Objects.equals(this.dryRun, createOptions.dryRun) &&
        Objects.equals(this.fieldManager, createOptions.fieldManager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, fieldManager);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOptions {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    fieldManager: ").append(toIndentedString(fieldManager)).append("\n");
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

