package br.edu.TrabalhoCleverson.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceUnit;
import javax.persistence.PersistenceUnits;
import javax.persistence.Table;

@PersistenceUnits({@PersistenceUnit(unitName="Trabalho")})
@Entity
@Table(name = "EMPREGADO")
@NamedQueries({@NamedQuery(name="Empregado.findAll", query="SELECT e FROM Empregado e")})
public class Empregado {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String rg;
	private String orgaoemissor;
	private String cpf;
	
	private String rua;
	private String bairro;
	private String cep;
	private String dataAdmisao;
	private String salario;
	public  static int  idDemitir;
	
	public Empregado(){
		
	}
	
	public Empregado(Integer id, String nome, String rg, String orgaoemissor, String cpf, String rua, String bairro,
			String cep, String dataAdmisao, String salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.orgaoemissor = orgaoemissor;
		this.cpf = cpf;
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.dataAdmisao = dataAdmisao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoemissor() {
		return orgaoemissor;
	}

	public void setOrgaoemissor(String orgaoemissor) {
		this.orgaoemissor = orgaoemissor;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getDataAdmisao() {
		return dataAdmisao;
	}

	public void setDataAdmisao(String dataAdmisao) {
		this.dataAdmisao = dataAdmisao;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}


}
