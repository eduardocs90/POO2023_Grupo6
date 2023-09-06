package br.com.poo.banco.contas;

public class ContaCorrente extends Conta {

	private double chequeEspecial;
	private double tarifa;

	public ContaCorrente() {

	}

	public ContaCorrente(String numConta, int numAgencia, String titular, double saldo, double chequeEspecial, double tarifa) {
		super(numConta, numAgencia, titular, saldo);
		this.chequeEspecial = chequeEspecial;
		this.tarifa = tarifa;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public double getTarifa() {
		return tarifa;
	}
	
	
	@Override
	public String toString() {
		return "Cheque Especial :" + chequeEspecial + "reais";
	}

}
