package cl.praxis.models.dto;

public class User {
	private int id;
	private String username;
	private String password;
	private boolean active;
	public User() {
		super();
	}
	
	
	
	public User(int id, String username, boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.active = active;
	}



	public User(int id, String username, String password, boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.active = active;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	

}
