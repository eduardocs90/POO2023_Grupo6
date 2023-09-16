package br.com.poo.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.poo.banco.enums.PessoasEnum;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.pessoas.Diretor;
import br.com.poo.banco.pessoas.Funcionario;

public class CadastroDiretores extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordSenha;
	private JPasswordField passwordConfirmarSenha;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textAgencia;
	private JTextField textSalario;

	public CadastroDiretores(Funcionario f) {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(CadastroDiretores.class.getResource("/br/com/poo/imagens/100x100.png")));
		setTitle("DÉ BANK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 532);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 3, true));
		panel.setBounds(24, 80, 382, 351);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblnome = new JLabel("Nome:");
		lblnome.setFont(new Font("Arial", Font.BOLD, 15));
		lblnome.setBounds(105, 45, 45, 13);
		panel.add(lblnome);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 15));
		lblCpf.setBounds(116, 92, 34, 13);
		panel.add(lblCpf);

		JLabel lblAgncia = new JLabel("Agência:");
		lblAgncia.setFont(new Font("Arial", Font.BOLD, 15));
		lblAgncia.setBounds(90, 194, 60, 13);
		panel.add(lblAgncia);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 15));
		lblSenha.setBounds(100, 246, 50, 13);
		panel.add(lblSenha);

		JLabel lblConfirmeASenha = new JLabel("Confirma senha:");
		lblConfirmeASenha.setFont(new Font("Arial", Font.BOLD, 15));
		lblConfirmeASenha.setBounds(38, 295, 116, 13);
		panel.add(lblConfirmeASenha);

		passwordSenha = new JPasswordField();
		passwordSenha.setFont(new Font("Arial", Font.BOLD, 15));
		passwordSenha.setBounds(164, 238, 185, 30);
		panel.add(passwordSenha);

		passwordConfirmarSenha = new JPasswordField();
		passwordConfirmarSenha.setFont(new Font("Arial", Font.BOLD, 15));
		passwordConfirmarSenha.setBounds(164, 287, 185, 30);
		panel.add(passwordConfirmarSenha);

		textNome = new JTextField();
		textNome.setFont(new Font("Arial", Font.BOLD, 15));
		textNome.setBounds(164, 36, 185, 30);
		panel.add(textNome);
		textNome.setColumns(10);

		textCpf = new JTextField();
		textCpf.setFont(new Font("Arial", Font.BOLD, 15));
		textCpf.setColumns(10);
		textCpf.setBounds(164, 83, 185, 30);
		panel.add(textCpf);

		textAgencia = new JTextField();
		textAgencia.setFont(new Font("Arial", Font.BOLD, 15));
		textAgencia.setColumns(10);
		textAgencia.setBounds(164, 185, 185, 30);
		panel.add(textAgencia);

		textSalario = new JTextField();
		textSalario.setFont(new Font("Arial", Font.BOLD, 15));
		textSalario.setColumns(10);
		textSalario.setBounds(164, 135, 185, 30);
		panel.add(textSalario);

		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Arial", Font.BOLD, 15));
		lblSalario.setBounds(96, 144, 54, 13);
		panel.add(lblSalario);

		JButton seguir = new JButton("");
		seguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = textNome.getText();
				String salario = textSalario.getText();
				String cpf = textCpf.getText();
				String agencia = textAgencia.getText();
				String senha = new String(passwordSenha.getPassword());
				String confSenha = new String(passwordConfirmarSenha.getPassword());

				if (nome.isEmpty() || salario.isEmpty() || cpf.isEmpty() || agencia.isEmpty() || senha.isEmpty()
						|| confSenha.isEmpty()) {
					JOptionPane.showMessageDialog(seguir, "Preencha todos os campos.");
				} else if (!senha.equals(confSenha)) {
					JOptionPane.showMessageDialog(seguir, "As senhas não coincidem.");
				} else {
					Funcionario f = new Diretor(PessoasEnum.DIRETOR.getTipoPessoas(), Double.parseDouble(salario),
							agencia, cpf, nome, senha);
					Funcionario.mapaFuncionario.put(cpf, f);
					String diretor = "\n" + PessoasEnum.DIRETOR.getTipoPessoas() + ";" + salario + ";" + agencia + ";"
							+ cpf + ";" + nome + ";" + senha + ";";
					JOptionPane.showMessageDialog(seguir, "Diretor cadastrado com sucesso!");
					try {
						LeituraEscrita.escritorFunc("banco", diretor);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		seguir.setIcon(new ImageIcon(CadastroDiretores.class.getResource("/br/com/poo/imagens/1.png")));
		seguir.setBounds(373, 442, 38, 40);
		contentPane.add(seguir);

		JButton sair = new JButton("");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		sair.setIcon(new ImageIcon(CadastroDiretores.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		sair.setBounds(10, 436, 45, 46);
		contentPane.add(sair);

		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(CadastroDiretores.class.getResource("/br/com/poo/imagens/100x100.png")));
		logo.setBounds(43, 8, 100, 61);
		contentPane.add(logo);

		JLabel cadastroDiretor = new JLabel("Cadastro de Diretor:");
		cadastroDiretor.setBounds(174, 23, 209, 39);
		contentPane.add(cadastroDiretor);
		cadastroDiretor.setFont(new Font("Arial", Font.BOLD, 20));
		cadastroDiretor.setForeground(Color.WHITE);
		
		JButton btnMenuPresid = new JButton("Menu Presidente");
		btnMenuPresid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuPresidente mp = new MenuPresidente(f);
				mp.setLocationRelativeTo(mp);
				mp.setVisible(true);
			}
		});
		btnMenuPresid.setFont(new Font("Arial", Font.BOLD, 15));
		btnMenuPresid.setBackground(Color.BLACK);
		btnMenuPresid.setForeground(Color.WHITE);
		btnMenuPresid.setBounds(143, 442, 155, 27);
		contentPane.add(btnMenuPresid);
	}
}
