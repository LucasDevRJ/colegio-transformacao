package br.com.github.lucasdevrj.mvc.transformacao.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Controller
public class PrincipalController {

	@GetMapping("/principal")
	public String index(Model model) {
		
		
		
		model.addAttribute("alunos", alunos);
		
		return "principal";
	}
}
