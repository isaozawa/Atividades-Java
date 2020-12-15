package com.eletronico.Eletronico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eletronico.Eletronico.model.TipoEletro;

@Repository
public interface TipoEletroRepository extends JpaRepository<TipoEletro, Long>{
	
	public List<TipoEletro> findAllByDescricaoContainingIgnoreCase (String descricao);

}
