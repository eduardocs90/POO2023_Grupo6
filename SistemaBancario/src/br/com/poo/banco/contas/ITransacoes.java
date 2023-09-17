package br.com.poo.banco.contas;

public interface ITransacoes {
	public boolean sacar(double valor);
	public double depositar(double valor);
	public boolean transferir(double valor, Conta conta);
}
