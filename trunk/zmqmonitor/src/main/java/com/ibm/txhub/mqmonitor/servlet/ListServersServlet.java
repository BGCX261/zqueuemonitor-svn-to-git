package com.ibm.txhub.mqmonitor.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.txhub.mqmonitor.dao.ServersNameDao;
import com.ibm.txhub.mqmonitor.dao.impl.ServersNameDaoMockImpl;

/**
 * Servlet implementation class ShowServersServlet
 */
public class ListServersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServersServlet() {
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
		System.out.println("Show Servers");
		ServersNameDao serversNameDao = new ServersNameDaoMockImpl();
		request.setAttribute("serverURLs", serversNameDao.getAllServerURLs());
		request.getRequestDispatcher("jsp/ListServers.jsp").forward(request, response);
	}

}
