<<<<<<< HEAD
package krr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;
import krr.co.member.MemberDAO;

public class DeleteCommand implements Command{
	
	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String sNum = request.getParameter("num");
		int num = Integer.parseInt(sNum);
		
	
		new MemberDAO().delete(num);
		
		
		return new CommandAction(true, "list.do");
	}
}
=======
package krr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;
import krr.co.member.MemberDAO;

public class DeleteCommand implements Command{
	
	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String sNum = request.getParameter("num");
		int num = Integer.parseInt(sNum);
		
	
		new MemberDAO().delete(num);
		
		
		return new CommandAction(true, "list.do");
	}
}
>>>>>>> 16c656fd12dd6e44a87835a25a45cd9cbf1106b2
