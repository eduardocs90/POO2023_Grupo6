package br.com.poo.banco.pessoas;

public class Diretor extends Funcionario{
	private String areaResponsavel;
	private int numGerente;
	
	public Diretor() {
	}

	public Diretor(String areaResponsavel, int numGerente) {
		super();
		this.areaResponsavel = areaResponsavel;
		this.numGerente = numGerente;
	}

	public String getAreaResponsavel() {
		return areaResponsavel;
	}
	public int getNumGerente() {
		return numGerente;
	}

	public void setNumGerente(int numGerente) {
		this.numGerente = numGerente;
	}

	@Override
	public String toString() {
		return "areaResponsavel: " + areaResponsavel + "\nnumGerente: " + numGerente ;
	}


	

}

