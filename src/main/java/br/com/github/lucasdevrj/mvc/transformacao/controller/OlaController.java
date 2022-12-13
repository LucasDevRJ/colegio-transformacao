package br.com.github.lucasdevrj.mvc.transformacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaController {

	@GetMapping("/ola")
	public String ola() {
		return "ola";
	}
}
