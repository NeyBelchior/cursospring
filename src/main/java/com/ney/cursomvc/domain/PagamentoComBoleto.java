package com.ney.cursomvc.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ney.cursomvc.domain.enums.EstadoPagamento;
@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L; 
	
	
	@Temporal(TemporalType.DATE)
	private Date datavencimento;
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;

	
	 

	public PagamentoComBoleto(Integer id, EstadoPagamento estado,Pedido pedido,Date dataVencimento,Date dataPagamento) {
		super(id, estado,pedido);
		this.datavencimento=dataVencimento;
		this.dataPagamento=dataPagamento;
	
	
	}
	
	

	
}
