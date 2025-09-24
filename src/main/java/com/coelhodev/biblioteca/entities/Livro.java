package com.coelhodev.biblioteca.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String categoria;
	private int quantidade;
	
	@ManyToMany
	@JoinTable(
			name = "livro_emprestimo",
			joinColumns = @JoinColumn(name = "livro_id"),
			inverseJoinColumns = @JoinColumn(name = "emprestimo_id")
			)
	private List<Emprestimo> emprestimos = new ArrayList<>();
	
	
	
	// ========== construtores, getters e setters ==========
	
	public Livro() {
		
	}



	public Livro(Long id, String titulo, String autor, int anoPublicacao, String categoria, int quantidade,
		List<Emprestimo> emprestimos) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.emprestimos = emprestimos;
	}







	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getAnoPublicacao() {
		return anoPublicacao;
	}



	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
