package br.com.poo.banco.contas;

public class ContaCorrente extends Conta {

	private double chequeEspecial;
	private double tarifa;
	
	
	public ContaCorrente() {
		super();
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
	
	/* chequeEspecial: O cheque especial será feito pela renda do cliente, se a pessoa ganha um salário de R$ 1.320,00, ela terá um valor de cheque especial de R$ 660,00
	 Ou seja, o cheque especial será equivalente a metade da renda mensal.
	 Colocar uma pontuação do cliente com o banco, se a pontuação for > 6 o cheque especial aumentará.
	 
	 O valor no chequeEspecial será negativo, então se (saldo<0) então o Cliente pagará o jurosEspecial;
	 
	 
	 	tarifa: somente o cliente pagará a tarifa, a tarifa do funcionário que também é cliente será igual a 0.
	 
	 */
	
	
	
	@Override
	public String toString() {
		return "Cheque Especial :" + chequeEspecial + "reais";
	}

}
