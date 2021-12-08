package eCommerce.entities.concrete;

import eCommerce.entities.abstracts.Entitiy;

public class User  implements Entitiy{

	private int userId;
	private String userName;
	private String userLastName;
	private String userMail;
	private String userPassword;
	
	public User() {
		
	};
	
	public User(int userId, String userName, String userLastName, String userMail, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLastName = userLastName;
		this.userMail = userMail;
		this.userPassword = userPassword;
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

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
	
}
