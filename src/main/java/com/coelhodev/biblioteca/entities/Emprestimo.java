package com.coelhodev.biblioteca.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.ManyToMany;

public class Emprestimo {

	 public Long id;
	 
	 @ManyToMany(mappedBy = "Usuario")
	 private Set<Usuario> usuario = new HashSet<>();
	 
	 @ManyToMany(mappedBy = "Livro")
	 private Set<Livro> livros = new HashSet<>();
	 
	 private localDate dataEmprestimo;
	 private localDate dataDevolucao;

	 
	 
	// ========== construtores, getters e setters ==========
	
	 public Emprestimo() {
		 
	 }



	public Emprestimo(Long id, Set<Usuario> usuario, Set<Livro> livros, localDate dataEmprestimo,
			localDate dataDevolucao) {
	
		this.id = id;
		this.usuario = usuario;
		this.livros = livros;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Set<Usuario> getUsuario() {
		return usuario;
	}



	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}



	public Set<Livro> getLivros() {
		return livros;
	}



	public void setLivros(Set<Livro> livros) {
		this.livros = livros;
	}



	public localDate getDataEmprestimo() {
		return dataEmprestimo;
	}



	public void setDataEmprestimo(localDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}



	public localDate getDataDevolucao() {
		return dataDevolucao;
	}



	public void setDataDevolucao(localDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	
}
