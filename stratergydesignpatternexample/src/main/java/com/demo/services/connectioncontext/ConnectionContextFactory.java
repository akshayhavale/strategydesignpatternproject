package com.demo.services.connectioncontext;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ConnectionContextFactory implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(ConnectionContextFactory.class);
	private Map<ConnectionContextType, ConnectionContext> connectionContextMap;

	public ConnectionContextFactory(Set<ConnectionContext> connectionContextServices) {
		createConnectionContext(connectionContextServices);
	}

	private void createConnectionContext(Set<ConnectionContext> connectionContexts) {
		connectionContextMap = new HashMap<>();
		connectionContexts.forEach(connectionContext -> connectionContextMap
				.put(connectionContext.getConntionContextTypeName(), connectionContext));
	}

	public ConnectionContext getConnectionContext(String input) {
		logger.debug("Verifying which connectionType work to do");
		switch (input.toUpperCase()) {
		case "STS": {
			return connectionContextMap.get(ConnectionContextType.SINGLETOSINGLE);
		}
		case "STM": {
			return connectionContextMap.get(ConnectionContextType.SINGLETOMULTIPLE);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}

}
