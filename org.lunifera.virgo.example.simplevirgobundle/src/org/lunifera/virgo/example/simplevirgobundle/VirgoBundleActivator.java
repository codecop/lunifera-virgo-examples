package org.lunifera.virgo.example.simplevirgobundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VirgoBundleActivator implements BundleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		Logger logger = LoggerFactory.getLogger(getClass());
	    logger.info("xxxxxxxxxxx STARTED xxxxxxxxxxxx");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Logger logger = LoggerFactory.getLogger(getClass());
	    logger.info("xxxxxxxxxxx STOPPED xxxxxxxxxxxx");
	}

}
