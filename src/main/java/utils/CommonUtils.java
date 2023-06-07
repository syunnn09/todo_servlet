package utils;

import bean.TodoBean;
import bean.TodoJsonBean;

public class CommonUtils {
	public TodoJsonBean convertTodoJsonBean(TodoBean todoBean) {
		TodoJsonBean bean = new TodoJsonBean();
		bean.setTodoId(todoBean.getTodoId());
		bean.setUserId(todoBean.getUserId());
		bean.setTitle(todoBean.getTitle());
		bean.setStartTime(todoBean.getStartTime());
		bean.setEndTime(todoBean.getEndTime());
		bean.setMemo(todoBean.getMemo());
		bean.setIsCompleted(todoBean.getIsCompleted());

		return bean;
	}
}
