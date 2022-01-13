package com.ney.cursomvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ney.cursomvc.domain.Estado;
import com.ney.cursomvc.domain.Produto;

@Repository

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	
	

	
	
}
