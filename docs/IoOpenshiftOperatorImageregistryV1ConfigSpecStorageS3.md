
# IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **String** | bucket is the bucket name in which you want to store the registry&#39;s data. Optional, will be generated if not provided. |  [optional]
**cloudFront** | [**IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3CloudFront**](IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3CloudFront.md) |  |  [optional]
**encrypt** | **Boolean** | encrypt specifies whether the registry stores the image in encrypted format or not. Optional, defaults to false. |  [optional]
**keyID** | **String** | keyID is the KMS key ID to use for encryption. Optional, Encrypt must be true, or this parameter is ignored. |  [optional]
**region** | **String** | region is the AWS region in which your bucket exists. Optional, will be set based on the installed AWS Region. |  [optional]
**regionEndpoint** | **String** | regionEndpoint is the endpoint for S3 compatible storage services. Optional, defaults based on the Region that is provided. |  [optional]



