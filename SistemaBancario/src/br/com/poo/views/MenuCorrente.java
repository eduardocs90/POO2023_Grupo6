package br.com.poo.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.text.DecimalFormat;

import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuCorrente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public MenuCorrente(String nome, String agencia, String conta, Double saldo, Double chequeEspecial) {
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
		
		JLabel labelUsuario = new JLabel("Olá, " + nome);
		labelUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelUsuario.setForeground(new Color(255, 255, 255));
		labelUsuario.setBounds(22, 9, 95, 29);
		contentPane.add(labelUsuario);
		
		JLabel labelAgencia = new JLabel("Ag " + agencia + " Conta " + conta);
		labelAgencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelAgencia.setForeground(new Color(255, 255, 255));
		labelAgencia.setBounds(284, 17, 161, 14);
		contentPane.add(labelAgencia);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 4, true));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(41, 119, 371, 296);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton buttonExtrato = new JButton("Extrato");
		buttonExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JRelatorioCliente rc = new JRelatorioCliente();
				rc.setLocationRelativeTo(rc);
				rc.setVisible(true);
			}
		});
		buttonExtrato.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/Extrato.jpg")));
		buttonExtrato.setBounds(235, 27, 91, 88);
		panel.add(buttonExtrato);
		
		JButton buttonPoupanca = new JButton("Poupança");
		buttonPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//MenuPoupanca menu = new MenuPoupanca();
			}
		});
		buttonPoupanca.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/Poupanca118x88.jpg")));
		buttonPoupanca.setBounds(43, 177, 100, 88);
		panel.add(buttonPoupanca);
		
		JButton buttonSegVida = new JButton("Seguro de Vida");
		buttonSegVida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonSegVida.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/SeguroVida118x88.jpg")));
		buttonSegVida.setBounds(226, 177, 100, 88);
		panel.add(buttonSegVida);
		
		JButton buttonTransacoes = new JButton("Transações Bancárias");
		buttonTransacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TransacoesBancarias tb = new TransacoesBancarias();
				tb.setLocationRelativeTo(tb);
				tb.setVisible(true);
			}
		});
		buttonTransacoes.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/Transações Bancárias.png")));
		buttonTransacoes.setBounds(43, 27, 91, 88);
		panel.add(buttonTransacoes);
		
		JLabel lblNewLabel_3 = new JLabel("Saldo R$");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 69, 68, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Saldo + cheque");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 95, 95, 14);
		contentPane.add(lblNewLabel_4);
		
		DecimalFormat formatoSaldo = new DecimalFormat("#,###.00");
		Double total = saldo + chequeEspecial;
		String saldoFormatado = formatoSaldo.format(saldo);
		String saldoFormatadoCheque = formatoSaldo.format(total);
		
		JLabel labelSaldo = new JLabel(saldoFormatado);
		labelSaldo.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelSaldo.setForeground(new Color(255, 255, 255));
		labelSaldo.setBounds(88, 69, 86, 14);
		contentPane.add(labelSaldo);
		
		JLabel labelSaldoCheque = new JLabel(saldoFormatadoCheque);
		labelSaldoCheque.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelSaldoCheque.setForeground(Color.WHITE);
		labelSaldoCheque.setBounds(115, 95, 82, 14);
		contentPane.add(labelSaldoCheque);
		
		JLabel lblNewLabel_6 = new JLabel("Icon Corrente");
		lblNewLabel_6.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/ContaCorrente.jpg")));
		lblNewLabel_6.setBounds(294, 42, 118, 70);
		contentPane.add(lblNewLabel_6);
		
		JButton buttonVoltar = new JButton("");
		buttonVoltar.setIcon(new ImageIcon(MenuCorrente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		buttonVoltar.setBounds(10, 430, 42, 35);
		contentPane.add(buttonVoltar);
	}
}
