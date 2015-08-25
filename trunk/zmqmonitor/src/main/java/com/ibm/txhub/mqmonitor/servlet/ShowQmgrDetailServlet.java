package com.ibm.txhub.mqmonitor.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.txhub.mqmonitor.dao.QueueMgrDao;
import com.ibm.txhub.mqmonitor.dao.impl.QueueMgrDaoMockImpl;

/**
 * Servlet implementation class ShowQmgrDetailServlet
 */
public class ShowQmgrDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowQmgrDetailServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ShowQmgrDetailServlet");
		String a = request.getParameter("qmgrname");
		System.out.println(a);
		QueueMgrDao queueMgrDao = new QueueMgrDaoMockImpl();
		request.setAttribute("qmgr", queueMgrDao.getQueueMgrConfig(request.getParameter("qmgrname")));
		request.getRequestDispatcher("jsp/ShowQmgr.jsp").forward(request, response);		
	}
}
