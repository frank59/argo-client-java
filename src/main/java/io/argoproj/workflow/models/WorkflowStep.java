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
import io.argoproj.workflow.models.Arguments;
import io.argoproj.workflow.models.ContinueOn;
import io.argoproj.workflow.models.Item;
import io.argoproj.workflow.models.Sequence;
import io.argoproj.workflow.models.TemplateRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WorkflowStep
 */

public class WorkflowStep {
  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Arguments arguments;

  public static final String SERIALIZED_NAME_CONTINUE_ON = "continueOn";
  @SerializedName(SERIALIZED_NAME_CONTINUE_ON)
  private ContinueOn continueOn;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ON_EXIT = "onExit";
  @SerializedName(SERIALIZED_NAME_ON_EXIT)
  private String onExit;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TEMPLATE_REF = "templateRef";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REF)
  private TemplateRef templateRef;

  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private String when;

  public static final String SERIALIZED_NAME_WITH_ITEMS = "withItems";
  @SerializedName(SERIALIZED_NAME_WITH_ITEMS)
  private List<Item> withItems = null;

  public static final String SERIALIZED_NAME_WITH_PARAM = "withParam";
  @SerializedName(SERIALIZED_NAME_WITH_PARAM)
  private String withParam;

  public static final String SERIALIZED_NAME_WITH_SEQUENCE = "withSequence";
  @SerializedName(SERIALIZED_NAME_WITH_SEQUENCE)
  private Sequence withSequence;


  public WorkflowStep arguments(Arguments arguments) {
    
    this.arguments = arguments;
    return this;
  }

   /**
   * Get arguments
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Arguments getArguments() {
    return arguments;
  }


  public void setArguments(Arguments arguments) {
    this.arguments = arguments;
  }


  public WorkflowStep continueOn(ContinueOn continueOn) {
    
    this.continueOn = continueOn;
    return this;
  }

   /**
   * Get continueOn
   * @return continueOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContinueOn getContinueOn() {
    return continueOn;
  }


  public void setContinueOn(ContinueOn continueOn) {
    this.continueOn = continueOn;
  }


  public WorkflowStep name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkflowStep onExit(String onExit) {
    
    this.onExit = onExit;
    return this;
  }

   /**
   * OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template.
   * @return onExit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OnExit is a template reference which is invoked at the end of the template, irrespective of the success, failure, or error of the primary template.")

  public String getOnExit() {
    return onExit;
  }


  public void setOnExit(String onExit) {
    this.onExit = onExit;
  }


  public WorkflowStep template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public WorkflowStep templateRef(TemplateRef templateRef) {
    
    this.templateRef = templateRef;
    return this;
  }

   /**
   * Get templateRef
   * @return templateRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateRef getTemplateRef() {
    return templateRef;
  }


  public void setTemplateRef(TemplateRef templateRef) {
    this.templateRef = templateRef;
  }


  public WorkflowStep when(String when) {
    
    this.when = when;
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWhen() {
    return when;
  }


  public void setWhen(String when) {
    this.when = when;
  }


  public WorkflowStep withItems(List<Item> withItems) {
    
    this.withItems = withItems;
    return this;
  }

  public WorkflowStep addWithItemsItem(Item withItemsItem) {
    if (this.withItems == null) {
      this.withItems = new ArrayList<Item>();
    }
    this.withItems.add(withItemsItem);
    return this;
  }

   /**
   * Get withItems
   * @return withItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Item> getWithItems() {
    return withItems;
  }


  public void setWithItems(List<Item> withItems) {
    this.withItems = withItems;
  }


  public WorkflowStep withParam(String withParam) {
    
    this.withParam = withParam;
    return this;
  }

   /**
   * WithParam expands a step into multiple parallel steps from the value in the parameter, which is expected to be a JSON list.
   * @return withParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WithParam expands a step into multiple parallel steps from the value in the parameter, which is expected to be a JSON list.")

  public String getWithParam() {
    return withParam;
  }


  public void setWithParam(String withParam) {
    this.withParam = withParam;
  }


  public WorkflowStep withSequence(Sequence withSequence) {
    
    this.withSequence = withSequence;
    return this;
  }

   /**
   * Get withSequence
   * @return withSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Sequence getWithSequence() {
    return withSequence;
  }


  public void setWithSequence(Sequence withSequence) {
    this.withSequence = withSequence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStep workflowStep = (WorkflowStep) o;
    return Objects.equals(this.arguments, workflowStep.arguments) &&
        Objects.equals(this.continueOn, workflowStep.continueOn) &&
        Objects.equals(this.name, workflowStep.name) &&
        Objects.equals(this.onExit, workflowStep.onExit) &&
        Objects.equals(this.template, workflowStep.template) &&
        Objects.equals(this.templateRef, workflowStep.templateRef) &&
        Objects.equals(this.when, workflowStep.when) &&
        Objects.equals(this.withItems, workflowStep.withItems) &&
        Objects.equals(this.withParam, workflowStep.withParam) &&
        Objects.equals(this.withSequence, workflowStep.withSequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, continueOn, name, onExit, template, templateRef, when, withItems, withParam, withSequence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStep {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    continueOn: ").append(toIndentedString(continueOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onExit: ").append(toIndentedString(onExit)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    templateRef: ").append(toIndentedString(templateRef)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    withItems: ").append(toIndentedString(withItems)).append("\n");
    sb.append("    withParam: ").append(toIndentedString(withParam)).append("\n");
    sb.append("    withSequence: ").append(toIndentedString(withSequence)).append("\n");
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

