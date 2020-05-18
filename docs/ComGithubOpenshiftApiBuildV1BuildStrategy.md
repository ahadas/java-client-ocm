
# ComGithubOpenshiftApiBuildV1BuildStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customStrategy** | [**ComGithubOpenshiftApiBuildV1CustomBuildStrategy**](ComGithubOpenshiftApiBuildV1CustomBuildStrategy.md) | customStrategy holds the parameters to the Custom build strategy |  [optional]
**dockerStrategy** | [**ComGithubOpenshiftApiBuildV1DockerBuildStrategy**](ComGithubOpenshiftApiBuildV1DockerBuildStrategy.md) | dockerStrategy holds the parameters to the container image build strategy. |  [optional]
**jenkinsPipelineStrategy** | [**ComGithubOpenshiftApiBuildV1JenkinsPipelineBuildStrategy**](ComGithubOpenshiftApiBuildV1JenkinsPipelineBuildStrategy.md) | JenkinsPipelineStrategy holds the parameters to the Jenkins Pipeline build strategy. |  [optional]
**sourceStrategy** | [**ComGithubOpenshiftApiBuildV1SourceBuildStrategy**](ComGithubOpenshiftApiBuildV1SourceBuildStrategy.md) | sourceStrategy holds the parameters to the Source build strategy. |  [optional]
**type** | **String** | type is the kind of build strategy. | 



