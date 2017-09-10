package br.edu.TrabalhoCleverson.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.util.Conexao;


public class EmpregadoDao implements InterfaceDao<Empregado> {
	
	static EmpregadoDao empregadoDao = new EmpregadoDao();
	
	EntityManagerFactory emf = Conexao.getInstance();

	@Override
	
	
	public void excluir(Empregado t) {
		// TODO Auto-generated method stub
		
	}

	public static EmpregadoDao getEmpregadoDao() {
		return empregadoDao;
	}

	public static void setEmpregadoDao(EmpregadoDao empregadoDao) {
		EmpregadoDao.empregadoDao = empregadoDao;
	}

	@Override
	public void salvar(Empregado empregado) {
		System.out.println("PASSOU AQUII EMPREGADO DAOO CADASTRAR "+empregado.getNome());
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(empregado);
		em.getTransaction().commit();

		em.close();
		
	}

	@Override
	public void alterar(Empregado t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empregado> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
