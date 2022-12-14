package br.com.github.lucasdevrj.mvc.transformacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import br.com.github.lucasdevrj.mvc.transformacao.repository.AlunoRepository;

@Controller
public class PrincipalController {
	
	@Autowired
	private AlunoRepository alunoRepository;

	@GetMapping("/principal")
	public String index(Model model) {
		
		List<Aluno> alunos = alunoRepository.findAll();
		model.addAttribute("alunos", alunos);
		
		return "principal";
	}
}
