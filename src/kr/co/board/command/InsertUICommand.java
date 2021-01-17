package kr.co.board.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.command.Command;
import kr.co.domain.CommandAction;
import kr.co.member.LoginDTO;

public class InsertUICommand implements Command{

	@Override
	public CommandAction execute(HttpServletRequest request,HttpServletResponse response) 		
				throws IOException, ServletException {
		HttpSession session = request.getSession(false);
		LoginDTO login = (LoginDTO)session.getAttribute("login");
		if( session == null || login == null) {
			return new CommandAction(true, loginui.do);
		}
		
		return new CommandAction(true, insert.jsp);
	
	}
	}
