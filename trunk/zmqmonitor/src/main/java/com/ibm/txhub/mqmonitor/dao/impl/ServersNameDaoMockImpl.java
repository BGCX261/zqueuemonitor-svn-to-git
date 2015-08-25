package com.ibm.txhub.mqmonitor.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.ibm.txhub.mqmonitor.dao.ServersNameDao;

public class ServersNameDaoMockImpl implements ServersNameDao {

	@Override
	public List<String> getAllServerURLs() {
		List<String> list = new ArrayList<String>();
		list.add("eshd16.sby.ibm.com");
		list.add("lexbz2072.lexington.ibm.com");
		list.add("shell.cjb.net");
		return list;
	}

}
