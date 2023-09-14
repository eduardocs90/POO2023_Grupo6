package br.com.poo.banco;

import java.io.IOException;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.contas.ContaPoupanca;
import br.com.poo.banco.io.LeituraEscrita;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Conta c1 = new ContaCorrente("CORRENTE","1235679-0","3214-0","123.321.932-90",900.00,700.00);
		Conta c2 = new ContaPoupanca("POUPANCA","908321-1","1213-9","908.221.321-11",1000.00);
		System.out.println("Conta do remetente:" + c1.getSaldo());
		System.out.println("Conta destino:" + c2.getSaldo());
		c1.transferir(500, c2);
		LeituraEscrita.comprovanteTransferencia(c1, c2, 500.00);
		System.out.println("Conta do remetente:" + c1.getSaldo());
		System.out.println("Conta destino:" + c2.getSaldo());
//		JCadastroCliente jc = new JCadastroCliente();
//		jc.setLocationRelativeTo(jc);
//		jc.setVisible(true);
		
//		LeituraEscrita.leitor("banco");
//		PaginaLogin pl = new PaginaLogin();
//		pl.setLocationRelativeTo(pl);
//		pl.setVisible(true);
//		Funcionario f = new Funcionario();
//		System.out.println(f);
//		
//		Conta c1 = new ContaCorrente("CORRENTE", "12345-6","1234-5","123.123.902-11",5000.00,500.00);
//		System.out.println("antes: " + c1.getSaldo());
//		LeituraEscrita.comprovanteSaque(c1, 5000.00);
//		System.out.println("depois: " + c1.getSaldo());

	}

}
