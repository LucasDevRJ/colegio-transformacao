package br.com.github.lucasdevrj.mvc.transformacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		
		return "aluno/formulario";
	}
}
