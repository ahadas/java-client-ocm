
# ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1PackageManifestStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogSource** | **String** | CatalogSource is the name of the CatalogSource this package belongs to | 
**catalogSourceDisplayName** | **String** |  | 
**catalogSourceNamespace** | **String** |   CatalogSourceNamespace is the namespace of the owning CatalogSource | 
**catalogSourcePublisher** | **String** |  | 
**channels** | [**List&lt;ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1PackageChannel&gt;**](ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1PackageChannel.md) | Channels are the declared channels for the package, ala &#x60;stable&#x60; or &#x60;alpha&#x60;. | 
**defaultChannel** | **String** | DefaultChannel is, if specified, the name of the default channel for the package. The default channel will be installed if no other channel is explicitly given. If the package has a single channel, then that channel is implicitly the default. | 
**packageName** | **String** | PackageName is the name of the overall package, ala &#x60;etcd&#x60;. | 
**provider** | [**ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink**](ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink.md) | Provider is the provider of the PackageManifest&#39;s default CSV |  [optional]



