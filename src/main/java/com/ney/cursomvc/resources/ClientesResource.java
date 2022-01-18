package com.ney.cursomvc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ney.cursomvc.domain.Cidade;
import com.ney.cursomvc.domain.Cliente;
import com.ney.cursomvc.domain.Estado;
import com.ney.cursomvc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClientesResource {

	@Autowired
	private ClienteService service;
	
	
	@RequestMapping(value ="/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Cliente obj =service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
