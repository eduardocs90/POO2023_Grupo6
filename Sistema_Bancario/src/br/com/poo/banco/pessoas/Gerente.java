package br.com.poo.banco.pessoas;

public class Gerente extends Funcionario {

	private int numFuncionario;
	private String setorResponsavel;

	public Gerente() {
	}

	public Gerente(int numFuncionario, String setorResponsavel) {
		super();
		this.numFuncionario = numFuncionario;
		this.setorResponsavel = setorResponsavel;
	}

	public int getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	public String getSetorResponsavel() {
		return setorResponsavel;
	}

	@Override
	public String toString() {
		return "Número de Funcionários: " + numFuncionario + "\nSetor Responsável: " + setorResponsavel;
	}

}
