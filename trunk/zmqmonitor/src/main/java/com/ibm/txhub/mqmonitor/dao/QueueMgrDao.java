package com.ibm.txhub.mqmonitor.dao;

import java.util.List;

import com.ibm.txhub.mqmonitor.domain.QueueMgrDetailInfors;
import com.ibm.txhub.mqmonitor.domain.QueueMgrMainInfors;

public interface QueueMgrDao {

	List<QueueMgrMainInfors> getAllQueueMgrs();
	
	QueueMgrDetailInfors getQueueMgrConfig(String qmgrName);
}
