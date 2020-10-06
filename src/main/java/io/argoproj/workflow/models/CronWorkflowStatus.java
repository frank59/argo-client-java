/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.2
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
import io.argoproj.workflow.models.Condition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CronWorkflowStatus is the status of a CronWorkflow
 */
@ApiModel(description = "CronWorkflowStatus is the status of a CronWorkflow")

public class CronWorkflowStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private List<io.kubernetes.client.openapi.models.V1ObjectReference> active = null;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<Condition> conditions = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULED_TIME = "lastScheduledTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULED_TIME)
  private org.joda.time.DateTime lastScheduledTime;


  public CronWorkflowStatus active(List<io.kubernetes.client.openapi.models.V1ObjectReference> active) {
    
    this.active = active;
    return this;
  }

  public CronWorkflowStatus addActiveItem(io.kubernetes.client.openapi.models.V1ObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<io.kubernetes.client.openapi.models.V1ObjectReference>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * Active is a list of active workflows stemming from this CronWorkflow
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active is a list of active workflows stemming from this CronWorkflow")

  public List<io.kubernetes.client.openapi.models.V1ObjectReference> getActive() {
    return active;
  }


  public void setActive(List<io.kubernetes.client.openapi.models.V1ObjectReference> active) {
    this.active = active;
  }


  public CronWorkflowStatus conditions(List<Condition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public CronWorkflowStatus addConditionsItem(Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<Condition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is a list of conditions the CronWorkflow may have
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions is a list of conditions the CronWorkflow may have")

  public List<Condition> getConditions() {
    return conditions;
  }


  public void setConditions(List<Condition> conditions) {
    this.conditions = conditions;
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
        Objects.equals(this.conditions, cronWorkflowStatus.conditions) &&
        Objects.equals(this.lastScheduledTime, cronWorkflowStatus.lastScheduledTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, conditions, lastScheduledTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CronWorkflowStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

