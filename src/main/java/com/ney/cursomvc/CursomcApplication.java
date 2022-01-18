package com.ney.cursomvc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ney.cursomvc.domain.Categoria;
import com.ney.cursomvc.domain.Cidade;
import com.ney.cursomvc.domain.Cliente;
import com.ney.cursomvc.domain.Endereco;
import com.ney.cursomvc.domain.Estado;
import com.ney.cursomvc.domain.Produto;
import com.ney.cursomvc.domain.enums.TipoCliente;
import com.ney.cursomvc.repositories.CategoriaRepository;
import com.ney.cursomvc.repositories.CidadeRepository;
import com.ney.cursomvc.repositories.ClienteRepository;
import com.ney.cursomvc.repositories.EnderecoRepository;
import com.ney.cursomvc.repositories.EstadoRepository;
import com.ney.cursomvc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
  
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		
		Produto p1 = new Produto(null,"Computador",2000.00);
		Produto p2 = new Produto(null,"Impressora",800.00);
		Produto p3 = new Produto(null, "Mouse",80.00 );
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null,"São paulo");
		
		
		Cidade c1 = new Cidade(null, "Uberlandia",est1);
		Cidade c2 = new Cidade(null, "São Paulo",est2);
		Cidade c3 = new Cidade(null, "Campinas",est2);
		
		
	    Cliente cli1 =  new  Cliente(null,"Maria Silva ","maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
	    cli1.getTelefones().addAll(Arrays.asList("27363323","93838393"));
	
	    Endereco e1 = new Endereco(null, "Rua Das Flores", "300", "Apt 203", "Jardim", "38220834", cli1, c1);
	    Endereco e2 =new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c2);
	    
	    
	    cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
	    
	   
	   
	    
	    
	    
	    
		
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		
	
		
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	    produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	    
	    estadoRepository.saveAll(Arrays.asList(est1,est2));
	    cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
	    clienteRepository.saveAll(Arrays.asList(cli1));
	    enderecoRepository.saveAll(Arrays.asList(e1,e2));
	   
	   
		
		
		
		
	}

}
