package com.demo.services;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.demo.services.connectioncontext.ConnectionContextFactory;
import com.demo.services.connectioncontext.ConnectionContext;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ApplicationTypeServiceImpl implements ApplicationService, Serializable{
	
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(ApplicationTypeServiceImpl.class);
	
	private final ConnectionContextFactory connectionContextFactory;

	@Override
	public String upgrade(String input) {
		logger.debug("AppType upgrading");
		ConnectionContext connectionContext = connectionContextFactory.getConnectionContext(input);
		return connectionContext.doConnectionMapping();
	}

}
