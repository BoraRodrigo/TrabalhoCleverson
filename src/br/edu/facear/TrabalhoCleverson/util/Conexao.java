package br.edu.facear.TrabalhoCleverson.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("Trabalho");
	

	public static EntityManagerFactory getInstance() {
		return emf;
	}

}
