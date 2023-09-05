package br.com.poo.banco.pessoas;

public class Presidente extends Funcionario {
	
	private int numDiretor;
	
	public Presidente() {	
	}

	public Presidente(int numDiretor) {
		super();
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
