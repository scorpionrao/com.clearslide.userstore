package com.clearslide.userstore.internal;

import com.clearslide.userstore.ClearslideUserStoreManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.user.api.UserStoreManager;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * @scr.component name="clearslide.userstore.service" immediate=true
 */
public class ClearSlideUserStoreManagerServiceComponent {

    private static Log log = LogFactory.getLog(ClearSlideUserStoreManagerServiceComponent.class);

    private static RealmService realmService;

    protected void activate(ComponentContext ctxt) {

        ClearslideUserStoreManager userStoreManager = new ClearslideUserStoreManager();
        ctxt.getBundleContext().registerService(UserStoreManager.class.getName(), userStoreManager, null);
        log.info("ClearslideUserStoreManager bundle activated successfully.");
    }

    protected void deactivate(ComponentContext ctxt) {
        log.info("ClearslideUserStoreManager is deactivated");

    }
}
