package com.ibm.txhub.mqmonitor.cache;

public final class SimpleCache {

	private static SimpleCache instance = null;
	
	public synchronized static SimpleCache getInstance(){
		if(instance == null){
			instance = new SimpleCache();
		}
		return instance;
	}
	
}
