package main;

import java.util.List;

import br.edu.TrabalhoCleverson.dao.EmpreDAO;
import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.bussines.TipoDemissao;
import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;


public class mind {

	
	public static void main(String[] args) {
	
		EmpreDAO dao= new EmpreDAO();
		dao.excluir(1);
	}
	

}
