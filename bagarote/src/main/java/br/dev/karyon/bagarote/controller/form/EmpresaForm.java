package br.dev.karyon.bagarote.controller.form;

import br.dev.karyon.bagarote.modelo.Empresa;
import br.dev.karyon.bagarote.modelo.LojaFisica;
import br.dev.karyon.bagarote.repository.LojaFisicaRepository;

public class EmpresaForm {
	
	private String cnpj;
	private String nomefantasia;
	private String nomeloja;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomefantasia() {
		return nomefantasia;
	}
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}
	public String getNomeloja() {
		return nomeloja;
	}
	public void setNomeloja(String nomeloja) {
		this.nomeloja = nomeloja;
	} 
	public Empresa converter(LojaFisicaRepository lojafisicaRepository) {
		LojaFisica loja = lojafisicaRepository.findByNomeloja(nomeloja);
		return new Empresa(cnpj, nomefantasia, loja);
	}
	
	
}
