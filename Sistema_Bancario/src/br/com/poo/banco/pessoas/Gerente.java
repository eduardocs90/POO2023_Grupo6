package br.com.poo.banco.pessoas;

public class Gerente extends Funcionario {

	
	private String setorResponsavel;

	
	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, String endereco, String contato, double salario, int id, String setorResponsavel) {
		super(nome, cpf, endereco, contato, salario, id);
		this.setorResponsavel = setorResponsavel;
	}

	
	public String getSetorResponsavel() {
		return setorResponsavel;
	}

	@Override
	public String toString() {
		return "\nSetor Responsável: " + setorResponsavel;
	}

}
