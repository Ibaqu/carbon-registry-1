/*
 * Copyright (c) 2006, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
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
 */

package org.wso2.carbon.registry.resource.services.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.registry.core.exceptions.RegistryException;
import org.wso2.carbon.registry.core.session.UserRegistry;

public class RestoreVersionUtil {

    private static final Log log = LogFactory.getLog(RestoreVersionUtil.class);

    public static void restoreVersion(UserRegistry userRegistry, String versionPath) throws Exception {

        try {
            userRegistry.restoreVersion(versionPath);

        } catch (RegistryException e) {
            String msg = "Failed to restore the version " + versionPath;
            log.error(msg, e);
            throw new RegistryException(msg, e);
        }
    }
}
