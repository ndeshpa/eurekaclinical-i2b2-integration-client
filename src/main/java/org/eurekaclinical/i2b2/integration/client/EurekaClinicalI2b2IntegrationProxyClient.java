package org.eurekaclinical.i2b2.integration.client;

/*-
 * #%L
 * Eureka! Clinical I2b2 Integration Webapp
 * %%
 * Copyright (C) 2016 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.eurekaclinical.common.comm.clients.EurekaClinicalClient;

/**
 * @author Andrew Post
 */
public class EurekaClinicalI2b2IntegrationProxyClient extends EurekaClinicalClient {

    private final String serviceUrl;

    public EurekaClinicalI2b2IntegrationProxyClient(String inServiceUrl) {
        super(null);
        this.serviceUrl = inServiceUrl;
    }

    @Override
    protected String getResourceUrl() {
        return this.serviceUrl;
    }
    
}