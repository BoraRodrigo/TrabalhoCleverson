package br.edu.facear.TrabalhoCleverson.Servlet;

import java.io.IOException;

import javax.persistence.Entity;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlRootElement;

import br.edu.TrabalhoCleverson.dao.EmpregadoDao;
import br.edu.TrabalhoCleverson.dao.FactoryDao;
import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.service.CadastrarEmpregadoService;

import br.edu.facear.TrabalhoCleverson.util.Conexao;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage;
	    nextPage = "Trabalho/cadastrarEmpregado.html";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		/// redirecionamento carrega nova pagina
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nome = request.getParameter("nome"); 
		String rg = request.getParameter("rg"); 
		String orgao = request.getParameter("orgao"); 
		String cpf = request.getParameter("cpf"); 
		
		String rua = request.getParameter("rua"); 
		String bairro = request.getParameter("bairro"); 
		String cep = request.getParameter("cep"); 
		
		String dataAdmisao = request.getParameter("dataAdmisao"); 
		String salario = request.getParameter("salario"); 
		
		System.out.println("NOME : "+nome);
		System.out.println("rg : "+rg);
		System.out.println("orgao : "+orgao);
		System.out.println("cpf : "+cpf);
		System.out.println("rua : "+rua);
		System.out.println("bairro : "+bairro);
		System.out.println("cep : "+cep);
		System.out.println("data : "+dataAdmisao);
		System.out.println("salario : "+salario);
		
		
		Empregado empregado = new Empregado();
		System.out.println("crioooo ");
		
		
		
		
		empregado.setBairro(bairro);
		empregado.setCep(cep);
		System.out.println("Aqui");
		empregado.setCpf(cpf);
		empregado.setDataAdmisao(dataAdmisao);
		empregado.setNome(nome);
		empregado.setOrgaoemissor(orgao);
		empregado.setRg(rg);
		empregado.setRua(rua);
		empregado.setSalario(2);

	
 EmpregadoDao.getEmpregadoDao().salvar(empregado);
	
	
		
		
		
		
		//CadastrarEmpregadoService cadastrarEmpregadoService = new CadastrarEmpregadoService();
		//cadastrarEmpregadoService.cadastrarEmpregado(nome, rg, orgao, cpf, rua, bairro, cep, dataAdmisao, Float.parseFloat(salario));
		
		//RequestDispatcher rd = getServletContext().getRequestDispatcher("/cadastrarEmpregado.html");
		///// redirecionamento carrega nova pagina
		//rd.forward(request, response);
		
	}

}
