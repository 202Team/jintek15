<<<<<<< HEAD
package krr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;

public class InsertUICommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {


		
		return new CommandAction(true, "insertui.jsp");
	}

=======
package krr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;

public class InsertUICommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {


		
		return new CommandAction(true, "insertui.jsp");
	}

>>>>>>> 16c656fd12dd6e44a87835a25a45cd9cbf1106b2
}