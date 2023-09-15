package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class CadastroGerente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroGerente frame = new CadastroGerente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroGerente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastroGerente.class.getResource("/br/com/poo/imagens/50x50.png")));
		setTitle("Cadastro Gerente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(67, 53, 310, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro Gerente ");
		lblNewLabel.setBounds(110, 11, 94, 25);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(110, 32, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 63, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(71, 35, 27, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setBounds(81, 66, 19, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 94, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(71, 128, 35, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Agencia");
		lblNewLabel_4.setBounds(60, 97, 38, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Confirmar Senha");
		lblNewLabel_3_1.setBounds(22, 162, 88, 14);
		panel.add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setIcon(new ImageIcon(CadastroGerente.class.getResource("/br/com/poo/imagens/2.png")));
		btnNewButton.setBounds(272, 181, 38, 46);
		panel.add(btnNewButton);
		
		JButton sair = new JButton("");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		                dispose();
		                PaginaLogin pl = new PaginaLogin();
		                pl.setLocationRelativeTo(pl);
		                pl.setVisible(true); 
		            }
		        });
		sair.setBackground(new Color(0, 0, 0));
		sair.setBounds(0, 181, 44, 46);
		panel.add(sair);
		sair.setIcon(new ImageIcon(CadastroGerente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(110, 125, 86, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(110, 156, 86, 20);
		panel.add(passwordField_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(CadastroGerente.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel_5.setBounds(171, 0, 96, 48);
		contentPane.add(lblNewLabel_5);
	}

}
