package br.com.poo.banco.contas;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String tipoConta,String numConta, String numAgencia, String cpf, Double saldo) {
		super(tipoConta,numConta, numAgencia, cpf, saldo);
	}
	
	public Double calcularRendimento(Double valor, int dias) {
		return (valor + (0.00024 * dias));
	}
}

