package krr.co.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;
import krr.co.domain.MemberDTO;
import krr.co.member.MemberDAO;

public class ListCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.list();
		
		request.setAttribute("list", list);
		
		
		return new CommandAction(false, "list.jsp");
	}

}
