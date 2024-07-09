package cl.praxis.models.dao;

import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.models.db.Db;
import cl.praxis.models.dto.Tuit;
import cl.praxis.models.dto.User;

public class TuitDAOImpl implements TuitDAO {

	@Override
	public int create(Tuit t) {

		try {

			Connection c = Db.getConnect();
			Statement stm = c.createStatement();
			String sql = "insert into tuit (id_usuario, mensaje, fecha_publicacion) values (" + t.getUserId() + ", '"
					+ t.getMessage() + "', now())";

			stm.execute(sql);

		} catch (SQLException e) {
			System.out.println("ERROR en metodo CREATE()");
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public Tuit read(int id) {
		return null;
	}

	@Override
	public List<Tuit> read() {

		List<Tuit> tuits = new ArrayList<Tuit>();
		try {

			Connection c = Db.getConnect();

			Statement stm = c.createStatement();

			ResultSet rs = stm.executeQuery(
					"select tuit.id, id_usuario, mensaje, fecha_publicacion, nombre_usuario, estado "
					+ "from tuit join usuario on tuit.id_usuario = usuario.id order by fecha_publicacion desc");

			while (rs.next()) {

				Timestamp tm = rs.getTimestamp("fecha_publicacion");
				
				Tuit t = new Tuit(rs.getInt("id"), rs.getString("mensaje"), rs.getInt("id_usuario"),
						tm.toLocalDateTime().toLocalDate());
				
				t.setUser(new User(rs.getInt("id_usuario"), rs.getString("nombre_usuario"), rs.getBoolean("estado")));
				
				tuits.add(t);
			}

		} catch (SQLException e) {
			System.out.println("ERROR en metodo READ()");
			e.printStackTrace();
		}

		return tuits;
	}

	@Override
	public boolean update(Tuit t) {
		return false;
	}

	@Override
	public boolean delete(int id) {
		return false;
	}

}
