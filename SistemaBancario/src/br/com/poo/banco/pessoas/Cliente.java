package br.com.poo.banco.pessoas;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String contato;
	private String senha;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, String endereco, String contato, String senha) {
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
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Nome do cliente: " + nome + "\ncpf: " + cpf + "\nendereco: " + endereco + "\ncontato: " + contato;
	}
	
	
}
