package com.coelhodev.biblioteca.dto;

import com.coelhodev.biblioteca.entities.Livro;

public class LivroDTO {

	private Long id;
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String categoria;
	private int quantidade;
	
	public LivroDTO(Long id, String titulo, String autor, int anoPublicacao, String categoria, int quantidade) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.quantidade = quantidade;
	}

	public LivroDTO(Livro entity) {
		id = entity.getId();
		titulo = entity.getTitulo();
		anoPublicacao = entity.getAnoPublicacao();
		categoria = entity.getCategoria();
		quantidade = entity.getQuantidade();
	}
	

	
	//GETTERS
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	
	
	
	
}
