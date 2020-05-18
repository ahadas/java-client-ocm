
# ComGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedBy** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | allowedBy is a reference to the rule that allows the PodTemplateSpec. A rule can be a SecurityContextConstraint or a PodSecurityPolicy A &#x60;nil&#x60;, indicates that it was denied. |  [optional]
**reason** | **String** | A machine-readable description of why this operation is in the \&quot;Failure\&quot; status. If this value is empty there is no information available. |  [optional]
**template** | [**IoK8sApiCoreV1PodTemplateSpec**](IoK8sApiCoreV1PodTemplateSpec.md) | template is the PodTemplateSpec after the defaulting is applied. |  [optional]



