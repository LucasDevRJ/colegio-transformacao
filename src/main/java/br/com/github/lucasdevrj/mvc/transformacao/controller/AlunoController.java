package br.com.github.lucasdevrj.mvc.transformacao.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerExceptionResolver;

import br.com.github.lucasdevrj.mvc.transformacao.dto.RequisicaoNovoAluno;
import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import br.com.github.lucasdevrj.mvc.transformacao.repository.AlunoRepository;

@Controller
@RequestMapping("aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;

	@GetMapping("formulario")
	public String formulario(RequisicaoNovoAluno requisicao) {
		return "aluno/formulario";
	}
	
	@PostMapping("novo")
	public String novo(@Validated RequisicaoNovoAluno requisicao, BindingResult resultado) {
		
		if (resultado.hasErrors()) {
			return "aluno/formulario";
		}
		
		Aluno aluno = requisicao.toAluno();
		alunoRepository.save(aluno);
		
		return "redirect:/principal";
	}
}
