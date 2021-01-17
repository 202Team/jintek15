package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.domain.CommandAction;
import kr.co.member.MemberDAO;

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
