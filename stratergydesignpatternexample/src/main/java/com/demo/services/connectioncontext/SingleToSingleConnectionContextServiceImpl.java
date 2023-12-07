package com.demo.services.connectioncontext;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SingleToSingleConnectionContextServiceImpl implements ConnectionContext, Serializable {

	private static final long serialVersionUID = 1L;
	private final static Logger logger = LoggerFactory.getLogger(SingleToSingleConnectionContextServiceImpl.class);

	@Override
	public String doConnectionMapping() {
		logger.debug("doing singletosingle connection changes");
		return ConnectionContextType.SINGLETOSINGLE.name();
	}

	@Override
	public ConnectionContextType getConntionContextTypeName() {
		return ConnectionContextType.SINGLETOSINGLE;
	}

}
