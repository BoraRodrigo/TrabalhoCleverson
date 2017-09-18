package br.edu.facear.TrabalhoCleverson.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;

/**
 * Servlet implementation class cadastrarEmpregadoServlet
 */

@WebServlet("/cadastrarEmpregadoServlet")
public class cadastrarEmpregadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cadastrarEmpregadoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/cadastrarEmpregado.jsp");
		rd.forward(request, response);

		String nome = request.getParameter("nome");
		String rg = request.getParameter("rg");
		String orgao = request.getParameter("orgao");
		String cpf = request.getParameter("cpf");
		String rua = request.getParameter("rua");
		String bairro = request.getParameter("bairro");
		String cep = request.getParameter("cep");
		String dataAdmisao = request.getParameter("dataAdmisao");
		String salario = request.getParameter("salario");

		new EmpregadoService()
				.cadastrarEmpregado(new Empregado(null, nome, rg, orgao, cpf, rua, bairro, cep, dataAdmisao, salario));

		

	}

}
