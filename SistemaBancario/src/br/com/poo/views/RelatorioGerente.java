package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class RelatorioGerente extends JFrame {

	/**
	 * 
	 */
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
					RelatorioGerente frame = new RelatorioGerente();
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
	public RelatorioGerente() {
		setTitle("DéBank");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RelatorioGerente.class.getResource("/br/com/poo/imagens/50x50.png")));
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(-15, 0, 89, 50);
		lblNewLabel_2.setIcon(new ImageIcon(RelatorioGerente.class.getResource("/br/com/poo/imagens/100x100.png")));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1_1 = new JButton("Gerar Relatório");
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1_1.setBounds(157, 279, 123, 23);
		contentPane.add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 58, 327, 195);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Agencia", "N°Conta", "Cpf", "ValorTotal"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(94);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Relatórios do Gerente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(143, 14, 133, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(RelatorioGerente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		btnNewButton.setBounds(0, 287, 50, 50);
		contentPane.add(btnNewButton);
	}
}
