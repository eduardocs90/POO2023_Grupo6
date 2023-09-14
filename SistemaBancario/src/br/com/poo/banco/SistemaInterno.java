package br.com.poo.banco;

import java.io.IOException;

import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.views.PaginaLogin;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LeituraEscrita.leitor("banco");
		PaginaLogin pl = new PaginaLogin();
		pl.setLocationRelativeTo(pl);
		pl.setVisible(true);
//		Funcionario f = new Funcionario();
//		System.out.println(f);
//		
//		Conta c1 = new ContaCorrente("CORRENTE", "12345-6","1234-5","123.123.902-11",5000.00,500.00);
//		System.out.println("antes: " + c1.getSaldo());
//		LeituraEscrita.comprovanteSaque(c1, 5000.00);
//		System.out.println("depois: " + c1.getSaldo());

	}

}
