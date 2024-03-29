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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import open_cluster_management.io.IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1AzureDiskVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1AzureFilePersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1CSIPersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1CephFSPersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1CinderPersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1FCVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1FlexPersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1FlockerVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1GCEPersistentDiskVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1GlusterfsPersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1HostPathVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1ISCSIPersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1LocalVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1NFSVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;
import open_cluster_management.io.IoK8sApiCoreV1PhotonPersistentDiskVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1PortworxVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1QuobyteVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1RBDPersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1ScaleIOPersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1StorageOSPersistentVolumeSource;
import open_cluster_management.io.IoK8sApiCoreV1VolumeNodeAffinity;
import open_cluster_management.io.IoK8sApiCoreV1VsphereVirtualDiskVolumeSource;

/**
 * PersistentVolumeSpec is the specification of a persistent volume.
 */
@ApiModel(description = "PersistentVolumeSpec is the specification of a persistent volume.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1PersistentVolumeSpec {
  @SerializedName("accessModes")
  private List<String> accessModes = null;

  @SerializedName("awsElasticBlockStore")
  private IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore = null;

  @SerializedName("azureDisk")
  private IoK8sApiCoreV1AzureDiskVolumeSource azureDisk = null;

  @SerializedName("azureFile")
  private IoK8sApiCoreV1AzureFilePersistentVolumeSource azureFile = null;

  @SerializedName("capacity")
  private Map<String, String> capacity = null;

  @SerializedName("cephfs")
  private IoK8sApiCoreV1CephFSPersistentVolumeSource cephfs = null;

  @SerializedName("cinder")
  private IoK8sApiCoreV1CinderPersistentVolumeSource cinder = null;

  @SerializedName("claimRef")
  private IoK8sApiCoreV1ObjectReference claimRef = null;

  @SerializedName("csi")
  private IoK8sApiCoreV1CSIPersistentVolumeSource csi = null;

  @SerializedName("fc")
  private IoK8sApiCoreV1FCVolumeSource fc = null;

  @SerializedName("flexVolume")
  private IoK8sApiCoreV1FlexPersistentVolumeSource flexVolume = null;

  @SerializedName("flocker")
  private IoK8sApiCoreV1FlockerVolumeSource flocker = null;

  @SerializedName("gcePersistentDisk")
  private IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk = null;

  @SerializedName("glusterfs")
  private IoK8sApiCoreV1GlusterfsPersistentVolumeSource glusterfs = null;

  @SerializedName("hostPath")
  private IoK8sApiCoreV1HostPathVolumeSource hostPath = null;

  @SerializedName("iscsi")
  private IoK8sApiCoreV1ISCSIPersistentVolumeSource iscsi = null;

  @SerializedName("local")
  private IoK8sApiCoreV1LocalVolumeSource local = null;

  @SerializedName("mountOptions")
  private List<String> mountOptions = null;

  @SerializedName("nfs")
  private IoK8sApiCoreV1NFSVolumeSource nfs = null;

  @SerializedName("nodeAffinity")
  private IoK8sApiCoreV1VolumeNodeAffinity nodeAffinity = null;

  @SerializedName("persistentVolumeReclaimPolicy")
  private String persistentVolumeReclaimPolicy = null;

  @SerializedName("photonPersistentDisk")
  private IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk = null;

  @SerializedName("portworxVolume")
  private IoK8sApiCoreV1PortworxVolumeSource portworxVolume = null;

  @SerializedName("quobyte")
  private IoK8sApiCoreV1QuobyteVolumeSource quobyte = null;

  @SerializedName("rbd")
  private IoK8sApiCoreV1RBDPersistentVolumeSource rbd = null;

  @SerializedName("scaleIO")
  private IoK8sApiCoreV1ScaleIOPersistentVolumeSource scaleIO = null;

  @SerializedName("storageClassName")
  private String storageClassName = null;

  @SerializedName("storageos")
  private IoK8sApiCoreV1StorageOSPersistentVolumeSource storageos = null;

  @SerializedName("volumeMode")
  private String volumeMode = null;

  @SerializedName("vsphereVolume")
  private IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume = null;

  public IoK8sApiCoreV1PersistentVolumeSpec accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
   * @return accessModes
  **/
  @ApiModelProperty(value = "AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec awsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
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

  public IoK8sApiCoreV1PersistentVolumeSpec azureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
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

  public IoK8sApiCoreV1PersistentVolumeSpec azureFile(IoK8sApiCoreV1AzureFilePersistentVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

   /**
   * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
   * @return azureFile
  **/
  @ApiModelProperty(value = "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
  public IoK8sApiCoreV1AzureFilePersistentVolumeSource getAzureFile() {
    return azureFile;
  }

  public void setAzureFile(IoK8sApiCoreV1AzureFilePersistentVolumeSource azureFile) {
    this.azureFile = azureFile;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec capacity(Map<String, String> capacity) {
    this.capacity = capacity;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec putCapacityItem(String key, String capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

   /**
   * A description of the persistent volume&#39;s resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "A description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity")
  public Map<String, String> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, String> capacity) {
    this.capacity = capacity;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec cephfs(IoK8sApiCoreV1CephFSPersistentVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

   /**
   * CephFS represents a Ceph FS mount on the host that shares a pod&#39;s lifetime
   * @return cephfs
  **/
  @ApiModelProperty(value = "CephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
  public IoK8sApiCoreV1CephFSPersistentVolumeSource getCephfs() {
    return cephfs;
  }

  public void setCephfs(IoK8sApiCoreV1CephFSPersistentVolumeSource cephfs) {
    this.cephfs = cephfs;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec cinder(IoK8sApiCoreV1CinderPersistentVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

   /**
   * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return cinder
  **/
  @ApiModelProperty(value = "Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  public IoK8sApiCoreV1CinderPersistentVolumeSource getCinder() {
    return cinder;
  }

  public void setCinder(IoK8sApiCoreV1CinderPersistentVolumeSource cinder) {
    this.cinder = cinder;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec claimRef(IoK8sApiCoreV1ObjectReference claimRef) {
    this.claimRef = claimRef;
    return this;
  }

   /**
   * ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
   * @return claimRef
  **/
  @ApiModelProperty(value = "ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding")
  public IoK8sApiCoreV1ObjectReference getClaimRef() {
    return claimRef;
  }

  public void setClaimRef(IoK8sApiCoreV1ObjectReference claimRef) {
    this.claimRef = claimRef;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec csi(IoK8sApiCoreV1CSIPersistentVolumeSource csi) {
    this.csi = csi;
    return this;
  }

   /**
   * CSI represents storage that is handled by an external CSI driver (Beta feature).
   * @return csi
  **/
  @ApiModelProperty(value = "CSI represents storage that is handled by an external CSI driver (Beta feature).")
  public IoK8sApiCoreV1CSIPersistentVolumeSource getCsi() {
    return csi;
  }

  public void setCsi(IoK8sApiCoreV1CSIPersistentVolumeSource csi) {
    this.csi = csi;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec fc(IoK8sApiCoreV1FCVolumeSource fc) {
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

  public IoK8sApiCoreV1PersistentVolumeSpec flexVolume(IoK8sApiCoreV1FlexPersistentVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

   /**
   * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
   * @return flexVolume
  **/
  @ApiModelProperty(value = "FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
  public IoK8sApiCoreV1FlexPersistentVolumeSource getFlexVolume() {
    return flexVolume;
  }

  public void setFlexVolume(IoK8sApiCoreV1FlexPersistentVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec flocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

   /**
   * Flocker represents a Flocker volume attached to a kubelet&#39;s host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
   * @return flocker
  **/
  @ApiModelProperty(value = "Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running")
  public IoK8sApiCoreV1FlockerVolumeSource getFlocker() {
    return flocker;
  }

  public void setFlocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec gcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

   /**
   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   * @return gcePersistentDisk
  **/
  @ApiModelProperty(value = "GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  public IoK8sApiCoreV1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }

  public void setGcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec glusterfs(IoK8sApiCoreV1GlusterfsPersistentVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

   /**
   * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
   * @return glusterfs
  **/
  @ApiModelProperty(value = "Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md")
  public IoK8sApiCoreV1GlusterfsPersistentVolumeSource getGlusterfs() {
    return glusterfs;
  }

  public void setGlusterfs(IoK8sApiCoreV1GlusterfsPersistentVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec hostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

   /**
   * HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   * @return hostPath
  **/
  @ApiModelProperty(value = "HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
  public IoK8sApiCoreV1HostPathVolumeSource getHostPath() {
    return hostPath;
  }

  public void setHostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec iscsi(IoK8sApiCoreV1ISCSIPersistentVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

   /**
   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. Provisioned by an admin.
   * @return iscsi
  **/
  @ApiModelProperty(value = "ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.")
  public IoK8sApiCoreV1ISCSIPersistentVolumeSource getIscsi() {
    return iscsi;
  }

  public void setIscsi(IoK8sApiCoreV1ISCSIPersistentVolumeSource iscsi) {
    this.iscsi = iscsi;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec local(IoK8sApiCoreV1LocalVolumeSource local) {
    this.local = local;
    return this;
  }

   /**
   * Local represents directly-attached storage with node affinity
   * @return local
  **/
  @ApiModelProperty(value = "Local represents directly-attached storage with node affinity")
  public IoK8sApiCoreV1LocalVolumeSource getLocal() {
    return local;
  }

  public void setLocal(IoK8sApiCoreV1LocalVolumeSource local) {
    this.local = local;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec mountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec addMountOptionsItem(String mountOptionsItem) {
    if (this.mountOptions == null) {
      this.mountOptions = new ArrayList<>();
    }
    this.mountOptions.add(mountOptionsItem);
    return this;
  }

   /**
   * A list of mount options, e.g. [\&quot;ro\&quot;, \&quot;soft\&quot;]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
   * @return mountOptions
  **/
  @ApiModelProperty(value = "A list of mount options, e.g. [\"ro\", \"soft\"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options")
  public List<String> getMountOptions() {
    return mountOptions;
  }

  public void setMountOptions(List<String> mountOptions) {
    this.mountOptions = mountOptions;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec nfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

   /**
   * NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   * @return nfs
  **/
  @ApiModelProperty(value = "NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  public IoK8sApiCoreV1NFSVolumeSource getNfs() {
    return nfs;
  }

  public void setNfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec nodeAffinity(IoK8sApiCoreV1VolumeNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

   /**
   * NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.
   * @return nodeAffinity
  **/
  @ApiModelProperty(value = "NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.")
  public IoK8sApiCoreV1VolumeNodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }

  public void setNodeAffinity(IoK8sApiCoreV1VolumeNodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec persistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    return this;
  }

   /**
   * What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
   * @return persistentVolumeReclaimPolicy
  **/
  @ApiModelProperty(value = "What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming")
  public String getPersistentVolumeReclaimPolicy() {
    return persistentVolumeReclaimPolicy;
  }

  public void setPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
    this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec photonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
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

  public IoK8sApiCoreV1PersistentVolumeSpec portworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
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

  public IoK8sApiCoreV1PersistentVolumeSpec quobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
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

  public IoK8sApiCoreV1PersistentVolumeSpec rbd(IoK8sApiCoreV1RBDPersistentVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

   /**
   * RBD represents a Rados Block Device mount on the host that shares a pod&#39;s lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
   * @return rbd
  **/
  @ApiModelProperty(value = "RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md")
  public IoK8sApiCoreV1RBDPersistentVolumeSource getRbd() {
    return rbd;
  }

  public void setRbd(IoK8sApiCoreV1RBDPersistentVolumeSource rbd) {
    this.rbd = rbd;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec scaleIO(IoK8sApiCoreV1ScaleIOPersistentVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

   /**
   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
   * @return scaleIO
  **/
  @ApiModelProperty(value = "ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
  public IoK8sApiCoreV1ScaleIOPersistentVolumeSource getScaleIO() {
    return scaleIO;
  }

  public void setScaleIO(IoK8sApiCoreV1ScaleIOPersistentVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
   * @return storageClassName
  **/
  @ApiModelProperty(value = "Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec storageos(IoK8sApiCoreV1StorageOSPersistentVolumeSource storageos) {
    this.storageos = storageos;
    return this;
  }

   /**
   * StorageOS represents a StorageOS volume that is attached to the kubelet&#39;s host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
   * @return storageos
  **/
  @ApiModelProperty(value = "StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md")
  public IoK8sApiCoreV1StorageOSPersistentVolumeSource getStorageos() {
    return storageos;
  }

  public void setStorageos(IoK8sApiCoreV1StorageOSPersistentVolumeSource storageos) {
    this.storageos = storageos;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec volumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return this;
  }

   /**
   * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec. This is a beta feature.
   * @return volumeMode
  **/
  @ApiModelProperty(value = "volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec. This is a beta feature.")
  public String getVolumeMode() {
    return volumeMode;
  }

  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }

  public IoK8sApiCoreV1PersistentVolumeSpec vsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
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
    IoK8sApiCoreV1PersistentVolumeSpec ioK8sApiCoreV1PersistentVolumeSpec = (IoK8sApiCoreV1PersistentVolumeSpec) o;
    return Objects.equals(this.accessModes, ioK8sApiCoreV1PersistentVolumeSpec.accessModes) &&
        Objects.equals(this.awsElasticBlockStore, ioK8sApiCoreV1PersistentVolumeSpec.awsElasticBlockStore) &&
        Objects.equals(this.azureDisk, ioK8sApiCoreV1PersistentVolumeSpec.azureDisk) &&
        Objects.equals(this.azureFile, ioK8sApiCoreV1PersistentVolumeSpec.azureFile) &&
        Objects.equals(this.capacity, ioK8sApiCoreV1PersistentVolumeSpec.capacity) &&
        Objects.equals(this.cephfs, ioK8sApiCoreV1PersistentVolumeSpec.cephfs) &&
        Objects.equals(this.cinder, ioK8sApiCoreV1PersistentVolumeSpec.cinder) &&
        Objects.equals(this.claimRef, ioK8sApiCoreV1PersistentVolumeSpec.claimRef) &&
        Objects.equals(this.csi, ioK8sApiCoreV1PersistentVolumeSpec.csi) &&
        Objects.equals(this.fc, ioK8sApiCoreV1PersistentVolumeSpec.fc) &&
        Objects.equals(this.flexVolume, ioK8sApiCoreV1PersistentVolumeSpec.flexVolume) &&
        Objects.equals(this.flocker, ioK8sApiCoreV1PersistentVolumeSpec.flocker) &&
        Objects.equals(this.gcePersistentDisk, ioK8sApiCoreV1PersistentVolumeSpec.gcePersistentDisk) &&
        Objects.equals(this.glusterfs, ioK8sApiCoreV1PersistentVolumeSpec.glusterfs) &&
        Objects.equals(this.hostPath, ioK8sApiCoreV1PersistentVolumeSpec.hostPath) &&
        Objects.equals(this.iscsi, ioK8sApiCoreV1PersistentVolumeSpec.iscsi) &&
        Objects.equals(this.local, ioK8sApiCoreV1PersistentVolumeSpec.local) &&
        Objects.equals(this.mountOptions, ioK8sApiCoreV1PersistentVolumeSpec.mountOptions) &&
        Objects.equals(this.nfs, ioK8sApiCoreV1PersistentVolumeSpec.nfs) &&
        Objects.equals(this.nodeAffinity, ioK8sApiCoreV1PersistentVolumeSpec.nodeAffinity) &&
        Objects.equals(this.persistentVolumeReclaimPolicy, ioK8sApiCoreV1PersistentVolumeSpec.persistentVolumeReclaimPolicy) &&
        Objects.equals(this.photonPersistentDisk, ioK8sApiCoreV1PersistentVolumeSpec.photonPersistentDisk) &&
        Objects.equals(this.portworxVolume, ioK8sApiCoreV1PersistentVolumeSpec.portworxVolume) &&
        Objects.equals(this.quobyte, ioK8sApiCoreV1PersistentVolumeSpec.quobyte) &&
        Objects.equals(this.rbd, ioK8sApiCoreV1PersistentVolumeSpec.rbd) &&
        Objects.equals(this.scaleIO, ioK8sApiCoreV1PersistentVolumeSpec.scaleIO) &&
        Objects.equals(this.storageClassName, ioK8sApiCoreV1PersistentVolumeSpec.storageClassName) &&
        Objects.equals(this.storageos, ioK8sApiCoreV1PersistentVolumeSpec.storageos) &&
        Objects.equals(this.volumeMode, ioK8sApiCoreV1PersistentVolumeSpec.volumeMode) &&
        Objects.equals(this.vsphereVolume, ioK8sApiCoreV1PersistentVolumeSpec.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, awsElasticBlockStore, azureDisk, azureFile, capacity, cephfs, cinder, claimRef, csi, fc, flexVolume, flocker, gcePersistentDisk, glusterfs, hostPath, iscsi, local, mountOptions, nfs, nodeAffinity, persistentVolumeReclaimPolicy, photonPersistentDisk, portworxVolume, quobyte, rbd, scaleIO, storageClassName, storageos, volumeMode, vsphereVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeSpec {\n");
    
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    claimRef: ").append(toIndentedString(claimRef)).append("\n");
    sb.append("    csi: ").append(toIndentedString(csi)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    local: ").append(toIndentedString(local)).append("\n");
    sb.append("    mountOptions: ").append(toIndentedString(mountOptions)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    persistentVolumeReclaimPolicy: ").append(toIndentedString(persistentVolumeReclaimPolicy)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
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

