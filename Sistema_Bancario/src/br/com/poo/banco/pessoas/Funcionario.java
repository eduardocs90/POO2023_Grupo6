package br.com.poo.banco.pessoas;

public class Funcionario extends Cliente {
	
	private double salario;
	private int id;
	
	public Funcionario() {
		
	}
	
	public Funcionario(double salario, int id) {
		super();
		this.salario = salario;
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Salário: " + salario + "\nID: " + id;
	}
	
	
}
