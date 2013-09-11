package org.lunifera.virgo.example.maven.spring;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringBean {

	@PostConstruct
	public void log() {
		Logger logger = LoggerFactory.getLogger(getClass());
		logger.info("xxxxxxxxxxx STARTED xxxxxxxxxxxx");
	}

}
