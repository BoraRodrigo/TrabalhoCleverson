package br.edu.TrabalhoCleverson.dao;

import java.util.List;

public interface InterfaceDao<T> {

	public void excluir(int t);	
	public void salvar(T t);	
	public void alterar(T t);	
	public List<T> listar();

	
}
