package br.com.github.lucasdevrj.mvc.transformacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import br.com.github.lucasdevrj.mvc.transformacao.model.Situacao;
import br.com.github.lucasdevrj.mvc.transformacao.repository.AlunoRepository;
import jakarta.websocket.OnError;

@Controller
@RequestMapping("/principal")
public class PrincipalController {
	
	@Autowired
	private AlunoRepository alunoRepository;

	@GetMapping
	public String principal(Model model) {
		
		List<Aluno> alunos = alunoRepository.findAll();
		model.addAttribute("alunos", alunos);
		
		return "principal";
	}
	
	@GetMapping("/{situacao}")
	public String situacao(@PathVariable("situacao") String situacao, Model model) {
		
		List<Aluno> alunos = alunoRepository.findAllBySituacao(Situacao.valueOf(situacao.toUpperCase()));
		model.addAttribute("alunos", alunos);
		
		return "principal";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/principal";
	}
}
