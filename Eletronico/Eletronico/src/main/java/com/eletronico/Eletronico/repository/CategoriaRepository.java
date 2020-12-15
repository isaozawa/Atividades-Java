package com.eletronico.Eletronico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronico.Eletronico.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String descricao);

}
