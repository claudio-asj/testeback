package br.dev.karyon.bagarote.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.karyon.bagarote.controller.dto.EmpresaDto;
import br.dev.karyon.bagarote.modelo.Empresa;
import br.dev.karyon.bagarote.modelo.LojaFisica;

@RestController
public class EmpresasController {
	
	@RequestMapping("/empresas")
	public List<EmpresaDto> lista(){
		Empresa empresa = new Empresa("1313131231","Nome e pa","a tal da razão",new LojaFisica("8484857585959", "Nome de uma loja", "AV. Seil la onde é"));
		return EmpresaDto.converter(Arrays.asList(empresa,empresa));
	}
}
