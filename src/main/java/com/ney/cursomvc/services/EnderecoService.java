package com.ney.cursomvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ney.cursomvc.domain.Categoria;
import com.ney.cursomvc.domain.Endereco;
import com.ney.cursomvc.repositories.CategoriaRepository;
import com.ney.cursomvc.repositories.EnderecoRepository;
import com.ney.cursomvc.services.exception.ObjectNotFoundException;

@Service
public class EnderecoService {
    @Autowired
	private EnderecoRepository repo;
	
    public Endereco find(Integer id) {
    	 Optional<Endereco> obj = repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException(
    	 "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    	} 


}
