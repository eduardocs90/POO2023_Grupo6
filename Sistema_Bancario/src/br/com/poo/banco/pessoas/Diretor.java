package br.com.poo.banco.pessoas;

public class Diretor extends Gerente{
	private int numFuncionario;
	

	public Diretor() {
		super();
	
	}


	public Diretor(double salario, String agencia, String cpf, String nome, String senha, String setorResponsavel) {
		super(salario, agencia, cpf, nome, senha, setorResponsavel);
		
	}


	public int getNumFuncionario() {
		return numFuncionario;
	}


	
	
	
	

}

