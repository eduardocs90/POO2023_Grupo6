package br.com.poo.banco.pessoas;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
	
	private final String TIPO_PESSOA = "CLIENTE";
	private String nome;
	private String cpf;
	private String endereco;
	private String contato;
	private String senha;
	
	public static Map<String, Cliente> mapaClientes = new HashMap<>();
	
	public Cliente() {
		
	}
	
	public Cliente(String TIPO_PESSOA,String nome, String cpf, String endereco, String contato, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.contato = contato;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getContato() {
		return contato;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getTipoPessoa() {
		return TIPO_PESSOA;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "[" + TIPO_PESSOA + " Nome: " + nome + " CPF: " + cpf + "\nendereco: " + endereco + "\ncontato: " + contato;
	}
	
	
}
