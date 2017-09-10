package Mainteste;

import br.edu.TrabalhoCleverson.dao.EmpregadoDao;
import br.edu.TrabalhoCleverson.entity.Empregado;

public class testePersistencia {

	public static void main(String[] args) {
		Empregado empregado = new Empregado();

		empregado.setBairro("bairro");
		empregado.setCep("cep");
		empregado.setCpf("cpf");
		empregado.setDataAdmisao("dataAdmisao");
		empregado.setNome("lidia");
		empregado.setOrgaoemissor("orgao");
		empregado.setRg("rg");
		empregado.setRua("rua");
		//empregado.setSalario("1");

	
		EmpregadoDao dao = new EmpregadoDao();
		dao.salvar(empregado);
	
	}

}
