package cl.praxis.models.dao;

import java.util.List;

import cl.praxis.models.dto.Tuit;

public interface TuitDAO {
	int create(Tuit t);
	Tuit read(int id);
	List<Tuit> read();
	boolean update(Tuit t);
	boolean delete(int id);
}
