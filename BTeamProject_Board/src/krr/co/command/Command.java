<<<<<<< HEAD
package krr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;

public interface Command {
	CommandAction execute(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException,ServletException;


}
=======
package krr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;

public interface Command {
	CommandAction execute(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException,ServletException;


}
>>>>>>> 16c656fd12dd6e44a87835a25a45cd9cbf1106b2
