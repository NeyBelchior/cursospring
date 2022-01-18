package com.ney.cursomvc.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.ney.cursomvc.domain.enums.EstadoPagamento;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Pagamento implements Serializable{
	           private static final long serialVersionUID = 1L; 
	@Id
	private Integer id;
	private Integer estadoPagamento;
	
	 @JoinColumn(name="pedido_id") 
	 @OneToOne
	 @MapsId
	 private Pedido pedido;
	
	
	 public Pagamento() {
		
	}

	public Pagamento(Integer id, EstadoPagamento estado,Pedido pedido) {

		this.id = id;
		this.estadoPagamento =estado.getCod();
		this.pedido=pedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPagamento getEstado() {
		return EstadoPagamento.toEnum(estadoPagamento);
	}

	public void setEstado(EstadoPagamento estado) {
		this.estadoPagamento =estado.getCod();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		return Objects.equals(id, other.id);
	}
	
 
	
	
	

}
