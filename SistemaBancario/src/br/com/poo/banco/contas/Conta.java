package br.com.poo.banco.contas;

public class Conta {
	
	private String numConta;
	private int numAgencia;
	private String titular;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String numConta, int numAgencia, String titular, double saldo) {
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String getNumConta() {
		return numConta;	
	}
	
	public int getNumAgencia() {
		return numAgencia;	
	}
	
	
	public String getTitular() {
		return titular;	
	}
	
	public double getSaldo() {
		return saldo;	
	}

	@Override
	public String toString() {
		return "Conta numConta: " + numConta + "\nnumAgencia: " + numAgencia + "\ntitular: " + titular + "\nsaldo: "
				+ saldo + "";
	}
	
	
}

