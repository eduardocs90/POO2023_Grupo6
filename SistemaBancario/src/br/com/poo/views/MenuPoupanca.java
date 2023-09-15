package br.com.poo.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPoupanca extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MenuPoupanca(String nome, String agencia, String conta, Double saldo) {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(MenuPoupanca.class.getResource("/br/com/poo/imagens/100x100.png")));
		setTitle("DéBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Saldo: ");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(40, 71, 53, 14);
		contentPane.add(lblNewLabel_3);

		DecimalFormat formatoSaldo = new DecimalFormat("#,###.00");
		String saldoFormatado = formatoSaldo.format(saldo);

		JLabel labelSaldo = new JLabel(saldoFormatado);
		labelSaldo.setForeground(Color.WHITE);
		labelSaldo.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelSaldo.setBounds(69, 95, 101, 14);
		contentPane.add(labelSaldo);

		JLabel labelUsuario = new JLabel("Olá, " + nome);
		labelUsuario.setForeground(Color.WHITE);
		labelUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelUsuario.setBounds(10, 11, 148, 29);
		contentPane.add(labelUsuario);

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
		panel.setBounds(37, 120, 359, 306);
		contentPane.add(panel);

		JButton buttonExtrato = new JButton("Extrato");
		buttonExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JRelatorioCliente re = new JRelatorioCliente();
				re.setLocationRelativeTo(re);
				re.setVisible(true);
			}
		});
		buttonExtrato.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Extrato.jpg")));
		buttonExtrato.setBounds(42, 184, 95, 88);
		panel.add(buttonExtrato);

		JButton buttonContaC = new JButton("Conta Corrente");
		buttonContaC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
//				MenuCorrente co = new MenuCorrente();
//				co.setLocationRelativeTo(co);
//				co.setVisible(true);
			}
		});
		buttonContaC.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/ContaCorrente.jpg")));
		buttonContaC.setBounds(230, 184, 95, 88);
		panel.add(buttonContaC);

		JButton buttonTransacoes = new JButton("Transações Bancárias");
		buttonTransacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TransacoesBancarias tb = new TransacoesBancarias();
				tb.setLocationRelativeTo(tb);
				tb.setVisible(true);
			}
		});
		buttonTransacoes
				.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Transações Bancárias.png")));
		buttonTransacoes.setBounds(42, 46, 91, 88);
		panel.add(buttonTransacoes);

		JButton buttonRendimentos = new JButton("Rendimentos");
		buttonRendimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JRendimentos jr = new JRendimentos();
				jr.setLocationRelativeTo(jr);
				jr.setVisible(true);
			}
		});
		buttonRendimentos.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Rendimentos.png")));
		buttonRendimentos.setBounds(224, 46, 95, 83);
		panel.add(buttonRendimentos);

		JLabel labelAgConta = new JLabel("Ag " + agencia + " Conta " + conta);
		labelAgConta.setForeground(Color.WHITE);
		labelAgConta.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelAgConta.setBounds(284, 19, 161, 14);
		contentPane.add(labelAgConta);

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel_4.setBounds(168, 25, 95, 59);
		contentPane.add(lblNewLabel_4);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MenuPoupanca.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		btnNewButton_1.setBounds(10, 440, 42, 35);
		contentPane.add(btnNewButton_1);
	}

}
