package br.com.poo.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.enums.AgenciaEnum;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.pessoas.Funcionario;
import br.com.poo.relatorios.RelatorioP;


public class RelatorioPresidente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	public RelatorioPresidente(Funcionario f) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RelatorioPresidente.class.getResource("/br/com/poo/imagens/50x50.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 93, 363, 231);
		contentPane.add(scrollPane);
		
		List<Funcionario> listaFuncionarios = new ArrayList<>(Funcionario.mapaFuncionario.values());
		RelatorioP rp = new RelatorioP(listaFuncionarios);
		table = new JTable();
		table.setModel(rp);
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
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setForeground(new Color(255, 255, 255));
		List<AgenciaEnum> listaAgencia = Arrays.asList(AgenciaEnum.values());
			comboBox.addItem("Selecione uma opção");
			for(AgenciaEnum a : listaAgencia) {
				comboBox.addItem(a.getTipoAgencia());
			}
		
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setToolTipText("");
		comboBox.setBounds(158, 50, 96, 22);
		contentPane.add(comboBox);
		
		JButton buttonRelatorio = new JButton("Gerar Relatório");
		buttonRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(buttonRelatorio, "Relatorio foi Gerado!");
				try {
					LeituraEscrita.gerarRelatorioPresidente(f, Funcionario.mapaFuncionario, Conta.mapaContas);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonRelatorio.setBackground(new Color(0, 0, 0));
		buttonRelatorio.setForeground(new Color(255, 255, 255));
		buttonRelatorio.setBounds(158, 335, 116, 23);
		contentPane.add(buttonRelatorio);
		
		JLabel lblNewLabel_1 = new JLabel("Agências");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(101, 54, 51, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton buttonRelatorio_1 = new JButton("Voltar ao Menu");
		buttonRelatorio_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuPresidente menu = new MenuPresidente(f);
				menu.setLocationRelativeTo(menu);
				menu.setVisible(true);
			}
		});
		buttonRelatorio_1.setForeground(Color.WHITE);
		buttonRelatorio_1.setBackground(Color.BLACK);
		buttonRelatorio_1.setBounds(158, 369, 116, 23);
		contentPane.add(buttonRelatorio_1);
	}
}
