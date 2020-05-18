
# IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptedNames** | [**IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames**](IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionNames.md) | acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec. | 
**conditions** | [**List&lt;IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionCondition&gt;**](IoK8sApiextensionsApiserverPkgApisApiextensionsV1beta1CustomResourceDefinitionCondition.md) | conditions indicate state for particular aspects of a CustomResourceDefinition |  [optional]
**storedVersions** | **List&lt;String&gt;** | storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from &#x60;spec.versions&#x60; while they exist in this list. | 



