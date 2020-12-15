package com.eletronico.Eletronico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronico.Eletronico.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainintIgnoreCase (String nome);

}
