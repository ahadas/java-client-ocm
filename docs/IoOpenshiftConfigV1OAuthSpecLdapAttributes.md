
# IoOpenshiftConfigV1OAuthSpecLdapAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **List&lt;String&gt;** | email is the list of attributes whose values should be used as the email address. Optional. If unspecified, no email is set for the identity |  [optional]
**id** | **List&lt;String&gt;** | id is the list of attributes whose values should be used as the user ID. Required. First non-empty attribute is used. At least one attribute is required. If none of the listed attribute have a value, authentication fails. LDAP standard identity attribute is \&quot;dn\&quot; |  [optional]
**name** | **List&lt;String&gt;** | name is the list of attributes whose values should be used as the display name. Optional. If unspecified, no display name is set for the identity LDAP standard display name attribute is \&quot;cn\&quot; |  [optional]
**preferredUsername** | **List&lt;String&gt;** | preferredUsername is the list of attributes whose values should be used as the preferred username. LDAP standard login attribute is \&quot;uid\&quot; |  [optional]



