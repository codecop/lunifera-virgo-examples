package org.lunifera.virgo.example.maven.springimpl;

import org.lunifera.virgo.example.maven.springapi.IServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceImpl implements IServiceInterface {

	public void log() {
		Logger logger = LoggerFactory.getLogger(getClass());
		logger.info("yyyyyyyyyyyy Service called yyyyyyyyyyy");
	}

}
