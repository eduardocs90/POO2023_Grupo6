package br.com.poo.banco.pessoas;

public class Presidente extends Diretor {
	
	private int numDiretor;
	
	

	public Presidente() {
		super();
	}



	public Presidente(double salario, String agencia, String cpf, String nome, String senha, String setorResponsavel) {
		super(salario, agencia, cpf, nome, senha, setorResponsavel);
		
	}



	public int getNumDiretor() {
		return numDiretor;
	}

	
	

}
