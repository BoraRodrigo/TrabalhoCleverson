package br.edu.facear.TrabalhoCleverson.bussines;

import org.apache.http.impl.io.SocketOutputBuffer;

public class TipoDemissao {
	CalculoDemissao cd = new CalculoDemissao();

	/*Esse ta Legal haha*/
	public float DemissaoJusta(float Salario, int dias, String aviso, String vencida, String inicio, String fim) {
		float calculo = 0;
		
		boolean avisoprevio;
		boolean feriasVencida;
		
		if(aviso.equals("sim")) {
			 avisoprevio=true;
		}else {
			 avisoprevio=false;
		}
		
		if(vencida.equals("sim")) {
			 feriasVencida=true;
		}else {
			 feriasVencida=false;
		}

		calculo = cd.SaldoSalarial(Salario, dias) + cd.FeriasSemJusta(feriasVencida, Salario);
		System.out.println("  Calculo:"+ calculo);
		return calculo;
	}
	/*Esse ta proximo*/
	public float PedidoDemissao(float Salario, int dias, String aviso, String vencida, String inicio, String fim) {
		float calculo = 0;
		boolean avisoprevio;
		boolean feriasVencida;
		
		if(aviso.equals("sim")) {
			 avisoprevio=true;
		}else {
			 avisoprevio=false;
		}
		
		if(vencida.equals("sim")) {
			 feriasVencida=true;
		}else {
			 feriasVencida=false;
		}
		
		calculo = cd.SaldoSalarial(Salario, dias);
		
		System.out.println("saldo pedido " + calculo + "e " + cd.SaldoSalarial(Salario, dias));

		calculo = calculo + cd.DecSalarioPropor(Salario, cd.MesesTrabalhados(inicio, fim));

		System.out
				.println("saldo DEC " + calculo + "e " + cd.DecSalarioPropor(Salario, cd.MesesTrabalhados(inicio, fim)));

		calculo = calculo + cd.FeriasProporcional(Salario, cd.MesesTrabalhados(inicio, fim));
 
		System.out.println("saldo FerP" + calculo +"e " + cd.FeriasProporcional(Salario, cd.MesesTrabalhados(inicio, fim)));

		calculo = calculo + cd.FeriasSemJusta(feriasVencida, Salario);

		System.out.println("saldo ferias " + calculo + "e "+ cd.FeriasSemJusta(feriasVencida, Salario));

		calculo = calculo + cd.AvisoPrevio( avisoprevio, Salario);
		
		System.out.println("Saldo aviso "+ calculo + "e " +cd.AvisoPrevio(avisoprevio, Salario));

		return calculo;

	}

		/*Quase la ta bem errado*/
	public float DemissaoSemJusta(float Salario, int dias, String aviso, String vencida, String inicio, String fim) {
		float calculo = 0;
		boolean avisoprevio;
		boolean feriasVencida;
		
		if(aviso.equals("sim")) {
			 avisoprevio=true;
		}else {
			 avisoprevio=false;
		}
		
		if(vencida.equals("sim")) {
			 feriasVencida=true;
		}else {
			 feriasVencida=false;
		}
		calculo = cd.SaldoSalarial(Salario, dias) + 
				cd.DecSalarioPropor(Salario, cd.MesesTrabalhados(inicio, fim))
				+ cd.FeriasSemJusta(feriasVencida, Salario) + 
				cd.FeriasProporcional(Salario, cd.MesesTrabalhados(inicio, fim))
				+ cd.AvisoPrevio( avisoprevio, Salario);

		return calculo;
	}
}
