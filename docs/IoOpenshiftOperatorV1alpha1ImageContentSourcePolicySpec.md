
# IoOpenshiftOperatorV1alpha1ImageContentSourcePolicySpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repositoryDigestMirrors** | [**List&lt;IoOpenshiftOperatorV1alpha1ImageContentSourcePolicySpecRepositoryDigestMirrors&gt;**](IoOpenshiftOperatorV1alpha1ImageContentSourcePolicySpecRepositoryDigestMirrors.md) | repositoryDigestMirrors allows images referenced by image digests in pods to be pulled from alternative mirrored repository locations. The image pull specification provided to the pod will be compared to the source locations described in RepositoryDigestMirrors and the image may be pulled down from any of the mirrors in the list instead of the specified repository allowing administrators to choose a potentially faster mirror. Only image pull specifications that have an image disgest will have this behavior applied to them - tags will continue to be pulled from the specified repository in the pull spec.   Each “source” repository is treated independently; configurations for different “source” repositories don’t interact.   When multiple policies are defined for the same “source” repository, the sets of defined mirrors will be merged together, preserving the relative order of the mirrors, if possible. For example, if policy A has mirrors &#x60;a, b, c&#x60; and policy B has mirrors &#x60;c, d, e&#x60;, the mirrors will be used in the order &#x60;a, b, c, d, e&#x60;.  If the orders of mirror entries conflict (e.g. &#x60;a, b&#x60; vs. &#x60;b, a&#x60;) the configuration is not rejected but the resulting order is unspecified. |  [optional]



