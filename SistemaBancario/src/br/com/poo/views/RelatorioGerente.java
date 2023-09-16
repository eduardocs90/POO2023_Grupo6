package br.com.poo.views;

import java.awt.Color;
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

import br.com.poo.banco.pessoas.Funcionario;

public class RelatorioGerente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public RelatorioGerente(Funcionario f) {
		setTitle("DéBank");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RelatorioGerente.class.getResource("/br/com/poo/imagens/50x50.png")));
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(-15, 0, 89, 50);
		lblNewLabel_2.setIcon(new ImageIcon(RelatorioGerente.class.getResource("/br/com/poo/imagens/100x100.png")));
		contentPane.add(lblNewLabel_2);
		
		JButton buttonRelatorio = new JButton("Gerar Relatório");
		buttonRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(buttonRelatorio, "Ainda não implementamos esse método :( Volte em outra versão");
			}
		});
		buttonRelatorio.setForeground(new Color(255, 255, 255));
		buttonRelatorio.setBackground(new Color(0, 0, 0));
		buttonRelatorio.setBounds(157, 279, 123, 23);
		contentPane.add(buttonRelatorio);
		
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(RelatorioGerente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		btnNewButton.setBounds(0, 287, 50, 50);
		contentPane.add(btnNewButton);
		
		JButton btnRetorneMenu = new JButton("Retorne Menu");
		btnRetorneMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuGerente menu = new MenuGerente(f);
				menu.setLocationRelativeTo(menu);
				menu.setVisible(true);
			}
		});
		btnRetorneMenu.setForeground(Color.WHITE);
		btnRetorneMenu.setBackground(Color.BLACK);
		btnRetorneMenu.setBounds(157, 314, 123, 23);
		contentPane.add(btnRetorneMenu);
	}
}
