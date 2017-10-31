package main;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;

public class TestarCalculos {

	@Test
	public void test() {
		EmpregadoService service = new EmpregadoService();
		service.tipoDemisao(2500, 10, "sim", "sim", "10-08-2016", "10-10-2016", "justaCausa");
		service.tipoDemisao(2500, 10, "sim", "sim", "10-08-2016", "10-10-2016", "semjustaCausa");
		service.tipoDemisao(2500, 10, "sim", "sim", "10-08-2016", "10-10-2016", "pedidoDemisao");
	}

}
