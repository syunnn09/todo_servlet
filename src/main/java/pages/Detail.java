package pages;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import bean.TodoBean;
import bean.TodoJsonBean;
import dao.TodoDao;
import utils.CommonUtils;

public class Detail extends PageBase {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int todoId = Integer.parseInt(request.getParameter("todoId"));

		TodoDao todoDao = new TodoDao();
		CommonUtils commonUtils = new CommonUtils();
		ObjectMapper mapper = new ObjectMapper();

		TodoBean todoBean = todoDao.getTodo(todoId);
		TodoJsonBean bean = commonUtils.convertTodoJsonBean(todoBean);

		try {
			String json = mapper.writeValueAsString(bean);
			response.getWriter().write(json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
