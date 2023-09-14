package br.com.poo.banco.contas;

public class ContaCorrente extends Conta {

	private Double chequeEspecial;
	private Double tarifa;

	@Override
	public boolean sacar(double valor) {
		tarifa = 0.10;
		if(getSaldo() < valor) {
			return false;
		}
		else if(valor <= 0.0) {
			return false;
		}
		else {
			double result = getSaldo() - valor - tarifa; 
			setSaldo(result); 
			return true;
		}
	}
	
	@Override
    public boolean transferir(double valor, Conta conta) {
		if(getSaldo() < valor) {
			return false;
		}
		else if(valor <= 0.0) {
			return false;
		}
		else {
			tarifa = 0.20;
			double result = getSaldo() - valor - tarifa;
			setSaldo(result);
			conta.depositar(valor);
			return true;
		}
    } 
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String tipoConta,String numConta, String numAgencia, String cpf, Double saldo, Double chequeEspecial) {
		super(tipoConta,numConta, numAgencia, cpf, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public Double getTarifa() {
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
