package br.com.poo.views;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.pessoas.Cliente;

public class SeguroVida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValor;

	public SeguroVida(Conta conta, Cliente c) {
		setTitle("DéBank");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SeguroVida.class.getResource("/br/com/poo/imagens/100x100.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(SeguroVida.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel.setBounds(21, 10, 100, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seguro de Vida");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(185, 44, 184, 25);
		contentPane.add(lblNewLabel_1);
		
		textValor = new JTextField();
		textValor.setBounds(185, 125, 159, 19);
		contentPane.add(textValor);
		textValor.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor:");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(107, 128, 68, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton buttonVoltar = new JButton("");
		buttonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		buttonVoltar.setIcon(new ImageIcon(SeguroVida.class.getResource("/br/com/poo/imagens/Voltar100x100.png")));
		buttonVoltar.setBounds(21, 194, 100, 100);
		contentPane.add(buttonVoltar);
		
		JButton buttonCorrente = new JButton("Voltar ao menu");
		buttonCorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MenuCorrente mc = new MenuCorrente(conta,c);
				mc.setLocationRelativeTo(mc);
				mc.setVisible(true);
			}
		});
		buttonCorrente.setBackground(new Color(0, 0, 0));
		buttonCorrente.setForeground(new Color(255, 255, 255));
		buttonCorrente.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonCorrente.setBounds(185, 194, 159, 21);
		contentPane.add(buttonCorrente);
		
		JButton buttonContinuar = new JButton("");
		buttonContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor = textValor.getText();
				if(conta instanceof ContaCorrente) {
					ContaCorrente cc = (ContaCorrente) conta;
					if(cc.seguroVida(Double.parseDouble(valor))) {
						JOptionPane.showMessageDialog(buttonContinuar, "Seguro de Vida acionado com Sucesso!");
						try {
							LeituraEscrita.comprovanteSeguro(cc, valor);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(buttonContinuar, "Saldo insuficiente ou valor inválido");
					}
				}
			}
		});
		buttonContinuar.setIcon(new ImageIcon(SeguroVida.class.getResource("/br/com/poo/imagens/2.png")));
		buttonContinuar.setBounds(402, 194, 100, 100);
		contentPane.add(buttonContinuar);
	}
}
