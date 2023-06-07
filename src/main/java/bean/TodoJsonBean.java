package bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TodoJsonBean {
	@JsonProperty("todoId")
	private int todoId;

	@JsonProperty("userId")
	private int userId;

	@JsonProperty("title")
	private String title;

	@JsonProperty("startTime")
	private String startTime;

	@JsonProperty("endTime")
	private String endTime;

	@JsonProperty("memo")
	private String memo;

	@JsonProperty("isCompleted")
	private int isCompleted;

	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void setIsCompleted(int isCompleted) {
		this.isCompleted = isCompleted;
	}
}
