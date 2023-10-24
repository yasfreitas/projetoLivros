package com.projetoLivro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoLivro.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
