package com.ney.cursomvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ney.cursomvc.domain.Categoria;
import com.ney.cursomvc.domain.ItemPedido;

@Repository

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
	
	
	

	
	
}
