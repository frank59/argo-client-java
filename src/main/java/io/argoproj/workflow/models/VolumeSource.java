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
import io.argoproj.workflow.models.AWSElasticBlockStoreVolumeSource;
import io.argoproj.workflow.models.AzureDiskVolumeSource;
import io.argoproj.workflow.models.AzureFileVolumeSource;
import io.argoproj.workflow.models.CSIVolumeSource;
import io.argoproj.workflow.models.CephFSVolumeSource;
import io.argoproj.workflow.models.CinderVolumeSource;
import io.argoproj.workflow.models.ConfigMapVolumeSource;
import io.argoproj.workflow.models.DownwardAPIVolumeSource;
import io.argoproj.workflow.models.EmptyDirVolumeSource;
import io.argoproj.workflow.models.FCVolumeSource;
import io.argoproj.workflow.models.FlexVolumeSource;
import io.argoproj.workflow.models.FlockerVolumeSource;
import io.argoproj.workflow.models.GCEPersistentDiskVolumeSource;
import io.argoproj.workflow.models.GitRepoVolumeSource;
import io.argoproj.workflow.models.GlusterfsVolumeSource;
import io.argoproj.workflow.models.HostPathVolumeSource;
import io.argoproj.workflow.models.ISCSIVolumeSource;
import io.argoproj.workflow.models.NFSVolumeSource;
import io.argoproj.workflow.models.PersistentVolumeClaimVolumeSource;
import io.argoproj.workflow.models.PhotonPersistentDiskVolumeSource;
import io.argoproj.workflow.models.PortworxVolumeSource;
import io.argoproj.workflow.models.ProjectedVolumeSource;
import io.argoproj.workflow.models.QuobyteVolumeSource;
import io.argoproj.workflow.models.RBDVolumeSource;
import io.argoproj.workflow.models.ScaleIOVolumeSource;
import io.argoproj.workflow.models.SecretVolumeSource;
import io.argoproj.workflow.models.StorageOSVolumeSource;
import io.argoproj.workflow.models.VsphereVirtualDiskVolumeSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents the source of a volume to mount. Only one of its members may be specified.
 */
@ApiModel(description = "Represents the source of a volume to mount. Only one of its members may be specified.")

public class VolumeSource {
  public static final String SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE = "awsElasticBlockStore";
  @SerializedName(SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE)
  private AWSElasticBlockStoreVolumeSource awsElasticBlockStore;

  public static final String SERIALIZED_NAME_AZURE_DISK = "azureDisk";
  @SerializedName(SERIALIZED_NAME_AZURE_DISK)
  private AzureDiskVolumeSource azureDisk;

  public static final String SERIALIZED_NAME_AZURE_FILE = "azureFile";
  @SerializedName(SERIALIZED_NAME_AZURE_FILE)
  private AzureFileVolumeSource azureFile;

  public static final String SERIALIZED_NAME_CEPHFS = "cephfs";
  @SerializedName(SERIALIZED_NAME_CEPHFS)
  private CephFSVolumeSource cephfs;

  public static final String SERIALIZED_NAME_CINDER = "cinder";
  @SerializedName(SERIALIZED_NAME_CINDER)
  private CinderVolumeSource cinder;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private ConfigMapVolumeSource configMap;

  public static final String SERIALIZED_NAME_CSI = "csi";
  @SerializedName(SERIALIZED_NAME_CSI)
  private CSIVolumeSource csi;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private DownwardAPIVolumeSource downwardAPI;

  public static final String SERIALIZED_NAME_EMPTY_DIR = "emptyDir";
  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  private EmptyDirVolumeSource emptyDir;

  public static final String SERIALIZED_NAME_FC = "fc";
  @SerializedName(SERIALIZED_NAME_FC)
  private FCVolumeSource fc;

  public static final String SERIALIZED_NAME_FLEX_VOLUME = "flexVolume";
  @SerializedName(SERIALIZED_NAME_FLEX_VOLUME)
  private FlexVolumeSource flexVolume;

  public static final String SERIALIZED_NAME_FLOCKER = "flocker";
  @SerializedName(SERIALIZED_NAME_FLOCKER)
  private FlockerVolumeSource flocker;

  public static final String SERIALIZED_NAME_GCE_PERSISTENT_DISK = "gcePersistentDisk";
  @SerializedName(SERIALIZED_NAME_GCE_PERSISTENT_DISK)
  private GCEPersistentDiskVolumeSource gcePersistentDisk;

