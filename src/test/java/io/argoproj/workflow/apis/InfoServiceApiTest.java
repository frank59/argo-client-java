/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.apis;

import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.models.GetUserInfoResponse;
import io.argoproj.workflow.models.InfoResponse;
import io.argoproj.workflow.models.Version;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InfoServiceApi
 */
@Ignore
public class InfoServiceApiTest {

    private final InfoServiceApi api = new InfoServiceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInfoTest() throws ApiException {
        InfoResponse response = api.getInfo();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserInfoTest() throws ApiException {
        GetUserInfoResponse response = api.getUserInfo();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVersionTest() throws ApiException {
        Version response = api.getVersion();

        // TODO: test validations
    }
    
}
