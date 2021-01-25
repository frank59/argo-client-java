/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.12.6
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
import io.argoproj.workflow.models.ClusterWorkflowTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ClusterWorkflowTemplateUpdateRequest
 */

public class ClusterWorkflowTemplateUpdateRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private ClusterWorkflowTemplate template;


  public ClusterWorkflowTemplateUpdateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * DEPRECATED: This field is ignored.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DEPRECATED: This field is ignored.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ClusterWorkflowTemplateUpdateRequest template(ClusterWorkflowTemplate template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterWorkflowTemplate getTemplate() {
    return template;
  }


  public void setTemplate(ClusterWorkflowTemplate template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterWorkflowTemplateUpdateRequest clusterWorkflowTemplateUpdateRequest = (ClusterWorkflowTemplateUpdateRequest) o;
    return Objects.equals(this.name, clusterWorkflowTemplateUpdateRequest.name) &&
        Objects.equals(this.template, clusterWorkflowTemplateUpdateRequest.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterWorkflowTemplateUpdateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

