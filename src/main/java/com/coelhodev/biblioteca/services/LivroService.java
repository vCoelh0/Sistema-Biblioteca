package com.coelhodev.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coelhodev.biblioteca.dto.LivroDTO;
import com.coelhodev.biblioteca.entities.Livro;
import com.coelhodev.biblioteca.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repository;
	
	public LivroDTO adicionar (LivroDTO dto) {
		
		Livro livro = new Livro();
		
		livro.setTitulo(dto.getTitulo());
		livro.setAutor(dto.getAutor());
		livro.setCategoria(dto.getCategoria());
		livro.setAnoPublicacao(dto.getAnoPublicacao());
		livro.setQuantidade(dto.getQuantidade());
		
		livro = repository.save(livro);
		
		return new LivroDTO(livro);
	}
	
	public List<LivroDTO> listar () {
		List<Livro> result = repository.findAll();
		return result.stream().map(LivroDTO::new).toList();
		
	}
	
	
}
