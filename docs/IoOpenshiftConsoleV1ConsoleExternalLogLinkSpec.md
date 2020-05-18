
# IoOpenshiftConsoleV1ConsoleExternalLogLinkSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hrefTemplate** | **String** | hrefTemplate is an absolute secure URL (must use https) for the log link including variables to be replaced. Variables are specified in the URL with the format ${variableName}, for instance, ${containerName} and will be replaced with the corresponding values from the resource. Resource is a pod. Supported variables are: - ${resourceName} - name of the resource which containes the logs - ${resourceUID} - UID of the resource which contains the logs               - e.g. &#x60;11111111-2222-3333-4444-555555555555&#x60; - ${containerName} - name of the resource&#39;s container that contains the logs - ${resourceNamespace} - namespace of the resource that contains the logs - ${resourceNamespaceUID} - namespace UID of the resource that contains the logs - ${podLabels} - JSON representation of labels matching the pod with the logs             - e.g. &#x60;{\&quot;key1\&quot;:\&quot;value1\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;}&#x60;   e.g., https://example.com/logs?resourceName&#x3D;${resourceName}&amp;containerName&#x3D;${containerName}&amp;resourceNamespace&#x3D;${resourceNamespace}&amp;podLabels&#x3D;${podLabels} | 
**namespaceFilter** | **String** | namespaceFilter is a regular expression used to restrict a log link to a matching set of namespaces (e.g., &#x60;^openshift-&#x60;). The string is converted into a regular expression using the JavaScript RegExp constructor. If not specified, links will be displayed for all the namespaces. |  [optional]
**text** | **String** | text is the display text for the link | 



