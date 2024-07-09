package cl.praxis.models.dto;

import java.time.LocalDate;

public class Tuit {
	private int id;
	private String message;
	private int userId;
	
	private User user;
	
	private LocalDate publicationDate;
	
	public Tuit() {
		super();
	}

	public Tuit(int id, String message, int userId, LocalDate publicationDate) {
		super();
		this.id = id;
		this.message = message;
		this.userId = userId;
		this.publicationDate = publicationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Tuit [id=" + id + ", message=" + message + ", userId=" + userId + ", publicationDate=" + publicationDate
				+ "]";
	}
	
	
	
	
}
