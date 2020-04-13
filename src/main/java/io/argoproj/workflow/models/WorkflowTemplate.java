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
import io.argoproj.workflow.models.WorkflowTemplateSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkflowTemplate
 */

public class WorkflowTemplate {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private io.kubernetes.client.models.V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private WorkflowTemplateSpec spec;


  public WorkflowTemplate metadata(io.kubernetes.client.models.V1ObjectMeta metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(io.kubernetes.client.models.V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public WorkflowTemplate spec(WorkflowTemplateSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowTemplateSpec getSpec() {
    return spec;
  }


  public void setSpec(WorkflowTemplateSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTemplate workflowTemplate = (WorkflowTemplate) o;
    return Objects.equals(this.metadata, workflowTemplate.metadata) &&
        Objects.equals(this.spec, workflowTemplate.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTemplate {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

