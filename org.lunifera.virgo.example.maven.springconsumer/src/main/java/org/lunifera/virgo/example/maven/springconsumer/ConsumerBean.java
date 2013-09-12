package org.lunifera.virgo.example.maven.springconsumer;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.lunifera.virgo.example.maven.springapi.IServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerBean {

	private IServiceInterface service;

	@Resource
	public void setService(IServiceInterface service) {
		this.service = service;
	}

	@PostConstruct
	public void log() {
		Logger logger = LoggerFactory.getLogger(getClass());
		logger.info("iiiiiiiiiiiiii Consumer STARTED iiiiiiiiiiii");

		service.log();
	}

}
