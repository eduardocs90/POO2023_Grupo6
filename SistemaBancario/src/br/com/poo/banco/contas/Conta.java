package br.com.poo.banco.contas;

import java.util.HashMap;
import java.util.Map;

public abstract class Conta implements ITransacoes{
	
	private String tipoConta;
	private String numConta;
	private String numAgencia;
	private String cpf;
	private Double saldo;
	
	public static Map<String, Conta> mapaContas = new HashMap<>();
	
	public Conta() {
		
	}
	
	public Conta(String tipoConta, String numConta, String numAgencia, String cpf, Double saldo) {
		this.tipoConta = tipoConta;
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	public String getNumConta() {
		return numConta;	
	}
	
	public String getNumAgencia() {
		return numAgencia;	
	}
	
	
	public String getCpf() {
		return cpf;	
	}
	
	public Double getSaldo() {
		return saldo;	
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "[Tipo Conta: " + tipoConta + " Num Conta: " + numConta + " numAgencia: " + numAgencia + " CPF: " + cpf + " Saldo: "
				+ saldo + "]";
	}
	
	
}

