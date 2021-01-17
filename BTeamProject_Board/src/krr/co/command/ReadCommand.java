<<<<<<< HEAD
package krr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;
import krr.co.domain.MemberDTO;
import krr.co.member.MemberDAO;

public class ReadCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request,
							HttpServletResponse response)
							throws IOException, ServletException {
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.read(id);
		
		request.setAttribute("dto", dto);
		
		
		return new CommandAction(false, "read.jsp");
	}

	
	}
=======
package krr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;
import krr.co.domain.MemberDTO;
import krr.co.member.MemberDAO;

public class ReadCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request,
							HttpServletResponse response)
							throws IOException, ServletException {
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.read(id);
		
		request.setAttribute("dto", dto);
		
		
		return new CommandAction(false, "read.jsp");
	}

	
	}
>>>>>>> 16c656fd12dd6e44a87835a25a45cd9cbf1106b2
