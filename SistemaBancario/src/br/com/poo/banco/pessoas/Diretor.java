package br.com.poo.banco.pessoas;

public class Diretor extends Gerente{
	private int numFuncionario;
	

	public Diretor() {
		super();
	
	}


	public Diretor(String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha, String setorResponsavel) {
		super(tipoFuncionario, salario, agencia, cpf, nome, senha, setorResponsavel);
		
	}


	public int getNumFuncionario() {
		return numFuncionario;
	}


	
	
	
	

}

