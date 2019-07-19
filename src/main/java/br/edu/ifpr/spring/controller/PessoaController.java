package br.edu.ifpr.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifpr.spring.models.Pessoa;
import br.edu.ifpr.spring.repository.PessoaRepository;

@Controller
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@RequestMapping(value="/form", method = RequestMethod.GET)
	public String form() {
		return "cadastro";
	}
	
	@RequestMapping(value="/form",method = RequestMethod.POST)
	public String cadastro(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		return "redirect:/";
	}

}
