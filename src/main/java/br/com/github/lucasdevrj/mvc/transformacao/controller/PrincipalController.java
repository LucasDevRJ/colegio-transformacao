package br.com.github.lucasdevrj.mvc.transformacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

	@GetMapping("/principal")
	public String index() {
		return "principal";
	}
}
