package br.edu.ifpr.spring.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpr.spring.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
