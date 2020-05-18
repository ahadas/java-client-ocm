
# ComGithubOpenshiftApiTemplateV1TemplateInstanceSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requester** | [**ComGithubOpenshiftApiTemplateV1TemplateInstanceRequester**](ComGithubOpenshiftApiTemplateV1TemplateInstanceRequester.md) | requester holds the identity of the agent requesting the template instantiation. |  [optional]
**secret** | [**IoK8sApiCoreV1LocalObjectReference**](IoK8sApiCoreV1LocalObjectReference.md) | secret is a reference to a Secret object containing the necessary template parameters. |  [optional]
**template** | [**ComGithubOpenshiftApiTemplateV1Template**](ComGithubOpenshiftApiTemplateV1Template.md) | template is a full copy of the template for instantiation. | 



