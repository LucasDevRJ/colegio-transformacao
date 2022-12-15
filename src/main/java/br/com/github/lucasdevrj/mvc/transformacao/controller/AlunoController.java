package br.com.github.lucasdevrj.mvc.transformacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("aluno")
public class AlunoController {

	@GetMapping("formulario")
	public String formulario() {
		return "aluno/formulario";
	}
	
	@PostMapping("novo")
	public String novo(RequisicaoNovoAluno requisicao) {
		return "aluno/formulario";
	}
}
