package br.com.poo.banco.enums;

public enum TransacoesEnum {
	
	SAQUE("Saque", 1),
	DEPOSITO("Depósito", 2),
	TRANSFERENCIA("Transferência",3);
	
	private String TipoTransacoes;
	private int id;
	
	TransacoesEnum(String TipoTransacoes, int id) {
		this.TipoTransacoes = TipoTransacoes;
		this.id = id;
	}
	
	public String getTipoTransferencia() {
		return TipoTransacoes;
	}
	
	public int getId() {
		return id;
	}
	
}
