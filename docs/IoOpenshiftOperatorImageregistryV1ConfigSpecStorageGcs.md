
# IoOpenshiftOperatorImageregistryV1ConfigSpecStorageGcs

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **String** | bucket is the bucket name in which you want to store the registry&#39;s data. Optional, will be generated if not provided. |  [optional]
**keyID** | **String** | keyID is the KMS key ID to use for encryption. Optional, buckets are encrypted by default on GCP. This allows for the use of a custom encryption key. |  [optional]
**projectID** | **String** | projectID is the Project ID of the GCP project that this bucket should be associated with. |  [optional]
**region** | **String** | region is the GCS location in which your bucket exists. Optional, will be set based on the installed GCS Region. |  [optional]



