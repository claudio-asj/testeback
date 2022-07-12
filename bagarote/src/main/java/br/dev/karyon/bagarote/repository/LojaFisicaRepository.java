package br.dev.karyon.bagarote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.dev.karyon.bagarote.modelo.LojaFisica;

public interface LojaFisicaRepository extends JpaRepository<LojaFisica, Long>{

	LojaFisica findByNomeloja(String nomeloja);

}
