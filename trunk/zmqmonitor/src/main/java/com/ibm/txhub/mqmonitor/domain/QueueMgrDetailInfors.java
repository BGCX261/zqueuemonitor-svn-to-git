package com.ibm.txhub.mqmonitor.domain;

public final class QueueMgrDetailInfors {

	private String name = "";
	
	private String codeset = "";
	
	private String distribution_list_support = "";
	
	private String dead_letter_queue = "";
	
	private String default_transmittion_queue = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodeset() {
		return codeset;
	}

	public void setCodeset(String codeset) {
		this.codeset = codeset;
	}

	public String getDistribution_list_support() {
		return distribution_list_support;
	}

	public void setDistribution_list_support(String distribution_list_support) {
		this.distribution_list_support = distribution_list_support;
	}

	public String getDead_letter_queue() {
		return dead_letter_queue;
	}

	public void setDead_letter_queue(String dead_letter_queue) {
		this.dead_letter_queue = dead_letter_queue;
	}

	public String getDefault_transmittion_queue() {
		return default_transmittion_queue;
	}

	public void setDefault_transmittion_queue(String default_transmittion_queue) {
		this.default_transmittion_queue = default_transmittion_queue;
	}
	
}
