package br.com.poo.banco.contas;

public class ContaPoupanca extends Conta {
	
	private double rendimento;
	
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(String numConta, int numAgencia, String titular, double saldo, double rendimento) {
		super(numConta, numAgencia, titular, saldo);
		this.rendimento = rendimento;
	}
	
	public double getRendimento() {
		return rendimento;
	}

	@Override
	public String toString() {
		return "Rendimentos : " + rendimento + "Anuais";
	}
}

