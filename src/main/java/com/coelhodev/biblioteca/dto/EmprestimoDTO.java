package com.coelhodev.biblioteca.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.coelhodev.biblioteca.entities.Emprestimo;
import com.coelhodev.biblioteca.entities.Livro;
import com.coelhodev.biblioteca.entities.Usuario;



public class EmprestimoDTO {

	 public Long id;
	 private Usuario usuario;
	 private Set<Livro> livros = new HashSet<>();
	 private LocalDate dataEmprestimo;
	 private LocalDate dataDevolucao;

	 
	 public EmprestimoDTO(Long id, Usuario usuario, Set<Livro> livros, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
		this.id = id;
		this.usuario = usuario;
		this.livros = livros;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	 
	 
	 public EmprestimoDTO(Emprestimo entity) {
		id = entity.getId();
		usuario = entity.getUsuario();
		dataEmprestimo = entity.getDataEmprestimo();
		dataDevolucao = entity.getDataDevolucao();
	 }
	 
	 
	//GETTERS
	public Long getId() {
		return id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public Set<Livro> getLivros() {
		return livros;
	}
	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	
	 
	 
	 
	
	
}
