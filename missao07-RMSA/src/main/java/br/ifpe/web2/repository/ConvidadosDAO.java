package br.ifpe.web2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifpe.web2.model.Convidado;

@Repository
public interface ConvidadosDAO extends JpaRepository<Convidado, Long> {

	
}
