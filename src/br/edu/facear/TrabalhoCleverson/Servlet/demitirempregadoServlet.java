package br.edu.facear.TrabalhoCleverson.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.TrabalhoCleverson.dao.EmpreDAO;
import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;

/**
 * Servlet implementation class demitirempregadoServlet
 */
@WebServlet("/demitirempregadoServlet")
public class demitirempregadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demitirempregadoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
String id= (String) request.getParameter("id");
		
		System.out.println("ID Demitir:"  +id);
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/demissao.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("id");
		
		System.out.println("ID Demitir:"  +id);
		EmpregadoService service = new EmpregadoService();
		service.Demitir(Empregado.idDemitir);
		
	

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
		
		
		
	}

}
