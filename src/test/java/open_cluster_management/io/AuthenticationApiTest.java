/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package open_cluster_management.io;

import open_cluster_management.ApiException;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1APIGroup;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Ignore
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    
    /**
     * 
     *
     * get information of a group
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAuthenticationAPIGroupTest() throws ApiException {
        IoK8sApimachineryPkgApisMetaV1APIGroup response = api.getAuthenticationAPIGroup();

        // TODO: test validations
    }
    
}
