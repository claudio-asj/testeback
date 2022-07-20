package br.dev.karyon.bagarote.controller.form;

import br.dev.karyon.bagarote.modelo.Empresa;
import br.dev.karyon.bagarote.repository.EmpresaRepository;

public class AtualizaEmpresaForm {
	
	private String cnpj;
	private String razaosocia;

	
	
	
	public String getCnpj() {
		return cnpj;
	}




	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}




	public String getRazaosocia() {
		return razaosocia;
	}




	public void setRazaosocia(String razaosocia) {
		this.razaosocia = razaosocia;
	}




	public Empresa atualizar(Long id, EmpresaRepository empresaRepository) {
		Empresa empresa = empresaRepository.getOne(id);
		empresa.setCnpj(cnpj);
		return empresa;
	}
	
	
}
