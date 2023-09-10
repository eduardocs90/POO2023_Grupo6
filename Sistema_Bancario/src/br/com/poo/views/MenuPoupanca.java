package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\crist\\Downloads\\WhatsApp Image 2023-09-09 at 16.46.41.jpeg"));
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
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Poupança.png"));
		lblNewLabel_1.setBounds(292, 40, 132, 78);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("R$");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(40, 95, 26, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBounds(10, 123, 414, 359);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Saque");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Inserir um título.png"));
		btnNewButton.setBounds(64, 37, 103, 88);
		panel.add(btnNewButton);
		
		JButton btnDepsito = new JButton("Depósito");
		btnDepsito.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Saque (2).png"));
		btnDepsito.setBounds(255, 37, 103, 88);
		panel.add(btnDepsito);
		
		JButton btnTransferncia = new JButton("Transferência\r\n");
		btnTransferncia.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Transferencia (1).png"));
		btnTransferncia.setBounds(255, 186, 103, 88);
		panel.add(btnTransferncia);
		
		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Extrato.png"));
		btnExtrato.setBounds(64, 186, 103, 88);
		panel.add(btnExtrato);
		
		JLabel lblNewLabel_2 = new JLabel("Ag 0000 Conta 000000-0");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(284, 19, 161, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\WhatsApp Image 2023-09-09 at 16.46.41.jpeg"));
		lblNewLabel_4.setBounds(168, 25, 95, 59);
		contentPane.add(lblNewLabel_4);
	}

}
