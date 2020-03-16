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
import io.argoproj.workflow.models.ArtifactRepositoryRef;
import io.argoproj.workflow.models.ExecutorConfig;
import io.argoproj.workflow.models.PodGC;
import io.argoproj.workflow.models.TTLStrategy;
import io.argoproj.workflow.models.Template;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WorkflowSpec is the specification of a Workflow.
 */
@ApiModel(description = "WorkflowSpec is the specification of a Workflow.")

public class WorkflowSpec {
  public static final String SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS = "activeDeadlineSeconds";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DEADLINE_SECONDS)
  private String activeDeadlineSeconds;

  public static final String SERIALIZED_NAME_AFFINITY = "affinity";
  @SerializedName(SERIALIZED_NAME_AFFINITY)
  private io.kubernetes.client.models.V1Affinity affinity;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private Arguments arguments;

  public static final String SERIALIZED_NAME_ARTIFACT_REPOSITORY_REF = "artifactRepositoryRef";
  @SerializedName(SERIALIZED_NAME_ARTIFACT_REPOSITORY_REF)
  private ArtifactRepositoryRef artifactRepositoryRef;

  public static final String SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN = "automountServiceAccountToken";
  @SerializedName(SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN)
  private Boolean automountServiceAccountToken;

  public static final String SERIALIZED_NAME_DNS_CONFIG = "dnsConfig";
  @SerializedName(SERIALIZED_NAME_DNS_CONFIG)
  private io.kubernetes.client.models.V1PodDNSConfig dnsConfig;

  public static final String SERIALIZED_NAME_DNS_POLICY = "dnsPolicy";
  @SerializedName(SERIALIZED_NAME_DNS_POLICY)
  private String dnsPolicy;

  public static final String SERIALIZED_NAME_ENTRYPOINT = "entrypoint";
  @SerializedName(SERIALIZED_NAME_ENTRYPOINT)
  private String entrypoint;

  public static final String SERIALIZED_NAME_EXECUTOR = "executor";
  @SerializedName(SERIALIZED_NAME_EXECUTOR)
  private ExecutorConfig executor;

  public static final String SERIALIZED_NAME_HOST_ALIASES = "hostAliases";
  @SerializedName(SERIALIZED_NAME_HOST_ALIASES)
  private List<io.kubernetes.client.models.V1HostAlias> hostAliases = null;

  public static final String SERIALIZED_NAME_HOST_NETWORK = "hostNetwork";
  @SerializedName(SERIALIZED_NAME_HOST_NETWORK)
  private Boolean hostNetwork;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<io.kubernetes.client.models.V1LocalObjectReference> imagePullSecrets = null;

  public static final String SERIALIZED_NAME_NODE_SELECTOR = "nodeSelector";
  @SerializedName(SERIALIZED_NAME_NODE_SELECTOR)
  private Map<String, String> nodeSelector = null;

  public static final String SERIALIZED_NAME_ON_EXIT = "onExit";
  @SerializedName(SERIALIZED_NAME_ON_EXIT)
  private String onExit;

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private String parallelism;

  public static final String SERIALIZED_NAME_POD_G_C = "podGC";
  @SerializedName(SERIALIZED_NAME_POD_G_C)
  private PodGC podGC;

  public static final String SERIALIZED_NAME_POD_PRIORITY = "podPriority";
  @SerializedName(SERIALIZED_NAME_POD_PRIORITY)
  private Integer podPriority;

  public static final String SERIALIZED_NAME_POD_PRIORITY_CLASS_NAME = "podPriorityClassName";
  @SerializedName(SERIALIZED_NAME_POD_PRIORITY_CLASS_NAME)
  private String podPriorityClassName;

  public static final String SERIALIZED_NAME_POD_SPEC_PATCH = "podSpecPatch";
  @SerializedName(SERIALIZED_NAME_POD_SPEC_PATCH)
  private String podSpecPatch;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_SCHEDULER_NAME = "schedulerName";
  @SerializedName(SERIALIZED_NAME_SCHEDULER_NAME)
  private String schedulerName;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private io.kubernetes.client.models.V1PodSecurityContext securityContext;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_NAME = "serviceAccountName";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_NAME)
  private String serviceAccountName;

  public static final String SERIALIZED_NAME_SUSPEND = "suspend";
  @SerializedName(SERIALIZED_NAME_SUSPEND)
  private Boolean suspend;

  public static final String SERIALIZED_NAME_TEMPLATES = "templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<Template> templates = null;

  public static final String SERIALIZED_NAME_TOLERATIONS = "tolerations";
  @SerializedName(SERIALIZED_NAME_TOLERATIONS)
  private List<io.kubernetes.client.models.V1Toleration> tolerations = null;

  public static final String SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED = "ttlSecondsAfterFinished";
  @SerializedName(SERIALIZED_NAME_TTL_SECONDS_AFTER_FINISHED)
  private Integer ttlSecondsAfterFinished;

  public static final String SERIALIZED_NAME_TTL_STRATEGY = "ttlStrategy";
  @SerializedName(SERIALIZED_NAME_TTL_STRATEGY)
  private TTLStrategy ttlStrategy;

  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES = "volumeClaimTemplates";
  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATES)
  private List<io.kubernetes.client.models.V1PersistentVolumeClaim> volumeClaimTemplates = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<io.kubernetes.client.models.V1Volume> volumes = null;


  public WorkflowSpec activeDeadlineSeconds(String activeDeadlineSeconds) {
    
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

   /**
   * Get activeDeadlineSeconds
   * @return activeDeadlineSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }


  public void setActiveDeadlineSeconds(String activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }


  public WorkflowSpec affinity(io.kubernetes.client.models.V1Affinity affinity) {
    
    this.affinity = affinity;
    return this;
  }

   /**
   * Get affinity
   * @return affinity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1Affinity getAffinity() {
    return affinity;
  }


  public void setAffinity(io.kubernetes.client.models.V1Affinity affinity) {
    this.affinity = affinity;
  }


  public WorkflowSpec arguments(Arguments arguments) {
    
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


  public WorkflowSpec artifactRepositoryRef(ArtifactRepositoryRef artifactRepositoryRef) {
    
    this.artifactRepositoryRef = artifactRepositoryRef;
    return this;
  }

   /**
   * Get artifactRepositoryRef
   * @return artifactRepositoryRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactRepositoryRef getArtifactRepositoryRef() {
    return artifactRepositoryRef;
  }


  public void setArtifactRepositoryRef(ArtifactRepositoryRef artifactRepositoryRef) {
    this.artifactRepositoryRef = artifactRepositoryRef;
  }


  public WorkflowSpec automountServiceAccountToken(Boolean automountServiceAccountToken) {
    
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false.
   * @return automountServiceAccountToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false.")

  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }


  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }


  public WorkflowSpec dnsConfig(io.kubernetes.client.models.V1PodDNSConfig dnsConfig) {
    
    this.dnsConfig = dnsConfig;
    return this;
  }

   /**
   * Get dnsConfig
   * @return dnsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1PodDNSConfig getDnsConfig() {
    return dnsConfig;
  }


  public void setDnsConfig(io.kubernetes.client.models.V1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
  }


  public WorkflowSpec dnsPolicy(String dnsPolicy) {
    
    this.dnsPolicy = dnsPolicy;
    return this;
  }

   /**
   * Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;.
   * @return dnsPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.")

  public String getDnsPolicy() {
    return dnsPolicy;
  }


  public void setDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
  }


  public WorkflowSpec entrypoint(String entrypoint) {
    
    this.entrypoint = entrypoint;
    return this;
  }

   /**
   * Get entrypoint
   * @return entrypoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEntrypoint() {
    return entrypoint;
  }


  public void setEntrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
  }


  public WorkflowSpec executor(ExecutorConfig executor) {
    
    this.executor = executor;
    return this;
  }

   /**
   * Get executor
   * @return executor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExecutorConfig getExecutor() {
    return executor;
  }


  public void setExecutor(ExecutorConfig executor) {
    this.executor = executor;
  }


  public WorkflowSpec hostAliases(List<io.kubernetes.client.models.V1HostAlias> hostAliases) {
    
    this.hostAliases = hostAliases;
    return this;
  }

  public WorkflowSpec addHostAliasesItem(io.kubernetes.client.models.V1HostAlias hostAliasesItem) {
    if (this.hostAliases == null) {
      this.hostAliases = new ArrayList<io.kubernetes.client.models.V1HostAlias>();
    }
    this.hostAliases.add(hostAliasesItem);
    return this;
  }

   /**
   * Get hostAliases
   * @return hostAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.models.V1HostAlias> getHostAliases() {
    return hostAliases;
  }


  public void setHostAliases(List<io.kubernetes.client.models.V1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
  }


  public WorkflowSpec hostNetwork(Boolean hostNetwork) {
    
    this.hostNetwork = hostNetwork;
    return this;
  }

   /**
   * Host networking requested for this workflow pod. Default to false.
   * @return hostNetwork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Host networking requested for this workflow pod. Default to false.")

  public Boolean getHostNetwork() {
    return hostNetwork;
  }


  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }


  public WorkflowSpec imagePullSecrets(List<io.kubernetes.client.models.V1LocalObjectReference> imagePullSecrets) {
    
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public WorkflowSpec addImagePullSecretsItem(io.kubernetes.client.models.V1LocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<io.kubernetes.client.models.V1LocalObjectReference>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * Get imagePullSecrets
   * @return imagePullSecrets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.models.V1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }


  public void setImagePullSecrets(List<io.kubernetes.client.models.V1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }


  public WorkflowSpec nodeSelector(Map<String, String> nodeSelector) {
    
    this.nodeSelector = nodeSelector;
    return this;
  }

  public WorkflowSpec putNodeSelectorItem(String key, String nodeSelectorItem) {
    if (this.nodeSelector == null) {
      this.nodeSelector = new HashMap<String, String>();
    }
    this.nodeSelector.put(key, nodeSelectorItem);
    return this;
  }

   /**
   * NodeSelector is a selector which will result in all pods of the workflow to be scheduled on the selected node(s). This is able to be overridden by a nodeSelector specified in the template.
   * @return nodeSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeSelector is a selector which will result in all pods of the workflow to be scheduled on the selected node(s). This is able to be overridden by a nodeSelector specified in the template.")

  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }


  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }


  public WorkflowSpec onExit(String onExit) {
    
    this.onExit = onExit;
    return this;
  }

   /**
   * OnExit is a template reference which is invoked at the end of the workflow, irrespective of the success, failure, or error of the primary 
   * @return onExit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OnExit is a template reference which is invoked at the end of the workflow, irrespective of the success, failure, or error of the primary ")

  public String getOnExit() {
    return onExit;
  }


  public void setOnExit(String onExit) {
    this.onExit = onExit;
  }


  public WorkflowSpec parallelism(String parallelism) {
    
    this.parallelism = parallelism;
    return this;
  }

   /**
   * Get parallelism
   * @return parallelism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParallelism() {
    return parallelism;
  }


  public void setParallelism(String parallelism) {
    this.parallelism = parallelism;
  }


  public WorkflowSpec podGC(PodGC podGC) {
    
    this.podGC = podGC;
    return this;
  }

   /**
   * Get podGC
   * @return podGC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PodGC getPodGC() {
    return podGC;
  }


  public void setPodGC(PodGC podGC) {
    this.podGC = podGC;
  }


  public WorkflowSpec podPriority(Integer podPriority) {
    
    this.podPriority = podPriority;
    return this;
  }

   /**
   * Priority to apply to workflow pods.
   * @return podPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Priority to apply to workflow pods.")

  public Integer getPodPriority() {
    return podPriority;
  }


  public void setPodPriority(Integer podPriority) {
    this.podPriority = podPriority;
  }


  public WorkflowSpec podPriorityClassName(String podPriorityClassName) {
    
    this.podPriorityClassName = podPriorityClassName;
    return this;
  }

   /**
   * PriorityClassName to apply to workflow pods.
   * @return podPriorityClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PriorityClassName to apply to workflow pods.")

  public String getPodPriorityClassName() {
    return podPriorityClassName;
  }


  public void setPodPriorityClassName(String podPriorityClassName) {
    this.podPriorityClassName = podPriorityClassName;
  }


  public WorkflowSpec podSpecPatch(String podSpecPatch) {
    
    this.podSpecPatch = podSpecPatch;
    return this;
  }

   /**
   * PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits).
   * @return podSpecPatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits).")

  public String getPodSpecPatch() {
    return podSpecPatch;
  }


  public void setPodSpecPatch(String podSpecPatch) {
    this.podSpecPatch = podSpecPatch;
  }


  public WorkflowSpec priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Priority is used if controller is configured to process limited number of workflows in parallel. Workflows with higher priority are processed first.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Priority is used if controller is configured to process limited number of workflows in parallel. Workflows with higher priority are processed first.")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public WorkflowSpec schedulerName(String schedulerName) {
    
    this.schedulerName = schedulerName;
    return this;
  }

   /**
   * Get schedulerName
   * @return schedulerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchedulerName() {
    return schedulerName;
  }


  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }


  public WorkflowSpec securityContext(io.kubernetes.client.models.V1PodSecurityContext securityContext) {
    
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1PodSecurityContext getSecurityContext() {
    return securityContext;
  }


  public void setSecurityContext(io.kubernetes.client.models.V1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public WorkflowSpec serviceAccountName(String serviceAccountName) {
    
    this.serviceAccountName = serviceAccountName;
    return this;
  }

   /**
   * ServiceAccountName is the name of the ServiceAccount to run all pods of the workflow as.
   * @return serviceAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ServiceAccountName is the name of the ServiceAccount to run all pods of the workflow as.")

  public String getServiceAccountName() {
    return serviceAccountName;
  }


  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }


  public WorkflowSpec suspend(Boolean suspend) {
    
    this.suspend = suspend;
    return this;
  }

   /**
   * Get suspend
   * @return suspend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuspend() {
    return suspend;
  }


  public void setSuspend(Boolean suspend) {
    this.suspend = suspend;
  }


  public WorkflowSpec templates(List<Template> templates) {
    
    this.templates = templates;
    return this;
  }

  public WorkflowSpec addTemplatesItem(Template templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<Template>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Template> getTemplates() {
    return templates;
  }


  public void setTemplates(List<Template> templates) {
    this.templates = templates;
  }


  public WorkflowSpec tolerations(List<io.kubernetes.client.models.V1Toleration> tolerations) {
    
    this.tolerations = tolerations;
    return this;
  }

  public WorkflowSpec addTolerationsItem(io.kubernetes.client.models.V1Toleration tolerationsItem) {
    if (this.tolerations == null) {
      this.tolerations = new ArrayList<io.kubernetes.client.models.V1Toleration>();
    }
    this.tolerations.add(tolerationsItem);
    return this;
  }

   /**
   * Get tolerations
   * @return tolerations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.models.V1Toleration> getTolerations() {
    return tolerations;
  }


  public void setTolerations(List<io.kubernetes.client.models.V1Toleration> tolerations) {
    this.tolerations = tolerations;
  }


  public WorkflowSpec ttlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
    return this;
  }

   /**
   * TTLSecondsAfterFinished limits the lifetime of a Workflow that has finished execution (Succeeded, Failed, Error). If this field is set, once the Workflow finishes, it will be deleted after ttlSecondsAfterFinished expires. If this field is unset, ttlSecondsAfterFinished will not expire. If this field is set to zero, ttlSecondsAfterFinished expires immediately after the Workflow finishes. DEPRECATED: Use TTLStrategy.SecondsAfterCompletion instead.
   * @return ttlSecondsAfterFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TTLSecondsAfterFinished limits the lifetime of a Workflow that has finished execution (Succeeded, Failed, Error). If this field is set, once the Workflow finishes, it will be deleted after ttlSecondsAfterFinished expires. If this field is unset, ttlSecondsAfterFinished will not expire. If this field is set to zero, ttlSecondsAfterFinished expires immediately after the Workflow finishes. DEPRECATED: Use TTLStrategy.SecondsAfterCompletion instead.")

  public Integer getTtlSecondsAfterFinished() {
    return ttlSecondsAfterFinished;
  }


  public void setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
    this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
  }


  public WorkflowSpec ttlStrategy(TTLStrategy ttlStrategy) {
    
    this.ttlStrategy = ttlStrategy;
    return this;
  }

   /**
   * Get ttlStrategy
   * @return ttlStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TTLStrategy getTtlStrategy() {
    return ttlStrategy;
  }


  public void setTtlStrategy(TTLStrategy ttlStrategy) {
    this.ttlStrategy = ttlStrategy;
  }


  public WorkflowSpec volumeClaimTemplates(List<io.kubernetes.client.models.V1PersistentVolumeClaim> volumeClaimTemplates) {
    
    this.volumeClaimTemplates = volumeClaimTemplates;
    return this;
  }

  public WorkflowSpec addVolumeClaimTemplatesItem(io.kubernetes.client.models.V1PersistentVolumeClaim volumeClaimTemplatesItem) {
    if (this.volumeClaimTemplates == null) {
      this.volumeClaimTemplates = new ArrayList<io.kubernetes.client.models.V1PersistentVolumeClaim>();
    }
    this.volumeClaimTemplates.add(volumeClaimTemplatesItem);
    return this;
  }

   /**
   * Get volumeClaimTemplates
   * @return volumeClaimTemplates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.models.V1PersistentVolumeClaim> getVolumeClaimTemplates() {
    return volumeClaimTemplates;
  }


  public void setVolumeClaimTemplates(List<io.kubernetes.client.models.V1PersistentVolumeClaim> volumeClaimTemplates) {
    this.volumeClaimTemplates = volumeClaimTemplates;
  }


  public WorkflowSpec volumes(List<io.kubernetes.client.models.V1Volume> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public WorkflowSpec addVolumesItem(io.kubernetes.client.models.V1Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<io.kubernetes.client.models.V1Volume>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<io.kubernetes.client.models.V1Volume> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<io.kubernetes.client.models.V1Volume> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSpec workflowSpec = (WorkflowSpec) o;
    return Objects.equals(this.activeDeadlineSeconds, workflowSpec.activeDeadlineSeconds) &&
        Objects.equals(this.affinity, workflowSpec.affinity) &&
        Objects.equals(this.arguments, workflowSpec.arguments) &&
        Objects.equals(this.artifactRepositoryRef, workflowSpec.artifactRepositoryRef) &&
        Objects.equals(this.automountServiceAccountToken, workflowSpec.automountServiceAccountToken) &&
        Objects.equals(this.dnsConfig, workflowSpec.dnsConfig) &&
        Objects.equals(this.dnsPolicy, workflowSpec.dnsPolicy) &&
        Objects.equals(this.entrypoint, workflowSpec.entrypoint) &&
        Objects.equals(this.executor, workflowSpec.executor) &&
        Objects.equals(this.hostAliases, workflowSpec.hostAliases) &&
        Objects.equals(this.hostNetwork, workflowSpec.hostNetwork) &&
        Objects.equals(this.imagePullSecrets, workflowSpec.imagePullSecrets) &&
        Objects.equals(this.nodeSelector, workflowSpec.nodeSelector) &&
        Objects.equals(this.onExit, workflowSpec.onExit) &&
        Objects.equals(this.parallelism, workflowSpec.parallelism) &&
        Objects.equals(this.podGC, workflowSpec.podGC) &&
        Objects.equals(this.podPriority, workflowSpec.podPriority) &&
        Objects.equals(this.podPriorityClassName, workflowSpec.podPriorityClassName) &&
        Objects.equals(this.podSpecPatch, workflowSpec.podSpecPatch) &&
        Objects.equals(this.priority, workflowSpec.priority) &&
        Objects.equals(this.schedulerName, workflowSpec.schedulerName) &&
        Objects.equals(this.securityContext, workflowSpec.securityContext) &&
        Objects.equals(this.serviceAccountName, workflowSpec.serviceAccountName) &&
        Objects.equals(this.suspend, workflowSpec.suspend) &&
        Objects.equals(this.templates, workflowSpec.templates) &&
        Objects.equals(this.tolerations, workflowSpec.tolerations) &&
        Objects.equals(this.ttlSecondsAfterFinished, workflowSpec.ttlSecondsAfterFinished) &&
        Objects.equals(this.ttlStrategy, workflowSpec.ttlStrategy) &&
        Objects.equals(this.volumeClaimTemplates, workflowSpec.volumeClaimTemplates) &&
        Objects.equals(this.volumes, workflowSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, arguments, artifactRepositoryRef, automountServiceAccountToken, dnsConfig, dnsPolicy, entrypoint, executor, hostAliases, hostNetwork, imagePullSecrets, nodeSelector, onExit, parallelism, podGC, podPriority, podPriorityClassName, podSpecPatch, priority, schedulerName, securityContext, serviceAccountName, suspend, templates, tolerations, ttlSecondsAfterFinished, ttlStrategy, volumeClaimTemplates, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSpec {\n");
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    artifactRepositoryRef: ").append(toIndentedString(artifactRepositoryRef)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
    sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    onExit: ").append(toIndentedString(onExit)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    podGC: ").append(toIndentedString(podGC)).append("\n");
    sb.append("    podPriority: ").append(toIndentedString(podPriority)).append("\n");
    sb.append("    podPriorityClassName: ").append(toIndentedString(podPriorityClassName)).append("\n");
    sb.append("    podSpecPatch: ").append(toIndentedString(podSpecPatch)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    suspend: ").append(toIndentedString(suspend)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    ttlSecondsAfterFinished: ").append(toIndentedString(ttlSecondsAfterFinished)).append("\n");
    sb.append("    ttlStrategy: ").append(toIndentedString(ttlStrategy)).append("\n");
    sb.append("    volumeClaimTemplates: ").append(toIndentedString(volumeClaimTemplates)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

