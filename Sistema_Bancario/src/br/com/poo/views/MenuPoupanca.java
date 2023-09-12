package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

public class MenuPoupanca extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPoupanca frame = new MenuPoupanca();
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
	public MenuPoupanca() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPoupanca.class.getResource("/br/com/poo/imagens/100x100.png")));
		setTitle("DéBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Saldo + rendimentos");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 70, 161, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("0.000,00");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(69, 95, 117, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("Olá, Usuário");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 95, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Poupanca118x88.jpg")));
		lblNewLabel_1.setBounds(292, 40, 132, 78);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("R$");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(40, 95, 26, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 4));
		panel.setLayout(null);
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 123, 414, 306);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Saque");
		btnNewButton.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Saque118x88.jpg")));
		btnNewButton.setBounds(44, 37, 103, 88);
		panel.add(btnNewButton);
		
		JButton btnDepsito = new JButton("Depósito");
		btnDepsito.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Deposito.jpg")));
		btnDepsito.setBounds(157, 37, 103, 88);
		panel.add(btnDepsito);
		
		JButton btnTransferncia = new JButton("Transferência\r\n");
		btnTransferncia.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Transferencia.jpg")));
		btnTransferncia.setBounds(236, 184, 100, 87);
		panel.add(btnTransferncia);
		
		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Extrato.jpg")));
		btnExtrato.setBounds(96, 184, 103, 88);
		panel.add(btnExtrato);
		
		JButton btnNewButton_2 = new JButton("Conta Corrente");
		btnNewButton_2.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/ContaCorrente.jpg")));
		btnNewButton_2.setBounds(275, 37, 95, 88);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Ag 0000 Conta 000000-0");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(284, 19, 161, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel_4.setBounds(168, 25, 95, 59);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		btnNewButton_1.setBounds(10, 440, 42, 35);
		contentPane.add(btnNewButton_1);
	}

}
