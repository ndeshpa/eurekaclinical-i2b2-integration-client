package org.eurekaclinical.i2b2integration.client;

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

import java.net.URI;
import org.eurekaclinical.common.comm.clients.AuthorizingEurekaClinicalClient;

/**
 * @author Andrew Post
 */
public class EurekaClinicalI2b2IntegrationClient extends AuthorizingEurekaClinicalClient {

    private final URI serviceUrl;

    public EurekaClinicalI2b2IntegrationClient(String inServiceUrl) {
        super(null);
        this.serviceUrl = URI.create(inServiceUrl);
    }

    @Override
    protected URI getResourceUrl() {
        return this.serviceUrl;
    }
    
}
