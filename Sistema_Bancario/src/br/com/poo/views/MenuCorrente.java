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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\crist\\Downloads\\WhatsApp Image 2023-09-09 at 16.46.41.jpeg"));
		setTitle("DéBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\WhatsApp Image 2023-09-09 at 16.46.41.jpeg"));
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
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBounds(10, 123, 414, 359);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Saque");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Saque.png"));
		btnNewButton.setBounds(22, 28, 104, 88);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		JButton btnDepsito = new JButton("Depósito");
		btnDepsito.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Saque (2).png"));
		btnDepsito.setBounds(148, 28, 104, 88);
		panel.add(btnDepsito);
		
		JButton btnTransferncia = new JButton("Transferência\r\n");
		btnTransferncia.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Transferencia (1).png"));
		btnTransferncia.setBounds(282, 28, 104, 88);
		panel.add(btnTransferncia);
		
		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Extrato.png"));
		btnExtrato.setBounds(22, 177, 104, 88);
		panel.add(btnExtrato);
		
		JButton btnNewButton_1_1 = new JButton("Poupança");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Poupança.png"));
		btnNewButton_1_1.setBounds(148, 177, 104, 88);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Seguro de Vida");
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Poupança (1).png"));
		btnNewButton_2_1.setBounds(282, 177, 104, 88);
		panel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Saldo R$");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 69, 67, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Saldo + cheque Especial R$");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 94, 145, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("0.000,00");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(87, 69, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("0.000,00");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setBounds(145, 94, 145, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6 = new JLabel("Icon Corrente");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\crist\\Downloads\\Poupança (2).png"));
		lblNewLabel_6.setBounds(294, 42, 118, 70);
		contentPane.add(lblNewLabel_6);
	}
}
