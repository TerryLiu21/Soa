package cn.hl.vo;

/**
* 
*/
public class User {
	private int userId;
	private String userName;
	private int age;
	

	//edit on local
	private String password;

	//edit on github
	private String account;

	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
