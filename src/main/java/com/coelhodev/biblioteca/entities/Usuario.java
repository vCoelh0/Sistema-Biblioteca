package com.coelhodev.biblioteca.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String email;
	
	@Enumerated(EnumType.STRING)
	private TiposUsuarios usuarios;
	
	@OneToMany
	private List<Emprestimo> emprestimos = new ArrayList<>();
	
	// ========== construtores, getters e setters ==========
	
	public Usuario() {
		
	}
	

	public Usuario(Long id, String nome, String email, TiposUsuarios usuarios, List<Emprestimo> emprestimos) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.usuarios = usuarios;
		this.emprestimos = emprestimos;
	}





	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public TiposUsuarios getUsuarios() {
		return usuarios;
	}



	public void setUsuarios(TiposUsuarios usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
}
