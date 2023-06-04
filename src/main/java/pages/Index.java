package pages;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.TodoBean;
import bean.UserBean;
import dao.TodoDao;

public class Index extends PageBase {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		UserBean user = (UserBean) session.getAttribute("user");
		int userId = user != null ? user.getUserId() : 1;
		TodoDao todoDao = new TodoDao();
		List<TodoBean> todos = todoDao.getTodos(userId);
		request.setAttribute("todos", todos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/index.jsp");
		dispatcher.forward(request, response);
	}
}
