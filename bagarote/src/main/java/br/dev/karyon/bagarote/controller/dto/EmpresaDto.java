package br.dev.karyon.bagarote.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.dev.karyon.bagarote.modelo.Empresa;

public class EmpresaDto {
	
	private Long id;
	private String cnpj;
	private String razaoSocial;
	
	public EmpresaDto(Empresa empresa) {
		this.id = empresa.getId();
		this.cnpj = empresa.getCnpj();
		this.razaoSocial = empresa.getRazaoSocial();
	}
	
	public Long getId() {
		return id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public static List<EmpresaDto> converter(List<Empresa> empresas) {
		return empresas.stream().map(EmpresaDto::new).collect(Collectors.toList());
	}
	
	
}
