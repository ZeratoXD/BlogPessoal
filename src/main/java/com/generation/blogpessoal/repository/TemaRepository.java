package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Tema;

public interface TemaRepository {
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
