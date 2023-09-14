package br.com.poo.banco.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.contas.ContaPoupanca;
import br.com.poo.banco.enums.ContaEnum;
import br.com.poo.banco.enums.PessoasEnum;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Diretor;
import br.com.poo.banco.pessoas.Funcionario;
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
				if(dados[0].equalsIgnoreCase(ContaEnum.POUPANCA.name())) {
					// String tipoConta,String numConta, String numAgencia, String cpf, Double saldo
					ContaPoupanca cp = new ContaPoupanca(dados[0], dados[1], dados[2], dados[3],Double.parseDouble(dados[4]));
					Conta.mapaContas.put(dados[3], cp); // identificador unico, o cpf da conta dados[3]
					
				} else if(dados[0].equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())){
					// String tipoConta,String numConta, String numAgencia, String cpf, Double saldo, Double chequeEspecial
					ContaCorrente cc = new ContaCorrente(dados[0], dados[1], dados[2], dados[3],Double.parseDouble(dados[4]), Double.parseDouble(dados[5]));
					Conta.mapaContas.put(dados[3], cc);
					
				} else if(dados[0].equalsIgnoreCase(PessoasEnum.CLIENTE.getTipoPessoas())) {
					// String TIPO_PESSOA,String nome, String cpf, String endereco, String contato, String senha
					Cliente c = new Cliente(dados[0],dados[1],dados[2],dados[3],dados[4],dados[5]);
					Cliente.mapaClientes.put(dados[2], c);
					
				} else if(dados[0].equalsIgnoreCase(PessoasEnum.GERENTE.getTipoPessoas())) {
					// String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha
					Gerente g = new Gerente(dados[0], Double.parseDouble(dados[1]),dados[2],dados[3],dados[4],dados[5]);
					Funcionario.mapaFuncionario.put(dados[3], g);
					
				} else if(dados[0].equalsIgnoreCase(PessoasEnum.DIRETOR.getTipoPessoas())) {
					// String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha
					Diretor d = new Diretor(dados[0], Double.parseDouble(dados[1]),dados[2],dados[3],dados[4],dados[5]);
					Funcionario.mapaFuncionario.put(dados[3], d);
					
				} else if(dados[0].equalsIgnoreCase(PessoasEnum.PRESIDENTE.getTipoPessoas())) {
					// String tipoFuncionario, Double salario, String agencia, String cpf, String nome, String senha
					Presidente p = new Presidente(dados[0], Double.parseDouble(dados[1]),dados[2],dados[3],dados[4],dados[5]);
					Funcionario.mapaFuncionario.put(dados[3], p);
				}
			}
			else {
				break;
			}
		}
		System.out.println(Conta.mapaContas);
		System.out.println(Funcionario.mapaFuncionario);
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
	
	public static void comprovanteSaque(Conta conta, Double valor) throws IOException {
		String path = conta.getTipoConta() + "_" + conta.getCpf();
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO,true));
		
		buffWriter.append("------------------ SAQUE ------------------\n");
		buffWriter.append("CPF: " + conta.getCpf() + "\n");
		buffWriter.append("Conta: " + conta.getNumConta() + "\n");
		buffWriter.append("Valor do Saque: " + valor + "\n");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWriter.append("Operação realizada em: "+ dtf.format(dataHora));
		buffWriter.append("------------------ FIM SAQUE ------------------\n");
		buffWriter.close();
	}
	
	public static void comprovanteDeposito(Conta conta, Double valor) throws IOException {
	    String path = conta.getTipoConta() + "_" + conta.getCpf();
	    BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

	    buffWriter.append("------------------ Depósito ------------------\n");
		buffWriter.append("CPF: " + conta.getCpf() + "\n");
		buffWriter.append("Conta: " + conta.getNumConta() + "\n");
		buffWriter.append("Valor do Depósito: " + valor + "\n");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWriter.append("Operação realizada em: "+ dtf.format(dataHora));
		buffWriter.append("------------------ FIM Depósito ------------------\n");
		buffWriter.close();
	}

//	public static void HistoricoTransacoes(Conta conta) throws IOException {
//	    String path = conta.getTipoConta() + "_" + conta.getCpf();
//	    BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));
//
//	    String linha = "------------------ HISTÓRICO DE TRANSAÇÕES ------------------";
//	    buffWriter.append(linha + "\n");
//
//	    linha = "CPF: " + conta.getCpf();
//	    buffWriter.append(linha + "\n");
//
//	    linha = "Conta: " + conta.getTipoConta();
//	    buffWriter.append(linha + "\n");
//
//	    linha = "Saldo Atual: " + conta.getSaldo();
//	    buffWriter.append(linha + "\n");
//
//	    linha = "Últimas Transações:";
//	    buffWriter.append(linha + "\n");
//
//	    for (String transacao : conta.getTransacoes()) {
//	        buffWriter.append(transacao + "\n");
//	    }

	
		
		/* ou
		buffWriter.append("------------------ SAQUE ------------------\n");
		buffWriter.append("CPF: "+ conta.getCpf() + "\n");
		etc...
		*/
		
		// desafio = inserir o nome do cliente, tem que conectar o cpf da conta com o do cliente
	}

