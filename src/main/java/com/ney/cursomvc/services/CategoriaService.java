package com.ney.cursomvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ney.cursomvc.domain.Categoria;
import com.ney.cursomvc.repositories.CategoriaRepository;
import com.ney.cursomvc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
    @Autowired
	private CategoriaRepository repo;
	
    public Categoria find(Integer id) {
    	 Optional<Categoria> obj = repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException(
    	 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    	} 


}
