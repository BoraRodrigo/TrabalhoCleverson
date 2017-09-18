package br.edu.TrabalhoCleverson.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.util.Conexao;

public class EmpreDAO implements InterfaceDao<Empregado> {

	EntityManagerFactory emf = Conexao.getInstance();

	@Override
	public void excluir(Empregado t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void salvar(Empregado empregado) {
		if(empregado != null){
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(empregado);
		em.getTransaction().commit();
		em.close();
		}

	}

	@Override
	public void alterar(Empregado t) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Empregado> listar() {
		EntityManager em = Conexao.getInstance().
				createEntityManager();
		Query q = em.createQuery("from Empregado");
		
		return q.getResultList();
	}

}
