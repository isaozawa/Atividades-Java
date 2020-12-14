package com.farmcia.farmacia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.farmcia.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByProdutoContainingIgnoreCase (String nome);


}
