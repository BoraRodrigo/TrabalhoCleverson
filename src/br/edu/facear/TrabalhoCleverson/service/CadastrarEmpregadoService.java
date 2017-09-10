package br.edu.facear.TrabalhoCleverson.service;

import br.edu.TrabalhoCleverson.dao.EmpregadoDao;
import br.edu.TrabalhoCleverson.dao.FactoryDao;
import br.edu.TrabalhoCleverson.entity.Empregado;

public class CadastrarEmpregadoService {
	public  void cadastrarEmpregado( String nome,String rg, String orgaoemissor, String cpf, 
			String rua, String bairro, String cep, String dataAdmisao, float salario) {
		
	Empregado empregado = new Empregado();
	EmpregadoDao empregadoDao = new EmpregadoDao();
	
	empregado.setBairro(bairro);
	empregado.setCep(cep);
	empregado.setCpf(cpf);
	empregado.setDataAdmisao(dataAdmisao);
	empregado.setNome(nome);
	empregado.setOrgaoemissor(orgaoemissor);
	empregado.setRg(rg);
	empregado.setRua(rua);
	empregado.setSalario(salario);

	
	empregadoDao.salvar(empregado);
	
	System.out.println("Passou na Service");
		
	}

}
