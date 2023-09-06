package br.com.poo.banco.pessoas;

public class Presidente extends Funcionario {
	
	private int numDiretor;
	
	

	public Presidente() {
		super();
	}

	public Presidente(String nome, String cpf, String endereco, String contato, double salario, int id, int numDiretor) {
		super(nome, cpf, endereco, contato, salario, id);
		this.numDiretor = numDiretor;
	}

	public int getNumDiretor() {
		return numDiretor;
	}

	public void setNumDiretor(int numDiretor) {
		this.numDiretor = numDiretor;
	}

	@Override
	public String toString() {
		return "Números de Diretores gerenciados:" + numDiretor ;
	}

}
