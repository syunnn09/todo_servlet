package bean;

import java.io.Serializable;

public class UserBean implements Serializable {
	private int userId;
	private String email, password;

	public UserBean() { }

	public UserBean(int userId, String email, String password) {
		this.userId = userId;
		this.email = email;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	};

	
}
