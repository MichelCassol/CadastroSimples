package br.edu.ifpr.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ifpr.spring.models.Pessoa;
import br.edu.ifpr.spring.repository.PessoaRepository;

@Controller
public class IndexController {
	
	@Autowired
	PessoaRepository repository;
	
	@ModelAttribute("lista")
	public List<Pessoa> listar(){
		return repository.findAll();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

}
