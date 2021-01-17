package kr.co.board.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.command.Command;
import kr.co.domain.CommandAction;

public class ReplyUICommand implements Command{

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String oriNumS = request.getParameter("num");
		System.out.println(oriNumS);
		return new CommandAction(true, "reply.jsp?oriNumS="+oriNumS);
	}
}
