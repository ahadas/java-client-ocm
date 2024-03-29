/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package open_cluster_management.io;

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
import open_cluster_management.io.IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1AzureDiskVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1AzureFileVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1CSIVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1CephFSVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1CinderVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1ConfigMapVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1DownwardAPIVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1EmptyDirVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1FCVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1FlexVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1FlockerVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1GCEPersistentDiskVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1GitRepoVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1GlusterfsVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1HostPathVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1ISCSIVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1NFSVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1PersistentVolumeClaimVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1PhotonPersistentDiskVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1PortworxVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1ProjectedVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1QuobyteVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1RBDVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1ScaleIOVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1SecretVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1StorageOSVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1VsphereVirtualDiskVolumeSource;

/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 */
@ApiModel(description = "Volume represents a named volume in a pod that may be accessed by any container in the pod.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1Volume {
  @SerializedName("awsElasticBlockStore")
  private IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore = null;

  @SerializedName("azureDisk")
  private IoK8sApiCoreV1AzureDiskVolumeSource azureDisk = null;

  @SerializedName("azureFile")
  private IoK8sApiCoreV1AzureFileVolumeSource azureFile = null;

  @SerializedName("cephfs")
  private IoK8sApiCoreV1CephFSVolumeSource cephfs = null;

  @SerializedName("cinder")
  private IoK8sApiCoreV1CinderVolumeSource cinder = null;

  @SerializedName("configMap")
  private IoK8sApiCoreV1ConfigMapVolumeSource configMap = null;

  @SerializedName("csi")
  private IoK8sApiCoreV1CSIVolumeSource csi = null;

  @SerializedName("downwardAPI")
  private IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI = null;

  @SerializedName("emptyDir")
  private IoK8sApiCoreV1EmptyDirVolumeSource emptyDir = null;

  @SerializedName("fc")
  private IoK8sApiCoreV1FCVolumeSource fc = null;

  @SerializedName("flexVolume")
  private IoK8sApiCoreV1FlexVolumeSource flexVolume = null;

  @SerializedName("flocker")
  private IoK8sApiCoreV1FlockerVolumeSource flocker = null;

  @SerializedName("gcePersistentDisk")
  private IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk = null;

  @SerializedName("gitRepo")
  private IoK8sApiCoreV1GitRepoVolumeSource gitRepo = null;

  @SerializedName("glusterfs")
  private IoK8sApiCoreV1GlusterfsVolumeSource glusterfs = null;

  @SerializedName("hostPath")
  private IoK8sApiCoreV1HostPathVolumeSource hostPath = null;

  @SerializedName("iscsi")
  private IoK8sApiCoreV1ISCSIVolumeSource iscsi = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nfs")
  private IoK8sApiCoreV1NFSVolumeSource nfs = null;

  @SerializedName("persistentVolumeClaim")
  private IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim = null;

  @SerializedName("photonPersistentDisk")
  private IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk = null;

  @SerializedName("portworxVolume")
  private IoK8sApiCoreV1PortworxVolumeSource portworxVolume = null;

  @SerializedName("projected")
  private IoK8sApiCoreV1ProjectedVolumeSource projected = null;

  @SerializedName("quobyte")
  private IoK8sApiCoreV1QuobyteVolumeSource quobyte = null;

  @SerializedName("rbd")
  private IoK8sApiCoreV1RBDVolumeSource rbd = null;

  @SerializedName("scaleIO")
  private IoK8sApiCoreV1ScaleIOVolumeSource scaleIO = null;

  @SerializedName("secret")
  private IoK8sApiCoreV1SecretVolumeSource secret = null;

  @SerializedName("storageos")
  private IoK8sApiCoreV1StorageOSVolumeSource storageos = null;

  @SerializedName("vsphereVolume")
  private IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume = null;

  public IoK8sApiCoreV1Volume awsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

   /**
   * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   * @return awsElasticBlockStore
  **/
  @ApiModelProperty(value = "AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
  public IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }

  public void setAwsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }

  public IoK8sApiCoreV1Volume azureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
    return this;
  }

   /**
   * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
   * @return azureDisk
  **/
  @ApiModelProperty(value = "AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
  public IoK8sApiCoreV1AzureDiskVolumeSource getAzureDisk() {
    return azureDisk;
  }

  public void setAzureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
  }

  public IoK8sApiCoreV1Volume azureFile(IoK8sApiCoreV1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

   /**
   * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
   * @return azureFile
  **/
  @ApiModelProperty(value = "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
  public IoK8sApiCoreV1AzureFileVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(IoK8sApiCoreV1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
  }

  public IoK8sApiCoreV1Volume cephfs(IoK8sApiCoreV1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

   /**
   * CephFS represents a Ceph FS mount on the host that shares a pod&#39;s lifetime
   * @return cephfs
  **/
  @ApiModelProperty(value = "CephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
  public IoK8sApiCoreV1CephFSVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(IoK8sApiCoreV1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
  }

  public IoK8sApiCoreV1Volume cinder(IoK8sApiCoreV1CinderVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

   /**
   * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return cinder
  **/
  @ApiModelProperty(value = "Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  public IoK8sApiCoreV1CinderVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(IoK8sApiCoreV1CinderVolumeSource cinder) {
    this.cinder = cinder;
  }

  public IoK8sApiCoreV1Volume configMap(IoK8sApiCoreV1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
    return this;
  }

   /**
   * ConfigMap represents a configMap that should populate this volume
   * @return configMap
  **/
  @ApiModelProperty(value = "ConfigMap represents a configMap that should populate this volume")
  public IoK8sApiCoreV1ConfigMapVolumeSource getConfigMap() {
    return configMap;
  }

  public void setConfigMap(IoK8sApiCoreV1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
  }

  public IoK8sApiCoreV1Volume csi(IoK8sApiCoreV1CSIVolumeSource csi) {
    this.csi = csi;
    return this;
  }

   /**
   * CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).
   * @return csi
  **/
  @ApiModelProperty(value = "CSI (Container Storage Interface) represents storage that is handled by an external CSI driver (Alpha feature).")
  public IoK8sApiCoreV1CSIVolumeSource getCsi() {
    return csi;
  }

  public void setCsi(IoK8sApiCoreV1CSIVolumeSource csi) {
    this.csi = csi;
  }

  public IoK8sApiCoreV1Volume downwardAPI(IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
    return this;
  }

   /**
   * DownwardAPI represents downward API about the pod that should populate this volume
   * @return downwardAPI
  **/
  @ApiModelProperty(value = "DownwardAPI represents downward API about the pod that should populate this volume")
  public IoK8sApiCoreV1DownwardAPIVolumeSource getDownwardAPI() {
    return downwardAPI;
  }

  public void setDownwardAPI(IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
  }

  public IoK8sApiCoreV1Volume emptyDir(IoK8sApiCoreV1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
    return this;
  }

   /**
   * EmptyDir represents a temporary directory that shares a pod&#39;s lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
   * @return emptyDir
  **/
  @ApiModelProperty(value = "EmptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
  public IoK8sApiCoreV1EmptyDirVolumeSource getEmptyDir() {
    return emptyDir;
  }

  public void setEmptyDir(IoK8sApiCoreV1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
  }

  public IoK8sApiCoreV1Volume fc(IoK8sApiCoreV1FCVolumeSource fc) {
    this.fc = fc;
    return this;
  }

   /**
   * FC represents a Fibre Channel resource that is attached to a kubelet&#39;s host machine and then exposed to the pod.
   * @return fc
  **/
  @ApiModelProperty(value = "FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.")
  public IoK8sApiCoreV1FCVolumeSource getFc() {
    return fc;
  }

  public void setFc(IoK8sApiCoreV1FCVolumeSource fc) {
    this.fc = fc;
  }

  public IoK8sApiCoreV1Volume flexVolume(IoK8sApiCoreV1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

   /**
   * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
   * @return flexVolume
  **/
  @ApiModelProperty(value = "FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
  public IoK8sApiCoreV1FlexVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(IoK8sApiCoreV1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }

  public IoK8sApiCoreV1Volume flocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

   /**
   * Flocker represents a Flocker volume attached to a kubelet&#39;s host machine. This depends on the Flocker control service being running
   * @return flocker
  **/
  @ApiModelProperty(value = "Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running")
  public IoK8sApiCoreV1FlockerVolumeSource getFlocker() {
    return flocker;
  }

  public void setFlocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }

  public IoK8sApiCoreV1Volume gcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

   /**
   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   * @return gcePersistentDisk
  **/
  @ApiModelProperty(value = "GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  public IoK8sApiCoreV1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }

  public void setGcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }

  public IoK8sApiCoreV1Volume gitRepo(IoK8sApiCoreV1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
    return this;
  }

   /**
   * GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod&#39;s container.
   * @return gitRepo
  **/
  @ApiModelProperty(value = "GitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.")
  public IoK8sApiCoreV1GitRepoVolumeSource getGitRepo() {
    return gitRepo;
  }

  public void setGitRepo(IoK8sApiCoreV1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
  }

  public IoK8sApiCoreV1Volume glusterfs(IoK8sApiCoreV1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

   /**
   * Glusterfs represents a Glusterfs mount on the host that shares a pod&#39;s lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
   * @return glusterfs
  **/
  @ApiModelProperty(value = "Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md")
  public IoK8sApiCoreV1GlusterfsVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(IoK8sApiCoreV1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }

  public IoK8sApiCoreV1Volume hostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

   /**
   * HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   * @return hostPath
  **/
  @ApiModelProperty(value = "HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
  public IoK8sApiCoreV1HostPathVolumeSource getHostPath() {
    return hostPath;
  }

  public void setHostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }

  public IoK8sApiCoreV1Volume iscsi(IoK8sApiCoreV1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

   /**
   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
   * @return iscsi
  **/
  @ApiModelProperty(value = "ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md")
  public IoK8sApiCoreV1ISCSIVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(IoK8sApiCoreV1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
  }

  public IoK8sApiCoreV1Volume name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Volume&#39;s name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1Volume nfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

   /**
   * NFS represents an NFS mount on the host that shares a pod&#39;s lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   * @return nfs
  **/
  @ApiModelProperty(value = "NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  public IoK8sApiCoreV1NFSVolumeSource getNfs() {
    return nfs;
  }

  public void setNfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }

  public IoK8sApiCoreV1Volume persistentVolumeClaim(IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

   /**
   * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   * @return persistentVolumeClaim
  **/
  @ApiModelProperty(value = "PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }

  public void setPersistentVolumeClaim(IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }

  public IoK8sApiCoreV1Volume photonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

   /**
   * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
   * @return photonPersistentDisk
  **/
  @ApiModelProperty(value = "PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine")
  public IoK8sApiCoreV1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }

  public void setPhotonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }

  public IoK8sApiCoreV1Volume portworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
    return this;
  }

   /**
   * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
   * @return portworxVolume
  **/
  @ApiModelProperty(value = "PortworxVolume represents a portworx volume attached and mounted on kubelets host machine")
  public IoK8sApiCoreV1PortworxVolumeSource getPortworxVolume() {
    return portworxVolume;
  }

  public void setPortworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
  }

  public IoK8sApiCoreV1Volume projected(IoK8sApiCoreV1ProjectedVolumeSource projected) {
    this.projected = projected;
    return this;
  }

   /**
   * Items for all in one resources secrets, configmaps, and downward API
   * @return projected
  **/
  @ApiModelProperty(value = "Items for all in one resources secrets, configmaps, and downward API")
  public IoK8sApiCoreV1ProjectedVolumeSource getProjected() {
    return projected;
  }

  public void setProjected(IoK8sApiCoreV1ProjectedVolumeSource projected) {
    this.projected = projected;
  }

  public IoK8sApiCoreV1Volume quobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
    return this;
  }

   /**
   * Quobyte represents a Quobyte mount on the host that shares a pod&#39;s lifetime
   * @return quobyte
  **/
  @ApiModelProperty(value = "Quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
  public IoK8sApiCoreV1QuobyteVolumeSource getQuobyte() {
    return quobyte;
  }

  public void setQuobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
  }

  public IoK8sApiCoreV1Volume rbd(IoK8sApiCoreV1RBDVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

   /**
   * RBD represents a Rados Block Device mount on the host that shares a pod&#39;s lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
   * @return rbd
  **/
  @ApiModelProperty(value = "RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md")
  public IoK8sApiCoreV1RBDVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(IoK8sApiCoreV1RBDVolumeSource rbd) {
    this.rbd = rbd;
  }

  public IoK8sApiCoreV1Volume scaleIO(IoK8sApiCoreV1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

   /**
   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
   * @return scaleIO
  **/
  @ApiModelProperty(value = "ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
  public IoK8sApiCoreV1ScaleIOVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(IoK8sApiCoreV1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }

  public IoK8sApiCoreV1Volume secret(IoK8sApiCoreV1SecretVolumeSource secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
   * @return secret
  **/
  @ApiModelProperty(value = "Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
  public IoK8sApiCoreV1SecretVolumeSource getSecret() {
    return secret;
  }

  public void setSecret(IoK8sApiCoreV1SecretVolumeSource secret) {
    this.secret = secret;
  }

  public IoK8sApiCoreV1Volume storageos(IoK8sApiCoreV1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
    return this;
  }

   /**
   * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
   * @return storageos
  **/
  @ApiModelProperty(value = "StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.")
  public IoK8sApiCoreV1StorageOSVolumeSource getStorageos() {
    return storageos;
  }

  public void setStorageos(IoK8sApiCoreV1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
  }

  public IoK8sApiCoreV1Volume vsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
    return this;
  }

   /**
   * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
   * @return vsphereVolume
  **/
  @ApiModelProperty(value = "VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return vsphereVolume;
  }

  public void setVsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
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
    IoK8sApiCoreV1Volume ioK8sApiCoreV1Volume = (IoK8sApiCoreV1Volume) o;
    return Objects.equals(this.awsElasticBlockStore, ioK8sApiCoreV1Volume.awsElasticBlockStore) &&
        Objects.equals(this.azureDisk, ioK8sApiCoreV1Volume.azureDisk) &&
        Objects.equals(this.azureFile, ioK8sApiCoreV1Volume.azureFile) &&
        Objects.equals(this.cephfs, ioK8sApiCoreV1Volume.cephfs) &&
        Objects.equals(this.cinder, ioK8sApiCoreV1Volume.cinder) &&
        Objects.equals(this.configMap, ioK8sApiCoreV1Volume.configMap) &&
        Objects.equals(this.csi, ioK8sApiCoreV1Volume.csi) &&
        Objects.equals(this.downwardAPI, ioK8sApiCoreV1Volume.downwardAPI) &&
        Objects.equals(this.emptyDir, ioK8sApiCoreV1Volume.emptyDir) &&
        Objects.equals(this.fc, ioK8sApiCoreV1Volume.fc) &&
        Objects.equals(this.flexVolume, ioK8sApiCoreV1Volume.flexVolume) &&
        Objects.equals(this.flocker, ioK8sApiCoreV1Volume.flocker) &&
        Objects.equals(this.gcePersistentDisk, ioK8sApiCoreV1Volume.gcePersistentDisk) &&
        Objects.equals(this.gitRepo, ioK8sApiCoreV1Volume.gitRepo) &&
        Objects.equals(this.glusterfs, ioK8sApiCoreV1Volume.glusterfs) &&
        Objects.equals(this.hostPath, ioK8sApiCoreV1Volume.hostPath) &&
        Objects.equals(this.iscsi, ioK8sApiCoreV1Volume.iscsi) &&
        Objects.equals(this.name, ioK8sApiCoreV1Volume.name) &&
        Objects.equals(this.nfs, ioK8sApiCoreV1Volume.nfs) &&
        Objects.equals(this.persistentVolumeClaim, ioK8sApiCoreV1Volume.persistentVolumeClaim) &&
        Objects.equals(this.photonPersistentDisk, ioK8sApiCoreV1Volume.photonPersistentDisk) &&
        Objects.equals(this.portworxVolume, ioK8sApiCoreV1Volume.portworxVolume) &&
        Objects.equals(this.projected, ioK8sApiCoreV1Volume.projected) &&
        Objects.equals(this.quobyte, ioK8sApiCoreV1Volume.quobyte) &&
        Objects.equals(this.rbd, ioK8sApiCoreV1Volume.rbd) &&
        Objects.equals(this.scaleIO, ioK8sApiCoreV1Volume.scaleIO) &&
        Objects.equals(this.secret, ioK8sApiCoreV1Volume.secret) &&
        Objects.equals(this.storageos, ioK8sApiCoreV1Volume.storageos) &&
        Objects.equals(this.vsphereVolume, ioK8sApiCoreV1Volume.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, csi, downwardAPI, emptyDir, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, iscsi, name, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIO, secret, storageos, vsphereVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Volume {\n");
    
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
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

