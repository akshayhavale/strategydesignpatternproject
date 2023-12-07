package com.demo.services.connectioncontext;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SingleToMultipleConnectionContextServiceImpl implements ConnectionContext, Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(SingleToMultipleConnectionContextServiceImpl.class);

	@Override
	public String doConnectionMapping() {
		logger.debug("doing singleToMultiple connection changes");
		return ConnectionContextType.SINGLETOMULTIPLE.name();
	}

	@Override
	public ConnectionContextType getConntionContextTypeName() {
		return ConnectionContextType.SINGLETOMULTIPLE;
	}

}
