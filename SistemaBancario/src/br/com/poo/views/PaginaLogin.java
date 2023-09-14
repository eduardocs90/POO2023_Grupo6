package br.com.poo.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.enums.ContaEnum;
import br.com.poo.banco.enums.PessoasEnum;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.banco.pessoas.Funcionario;

public class PaginaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCpf;
	private JPasswordField textSenha;

	/**
	 * Create the frame.
	 */
	public PaginaLogin() {
		setTitle("DÉ BANK");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(PaginaLogin.class.getResource("/br/com/poo/imagens/100x100.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 536);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtpnWayToThe = new JTextPane();
		txtpnWayToThe.setFont(new Font("Arial Narrow", Font.BOLD, 10));
		txtpnWayToThe.setForeground(Color.DARK_GRAY);
		txtpnWayToThe.setBackground(Color.BLACK);
		txtpnWayToThe.setText("WAY TO THE FUTURE");
		txtpnWayToThe.setBounds(335, 466, 99, 20);
		contentPane.add(txtpnWayToThe);

		JButton buttonExit = new JButton("");
		buttonExit.setHorizontalAlignment(SwingConstants.LEFT);
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonExit.setBackground(Color.DARK_GRAY);
		buttonExit.setFont(new Font("Tahoma", Font.PLAIN, 7));
		buttonExit.setIcon(new ImageIcon(PaginaLogin.class.getResource("/br/com/poo/imagens/SAIR.png")));
		buttonExit.setBounds(-17, 446, 64, 51);
		contentPane.add(buttonExit);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(-17, -15, 473, 456);
		contentPane.add(panel);
		panel.setLayout(null);

		JTextPane txtpnCpf = new JTextPane();
		txtpnCpf.setBounds(128, 217, 67, 22);
		panel.add(txtpnCpf);
		txtpnCpf.setBackground(new Color(0, 0, 0));
		txtpnCpf.setForeground(new Color(255, 255, 255));
		txtpnCpf.setText("CPF :");
		txtpnCpf.setFont(new Font("Arial Black", Font.BOLD, 15));

		JTextPane txtpnSenha = new JTextPane();
		txtpnSenha.setBounds(128, 305, 103, 22);
		panel.add(txtpnSenha);
		txtpnSenha.setText("SENHA :");
		txtpnSenha.setForeground(Color.WHITE);
		txtpnSenha.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtpnSenha.setBackground(Color.BLACK);

		textSenha = new JPasswordField();
		textSenha.setBounds(128, 331, 191, 27);
		panel.add(textSenha);

		JButton buttonLogin = new JButton("");
		buttonLogin.setBounds(194, 374, 67, 71);
		panel.add(buttonLogin);
		buttonLogin.setIcon(new ImageIcon(PaginaLogin.class.getResource("/br/com/poo/imagens/2.png")));
		buttonLogin.setForeground(Color.DARK_GRAY);
		buttonLogin.setBackground(new Color(0, 0, 0));
		buttonLogin.setFont(new Font("Arial", Font.BOLD, 15));

		JLabel logo = new JLabel("");
		logo.setBounds(78, 21, 241, 154);
		panel.add(logo);
		logo.setIcon(new ImageIcon(PaginaLogin.class.getResource("/br/com/poo/imagens/300x300.png")));

		textCpf = new JTextField();
		textCpf.setBounds(128, 242, 191, 27);
		panel.add(textCpf);
		textCpf.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		textCpf.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Cliente", "Gerente", "Diretor", "Presidente" }));
		comboBox.setBounds(160, 185, 133, 21);
		panel.add(comboBox);
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cpf = textCpf.getText();
				String senha = new String(textSenha.getPassword());
				Cliente c = Cliente.mapaClientes.get(cpf);
				Funcionario f = Funcionario.mapaFuncionario.get(cpf);
				Conta conta = Conta.mapaContas.get(cpf);

				if (c != null && c.getCpf().equals(cpf) && c.getSenha().equals(senha)) {
				    // Autenticado como Cliente
				    if (comboBox.getSelectedItem().toString().equals(PessoasEnum.CLIENTE.getTipoPessoas())) {
				        if (conta.getTipoConta().equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
				            // Lógica para cliente com conta corrente
				        } else if (conta.getTipoConta().equalsIgnoreCase(ContaEnum.POUPANCA.name())) {
				            // Lógica para cliente com conta poupança
				        } else {
                            JOptionPane.showMessageDialog(buttonLogin, "Há campos inválidos. Por favor, tente novamente! ","Aviso!", JOptionPane.WARNING_MESSAGE);
                        }
				    } 
				} else if (f != null && f.getCpf().equals(cpf) && f.getSenha().equals(senha)) {
				    // Autenticado como Funcionário
				    if (comboBox.getSelectedItem().toString().equals(PessoasEnum.GERENTE.getTipoPessoas())) {
				        if (f.getTipoFuncionario().equals(PessoasEnum.GERENTE.getTipoPessoas())) {
				            // Autenticado como gerente
				            dispose();
				            MenuGerente menuGerente = new MenuGerente();
				            menuGerente.setLocationRelativeTo(menuGerente);
				            menuGerente.setVisible(true);
				        } else {
                           JOptionPane.showMessageDialog(buttonLogin, "Há campos inválidos. Por favor, tente novamente! ","Aviso!", JOptionPane.WARNING_MESSAGE);
				        }
				    } else if (comboBox.getSelectedItem().toString().equals(PessoasEnum.DIRETOR.getTipoPessoas())) {
				        if (f.getTipoFuncionario().equals(PessoasEnum.DIRETOR.getTipoPessoas())) {
				            // Autenticado como diretor
				            dispose();
				            JMenuDiretor jMenuDiretor = new JMenuDiretor();
				            jMenuDiretor.setLocationRelativeTo(jMenuDiretor);
				            jMenuDiretor.setVisible(true);
				        } else {
	                           JOptionPane.showMessageDialog(buttonLogin, "Há campos inválidos. Por favor, tente novamente!","Aviso!", JOptionPane.WARNING_MESSAGE);
					        }
				    } else if (comboBox.getSelectedItem().toString().equals(PessoasEnum.PRESIDENTE.getTipoPessoas())) {
				        if (f.getTipoFuncionario().equals(PessoasEnum.PRESIDENTE.getTipoPessoas())) {
				            // Autenticado como presidente
				            dispose();
				            MenuPresidente menuPresidente = new MenuPresidente();
				            menuPresidente.setLocationRelativeTo(menuPresidente);
				            menuPresidente.setVisible(true);
				        } else {
	                           JOptionPane.showMessageDialog(buttonLogin, "Há campos inválidos. Por favor, tente novamente! ","Aviso!", JOptionPane.WARNING_MESSAGE);
					        }
				        
				    }
				
				}else {
                    JOptionPane.showMessageDialog(buttonLogin, "Há campos inválidos. Por favor, tente novamente! ","Aviso!", JOptionPane.WARNING_MESSAGE);
			        }
			}
		});
	}
}
