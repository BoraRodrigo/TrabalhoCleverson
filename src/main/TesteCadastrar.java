package main;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;

public class TesteCadastrar {

	@Test
	public void test() {
		EmpregadoService service = new EmpregadoService();
		service.cadastrarEmpregado(new Empregado(null, "Roberto", "124", "SSp", "987", "rua", "bairro", "835", "12-08-2016", "2500"));
	}

}
