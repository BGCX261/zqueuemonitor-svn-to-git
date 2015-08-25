package com.ibm.txhub.mqmonitor.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.txhub.mqmonitor.dao.QueueMgrDao;
import com.ibm.txhub.mqmonitor.dao.impl.QueueMgrDaoMockImpl;

/**
 * Servlet implementation class ShowQmgrServlet
 */
public class ListQmgrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListQmgrServlet() {
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
		System.out.println("ShowQmgrServlet");
		QueueMgrDao qMgrsDao = new QueueMgrDaoMockImpl();
		request.setAttribute("qmgrs",qMgrsDao.getAllQueueMgrs());
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/ListQmgrs.jsp");
		dispatcher.forward(request, response);
	}

}
