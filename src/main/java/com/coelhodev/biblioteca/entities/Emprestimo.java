package com.coelhodev.biblioteca.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_emprestimo")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 public Long id;
	 
	 @ManyToOne()
	 @JoinColumn(name = "usuario_id")
	 private Usuario usuario;
	 
	 @ManyToMany(mappedBy = "emprestimos")
	 private Set<Livro> livros = new HashSet<>();
	 
	 private LocalDate dataEmprestimo;
	 private LocalDate dataDevolucao;

	 
	 
	// ========== construtores, getters e setters ==========
	
	 public Emprestimo() {
		 
	 }


	public Emprestimo(Long id, Usuario usuario, Set<Livro> livros, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
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



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
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
