package com.ney.cursomvc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ney.cursomvc.domain.Categoria;
import com.ney.cursomvc.domain.Cidade;
import com.ney.cursomvc.services.CategoriaService;
import com.ney.cursomvc.services.CidadeService;

@RestController
@RequestMapping(value="/Cidades")
public class CidadeResource {

	@Autowired
	private CidadeService service;
	
	
	@RequestMapping(value ="/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Cidade obj =service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
