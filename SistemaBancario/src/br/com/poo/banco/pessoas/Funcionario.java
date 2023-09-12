package br.com.poo.banco.pessoas;

import java.util.HashMap;
import java.util.Map;

public class Funcionario {
	
	private String tipoFuncionario;
	private Double salario;
	private String agencia;
	private String cpf;
	private String nome;
	private String senha;
	
	public static Map<String, Funcionario> mapaFuncionario = new HashMap<>();

	public Funcionario() {
	
	}


	public Funcionario(String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha) {
		this.tipoFuncionario = tipoFuncionario;
		this.salario = salario;
		this.agencia = agencia;
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}

	public Double getSalario() {
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
		return "Funcionario [tipoFuncionario=" + tipoFuncionario + ", salario=" + salario + ", agencia=" + agencia
				+ ", cpf=" + cpf + ", nome=" + nome + ", senha=" + senha + "]";
	}

	
	
}
