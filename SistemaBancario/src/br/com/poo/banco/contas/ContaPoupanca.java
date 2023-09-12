package br.com.poo.banco.contas;

public class ContaPoupanca extends Conta {
	
	private double rendimento;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String numConta, int numAgencia, String titular, double saldo, double rendimento) {
		super(numConta, numAgencia, titular, saldo);
		this.rendimento = rendimento;
	}
	
	public double getRendimento() {
		return rendimento;
	}
	
	/* rendimentoTotal será o saldo atual da conta (poupança * rendimento (ao mês 0,72%) (ao ano 8,41%), o rendimentoParcial será informado pelo presidente do banco após
	 as alterações feitas pelo Banco Central */
	
	@Override
	public String toString() {
		return "Rendimentos : " + rendimento + "Anuais";
	}
}

