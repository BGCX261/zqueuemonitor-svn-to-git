package com.ibm.txhub.mqmonitor.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.ibm.txhub.mqmonitor.dao.QueueMgrDao;
import com.ibm.txhub.mqmonitor.domain.QueueMgrDetailInfors;
import com.ibm.txhub.mqmonitor.domain.QueueMgrMainInfors;

public class QueueMgrDaoMockImpl implements QueueMgrDao {

	@Override
	public List<QueueMgrMainInfors> getAllQueueMgrs() {
		List<QueueMgrMainInfors> qmgrs = new ArrayList<QueueMgrMainInfors>();
		for(int i = 0; i < 5; i++){
			QueueMgrMainInfors infos = new QueueMgrMainInfors();
			infos.setName("Qmgr_" + i);
			infos.setStatus(i % 2 == 0 ? "Running" : "Stopped");
			qmgrs.add(infos);
		}
		return qmgrs;
	}

	@Override
	public QueueMgrDetailInfors getQueueMgrConfig(String qmgrName) {
		QueueMgrDetailInfors detailInfors = new QueueMgrDetailInfors();
		detailInfors.setName(qmgrName);
		detailInfors.setCodeset("1208");
		detailInfors.setDistribution_list_support("YES");
		detailInfors.setDead_letter_queue("");
		detailInfors.setDefault_transmittion_queue("");
		return detailInfors;
	}

}
