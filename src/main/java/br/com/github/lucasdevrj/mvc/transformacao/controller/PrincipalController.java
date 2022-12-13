package br.com.github.lucasdevrj.mvc.transformacao.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.github.lucasdevrj.mvc.transformacao.model.Aluno;
import br.com.github.lucasdevrj.mvc.transformacao.model.Situacao;

@Controller
public class PrincipalController {

	@GetMapping("/principal")
	public String index(Model model) {
		Aluno aluno = new Aluno();
		aluno.setNome("Lucas");
		aluno.setSobrenome("Pereira");
		aluno.setAno(3);
		aluno.setMatricula("33412");
		aluno.setPrimeiraNota(6.7);
		aluno.setSegundaNota(7.0);
		aluno.setSituacao(Situacao.APROVADO);
		
		List<Aluno> alunos = Arrays.asList(aluno);
		model.addAttribute("alunos", alunos);
		
		return "principal";
	}
}
