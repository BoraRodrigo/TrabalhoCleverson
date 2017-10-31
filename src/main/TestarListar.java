package main;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.TrabalhoCleverson.dao.EmpreDAO;
import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;

public class TestarListar {

	@Test
	public void test() {
		EmpreDAO dao = new EmpreDAO();
		dao.listar();
	}

}