  public static final String SERIALIZED_NAME_GIT_REPO = "gitRepo";
  @SerializedName(SERIALIZED_NAME_GIT_REPO)
  private GitRepoVolumeSource gitRepo;

  public static final String SERIALIZED_NAME_GLUSTERFS = "glusterfs";
  @SerializedName(SERIALIZED_NAME_GLUSTERFS)
  private GlusterfsVolumeSource glusterfs;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";
  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  private HostPathVolumeSource hostPath;

  public static final String SERIALIZED_NAME_ISCSI = "iscsi";
  @SerializedName(SERIALIZED_NAME_ISCSI)
  private ISCSIVolumeSource iscsi;

  public static final String SERIALIZED_NAME_NFS = "nfs";
  @SerializedName(SERIALIZED_NAME_NFS)
  private NFSVolumeSource nfs;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM)
  private PersistentVolumeClaimVolumeSource persistentVolumeClaim;

  public static final String SERIALIZED_NAME_PHOTON_PERSISTENT_DISK = "photonPersistentDisk";
  @SerializedName(SERIALIZED_NAME_PHOTON_PERSISTENT_DISK)
  private PhotonPersistentDiskVolumeSource photonPersistentDisk;

  public static final String SERIALIZED_NAME_PORTWORX_VOLUME = "portworxVolume";
  @SerializedName(SERIALIZED_NAME_PORTWORX_VOLUME)
  private PortworxVolumeSource portworxVolume;

  public static final String SERIALIZED_NAME_PROJECTED = "projected";
  @SerializedName(SERIALIZED_NAME_PROJECTED)
  private ProjectedVolumeSource projected;

  public static final String SERIALIZED_NAME_QUOBYTE = "quobyte";
  @SerializedName(SERIALIZED_NAME_QUOBYTE)
  private QuobyteVolumeSource quobyte;

  public static final String SERIALIZED_NAME_RBD = "rbd";
  @SerializedName(SERIALIZED_NAME_RBD)
  private RBDVolumeSource rbd;

  public static final String SERIALIZED_NAME_SCALE_I_O = "scaleIO";
  @SerializedName(SERIALIZED_NAME_SCALE_I_O)
  private ScaleIOVolumeSource scaleIO;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private SecretVolumeSource secret;

  public static final String SERIALIZED_NAME_STORAGEOS = "storageos";
  @SerializedName(SERIALIZED_NAME_STORAGEOS)
  private StorageOSVolumeSource storageos;

  public static final String SERIALIZED_NAME_VSPHERE_VOLUME = "vsphereVolume";
  @SerializedName(SERIALIZED_NAME_VSPHERE_VOLUME)
  private VsphereVirtualDiskVolumeSource vsphereVolume;


  public VolumeSource awsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

   /**
   * Get awsElasticBlockStore
   * @return awsElasticBlockStore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }


  public void setAwsElasticBlockStore(AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }


  public VolumeSource azureDisk(AzureDiskVolumeSource azureDisk) {
    
    this.azureDisk = azureDisk;
    return this;
  }

   /**
   * Get azureDisk
   * @return azureDisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AzureDiskVolumeSource getAzureDisk() {
    return azureDisk;
  }


  public void setAzureDisk(AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
  }


  public VolumeSource azureFile(AzureFileVolumeSource azureFile) {
    
    this.azureFile = azureFile;
    return this;
  }

   /**
   * Get azureFile
   * @return azureFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AzureFileVolumeSource getAzureFile() {
    return azureFile;
  }


  public void setAzureFile(AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
  }


  public VolumeSource cephfs(CephFSVolumeSource cephfs) {
    
    this.cephfs = cephfs;
    return this;
  }

   /**
   * Get cephfs
   * @return cephfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CephFSVolumeSource getCephfs() {
    return cephfs;
  }


  public void setCephfs(CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
  }


  public VolumeSource cinder(CinderVolumeSource cinder) {
    
    this.cinder = cinder;
    return this;
  }

   /**
   * Get cinder
   * @return cinder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CinderVolumeSource getCinder() {
    return cinder;
  }


  public void setCinder(CinderVolumeSource cinder) {
    this.cinder = cinder;
  }


  public VolumeSource configMap(ConfigMapVolumeSource configMap) {
    
    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigMapVolumeSource getConfigMap() {
    return configMap;
  }


  public void setConfigMap(ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
  }


  public VolumeSource csi(CSIVolumeSource csi) {
    
    this.csi = csi;
    return this;
  }

   /**
   * Get csi
   * @return csi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CSIVolumeSource getCsi() {
    return csi;
  }


  public void setCsi(CSIVolumeSource csi) {
    this.csi = csi;
  }


  public VolumeSource downwardAPI(DownwardAPIVolumeSource downwardAPI) {
    
    this.downwardAPI = downwardAPI;
    return this;
  }

   /**
   * Get downwardAPI
   * @return downwardAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DownwardAPIVolumeSource getDownwardAPI() {
    return downwardAPI;
  }


  public void setDownwardAPI(DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
  }


  public VolumeSource emptyDir(EmptyDirVolumeSource emptyDir) {
    
    this.emptyDir = emptyDir;
    return this;
  }

   /**
   * Get emptyDir
   * @return emptyDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmptyDirVolumeSource getEmptyDir() {
    return emptyDir;
  }


  public void setEmptyDir(EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
  }


  public VolumeSource fc(FCVolumeSource fc) {
    
    this.fc = fc;
    return this;
  }

   /**
   * Get fc
   * @return fc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FCVolumeSource getFc() {
    return fc;
  }


  public void setFc(FCVolumeSource fc) {
    this.fc = fc;
  }


  public VolumeSource flexVolume(FlexVolumeSource flexVolume) {
    
    this.flexVolume = flexVolume;
    return this;
  }

   /**
   * Get flexVolume
   * @return flexVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FlexVolumeSource getFlexVolume() {
    return flexVolume;
  }


  public void setFlexVolume(FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }


  public VolumeSource flocker(FlockerVolumeSource flocker) {
    
    this.flocker = flocker;
    return this;
  }

   /**
   * Get flocker
   * @return flocker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FlockerVolumeSource getFlocker() {
    return flocker;
  }


  public void setFlocker(FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }


  public VolumeSource gcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk) {
    
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

   /**
   * Get gcePersistentDisk
   * @return gcePersistentDisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }


  public void setGcePersistentDisk(GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }


  public VolumeSource gitRepo(GitRepoVolumeSource gitRepo) {
    
    this.gitRepo = gitRepo;
    return this;
  }

   /**
   * Get gitRepo
   * @return gitRepo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GitRepoVolumeSource getGitRepo() {
    return gitRepo;
  }


  public void setGitRepo(GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
  }


  public VolumeSource glusterfs(GlusterfsVolumeSource glusterfs) {
    
    this.glusterfs = glusterfs;
    return this;
  }

   /**
   * Get glusterfs
   * @return glusterfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GlusterfsVolumeSource getGlusterfs() {
    return glusterfs;
  }


  public void setGlusterfs(GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }


  public VolumeSource hostPath(HostPathVolumeSource hostPath) {
    
    this.hostPath = hostPath;
    return this;
  }

   /**
   * Get hostPath
   * @return hostPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HostPathVolumeSource getHostPath() {
    return hostPath;
  }


  public void setHostPath(HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }


  public VolumeSource iscsi(ISCSIVolumeSource iscsi) {
    
    this.iscsi = iscsi;
    return this;
  }

   /**
   * Get iscsi
   * @return iscsi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ISCSIVolumeSource getIscsi() {
    return iscsi;
  }


  public void setIscsi(ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
  }


  public VolumeSource nfs(NFSVolumeSource nfs) {
    
    this.nfs = nfs;
    return this;
  }

   /**
   * Get nfs
   * @return nfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NFSVolumeSource getNfs() {
    return nfs;
  }


  public void setNfs(NFSVolumeSource nfs) {
    this.nfs = nfs;
  }


  public VolumeSource persistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

   /**
   * Get persistentVolumeClaim
   * @return persistentVolumeClaim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }


  public void setPersistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }


  public VolumeSource photonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

   /**
   * Get photonPersistentDisk
   * @return photonPersistentDisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }


  public void setPhotonPersistentDisk(PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }


  public VolumeSource portworxVolume(PortworxVolumeSource portworxVolume) {
    
    this.portworxVolume = portworxVolume;
    return this;
  }

   /**
   * Get portworxVolume
   * @return portworxVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PortworxVolumeSource getPortworxVolume() {
    return portworxVolume;
  }


  public void setPortworxVolume(PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
  }


  public VolumeSource projected(ProjectedVolumeSource projected) {
    
    this.projected = projected;
    return this;
  }

   /**
   * Get projected
   * @return projected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectedVolumeSource getProjected() {
    return projected;
  }


  public void setProjected(ProjectedVolumeSource projected) {
    this.projected = projected;
  }


  public VolumeSource quobyte(QuobyteVolumeSource quobyte) {
    
    this.quobyte = quobyte;
    return this;
  }

   /**
   * Get quobyte
   * @return quobyte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QuobyteVolumeSource getQuobyte() {
    return quobyte;
  }


  public void setQuobyte(QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
  }


  public VolumeSource rbd(RBDVolumeSource rbd) {
    
    this.rbd = rbd;
    return this;
  }

   /**
   * Get rbd
   * @return rbd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RBDVolumeSource getRbd() {
    return rbd;
  }


  public void setRbd(RBDVolumeSource rbd) {
    this.rbd = rbd;
  }


  public VolumeSource scaleIO(ScaleIOVolumeSource scaleIO) {
    
    this.scaleIO = scaleIO;
    return this;
  }

   /**
   * Get scaleIO
   * @return scaleIO
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScaleIOVolumeSource getScaleIO() {
    return scaleIO;
  }


  public void setScaleIO(ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }


  public VolumeSource secret(SecretVolumeSource secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SecretVolumeSource getSecret() {
    return secret;
  }


  public void setSecret(SecretVolumeSource secret) {
    this.secret = secret;
  }


  public VolumeSource storageos(StorageOSVolumeSource storageos) {
    
    this.storageos = storageos;
    return this;
  }

   /**
   * Get storageos
   * @return storageos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageOSVolumeSource getStorageos() {
    return storageos;
  }


  public void setStorageos(StorageOSVolumeSource storageos) {
    this.storageos = storageos;
  }


  public VolumeSource vsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
    
    this.vsphereVolume = vsphereVolume;
    return this;
  }

   /**
   * Get vsphereVolume
   * @return vsphereVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return vsphereVolume;
  }


  public void setVsphereVolume(VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeSource volumeSource = (VolumeSource) o;
    return Objects.equals(this.awsElasticBlockStore, volumeSource.awsElasticBlockStore) &&
        Objects.equals(this.azureDisk, volumeSource.azureDisk) &&
        Objects.equals(this.azureFile, volumeSource.azureFile) &&
        Objects.equals(this.cephfs, volumeSource.cephfs) &&
        Objects.equals(this.cinder, volumeSource.cinder) &&
        Objects.equals(this.configMap, volumeSource.configMap) &&
        Objects.equals(this.csi, volumeSource.csi) &&
        Objects.equals(this.downwardAPI, volumeSource.downwardAPI) &&
        Objects.equals(this.emptyDir, volumeSource.emptyDir) &&
        Objects.equals(this.fc, volumeSource.fc) &&
        Objects.equals(this.flexVolume, volumeSource.flexVolume) &&
        Objects.equals(this.flocker, volumeSource.flocker) &&
        Objects.equals(this.gcePersistentDisk, volumeSource.gcePersistentDisk) &&
        Objects.equals(this.gitRepo, volumeSource.gitRepo) &&
        Objects.equals(this.glusterfs, volumeSource.glusterfs) &&
        Objects.equals(this.hostPath, volumeSource.hostPath) &&
        Objects.equals(this.iscsi, volumeSource.iscsi) &&
        Objects.equals(this.nfs, volumeSource.nfs) &&
        Objects.equals(this.persistentVolumeClaim, volumeSource.persistentVolumeClaim) &&
        Objects.equals(this.photonPersistentDisk, volumeSource.photonPersistentDisk) &&
        Objects.equals(this.portworxVolume, volumeSource.portworxVolume) &&
        Objects.equals(this.projected, volumeSource.projected) &&
        Objects.equals(this.quobyte, volumeSource.quobyte) &&
        Objects.equals(this.rbd, volumeSource.rbd) &&
        Objects.equals(this.scaleIO, volumeSource.scaleIO) &&
        Objects.equals(this.secret, volumeSource.secret) &&
        Objects.equals(this.storageos, volumeSource.storageos) &&
        Objects.equals(this.vsphereVolume, volumeSource.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, csi, downwardAPI, emptyDir, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, iscsi, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIO, secret, storageos, vsphereVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeSource {\n");
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    csi: ").append(toIndentedString(csi)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    gitRepo: ").append(toIndentedString(gitRepo)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    projected: ").append(toIndentedString(projected)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
    sb.append("    vsphereVolume: ").append(toIndentedString(vsphereVolume)).append("\n");
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

