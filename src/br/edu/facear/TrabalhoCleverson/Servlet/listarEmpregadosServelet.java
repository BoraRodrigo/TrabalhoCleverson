package br.edu.facear.TrabalhoCleverson.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.metamodel.SetAttribute;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.TrabalhoCleverson.dao.EmpreDAO;
import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.service.CadastrarEmpregadoService;

/**
 * Servlet implementation class listarEmpregadosServelet
 */
@WebServlet("/listarEmpregadosServelet")
public class listarEmpregadosServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public listarEmpregadosServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CadastrarEmpregadoService service = new CadastrarEmpregadoService();
		List<Empregado> listaEmpregado = new ArrayList<Empregado>();
		listaEmpregado = new EmpreDAO().listar();

		System.out.println("Rodrigo:  " + listaEmpregado.get(1).getNome());

		request.setAttribute("listaEmpregado", listaEmpregado);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listarEmpregados.jsp");

		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
