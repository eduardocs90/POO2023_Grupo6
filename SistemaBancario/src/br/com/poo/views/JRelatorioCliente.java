package br.com.poo.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.contas.ContaPoupanca;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.pessoas.Cliente;
import br.com.poo.extrato.ExtratoCliente;

public class JRelatorioCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	
	
	public JRelatorioCliente(Conta conta, Cliente c) {
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
		
		ExtratoCliente ec = new ExtratoCliente();
		
		table = new JTable();
		table.setModel(ec);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(JRelatorioCliente.class.getResource("/br/com/poo/imagens/50x50.png")));
		lblNewLabel.setBounds(32, 10, 51, 29);
		contentPane.add(lblNewLabel);
		
		JButton buttonExtrato = new JButton("");
		buttonExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					LeituraEscrita.comprovanteSaldo(conta);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		buttonExtrato.setIcon(new ImageIcon(JRelatorioCliente.class.getResource("/br/com/poo/imagens/Extrato.jpg")));
		buttonExtrato.setBounds(291, 252, 118, 88);
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
		
		JButton ButtonCorrente = new JButton("Conta Corrente");
		ButtonCorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ContaCorrente cc = ((ContaCorrente) conta);
					dispose();
					MenuCorrente mc = new MenuCorrente(cc, c);
					mc.setLocationRelativeTo(mc);
					mc.setVisible(true);
				} catch (java.lang.ClassCastException exc) {

					JOptionPane.showMessageDialog(ButtonCorrente, "Você não possui conta corrente! ");
					exc.printStackTrace();
				}
			}
		});
		ButtonCorrente.setForeground(SystemColor.window);
		ButtonCorrente.setBackground(Color.BLACK);
		ButtonCorrente.setBounds(151, 258, 118, 23);
		contentPane.add(ButtonCorrente);
		
		JButton ButtonPoupanca = new JButton("Conta Poupança");
		ButtonPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ContaPoupanca cc = ((ContaPoupanca) conta);
					dispose();
					MenuPoupanca mp = new MenuPoupanca(cc, c);
					mp.setLocationRelativeTo(mp);
					mp.setVisible(true);
				} catch (java.lang.ClassCastException exc) {

					JOptionPane.showMessageDialog(ButtonPoupanca, "Você não possui conta corrente! ");
					exc.printStackTrace();
				}
			}
		});
		ButtonPoupanca.setForeground(Color.WHITE);
		ButtonPoupanca.setBackground(Color.BLACK);
		ButtonPoupanca.setBounds(151, 308, 118, 23);
		contentPane.add(ButtonPoupanca);
	}
}
