package org.lunifera.virgo.example.maven.bundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleBundleActivator implements BundleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		Logger logger = LoggerFactory.getLogger(getClass());
	    logger.info("xxxxxxxxxxx Maven STARTED xxxxxxxxxxxx");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Logger logger = LoggerFactory.getLogger(getClass());
	    logger.info("xxxxxxxxxxx Maven STOPPED xxxxxxxxxxxx");
	}

}
