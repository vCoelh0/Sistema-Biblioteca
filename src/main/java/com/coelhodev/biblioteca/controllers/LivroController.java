package com.coelhodev.biblioteca.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coelhodev.biblioteca.dto.LivroDTO;
import com.coelhodev.biblioteca.services.LivroService;


@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	LivroService service;
	
	@PostMapping
	public LivroDTO adicionar(@RequestBody LivroDTO dto) {
	return service.adicionar(dto);
	}
	
	@GetMapping
	public List<LivroDTO> listar() {
		return service.listar();
	}
		
}
