package br.com.poo.banco.enums;

public enum PessoasEnum {
	
	CLIENTE("Cliente",1),
	FUNCIONARIO("Funcionário",2),
	GERENTE("Gerente",3),
	DIRETOR("Diretor",4),
	PRESIDENTE("Presidente",5);
	
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
