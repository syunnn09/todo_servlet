package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.TodoBean;

public class TodoDao extends CommonDao {
	public List<TodoBean> getTodos(int userId) {
		List<TodoBean> todos = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
			String sql = "SELECT * FROM todo WHERE userId=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int todoId = rs.getInt("todoId");
				String title = rs.getString("title");
				String startTime = rs.getString("startTime");
				String endTime = rs.getString("endTime");
				String memo = rs.getString("memo");
				int isCompleted = rs.getInt("isCompleted");
				TodoBean todo = new TodoBean(todoId, userId, title, startTime, endTime, memo, isCompleted);
				todos.add(todo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return todos;
	}
}
