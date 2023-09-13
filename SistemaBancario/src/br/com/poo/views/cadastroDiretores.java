package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class cadastroDiretores extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordSenha;
	private JPasswordField passwordConfSenha;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textAgencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroDiretores frame = new cadastroDiretores();
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
	public cadastroDiretores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(cadastroDiretores.class.getResource("/br/com/poo/imagens/100x100.png")));
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
		lblnome.setBounds(97, 55, 45, 13);
		panel.add(lblnome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial", Font.BOLD, 15));
		lblCpf.setBounds(107, 111, 34, 13);
		panel.add(lblCpf);
		
		JLabel lblAgncia = new JLabel("Agência:");
		lblAgncia.setFont(new Font("Arial", Font.BOLD, 15));
		lblAgncia.setBounds(82, 167, 60, 13);
		panel.add(lblAgncia);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial", Font.BOLD, 15));
		lblSenha.setBounds(88, 220, 54, 13);
		panel.add(lblSenha);
		
		JLabel lblConfirmeASenha = new JLabel("Confirma senha:");
		lblConfirmeASenha.setFont(new Font("Arial", Font.BOLD, 15));
		lblConfirmeASenha.setBounds(26, 269, 132, 13);
		panel.add(lblConfirmeASenha);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setFont(new Font("Arial", Font.BOLD, 15));
		passwordSenha.setBounds(152, 212, 185, 30);
		panel.add(passwordSenha);
		
		passwordConfSenha = new JPasswordField();
		passwordConfSenha.setFont(new Font("Arial", Font.BOLD, 15));
		passwordConfSenha.setBounds(152, 261, 185, 30);
		panel.add(passwordConfSenha);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Arial", Font.BOLD, 15));
		textNome.setBounds(152, 47, 185, 30);
		panel.add(textNome);
		textNome.setColumns(10);
		
		textCpf = new JTextField();
		textCpf.setFont(new Font("Arial", Font.BOLD, 15));
		textCpf.setColumns(10);
		textCpf.setBounds(152, 103, 185, 30);
		panel.add(textCpf);
		
		textAgencia = new JTextField();
		textAgencia.setFont(new Font("Arial", Font.BOLD, 15));
		textAgencia.setColumns(10);
		textAgencia.setBounds(152, 159, 185, 30);
		panel.add(textAgencia);
		
		JButton seguir = new JButton("");
		seguir.setIcon(new ImageIcon(cadastroDiretores.class.getResource("/br/com/poo/imagens/1.png")));
		seguir.setBounds(373, 442, 38, 40);
		contentPane.add(seguir);
		
		JButton sair = new JButton("");
		sair.setIcon(new ImageIcon(cadastroDiretores.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		sair.setBounds(10, 436, 45, 46);
		contentPane.add(sair);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(cadastroDiretores.class.getResource("/br/com/poo/imagens/100x100.png")));
		logo.setBounds(43, 8, 100, 61);
		contentPane.add(logo);
		
		JLabel cadastroDiretor = new JLabel("Cadastro de Diretor:");
		cadastroDiretor.setBounds(174, 23, 209, 39);
		contentPane.add(cadastroDiretor);
		cadastroDiretor.setFont(new Font("Arial", Font.BOLD, 20));
		cadastroDiretor.setForeground(Color.WHITE);
	}
}
