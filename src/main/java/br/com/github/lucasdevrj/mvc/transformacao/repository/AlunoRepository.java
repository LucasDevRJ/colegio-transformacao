package br.com.github.lucasdevrj.mvc.transformacao.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class AlunoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Aluno> recuperaTodosAlunos() {
		Query query = entityManager.createQuery("select a from Aluno a", Aluno.class);
		return query.getResultList();
	}
}
