package cl.praxis.models.service;

import cl.praxis.models.dao.UserDAO;
import cl.praxis.models.dao.UserDAOImpl;

public class LoginService {
	
	private UserDAO userDAO = new UserDAOImpl();
	
	public boolean login(String username, String password) {
		return userDAO.validateLogin(username, password);
	}

}
