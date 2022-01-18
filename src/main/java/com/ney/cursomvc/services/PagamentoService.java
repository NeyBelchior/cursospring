package com.ney.cursomvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ney.cursomvc.domain.Categoria;
import com.ney.cursomvc.domain.Pagamento;
import com.ney.cursomvc.repositories.PagamentoRepository;
import com.ney.cursomvc.services.exception.ObjectNotFoundException;

@Service
public class PagamentoService {
    @Autowired
	private PagamentoRepository repo;
	
    public Pagamento find(Integer id) {
    	 Optional<Pagamento> obj = repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException(
    	 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    	} 


}
