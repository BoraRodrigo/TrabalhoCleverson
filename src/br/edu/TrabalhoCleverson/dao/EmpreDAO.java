package br.edu.TrabalhoCleverson.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;

import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;
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
	
	public Empregado PegarEmpregado( int id) {
		EmpregadoService service = new EmpregadoService();
		List<Empregado> listaEmpregado = new ArrayList<Empregado>();
		Empregado  empregado = new Empregado();
		listaEmpregado = new EmpreDAO().listar();
		
		for(int i=0; i<listaEmpregado.size(); i++) {
			if(listaEmpregado.get(i).getId()==id) {
				empregado.setNome(listaEmpregado.get(i).getNome());
				empregado.setSalario((listaEmpregado.get(i).getSalario()));
				empregado.setCpf(listaEmpregado.get(i).getCpf());
				empregado.setDataAdmisao((listaEmpregado.get(i).getDataAdmisao()));
				empregado.setId(listaEmpregado.get(i).getId());
			}
		}	
		return empregado;
	}
}
