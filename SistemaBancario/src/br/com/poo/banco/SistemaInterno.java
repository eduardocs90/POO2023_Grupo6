package br.com.poo.banco;

import java.io.IOException;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.pessoas.Funcionario;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Funcionario f = new Funcionario();
		System.out.println(f);
		
		Conta c1 = new Conta("CORRENTE", "12345-6","1234-5","123.123.902-11",5000.00);
		System.out.println("antes: " + c1.getSaldo());
		LeituraEscrita.comprovanteSaque(c1, 5000.00);
		System.out.println("depois: " + c1.getSaldo());

	}

}
