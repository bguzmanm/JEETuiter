package cl.praxis.models.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.models.db.Db;
import cl.praxis.models.dto.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public int create(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateLogin(String username, String password) {
		User user = new User();
		
		boolean result = false;
		try {

			Connection c = Db.getConnect();

			Statement stm = c.createStatement();

			ResultSet rs = stm.executeQuery(
					"select username where nombre_usuario = '" + username + "' and password = '" + password + "'");

			if (rs.next()) {

				result = true;
				
			}

		} catch (SQLException e) {
			System.out.println("ERROR en metodo validateLogin()");
			e.printStackTrace();
		}

		return result;
	}

}
