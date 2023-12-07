package com.demo.services.connectioncontext;

public enum ConnectionContextType {
	
	SINGLETOSINGLE("SINGLETOSINGLE"),
	SINGLETOMULTIPLE("SINGLETOMULTIPLE"),
	MULTIPLETOSINGLE("MULTIPLETOSINGLE"),
	MULTIPLETOMULTIPLE("MULTIPLETOMULTIPLE");
	
	private final String text;
	
	ConnectionContextType(final String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
	

}
