package br.com.poo.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.contas.ContaPoupanca;
import br.com.poo.banco.enums.ContaEnum;
import br.com.poo.banco.enums.PessoasEnum;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.pessoas.Cliente;

public class JCadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textContato;
	private JTextField textEndereco;
	private JPasswordField textSenha;
	private JPasswordField textConfSenha;
	private JTextField labelNumConta;
	private JTextField labelSaldo;
	private JTextField labelCheque;
	private JTextField numAgencia;

	public JCadastroCliente() {
		setTitle("DéBank");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(JCadastroCliente.class.getResource("/br/com/poo/imagens/50x50.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 527);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CADASTRO DE CLIENTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(185, 26, 221, 25);
		contentPane.add(lblNewLabel);

		textNome = new JTextField();
		textNome.setBounds(182, 112, 224, 19);
		contentPane.add(textNome);
		textNome.setColumns(10);

		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(182, 152, 224, 19);
		contentPane.add(textCpf);

		textContato = new JTextField();
		textContato.setColumns(10);
		textContato.setBounds(182, 192, 224, 19);
		contentPane.add(textContato);

		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(182, 233, 224, 19);
		contentPane.add(textEndereco);

		textSenha = new JPasswordField();
		textSenha.setBounds(182, 269, 224, 19);
		contentPane.add(textSenha);

		textConfSenha = new JPasswordField();
		textConfSenha.setBounds(182, 310, 224, 19);
		contentPane.add(textConfSenha);

		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(65, 113, 59, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("CPF: ");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(65, 153, 59, 13);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("SENHA:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(65, 270, 59, 13);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("CONFIRMAR SENHA:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(65, 312, 128, 13);
		contentPane.add(lblNewLabel_1_3);

		numAgencia = new JTextField();
		numAgencia.setColumns(10);
		numAgencia.setBounds(295, 435, 96, 19);
		contentPane.add(numAgencia);

		JComboBox<String> comboBox = new JComboBox<>();
		List<ContaEnum> listaConta = Arrays.asList(ContaEnum.values());
		comboBox.addItem("Selecione uma opção");
		for (ContaEnum c : listaConta) {
			comboBox.addItem(c.getTipoConta());
		}
		comboBox.setBounds(295, 69, 85, 21);
		contentPane.add(comboBox);

		JButton buttonContinuar = new JButton("");
		buttonContinuar
				.setIcon(new ImageIcon(JCadastroCliente.class.getResource("/br/com/poo/imagens/Design sem nome.png")));
		buttonContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String cpf = textCpf.getText();
				String telefone = textContato.getText();
				String endereco = textEndereco.getText();
				String numConta = labelNumConta.getText();
				String saldo = labelSaldo.getText();
				String chequeEspecial = labelCheque.getText();
				String agencia = numAgencia.getText();
				String senha = new String(textSenha.getPassword());
				String confSenha = new String(textConfSenha.getPassword());
				String tipoConta = comboBox.getSelectedItem().toString();

				if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || endereco.isEmpty() || senha.isEmpty()
						|| confSenha.isEmpty()) {
					JOptionPane.showMessageDialog(buttonContinuar, "Preencha todos os campos.");
				} else if (!senha.equals(confSenha)) {
					JOptionPane.showMessageDialog(buttonContinuar, "As senhas não coincidem.");
				} else {
					Cliente c = new Cliente(PessoasEnum.CLIENTE.getTipoPessoas(), nome, cpf, endereco, telefone, senha);
					Cliente.mapaClientes.put(cpf, c);
					String cliente = "\n" + PessoasEnum.CLIENTE.getTipoPessoas() + ";" + nome + ";" + cpf + ";"
							+ endereco + ";" + telefone + ";" + senha + ";";
					String conta = null;
					if (tipoConta.equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
						ContaCorrente cc = new ContaCorrente(tipoConta, numConta, agencia, cpf,
								Double.parseDouble(saldo), Double.parseDouble(chequeEspecial));
						Conta.mapaContas.put(cpf, cc);
						conta = "\n" + ContaEnum.CORRENTE.getTipoConta() + ";" + numConta + ";" + agencia + ";"
								+ cpf + ";" + saldo + ";" + chequeEspecial + ";";
					} else if (tipoConta.equalsIgnoreCase(ContaEnum.POUPANCA.getTipoConta())) {
						ContaPoupanca cp = new ContaPoupanca(tipoConta, numConta, agencia, cpf,
								Double.parseDouble(saldo));
						Conta.mapaContas.put(cpf, cp);
						conta = "\n" + ContaEnum.POUPANCA.getTipoConta() + ";" + numConta + ";" + agencia + ";"
								+ cpf + ";" + saldo + ";";
					}
					JOptionPane.showMessageDialog(buttonContinuar, "Cliente cadastrado com sucesso!");
					try {
						LeituraEscrita.escritor("banco", cliente,conta);
						dispose();
						MenuGerente menu = new MenuGerente();
						menu.setLocationRelativeTo(menu);
						menu.setVisible(true);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}

			}
		});
		buttonContinuar.setBackground(UIManager.getColor("Button.shadow"));
		buttonContinuar.setBounds(430, 346, 50, 50);
		contentPane.add(buttonContinuar);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(JCadastroCliente.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel_2.setBounds(10, 15, 85, 55);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_1_4 = new JLabel("TELEFONE:");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(65, 193, 85, 13);
		contentPane.add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_1_1 = new JLabel("ENDEREÇO:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(65, 234, 85, 13);
		contentPane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_3 = new JLabel("Tipo Conta");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(216, 72, 69, 13);
		contentPane.add(lblNewLabel_3);

		JButton buttonVoltar = new JButton("");
		buttonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		buttonVoltar.setIcon(new ImageIcon(JCadastroCliente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		buttonVoltar.setBounds(23, 346, 50, 50);
		contentPane.add(buttonVoltar);

		labelNumConta = new JTextField();
		labelNumConta.setBounds(299, 343, 96, 19);
		contentPane.add(labelNumConta);
		labelNumConta.setColumns(10);

		labelSaldo = new JTextField();
		labelSaldo.setColumns(10);
		labelSaldo.setBounds(299, 377, 96, 19);
		contentPane.add(labelSaldo);

		labelCheque = new JTextField();
		labelCheque.setColumns(10);
		labelCheque.setBounds(299, 406, 96, 19);
		contentPane.add(labelCheque);

		JLabel lblNewLabel_4 = new JLabel("conta");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(230, 346, 45, 13);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("saldo");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setBounds(230, 383, 45, 13);
		contentPane.add(lblNewLabel_4_1);

		JLabel lblNewLabel_4_1_1 = new JLabel("cheque");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setBounds(230, 409, 45, 13);
		contentPane.add(lblNewLabel_4_1_1);

		JLabel lblNewLabel_4_1_1_1 = new JLabel("agencia");
		lblNewLabel_4_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1_1.setBounds(230, 432, 45, 13);
		contentPane.add(lblNewLabel_4_1_1_1);
	}
}
