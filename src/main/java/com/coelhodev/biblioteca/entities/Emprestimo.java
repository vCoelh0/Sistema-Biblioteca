package com.coelhodev.biblioteca.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="tb_emprestimo")
public class Emprestimo {

	 public Long id;
	 
	 @ManyToMany(mappedBy = "Usuario")
	 private Set<Usuario> usuario = new HashSet<>();
	 
	 @ManyToMany(mappedBy = "Livro")
	 private Set<Livro> livros = new HashSet<>();
	 
	 private LocalDate dataEmprestimo;
	 private LocalDate dataDevolucao;

	 
	 
	// ========== construtores, getters e setters ==========
	
	 public Emprestimo() {
		 
	 }



	public Emprestimo(Long id, Set<Usuario> usuario, Set<Livro> livros, LocalDate dataEmprestimo,
			LocalDate dataDevolucao) {
	
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



	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}



	public void setDataEmprestimo(LocalDate dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}



	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}



	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	
}
