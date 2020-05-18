
# ComGithubOpenshiftApiTemplateV1BrokerTemplateInstanceSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bindingIDs** | **List&lt;String&gt;** | bindingids is a list of &#39;binding_id&#39;s provided during successive bind calls to the template service broker. |  [optional]
**secret** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | secret is a reference to a Secret object residing in a namespace, containing the necessary template parameters. | 
**templateInstance** | [**IoK8sApiCoreV1ObjectReference**](IoK8sApiCoreV1ObjectReference.md) | templateinstance is a reference to a TemplateInstance object residing in a namespace. | 



