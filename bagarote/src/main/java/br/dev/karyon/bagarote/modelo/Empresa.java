package br.dev.karyon.bagarote.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Empresa {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnpj;
	private String nomefantasia;
	private String razaosocial;
	@ManyToOne
	private LojaFisica lojaFisica;
	
	public Empresa() {
		
	}
	
	
	public Empresa(String cnpj, String nomefantasia, LojaFisica lojaFisica) {
		super();
		this.cnpj = cnpj;
		this.nomefantasia = nomefantasia;
		this.lojaFisica = lojaFisica;

	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeFantasia() {
		return nomefantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomefantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaosocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaosocial = razaoSocial;
	}
	public LojaFisica getLojaFisica() {
		return lojaFisica;
	}
	public void setLojaFisica(LojaFisica lojaFisica) {
		this.lojaFisica = lojaFisica;
	}

	
	
}
