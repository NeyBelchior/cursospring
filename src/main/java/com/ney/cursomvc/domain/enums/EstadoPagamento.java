package com.ney.cursomvc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1,"Pendente"),
	QUITADO(2,"Quitado"),
	CANCELADO(3,"Cancelado");
	
	Integer cod;
	String desc;
	
	private EstadoPagamento(Integer cod, String Desc) {
		this.cod=cod;
		this.desc=desc;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}
	
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		} 
		for(EstadoPagamento ep : EstadoPagamento.values()) {
			if(ep.cod.equals(cod)) {
				return ep;
			}
		}
		throw new IllegalArgumentException("Tipo de pagamento não encontrado para o valor " +cod);
		
		
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	

	
	
	
	
	
	
	
}
