package br.com.poo.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class JRelatorioCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRelatorioCliente frame = new JRelatorioCliente();
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
	public JRelatorioCliente() {
		setTitle("DéBank");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JRelatorioCliente.class.getResource("/br/com/poo/imagens/50x50.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 394);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 49, 377, 192);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Titular","Agência","Conta","Saldo", "Saque", "Depósito", "Transferência", "Taxa de Mov."
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(JRelatorioCliente.class.getResource("/br/com/poo/imagens/50x50.png")));
		lblNewLabel.setBounds(32, 10, 51, 29);
		contentPane.add(lblNewLabel);
		
		JButton buttonExtrato = new JButton("");
		buttonExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(buttonExtrato, "Ainda não implementamos esse método :( Volte em outra versão");
				
			}
		});
		buttonExtrato.setIcon(new ImageIcon(JRelatorioCliente.class.getResource("/br/com/poo/imagens/Extrato.jpg")));
		buttonExtrato.setBounds(159, 251, 118, 88);
		contentPane.add(buttonExtrato);
		
		JLabel lblNewLabel_1 = new JLabel("Relatórios");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(178, 16, 91, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(JRelatorioCliente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		btnNewButton.setBounds(20, 281, 50, 50);
		contentPane.add(btnNewButton);
	}
}
