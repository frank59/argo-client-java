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
import java.util.ArrayList;
import java.util.List;

/**
 * CronWorkflowStatus
 */

public class CronWorkflowStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private List<io.kubernetes.client.models.V1ObjectReference> active = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULED_TIME = "lastScheduledTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULED_TIME)
  private org.joda.time.DateTime lastScheduledTime;


  public CronWorkflowStatus active(List<io.kubernetes.client.models.V1ObjectReference> active) {
    
    this.active = active;
    return this;
  }

  public CronWorkflowStatus addActiveItem(io.kubernetes.client.models.V1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<io.kubernetes.client.models.V1ObjectReference>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.models.V1ObjectReference> getActive() {
    return active;
  }


  public void setActive(List<io.kubernetes.client.models.V1ObjectReference> active) {
    this.active = active;
  }


  public CronWorkflowStatus lastScheduledTime(org.joda.time.DateTime lastScheduledTime) {
    
    this.lastScheduledTime = lastScheduledTime;
    return this;
  }

   /**
   * Get lastScheduledTime
   * @return lastScheduledTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public org.joda.time.DateTime getLastScheduledTime() {
    return lastScheduledTime;
  }


  public void setLastScheduledTime(org.joda.time.DateTime lastScheduledTime) {
    this.lastScheduledTime = lastScheduledTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CronWorkflowStatus cronWorkflowStatus = (CronWorkflowStatus) o;
    return Objects.equals(this.active, cronWorkflowStatus.active) &&
        Objects.equals(this.lastScheduledTime, cronWorkflowStatus.lastScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastScheduledTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronWorkflowStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduledTime: ").append(toIndentedString(lastScheduledTime)).append("\n");
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

