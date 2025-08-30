package com.coelhodev.biblioteca.dto;

import com.coelhodev.biblioteca.entities.TiposUsuarios;
import com.coelhodev.biblioteca.entities.Usuario;

public class UsuarioDTO {

	private Long id;
	private String nome;
	private String email;
	private TiposUsuarios usuarios;
	

	public UsuarioDTO(Long id, String nome, String email, TiposUsuarios usuarios) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.usuarios = usuarios;
	}
	
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
		usuarios = entity.getUsuarios();
	}
	
	
	//GETTERS
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public TiposUsuarios getUsuarios() {
		return usuarios;
	}

	
	
	
	
}
