package br.com.poo.banco.pessoas;

public class Funcionario {
	
	private double salario;
	private String agencia;
	private String cpf;
	private String nome;
	private String senha;
	

	public Funcionario() {
	
	}


	public Funcionario(double salario, String agencia, String cpf, String nome, String senha) {
		this.salario = salario;
		this.agencia = agencia;
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
	}


	public double getSalario() {
		return salario;
	}


	public String getAgencia() {
		return agencia;
	}


	public String getCpf() {
		return cpf;
	}


	public String getNome() {
		return nome;
	}


	public String getSenha() {
		return senha;
	}


	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", agencia=" + agencia + ", cpf=" + cpf + ", nome=" + nome
				+ ", senha=" + senha + "]";
	}

	
	
}
