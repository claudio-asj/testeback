package br.dev.karyon.bagarote.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.karyon.bagarote.modelo.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	List<Empresa> findByCnpj(String cnpj);

}
