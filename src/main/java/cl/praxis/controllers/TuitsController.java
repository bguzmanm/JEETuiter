package cl.praxis.controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.models.dto.Tuit;
import cl.praxis.models.service.TuitService;

@WebServlet("/")
public class TuitsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TuitsController() {
        super();
    }
    
    private TuitService service = new TuitService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Tuit> tuits = service.getAll();
		request.setAttribute("tuits", tuits);
		
		getServletContext().getRequestDispatcher("/views/index.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String message = request.getParameter("message");

		//TODO: Implementar validacion de usuario
		int userId = 2;
		
		Tuit t = new Tuit();
		t.setMessage(message);
		t.setUserId(userId);
		t.setPublicationDate(LocalDate.now());
		
		try {
			service.save(t);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		doGet(request, response);
	}

}
