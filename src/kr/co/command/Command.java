<<<<<<< HEAD
package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.domain.CommandAction;


public interface Command {

	public abstract CommandAction execute(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException;
}
=======
package kr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.domain.CommandAction;


public interface Command {

	public abstract CommandAction execute(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException;
}
>>>>>>> 16c656fd12dd6e44a87835a25a45cd9cbf1106b2
