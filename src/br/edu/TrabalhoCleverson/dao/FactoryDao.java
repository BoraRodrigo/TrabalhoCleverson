package br.edu.TrabalhoCleverson.dao;

import br.edu.TrabalhoCleverson.entity.Empregado;


public class FactoryDao {
	
	public static InterfaceDao<Empregado> createEmpregadoDao() {
		return new EmpregadoDao();
	}
}
