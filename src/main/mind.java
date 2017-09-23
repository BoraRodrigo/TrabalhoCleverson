package main;

import java.util.List;

import br.edu.TrabalhoCleverson.entity.Empregado;
import br.edu.facear.TrabalhoCleverson.bussines.TipoDemissao;
import br.edu.facear.TrabalhoCleverson.service.EmpregadoService;


public class mind {

	
	public static void main(String[] args) {
	
		List<Empregado> Lista_Empregado = new EmpregadoService().Listar();
		for (int i = 0; i < Lista_Empregado.size(); i++) {
			if(Lista_Empregado.get(i).getNome().equals("Rodrigo")){
				TipoDemissao TD = new TipoDemissao();
			//	System.out.println("S Ferias nome:"+ Lista_Empregado.get(i).getNome() + "Valor a pagar: " + TD.DemissaoJusta(Float.parseFloat(Lista_Empregado.get(i).getSalario()), 10, true, true, "02/01/1998", "02/08/1998"));
				//System.out.println("N ferias nome:"+ Lista_Empregado.get(i).getNome() + "Valor a pagar: " + TD.DemissaoJusta(Float.parseFloat(Lista_Empregado.get(i).getSalario()), 10, true, false, "02/01/1998", "02/08/1998"));
				///System.out.println("N aviso nome:"+ Lista_Empregado.get(i).getNome() + "Valor a pagar: " + TD.DemissaoJusta(Float.parseFloat(Lista_Empregado.get(i).getSalario()), 10, false, true, "02/01/1998", "02/08/1998"));
				//System.out.println("N aviso N ferias nome:"+ Lista_Empregado.get(i).getNome() + "Valor a pagar: " + TD.DemissaoJusta(Float.parseFloat(Lista_Empregado.get(i).getSalario()), 10, false, false, "02/01/1998", "02/08/1998"));
			//	System.out.println("pedido demissao" + TD.PedidoDemissao(Float.parseFloat(Lista_Empregado.get(i).getSalario()), 10, false, false, "22/05/2016", "22/10/2016"));
				//System.out.println("Justa" + TD.DemissaoJusta(Float.parseFloat(Lista_Empregado.get(i).getSalario()), 10, true, true, "02/05/2016", "02/10/2016"));
				///System.out.println("SemJusta" + TD.DemissaoSemJusta(Float.parseFloat(Lista_Empregado.get(i).getSalario()), 10, true, true, "22/05/2016", "22/10/2016"));
			}
		}
	}
	

}
