package cl.praxis.models.dao;

import java.util.List;

import cl.praxis.models.dto.User;

public interface UserDAO {
	int create(User u);
	User read(int id);
	List<User> read();
	boolean update(User u);
	boolean delete(int id);
	boolean validateLogin(String username, String password);
}
