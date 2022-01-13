package com.ney.cursomvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ney.cursomvc.domain.Categoria;
import com.ney.cursomvc.domain.Cidade;
import com.ney.cursomvc.domain.Estado;
import com.ney.cursomvc.repositories.CategoriaRepository;
import com.ney.cursomvc.repositories.CidadeRepository;
import com.ney.cursomvc.repositories.EstadoRepository;
import com.ney.cursomvc.services.exception.ObjectNotFoundException;

@Service
public class EstadoService {
    @Autowired
	private EstadoRepository repo;
	
    public Estado find(Integer id) {
    	 Optional<Estado> obj = repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException(
    	 "Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
    	} 


}
