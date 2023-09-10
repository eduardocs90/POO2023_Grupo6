package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;

public class paginaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCpf;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paginaLogin frame = new paginaLogin();
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
	public paginaLogin() {
		setTitle("DÉ BANK");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PC\\Downloads\\Design sem nome (5).png"));
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
		txtpnWayToThe.setBounds(335, 477, 99, 20);
		contentPane.add(txtpnWayToThe);
		
		JButton buttonExit = new JButton("SAIR");
		buttonExit.setHorizontalAlignment(SwingConstants.LEFT);
		buttonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonExit.setBackground(Color.DARK_GRAY);
		buttonExit.setFont(new Font("Tahoma", Font.PLAIN, 7));
		buttonExit.setIcon(new ImageIcon("C:\\Users\\PC\\Downloads\\Design sem nome (6).png"));
		buttonExit.setBounds(-17, 464, 52, 33);
		contentPane.add(buttonExit);
		
		textCpf = new JTextField();
		textCpf.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		textCpf.setBounds(113, 195, 186, 33);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\PC\\Downloads\\Design sem nome (3).png"));
		lblNewLabel.setBounds(96, 0, 152, 126);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(-17, -15, 473, 474);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnCpf = new JTextPane();
		txtpnCpf.setBounds(128, 184, 67, 33);
		panel.add(txtpnCpf);
		txtpnCpf.setBackground(new Color(0, 0, 0));
		txtpnCpf.setForeground(new Color(255, 255, 255));
		txtpnCpf.setText("CPF :");
		txtpnCpf.setFont(new Font("Arial Black", Font.BOLD, 15));
		
		JTextPane txtpnSenha = new JTextPane();
		txtpnSenha.setBounds(128, 298, 103, 22);
		panel.add(txtpnSenha);
		txtpnSenha.setText("SENHA :");
		txtpnSenha.setForeground(Color.WHITE);
		txtpnSenha.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtpnSenha.setBackground(Color.BLACK);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(128, 325, 189, 33);
		panel.add(passwordField);
		
		JButton buttonLogin = new JButton("");
		buttonLogin.setBounds(200, 388, 48, 52);
		panel.add(buttonLogin);
		buttonLogin.setIcon(new ImageIcon("C:\\Users\\PC\\Downloads\\up.png"));
		buttonLogin.setForeground(Color.DARK_GRAY);
		buttonLogin.setBackground(new Color(0, 0, 0));
		buttonLogin.setFont(new Font("Arial", Font.BOLD, 15));
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
