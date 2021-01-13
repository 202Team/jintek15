package krr.co.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import krr.co.domain.CommandAction;
import krr.co.domain.MemberDTO;
import krr.co.member.MemberDAO;

public class InsertCommand implements Command {

	@Override
	public CommandAction execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw1");
		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		String address = request.getParameter("address");
		String tell1 = request.getParameter("tell1");
		int tell = Integer.parseInt(tell1);
		
		MemberDTO dto = new MemberDTO(-1, id, pw, name, nickname, tell, address, null);
		
		MemberDAO dao = new MemberDAO();
		new MemberDAO().insert(dto);
		
		
		return new CommandAction(true, "insert.jsp");
	}

}
