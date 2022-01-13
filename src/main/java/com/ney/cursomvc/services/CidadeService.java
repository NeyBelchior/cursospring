package com.ney.cursomvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ney.cursomvc.domain.Categoria;
import com.ney.cursomvc.domain.Cidade;
import com.ney.cursomvc.repositories.CategoriaRepository;
import com.ney.cursomvc.repositories.CidadeRepository;
import com.ney.cursomvc.services.exception.ObjectNotFoundException;

@Service
public class CidadeService {
    @Autowired
	private CidadeRepository repo;
	
    public Cidade find(Integer id) {
    	 Optional<Cidade> obj = repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException(
    	 "Objeto não encontrado! Id: " + id + ", Tipo: " + Cidade.class.getName()));
    	} 


}
