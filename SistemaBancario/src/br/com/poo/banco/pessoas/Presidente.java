package br.com.poo.banco.pessoas;

public class Presidente extends Diretor {
	
	public Presidente() {
		super();
	}

	public Presidente(String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha) {
		super(tipoFuncionario, salario, agencia, cpf, nome, senha);
		
	}

}
