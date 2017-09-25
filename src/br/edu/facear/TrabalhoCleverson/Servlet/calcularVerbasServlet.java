package br.edu.facear.TrabalhoCleverson.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.TrabalhoCleverson.dao.EmpreDAO;
import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.bussines.TipoDemissao;
import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;

/**
 * Servlet implementation class calcularVerbasServlet
 */
@WebServlet("/calcularVerbasServlet")
public class calcularVerbasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calcularVerbasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	EmpregadoService service = new EmpregadoService();
		
		System.out.println("Entrou calcular servelet");
		
		String cpf = request.getParameter("cpf");
		String avisoPrevio = request.getParameter("aviso");
		String feriasVencidas = request.getParameter("ferias");
		String diasTrabalhados = request.getParameter("diastrabalhado");
		String tipodemisao = request.getParameter("tipodemissao");
		String dataAdmisao = request.getParameter("dataAdmissao");
		String dataDemisao = request.getParameter("dataDemissão");
		String salario = request.getParameter("ultimoSalario");
		String id = request.getParameter("id");
		
		EmpreDAO dao = new EmpreDAO();
		dao.PegarEmpregado(Integer.parseInt(id));
		
		float saldo=service.tipoDemisao(Float.parseFloat(salario), Integer.parseInt(diasTrabalhados), 
				avisoPrevio, feriasVencidas, dataAdmisao, dataDemisao, tipodemisao);

		request.setAttribute("empregado", dao.PegarEmpregado(Integer.parseInt(id)));
		request.setAttribute("saldo", saldo);
		request.setAttribute("diasTrabalhados", diasTrabalhados);
		request.setAttribute("avisoPrevio", avisoPrevio.toUpperCase());
		request.setAttribute("feriasVencidas", feriasVencidas.toUpperCase());
		request.setAttribute("id", id);
		Empregado.idDemitir=Integer.parseInt(id);
		
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/demissao.jsp");

		rd.forward(request, response);

	}

}
