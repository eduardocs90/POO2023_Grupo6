package br.com.poo.views;

import java.awt.Color;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class RelatorioPresidente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public RelatorioPresidente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RelatorioPresidente.class.getResource("/br/com/poo/imagens/50x50.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 420);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 93, 363, 231);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Capital Total", "   Gerentes"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(RelatorioPresidente.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel.setBounds(-14, 0, 88, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblRelatriosDoPresidente = new JLabel("Relatórios do Presidente");
		lblRelatriosDoPresidente.setForeground(Color.WHITE);
		lblRelatriosDoPresidente.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRelatriosDoPresidente.setBounds(137, 7, 148, 23);
		contentPane.add(lblRelatriosDoPresidente);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(RelatorioPresidente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		btnNewButton.setBounds(-2, 346, 46, 35);
		contentPane.add(btnNewButton);
		
		JButton buttonRelatorio = new JButton("Gerar Relatório");
		buttonRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(buttonRelatorio, "Ainda não implementamos esse método :( Volte em outra versão");
			}
		});
		buttonRelatorio.setBackground(new Color(0, 0, 0));
		buttonRelatorio.setForeground(new Color(255, 255, 255));
		buttonRelatorio.setBounds(157, 343, 116, 23);
		contentPane.add(buttonRelatorio);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setToolTipText("");
		comboBox.setBounds(158, 50, 96, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Agências");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(101, 54, 51, 14);
		contentPane.add(lblNewLabel_1);
	}
}
