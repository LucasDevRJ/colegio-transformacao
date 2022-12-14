package br.com.github.lucasdevrj.mvc.transformacao.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
