package br.com.poo.banco.enums;

public enum ContaEnum {

	CORRENTE("Corrente", 1),
	POUPANCA("Poupanca", 2);
	
	private String TipoConta;
	private int id;
	
	ContaEnum(String TipoConta, int id) {
		this.TipoConta = TipoConta;
		this.id = id;
	}
	
	public String getTipoConta() {
		return TipoConta;
	}
	
	public int getId() {
		return id;
	}
}
