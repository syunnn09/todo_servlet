package pages;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.UserBean;

public class PageBase {
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	public UserBean getUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (UserBean) session.getAttribute("user");
	}

	public int getUserId(HttpServletRequest request) {
		UserBean user = this.getUser(request);
		return user != null ? user.getUserId() : 1;
	}
}
