package com.coelhodev.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coelhodev.biblioteca.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
