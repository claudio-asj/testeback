package br.dev.karyon.bagarote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.karyon.bagarote.controller.dto.EmpresaDto;
import br.dev.karyon.bagarote.controller.form.EmpresaForm;
import br.dev.karyon.bagarote.modelo.Empresa;
import br.dev.karyon.bagarote.repository.EmpresaRepository;
import br.dev.karyon.bagarote.repository.LojaFisicaRepository;

@RestController
@RequestMapping("/empresas")
public class EmpresasController {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private LojaFisicaRepository lojafisicaRepository;
	
	@GetMapping
	public List<EmpresaDto> lista(String cnpj){
		if(cnpj == null) {
			List<Empresa> empresas = empresaRepository.findAll();
			return EmpresaDto.converter(empresas);
		} else {
			List<Empresa> empresas = empresaRepository.findByCnpj(cnpj);
			return EmpresaDto.converter(empresas);
		}
	}
	
	@PostMapping
	public void cadastrar(@RequestBody EmpresaForm form) { 
		Empresa empresa = form.converter(lojafisicaRepository);
		empresaRepository.save(empresa);
	}
}

