package br.edu.facear.TrabalhoCleverson.service;

import java.util.List;

import br.edu.TrabalhoCleverson.dao.FactoryDao;
import br.edu.TrabalhoCleverson.dao.InterfaceDao;
import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.bussines.TipoDemissao;

public class EmpregadoService {

	public void cadastrarEmpregado(Empregado empregado) {
		
		InterfaceDao<Empregado> dao = new FactoryDao().createEmpregadoDao();
		dao.salvar(empregado);

	}
	public List<Empregado> Listar(){
		InterfaceDao<Empregado> empregado = new FactoryDao().createEmpregadoDao();
		return empregado.listar();
	}
	public Empregado PegarEmpregado( Empregado empregado) {
		
		
		return empregado;
	}
	public float tipoDemisao(float Salario, int dias, String aviso, String vencida, String inicio, String fim,String tipo) {
		float saldo = 0;
		if(tipo.equals("justaCausa")) {
			TipoDemissao demissao = new TipoDemissao();
			saldo= demissao.DemissaoJusta(Salario, dias, aviso, vencida, inicio, fim);
		}
		return saldo;
	}

	
}
