package br.dev.karyon.bagarote.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LojaFisica {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnpj;
	private String nomeloja;
	private String enderecocompleto;
	private String nomecompleto;
	private String telFixo;
	private String celular;
	private String whatsapp;
	@ManyToOne
	private Empresa empresa;
	
	public LojaFisica(String cnpj, String nomeLoja, String enderecoCompleto) {
		this.cnpj = cnpj;
		this.nomecompleto = nomeLoja;
		this.enderecocompleto = enderecoCompleto;
	}
	
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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
	public String getNomeLoja() {
		return nomeloja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeloja = nomeLoja;
	}
	public String getEnderecoCompleto() {
		return enderecocompleto;
	}
	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecocompleto = enderecoCompleto;
	}
	public String getNomeCompleto() {
		return nomecompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomecompleto = nomeCompleto;
	}
	public String getTelFixo() {
		return telFixo;
	}
	public void setTelFixo(String telFixo) {
		this.telFixo = telFixo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	
	
}
