package br.com.poo.banco.enums;

public enum PessoasEnum {
	
	CLIENTE("Cliente",1),
	GERENTE("Gerente",2),
	DIRETOR("Diretor",3),
	PRESIDENTE("Presidente",4);
	
	private String tipoPessoas;
	private int id;
	
	private PessoasEnum(String tipoPessoas, int id) {
		this.tipoPessoas = tipoPessoas;
		this.id = id;
	}

	public String getTipoPessoas() {
		return tipoPessoas;
	}

	public int getId() {
		return id;
	}
	
	
	

}
