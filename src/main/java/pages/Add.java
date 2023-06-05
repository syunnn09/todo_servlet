package pages;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TodoDao;

public class Add extends PageBase {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId = this.getUserId(request);
		String title = request.getParameter("title");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
		String memo = request.getParameter("memo");

		TodoDao todoDao = new TodoDao();
		int addResult = todoDao.addTodo(userId, title, startTime, endTime, memo);
		String result = addResult == 0 ? "failed" : "success";

		response.getWriter().println("{result: " + result + "}");
	}
}
