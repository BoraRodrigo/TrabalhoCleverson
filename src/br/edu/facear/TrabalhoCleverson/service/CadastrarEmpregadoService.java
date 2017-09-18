package br.edu.facear.TrabalhoCleverson.service;

import java.util.List;

import br.edu.TrabalhoCleverson.dao.FactoryDao;
import br.edu.TrabalhoCleverson.dao.InterfaceDao;
import br.edu.TrabalhoCleverson.entity.Empregado;

public class CadastrarEmpregadoService {

	public void cadastrarEmpregado(Empregado empregado) {
		
		InterfaceDao<Empregado> dao = new FactoryDao().createEmpregadoDao();
		dao.salvar(empregado);

	}
	public List<Empregado> Listar(){
		InterfaceDao<Empregado> empregado = new FactoryDao().createEmpregadoDao();
		return empregado.listar();
	}
	
}
