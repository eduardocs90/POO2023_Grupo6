package br.com.poo.banco.contas;

import java.util.HashMap;
import java.util.Map;

public abstract class Conta {
	
	private String tipoConta;
	private String numConta;
	private String numAgencia;
	private String cpf;
	private Double saldo;
	
	public static Map<String, Conta> mapaContas = new HashMap<>();
	
	public Conta() {
		
	}
	
	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		else if(valor <= 0.0) {
			return false;
		}
		else {
			saldo -= valor;
			return true;
		}
	}

    public double depositar(double valor) {
    	return saldo += valor;
    }

    public boolean transferir(double valor, Conta conta) {
		if(this.saldo < valor) {
			return false;
		}
		else if(valor <= 0.0) {
			return false;
		}
		else {
			saldo -= valor;
			conta.depositar(valor);
			return true;
		}
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
		return "Tipo Conta: " + tipoConta + "Conta numConta: " + numConta + "\nnumAgencia: " + numAgencia + "\ncpf: " + cpf + "\nsaldo: "
				+ saldo + "";
	}
	
	
}

