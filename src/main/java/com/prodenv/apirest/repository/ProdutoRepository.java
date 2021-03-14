package com.prodenv.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodenv.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long id);

}
