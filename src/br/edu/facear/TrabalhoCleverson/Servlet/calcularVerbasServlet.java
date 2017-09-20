package br.edu.facear.TrabalhoCleverson.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
System.out.println(tipodemisao);
System.out.println(avisoPrevio);
System.out.println(feriasVencidas);
System.out.println(diasTrabalhados);
System.out.println(dataAdmisao);
System.out.println(dataDemisao);
System.out.println("SALARIO: "+salario);

		
		service.tipoDemisao(Float.parseFloat(salario), Integer.parseInt(diasTrabalhados), 
				true, true, dataAdmisao, dataDemisao, tipodemisao);
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
