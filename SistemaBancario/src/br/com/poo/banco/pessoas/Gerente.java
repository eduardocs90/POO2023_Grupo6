package br.com.poo.banco.pessoas;

public class Gerente extends Funcionario {

	
	private String setorResponsavel;

	
	public Gerente() {
		super();
	}


	public Gerente(String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha, String setorResponsavel) {
		super(tipoFuncionario, salario, agencia, cpf, nome, senha);
		this.setorResponsavel = setorResponsavel;
		
	}


	public String getSetorResponsavel() {
		return setorResponsavel;
	}


	@Override
	public String toString() {
		return "Gerente [setorResponsavel=" + setorResponsavel + "]";
	}
	

}	