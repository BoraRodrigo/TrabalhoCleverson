package br.edu.facear.TrabalhoCleverson.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.TrabalhoCleverson.dao.EmpreDAO;
import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.bussines.CalculoDemissao;
import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;

/**
 * Servlet implementation class ObterDados
 */
@WebServlet("/ObterDados")
public class ObterDados extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ObterDados() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id = request.getParameter("id");
	
	EmpreDAO dao = new EmpreDAO();
	dao.PegarEmpregado(Integer.parseInt(id));

	request.setAttribute("empregado", dao.PegarEmpregado(Integer.parseInt(id)));
	RequestDispatcher rd = getServletContext().getRequestDispatcher("/demissao.jsp");

	rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println(id);
	}

}
