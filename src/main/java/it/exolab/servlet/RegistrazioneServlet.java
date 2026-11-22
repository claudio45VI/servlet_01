package it.exolab.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import it.exolab.dao.UtenteDao;
import it.exolab.model.Utente;

/**
 * Servlet implementation class RegistrazioneServlet
 */
@WebServlet("/registrazione")
public class RegistrazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrazioneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nomeGet = request.getParameter("nome");
		request.setAttribute("contengoNomeGet", nomeGet);
		String emailGet = request.getParameter("email");
		request.setAttribute("contengoEmailGet", emailGet);
		request.getRequestDispatcher("/riepilogo.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nomePost = request.getParameter("nome");
		request.setAttribute("contengoNomePost", nomePost);
		String emailPost = request.getParameter("email");
		request.setAttribute("contengoEmailPost", emailPost);
		
		Utente utente1 = new Utente();
		utente1.setNome(nomePost);
		utente1.setEmail(emailPost);
		
		UtenteDao dao = new UtenteDao();
		dao.insert(utente1);  
		
		request.getRequestDispatcher("/riepilogo.jsp").forward(request, response);
	}

}
