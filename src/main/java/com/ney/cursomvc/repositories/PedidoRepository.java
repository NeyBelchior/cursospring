package com.ney.cursomvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ney.cursomvc.domain.Pedido;

@Repository

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	
	
	

	
	
}
