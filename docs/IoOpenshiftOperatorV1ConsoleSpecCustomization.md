
# IoOpenshiftOperatorV1ConsoleSpecCustomization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **String** | brand is the default branding of the web console which can be overridden by providing the brand field.  There is a limited set of specific brand options. This field controls elements of the console such as the logo. Invalid value will prevent a console rollout. |  [optional]
**customLogoFile** | [**IoOpenshiftOperatorV1ConsoleSpecCustomizationCustomLogoFile**](IoOpenshiftOperatorV1ConsoleSpecCustomizationCustomLogoFile.md) |  |  [optional]
**customProductName** | **String** | customProductName is the name that will be displayed in page titles, logo alt text, and the about dialog instead of the normal OpenShift product name. |  [optional]
**documentationBaseURL** | **String** | documentationBaseURL links to external documentation are shown in various sections of the web console.  Providing documentationBaseURL will override the default documentation URL. Invalid value will prevent a console rollout. |  [optional]



