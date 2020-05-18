
# IoOpenshiftConfigV1FeatureGateSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customNoUpgrade** | **Object** | customNoUpgrade allows the enabling or disabling of any feature. Turning this feature set on IS NOT SUPPORTED, CANNOT BE UNDONE, and PREVENTS UPGRADES. Because of its nature, this setting cannot be validated.  If you have any typos or accidentally apply invalid combinations your cluster may fail in an unrecoverable way.  featureSet must equal \&quot;CustomNoUpgrade\&quot; must be set to use this field. |  [optional]
**featureSet** | **String** | featureSet changes the list of features in the cluster.  The default is empty.  Be very careful adjusting this setting. Turning on or off features may cause irreversible changes in your cluster which cannot be undone. |  [optional]



