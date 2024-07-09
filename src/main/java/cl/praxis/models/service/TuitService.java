package cl.praxis.models.service;

import java.util.List;

import cl.praxis.models.dao.TuitDAO;
import cl.praxis.models.dao.TuitDAOImpl;
import cl.praxis.models.dto.Tuit;

public class TuitService {
	private TuitDAO tuitDAO = new TuitDAOImpl();
	
	public List<Tuit> getAll(){
		return tuitDAO.read();
	}
	
	public int save(Tuit t) throws Exception {		
		if (t.getMessage() == null) {
			throw new Exception("no agregaste mensaje");
		}
		
		return tuitDAO.create(t);
	}
}
