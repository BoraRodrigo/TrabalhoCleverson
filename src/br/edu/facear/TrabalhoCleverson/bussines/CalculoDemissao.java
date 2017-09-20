package br.edu.facear.TrabalhoCleverson.bussines;

import java.util.StringTokenizer;

public class CalculoDemissao {
	

	
	
	public float SaldoSalarial(float Salario, int dias){
		//Descontado em INSS e IRFF
		float Saldo=0;
		
		Saldo=dias * (Salario/30);
		
		return Saldo;
	}
	
	public float AvisoPrevio(boolean aviso, float Salario){
		float Saldo=0;
		System.out.println("saldo" + Saldo);
		/*foi trabalhado*/if(aviso==true){
			return Saldo;
		/*funcionario pagou */}else{
			Saldo=(Salario);
			System.out.println("Saldo aviso else" + Saldo);
			return -Saldo;
		}
		 
	}
	
	/*public float FeriasComJusta(boolean vencida, float Salario){
		float Saldo=0;
		if(vencida==true){
			Saldo=Salario;
			return Saldo;
		}
		 return Saldo;
	}*/
	
	public float FeriasSemJusta(boolean vencida, float Salario){
		float Saldo=0;
		if(vencida==true){
			Saldo= Salario+(Salario/3);
			System.out.println(Saldo+"tem que dar 10M");
			return Saldo;
		}
		 return Saldo;
	}
	
	public float FeriasProporcional(float Salario, int meses){
		float Saldo=0;
		Saldo= ((Salario+(Salario/3))/12)*meses;
		
		System.out.println("de 5 meses " + Saldo);
		
		return Saldo;
	}
	
	public float DecSalarioPropor(float Salario, int meses){
		float Saldo=0;
		Saldo= ((Salario)/12)*meses;
		System.out.println("salario DEC " + Salario + " meses " + meses );
		System.out.println("DEC de 5" + Saldo);
		return Saldo;
	}
		
	
	
	public int MesesTrabalhados(String inicio, String fim){
		
		String recebe;
		String recebefim;
		int i = 0;
		int f = 0;
		
		StringTokenizer st = new StringTokenizer(inicio);
		st.nextToken("-");
		recebe=st.nextToken("-");
		StringTokenizer stf = new StringTokenizer(fim);
		stf.nextToken("-");
		recebefim=stf.nextToken("-");
		
		i = Integer.parseInt(recebe);
		f = Integer.parseInt(recebefim);
		
		return ((f - i)-12)+12;
		
	}
	
	public int AnosTrabalhados(String inicio, String fim){
		String recebe;
		String recebefim;
		int i = 0;
		int f = 0;
		
		StringTokenizer st = new StringTokenizer(inicio);
		st.nextToken("/");
		st.nextToken("/");
		recebe=st.nextToken("/");
		StringTokenizer stf = new StringTokenizer(fim);
		stf.nextToken("/");
		stf.nextToken("/");
		recebefim=stf.nextToken("/");
		
		i = Integer.parseInt(recebe);
		f = Integer.parseInt(recebefim);
		
		return (f-i);
	}
}
