
# ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecTopologySpreadConstraints

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labelSelector** | [**ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLabelSelector**](ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLabelSelector.md) |  |  [optional]
**maxSkew** | **Integer** | MaxSkew describes the degree to which pods may be unevenly distributed. It&#39;s the maximum permitted difference between the number of matching pods in any two topology domains of a given topology type. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. It&#39;s a required field. Default value is 1 and 0 is not allowed. | 
**topologyKey** | **String** | TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each &lt;key, value&gt; as a \&quot;bucket\&quot;, and try to put balanced number of pods into each bucket. It&#39;s a required field. | 
**whenUnsatisfiable** | **String** | WhenUnsatisfiable indicates how to deal with a pod if it doesn&#39;t satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it - ScheduleAnyway tells the scheduler to still schedule it It&#39;s considered as \&quot;Unsatisfiable\&quot; if and only if placing incoming pod on any topology violates \&quot;MaxSkew\&quot;. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won&#39;t make it *more* imbalanced. It&#39;s a required field. | 



