package com.ney.cursomvc.domain.enums;

public enum TipoCliente {
	
	

	PESSOAFISICA(1,"Pessoa Juridica"),
	PESSOAJURIDICA(2,"Pessoa Fisica");
	
	
	private int cod;
	private String desc;
	
	private TipoCliente(int cod, String desc) {
		this.cod=cod;
		this.desc=desc;
	}
    
	
	public static TipoCliente toEnum (Integer cod){
		if(cod==null) {
		 return null;
		}
		for(TipoCliente rp : TipoCliente.values()) {
			if(cod.equals(rp.getCod())) {
				return rp;
			}
			
		}
		throw new IllegalArgumentException("Tipo de pessoa Inexistente para o codigo : "+cod);
		
		
	}  
	
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
