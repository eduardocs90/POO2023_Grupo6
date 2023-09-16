package br.com.poo.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.com.poo.banco.enums.PessoasEnum;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.pessoas.Funcionario;
import br.com.poo.banco.pessoas.Gerente;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.Font;

public class CadastroGerente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textAgencia;
	private JPasswordField passwordSenha;
	private JPasswordField passwordConfSenha;
	private JTextField textSalario;

	public CadastroGerente(Funcionario f) {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(CadastroGerente.class.getResource("/br/com/poo/imagens/50x50.png")));
		setTitle("Cadastro Gerente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(46, 59, 310, 235);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cadastro Gerente ");
		lblNewLabel.setBounds(110, 11, 94, 25);
		panel.add(lblNewLabel);

		textNome = new JTextField();
		textNome.setBounds(110, 32, 120, 20);
		panel.add(textNome);
		textNome.setColumns(10);

		textCpf = new JTextField();
		textCpf.setBounds(110, 63, 120, 20);
		panel.add(textCpf);
		textCpf.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(71, 35, 27, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setBounds(71, 66, 19, 14);
		panel.add(lblNewLabel_2);

		textAgencia = new JTextField();
		textAgencia.setBounds(110, 130, 120, 20);
		panel.add(textAgencia);
		textAgencia.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(63, 164, 35, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Agencia");
		lblNewLabel_4.setBounds(60, 133, 38, 14);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_3_1 = new JLabel("Confirmar Senha");
		lblNewLabel_3_1.setBounds(23, 195, 88, 14);
		panel.add(lblNewLabel_3_1);

		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(110, 161, 120, 20);
		panel.add(passwordSenha);

		passwordConfSenha = new JPasswordField();
		passwordConfSenha.setBounds(110, 192, 120, 20);
		panel.add(passwordConfSenha);

		textSalario = new JTextField();
		textSalario.setColumns(10);
		textSalario.setBounds(110, 94, 120, 20);
		panel.add(textSalario);

		JLabel lblNewLabel_2_1 = new JLabel("Salario");
		lblNewLabel_2_1.setBounds(63, 97, 35, 14);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(CadastroGerente.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel_5.setBounds(171, 0, 96, 48);
		contentPane.add(lblNewLabel_5);

		JButton sair = new JButton("");
		sair.setBounds(29, 309, 44, 46);
		contentPane.add(sair);
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		sair.setBackground(new Color(0, 0, 0));
		sair.setIcon(new ImageIcon(CadastroGerente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));

		JButton seguir = new JButton("");
		seguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String salario = textSalario.getText();
				String cpf = textCpf.getText();
				String agencia = textAgencia.getText();
				String senha = new String(passwordSenha.getPassword());
				String confSenha = new String(passwordConfSenha.getPassword());

				if (nome.isEmpty() || salario.isEmpty() || cpf.isEmpty() || agencia.isEmpty() || senha.isEmpty()
						|| confSenha.isEmpty()) {
					JOptionPane.showMessageDialog(seguir, "Preencha todos os campos.");
				} else if (!senha.equals(confSenha)) {
					JOptionPane.showMessageDialog(seguir, "As senhas não coincidem.");
				} else {
					Funcionario f = new Gerente(PessoasEnum.GERENTE.getTipoPessoas(), Double.parseDouble(salario),
							agencia, cpf, nome, senha);
					Funcionario.mapaFuncionario.put(cpf, f);
					String gerente = "\n" + PessoasEnum.GERENTE.getTipoPessoas() + ";" + salario + ";" + agencia + ";"
							+ cpf + ";" + nome + ";" + senha + ";";
					JOptionPane.showMessageDialog(seguir, "Gerente cadastrado com sucesso!");
					try {
						LeituraEscrita.escritorFunc("banco", gerente);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		seguir.setBounds(372, 313, 38, 36);
		contentPane.add(seguir);
		seguir.setBackground(new Color(0, 0, 0));
		seguir.setIcon(new ImageIcon(CadastroGerente.class.getResource("/br/com/poo/imagens/2.png")));

		JButton btnMenuDiretor = new JButton("Menu Diretor");
		btnMenuDiretor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JMenuDiretor md = new JMenuDiretor(f);
				md.setLocationRelativeTo(md);
				md.setVisible(true);
			}
		});
		btnMenuDiretor.setBackground(Color.BLACK);
		btnMenuDiretor.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMenuDiretor.setForeground(Color.WHITE);
		btnMenuDiretor.setBounds(144, 341, 142, 23);
		contentPane.add(btnMenuDiretor);

		JButton btnMenuPresidente = new JButton("Menu Presidente");
		btnMenuPresidente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = "454.211.157-00";
				Funcionario func = Funcionario.mapaFuncionario.get(cpf);
				if (func.getCpf().equals("454.211.157-00")) {
					dispose();
					MenuPresidente mp = new MenuPresidente(f);
					mp.setLocationRelativeTo(mp);
					mp.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(btnMenuPresidente, "Você não é o Presidente! ", "Aviso!",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnMenuPresidente.setForeground(Color.WHITE);
		btnMenuPresidente.setFont(new Font("Arial", Font.PLAIN, 15));
		btnMenuPresidente.setBackground(Color.BLACK);
		btnMenuPresidente.setBounds(144, 307, 142, 23);
		contentPane.add(btnMenuPresidente);
	}
}
