package model;

import com.mysql.cj.callback.UsernameCallback;

public class User {
	private String username;
	private String password;
	private String tenuser;
	
	public User() {
		super();
	}

	public User(String username, String password, String tenuser) {
		super();
		this.username = username;
		this.password = password;
		this.tenuser = tenuser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTenuser() {
		return tenuser;
	}

	public void setTenuser(String tenuser) {
		this.tenuser = tenuser;
	}

	@Override
	public String toString() {
		return "User [Username=" + username + ", password=" + password + ", tenuser=" + tenuser + "]";
	}
	
}
