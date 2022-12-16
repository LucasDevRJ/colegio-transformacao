package br.com.github.lucasdevrj.mvc.transformacao.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import br.com.github.lucasdevrj.mvc.transformacao.model.Situacao;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

	List<Aluno> findAllByAprovado(Situacao aprovado);

}
