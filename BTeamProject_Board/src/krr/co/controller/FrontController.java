<<<<<<< HEAD
package krr.co.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.command.Command;
import krr.co.command.InsertCommand;
import krr.co.command.InsertUICommand;
import krr.co.command.ListCommand;
import krr.co.command.ReadCommand;
import krr.co.domain.CommandAction;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uri = request.getRequestURI();
		String cPath = request.getContextPath();
		String sp = uri.substring(cPath.length());
		Command com = null;
		
		if(sp.equalsIgnoreCase("/insertui.do")) {
			com = new InsertUICommand();
		}else if(sp.equalsIgnoreCase("/insert.do")) {
			com = new InsertCommand();
		}else if(sp.equalsIgnoreCase("/list.do")) {
			com = new ListCommand();
		}else if(sp.equalsIgnoreCase("/read.do")) {
			com = new ReadCommand();
			
		
		if(com != null) {
			CommandAction action = com.execute(request, response);
			
			if(action.isRedirect()) {
				response.sendRedirect(action.getWhere());
			}else {
				RequestDispatcher dis = request.getRequestDispatcher(action.getWhere());
				dis.forward(request, response);
			}
		} else {
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("해당 서비스는 제공하지 않습니다.");
			out.print("</body>");
			out.print("</html>");
		
		}
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
=======
package krr.co.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.command.Command;
import krr.co.command.InsertCommand;
import krr.co.command.InsertUICommand;
import krr.co.command.ListCommand;
import krr.co.command.ReadCommand;
import krr.co.domain.CommandAction;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uri = request.getRequestURI();
		String cPath = request.getContextPath();
		String sp = uri.substring(cPath.length());
		Command com = null;
		
		if(sp.equalsIgnoreCase("/insertui.do")) {
			com = new InsertUICommand();
		}else if(sp.equalsIgnoreCase("/insert.do")) {
			com = new InsertCommand();
		}else if(sp.equalsIgnoreCase("/list.do")) {
			com = new ListCommand();
		}else if(sp.equalsIgnoreCase("/read.do")) {
			com = new ReadCommand();
			
		
		if(com != null) {
			CommandAction action = com.execute(request, response);
			
			if(action.isRedirect()) {
				response.sendRedirect(action.getWhere());
			}else {
				RequestDispatcher dis = request.getRequestDispatcher(action.getWhere());
				dis.forward(request, response);
			}
		} else {
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<body>");
			out.print("해당 서비스는 제공하지 않습니다.");
			out.print("</body>");
			out.print("</html>");
		
		}
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
>>>>>>> 16c656fd12dd6e44a87835a25a45cd9cbf1106b2
