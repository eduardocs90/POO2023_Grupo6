package br.com.poo.banco;

import java.io.IOException;

import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.views.TelaCarregamento;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		LeituraEscrita.leitor("banco");
		TelaCarregamento tc = new TelaCarregamento();
		tc.setLocationRelativeTo(tc);
		tc.setVisible(true);
	}
}
