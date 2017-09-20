package br.edu.facear.TrabalhoCleverson.bussines;

import org.apache.http.impl.io.SocketOutputBuffer;

public class TipoDemissao {
	CalculoDemissao cd = new CalculoDemissao();

	/*Esse ta Legal haha*/
	public float DemissaoJusta(float Salario, int dias, boolean aviso, boolean vencida, String inicio, String fim) {
		float calculo = 0;

		calculo = cd.SaldoSalarial(Salario, dias) + cd.FeriasSemJusta(vencida, Salario);

		return calculo;
	}
	/*Esse ta proximo*/
	public float PedidoDemissao(float Salario, int dias, boolean aviso, boolean vencida, String inicio, String fim) {
		float calculo = 0;
		calculo = cd.SaldoSalarial(Salario, dias);
		
		System.out.println("saldo pedido " + calculo + "e " + cd.SaldoSalarial(Salario, dias));

		calculo = calculo + cd.DecSalarioPropor(Salario, cd.MesesTrabalhados(inicio, fim));

		System.out
				.println("saldo DEC " + calculo + "e " + cd.DecSalarioPropor(Salario, cd.MesesTrabalhados(inicio, fim)));

		calculo = calculo + cd.FeriasProporcional(Salario, cd.MesesTrabalhados(inicio, fim));
 
		System.out.println("saldo FerP" + calculo +"e " + cd.FeriasProporcional(Salario, cd.MesesTrabalhados(inicio, fim)));

		calculo = calculo + cd.FeriasSemJusta(vencida, Salario);

		System.out.println("saldo ferias " + calculo + "e "+ cd.FeriasSemJusta(vencida, Salario));

		calculo = calculo + cd.AvisoPrevio( aviso, Salario);
		
		System.out.println("Saldo aviso "+ calculo + "e " +cd.AvisoPrevio(aviso, Salario));

		return calculo;

	}

		/*Quase la ta bem errado*/
	public float DemissaoSemJusta(float Salario, int dias, boolean aviso, boolean vencida, String inicio, String fim) {
		float calculo = 0;
		calculo = cd.SaldoSalarial(Salario, dias) + 
				cd.DecSalarioPropor(Salario, cd.MesesTrabalhados(inicio, fim))
				+ cd.FeriasSemJusta(vencida, Salario) + 
				cd.FeriasProporcional(Salario, cd.MesesTrabalhados(inicio, fim))
				+ cd.AvisoPrevio( aviso, Salario);

		return calculo;
	}
}
