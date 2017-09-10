package br.edu.TrabalhoCleverson.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("TrabalhoCleverson");
	

	public static EntityManagerFactory getInstance() {
		return emf;
	}
}
