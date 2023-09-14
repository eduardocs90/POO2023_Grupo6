package br.com.poo.banco;

import java.io.IOException;

import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.views.JCadastroCliente;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		PaginaLogin pl = new PaginaLogin();
//		pl.setLocationRelativeTo(pl);
//		pl.setVisible(true);
		
//		Conta c1 = new ContaCorrente("CORRENTE","1235679-0","3214-0","123.321.932-90",900.00,700.00);
//		Conta c2 = new ContaPoupanca("POUPANCA","908321-1","1213-9","908.221.321-11",1000.00);
//		System.out.println("Conta do remetente:" + c1.getSaldo());
//		System.out.println("Conta destino:" + c2.getSaldo());
//		c1.transferir(500, c2);
//		LeituraEscrita.comprovanteTransferencia(c1, c2, 500.00);
//		System.out.println("Conta do remetente:" + c1.getSaldo());
//		System.out.println("Conta destino:" + c2.getSaldo());
		LeituraEscrita.leitor("banco");
		JCadastroCliente jc = new JCadastroCliente();
		jc.setLocationRelativeTo(jc);
		jc.setVisible(true);
	}

}
