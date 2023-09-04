package br.com.poo.banco.contas;

public class ContaCorrente extends Conta {
	
	private double chequeEspecial;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(String numConta, int numAgencia, String titular, double saldo, double chequeEspecial) {
		super(numConta, numAgencia, titular, saldo);
		this.chequeEspecial = chequeEspecial;
	}
}
