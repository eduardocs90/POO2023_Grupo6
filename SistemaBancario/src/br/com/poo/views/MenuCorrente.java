package br.com.poo.views;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

public class MenuCorrente extends JFrame {

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
					MenuCorrente frame = new MenuCorrente();
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
	public MenuCorrente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuCorrente.class.getResource("/br/com/poo/imagens/100x100.png")));
		setTitle("DéBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel_1.setBounds(167, 9, 82, 71);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Olá, Usuário");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(22, 9, 95, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Ag 0000 Conta 000000-0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(284, 17, 161, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 4, true));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(41, 119, 371, 296);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/Extrato.jpg")));
		btnExtrato.setBounds(235, 27, 91, 88);
		panel.add(btnExtrato);
		
		JButton btnNewButton_1_1 = new JButton("Poupança");
		btnNewButton_1_1.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/Poupanca118x88.jpg")));
		btnNewButton_1_1.setBounds(43, 177, 100, 88);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Seguro de Vida");
		btnNewButton_2_1.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/SeguroVida118x88.jpg")));
		btnNewButton_2_1.setBounds(226, 177, 100, 88);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton = new JButton("Transações Bancárias");
		btnNewButton.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/Transações Bancárias.png")));
		btnNewButton.setBounds(43, 27, 91, 88);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Saldo R$");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 69, 67, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Saldo + cheque esp R$");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 94, 132, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("0.000,00");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(87, 69, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("0.000,00");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setBounds(145, 94, 76, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6 = new JLabel("Icon Corrente");
		lblNewLabel_6.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/ContaCorrente.jpg")));
		lblNewLabel_6.setBounds(294, 42, 118, 70);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		btnNewButton_1.setBounds(10, 430, 42, 35);
		contentPane.add(btnNewButton_1);
	}
}
