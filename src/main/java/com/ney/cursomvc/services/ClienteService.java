package com.ney.cursomvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ney.cursomvc.domain.Cidade;
import com.ney.cursomvc.domain.Cliente;
import com.ney.cursomvc.repositories.ClienteRepository;
import com.ney.cursomvc.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
    @Autowired
	private ClienteRepository repo;
	
    public Cliente find(Integer id) {
    	 Optional<Cliente> obj = repo.findById(id);
    	return obj.orElseThrow(() -> new ObjectNotFoundException(
    	 "Objeto não encontrado! Id: " + id + ", Tipo: " + Cidade.class.getName()));
    	} 


}
