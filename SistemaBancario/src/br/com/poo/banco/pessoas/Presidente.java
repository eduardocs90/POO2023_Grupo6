package br.com.poo.banco.pessoas;

public class Presidente extends Diretor {
	
	private int numDiretor;
	
	

	public Presidente() {
		super();
	}



	public Presidente(String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha, String setorResponsavel) {
		super(tipoFuncionario, salario, agencia, cpf, nome, senha, setorResponsavel);
		
	}



	public int getNumDiretor() {
		return numDiretor;
	}

	
	

}
