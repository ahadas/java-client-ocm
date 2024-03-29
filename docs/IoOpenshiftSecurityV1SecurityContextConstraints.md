
# IoOpenshiftSecurityV1SecurityContextConstraints

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowHostDirVolumePlugin** | **Boolean** | AllowHostDirVolumePlugin determines if the policy allow containers to use the HostDir volume plugin | 
**allowHostIPC** | **Boolean** | AllowHostIPC determines if the policy allows host ipc in the containers. | 
**allowHostNetwork** | **Boolean** | AllowHostNetwork determines if the policy allows the use of HostNetwork in the pod spec. | 
**allowHostPID** | **Boolean** | AllowHostPID determines if the policy allows host pid in the containers. | 
**allowHostPorts** | **Boolean** | AllowHostPorts determines if the policy allows host ports in the containers. | 
**allowPrivilegeEscalation** | **Object** | AllowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true. |  [optional]
**allowPrivilegedContainer** | **Boolean** | AllowPrivilegedContainer determines if a container can request to be run as privileged. | 
**allowedCapabilities** | **Object** | AllowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field maybe added at the pod author&#39;s discretion. You must not list a capability in both AllowedCapabilities and RequiredDropCapabilities. To allow all capabilities you may use &#39;*&#39;. | 
**allowedFlexVolumes** | **Object** | AllowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the \&quot;Volumes\&quot; field. |  [optional]
**allowedUnsafeSysctls** | **Object** | AllowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.   Examples: e.g. \&quot;foo/_*\&quot; allows \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; allows \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc. |  [optional]
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources |  [optional]
**defaultAddCapabilities** | **Object** | DefaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capabiility in both DefaultAddCapabilities and RequiredDropCapabilities. | 
**defaultAllowPrivilegeEscalation** | **Object** | DefaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process. |  [optional]
**forbiddenSysctls** | **Object** | ForbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in \&quot;*\&quot; in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.   Examples: e.g. \&quot;foo/_*\&quot; forbids \&quot;foo/bar\&quot;, \&quot;foo/baz\&quot;, etc. e.g. \&quot;foo.*\&quot; forbids \&quot;foo.bar\&quot;, \&quot;foo.baz\&quot;, etc. |  [optional]
**fsGroup** | **Object** | FSGroup is the strategy that will dictate what fs group is used by the SecurityContext. |  [optional]
**groups** | **Object** | The groups that have permission to use this security context constraints |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds |  [optional]
**metadata** | [**IoK8sApimachineryPkgApisMetaV1ObjectMeta**](IoK8sApimachineryPkgApisMetaV1ObjectMeta.md) | Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata |  [optional]
**priority** | **Object** | Priority influences the sort order of SCCs when evaluating which SCCs to try first for a given pod request based on access in the Users and Groups fields.  The higher the int, the higher priority. An unset value is considered a 0 priority. If scores for multiple SCCs are equal they will be sorted from most restrictive to least restrictive. If both priorities and restrictions are equal the SCCs will be sorted by name. | 
**readOnlyRootFilesystem** | **Boolean** | ReadOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the SCC should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to. | 
**requiredDropCapabilities** | **Object** | RequiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added. | 
**runAsUser** | **Object** | RunAsUser is the strategy that will dictate what RunAsUser is used in the SecurityContext. |  [optional]
**seLinuxContext** | **Object** | SELinuxContext is the strategy that will dictate what labels will be set in the SecurityContext. |  [optional]
**seccompProfiles** | **Object** | SeccompProfiles lists the allowed profiles that may be set for the pod or container&#39;s seccomp annotations.  An unset (nil) or empty value means that no profiles may be specifid by the pod or container. The wildcard &#39;*&#39; may be used to allow all profiles.  When used to generate a value for a pod the first non-wildcard profile will be used as the default. |  [optional]
**supplementalGroups** | **Object** | SupplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext. |  [optional]
**users** | **Object** | The users who have permissions to use this security context constraints |  [optional]
**volumes** | **Object** | Volumes is a white list of allowed volume plugins.  FSType corresponds directly with the field names of a VolumeSource (azureFile, configMap, emptyDir).  To allow all volumes you may use \&quot;*\&quot;. To allow no volumes, set to [\&quot;none\&quot;]. | 



