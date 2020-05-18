
# IoOpenshiftConfigV1APIServerSpecEncryption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | type defines what encryption type should be used to encrypt resources at the datastore layer. When this field is unset (i.e. when it is set to the empty string), identity is implied. The behavior of unset can and will change over time.  Even if encryption is enabled by default, the meaning of unset may change to a different encryption type based on changes in best practices.   When encryption is enabled, all sensitive resources shipped with the platform are encrypted. This list of sensitive resources can and will change over time.  The current authoritative list is:     1. secrets   2. configmaps   3. routes.route.openshift.io   4. oauthaccesstokens.oauth.openshift.io   5. oauthauthorizetokens.oauth.openshift.io |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
IDENTITY | &quot;identity&quot;
AESCBC | &quot;aescbc&quot;



