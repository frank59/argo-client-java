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
import io.argoproj.workflow.models.ClusterWorkflowTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClusterWorkflowTemplateList
 */

public class ClusterWorkflowTemplateList {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<ClusterWorkflowTemplate> items = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private io.kubernetes.client.models.V1ListMeta metadata;


  public ClusterWorkflowTemplateList items(List<ClusterWorkflowTemplate> items) {
    
    this.items = items;
    return this;
  }

  public ClusterWorkflowTemplateList addItemsItem(ClusterWorkflowTemplate itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ClusterWorkflowTemplate>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ClusterWorkflowTemplate> getItems() {
    return items;
  }


  public void setItems(List<ClusterWorkflowTemplate> items) {
    this.items = items;
  }


  public ClusterWorkflowTemplateList metadata(io.kubernetes.client.models.V1ListMeta metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1ListMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(io.kubernetes.client.models.V1ListMeta metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterWorkflowTemplateList clusterWorkflowTemplateList = (ClusterWorkflowTemplateList) o;
    return Objects.equals(this.items, clusterWorkflowTemplateList.items) &&
        Objects.equals(this.metadata, clusterWorkflowTemplateList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterWorkflowTemplateList {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

