package com.ney.cursomvc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.ney.cursomvc.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComCartao extends Pagamento {
	    private static final long serialVersionUID = 1L; 
	
	private Integer parcelas;


	 public PagamentoComCartao(){
		 super();
	 }
	
	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido,Integer parcelas) {
		super(id, estado, pedido);
		this.parcelas=parcelas;
	}


	
	
	

}
