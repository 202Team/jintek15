<<<<<<< HEAD
package kr.co.member.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.command.Command;
import kr.co.domain.CommandAction;

public class InsertUICommand implements Command{

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
				
		return new CommandAction(true, "insert.jsp");
	}

}
=======
package kr.co.member.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.command.Command;
import kr.co.domain.CommandAction;

public class InsertUICommand implements Command{

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
				
		return new CommandAction(true, "insert.jsp");
	}

}
>>>>>>> 16c656fd12dd6e44a87835a25a45cd9cbf1106b2
