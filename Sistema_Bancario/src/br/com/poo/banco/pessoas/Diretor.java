package br.com.poo.banco.pessoas;

public class Diretor extends Gerente{
	private int numFuncionario;
	

	public Diretor() {
		super();
	
	}
	
	public Diretor(String nome, String cpf, String endereco, String contato, double salario, int id, String setorResponsavel, int numFuncionario) {	
		super(nome, cpf, endereco, contato, salario, id, setorResponsavel);
		this.numFuncionario = numFuncionario;
	
	}

	public int getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	@Override
	public String toString() {
		return "Numero de Funcionários: " + numFuncionario;
	}
	
	
	

}

