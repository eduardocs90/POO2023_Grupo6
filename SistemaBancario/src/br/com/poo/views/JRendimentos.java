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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.pessoas.Cliente;

public class JRendimentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValor;
	private JTextField textDias;
	
	

	public JRendimentos(Conta conta, Cliente c) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JRendimentos.class.getResource("/br/com/poo/imagens/100x100.png")));
		setTitle("DéBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 523);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JRendimentos.class.getResource("/br/com/poo/imagens/200x200.png")));
		lblNewLabel.setBounds(133, 10, 172, 136);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Simulação de Rendimento");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(121, 150, 249, 27);
		contentPane.add(lblNewLabel_1);
		
		JButton buttonVoltar = new JButton("");
		buttonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		buttonVoltar.setIcon(new ImageIcon(JRendimentos.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		buttonVoltar.setBounds(30, 411, 50, 50);
		contentPane.add(buttonVoltar);
		
		JButton buttonContinuar = new JButton("");
		buttonContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(buttonContinuar, "Ainda não implementamos esse método :( Volte em outra versão");
			}
		});
		buttonContinuar.setIcon(new ImageIcon(JRendimentos.class.getResource("/br/com/poo/imagens/Design sem nome (1).png")));
		buttonContinuar.setBounds(383, 411, 50, 50);
		contentPane.add(buttonContinuar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 5, true));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(89, 187, 292, 198);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dias:");
		lblNewLabel_1_1_1.setBounds(31, 33, 68, 27);
		panel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textDias = new JTextField();
		textDias.setBounds(119, 40, 141, 19);
		panel.add(textDias);
		textDias.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor:");
		lblNewLabel_1_1.setBounds(31, 86, 55, 22);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		textValor = new JTextField();
		textValor.setBounds(119, 86, 141, 19);
		panel.add(textValor);
		textValor.setColumns(10);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Total:");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_2.setBounds(31, 134, 55, 22);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel textTotal = new JLabel("0,000.00");
		textTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		textTotal.setForeground(Color.WHITE);
		textTotal.setBounds(119, 140, 141, 13);
		panel.add(textTotal);
		
		JButton BotaoContaPoupanca = new JButton("Conta Poupança");
		BotaoContaPoupanca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					MenuPoupanca mp = new MenuPoupanca(conta, c);
					mp.setLocationRelativeTo(mp);
					mp.setVisible(true);
				} catch (java.lang.ClassCastException exc) {
					JOptionPane.showMessageDialog(BotaoContaPoupanca, "Você não possui conta poupança! ");
					exc.printStackTrace();
				}
			}
		});
		BotaoContaPoupanca.setForeground(Color.WHITE);
		BotaoContaPoupanca.setBackground(Color.BLACK);
		BotaoContaPoupanca.setBounds(174, 420, 131, 23);
		contentPane.add(BotaoContaPoupanca);
	}
}
