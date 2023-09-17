package br.com.poo.banco.contas;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipoConta, String numConta, String numAgencia, String cpf, Double saldo) {
		super(tipoConta, numConta, numAgencia, cpf, saldo);
	}

	public Double calcularRendimento(Double valor, int dias) {
		return (valor + (0.00024 * dias));
	}
	
	@Override
	public boolean sacar(double valor) {
		if (getSaldo() < valor) {
			return false;
		} else if (valor <= 0.0) {
			return false;
		} else {
			double result = getSaldo() - valor; 
			setSaldo(result); 
			return true;
		}
	}
	
	@Override
	public double depositar(double valor) {
		Double result = getSaldo() + valor;
		setSaldo(result);
		return result;
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
			double result = getSaldo() - valor;
			setSaldo(result);
			conta.depositar(valor);
			return true;
		}
    }
}
