package bean;

import java.io.Serializable;

public class TodoBean implements Serializable {
	private int todoId, userId, isCompleted;
	private String title, startTime,endTime, memo;

	public TodoBean() { }

	public TodoBean(int todoId, int userId, String title, String startTime, String endTime, String memo, int isCompleted) {
		this.todoId = todoId;
		this.userId = userId;
		this.title = title;
		this.startTime = startTime;
		this.endTime = endTime;
		this.memo = memo;
		this.isCompleted = isCompleted;
	}

	public int getTodoId() {
		return todoId;
	}

	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(int isCompleted) {
		this.isCompleted = isCompleted;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
