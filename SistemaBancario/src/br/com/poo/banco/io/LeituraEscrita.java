package br.com.poo.banco.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.contas.ContaPoupanca;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Diretor;
import br.com.poo.banco.pessoas.Gerente;
import br.com.poo.banco.pessoas.Presidente;

public class LeituraEscrita {
	
	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";
	
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO+path+EXTENSAO));
		
		String linha = "";
		while(true) {
			linha = buffRead.readLine();
			if(linha!=null) {
				String[] dados = linha.split(";");
				if(dados[0].equalsIgnoreCase("POUPANCA")) {
					// String tipoConta,String numConta, String numAgencia, String cpf, Double saldo
					ContaPoupanca cp = new ContaPoupanca(dados[0], dados[1], dados[2], dados[3],Double.parseDouble(dados[4]));
					Conta.mapaContas.put(dados[3], cp); // identificador unico, o cpf da conta dados[3]
					
				} else if(dados[0].equalsIgnoreCase("CORRENTE")){
					// String tipoConta,String numConta, String numAgencia, String cpf, Double saldo, Double chequeEspecial
					ContaCorrente cc = new ContaCorrente(dados[0], dados[1], dados[2], dados[3],Double.parseDouble(dados[4]), Double.parseDouble(dados[5]));
					Conta.mapaContas.put(dados[3], cc);
					
				} else if(dados[0].equalsIgnoreCase("CLIENTE")) {
					// String nome, String cpf, String endereco, String contato, String senha
					Cliente c = new Cliente(dados[0],dados[1],dados[2],dados[3],dados[4]);
					Cliente.mapaClientes.put(dados[1], c);
					
				} else if(dados[0].equalsIgnoreCase("GERENTE")) {
					// String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha, String setorResponsavel
					Gerente g = new Gerente(dados[0], Double.parseDouble(dados[1]),dados[2],dados[3],dados[4],dados[5],dados[6]);
					Gerente.mapaFuncionario.put(dados[3], g);
					
				} else if(dados[0].equalsIgnoreCase("DIRETOR")) {
					// String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha, String setorResponsavel
					Diretor d = new Diretor(dados[0], Double.parseDouble(dados[1]),dados[2],dados[3],dados[4],dados[5],dados[6]);
					Diretor.mapaFuncionario.put(dados[3], d);
					
				} else if(dados[0].equalsIgnoreCase("PRESIDENTE")) {
					// String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha, String setorResponsavel
					Presidente p = new Presidente(dados[0], Double.parseDouble(dados[1]),dados[2],dados[3],dados[4],dados[5],dados[6]);
					Presidente.mapaFuncionario.put(dados[3], p);
				}
			}
			else {
				break;
			}
		}
		System.out.println(Conta.mapaContas);
		buffRead.close();
	}
	
	public static void escritor(String path) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO+path+EXTENSAO,true));
		String dado;
		
		System.out.println("Escreva algo: ");
		dado = sc.nextLine();
		buffWriter.append(dado + "\n");
		sc.close();
		buffWriter.close();
	}
}
