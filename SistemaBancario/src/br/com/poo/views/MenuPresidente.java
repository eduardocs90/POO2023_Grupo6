package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class MenuPresidente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPresidente frame = new MenuPresidente();
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
	public MenuPresidente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPresidente.class.getResource("/br/com/poo/imagens/100x100.png")));
		setTitle("DÉ BANK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 537);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBackground(SystemColor.inactiveCaptionBorder);
		logo.setIcon(new ImageIcon(MenuPresidente.class.getResource("/br/com/poo/imagens/100x100.png")));
		logo.setBounds(10, 4, 111, 77);
		contentPane.add(logo);
		
		JLabel ola = new JLabel("Olá Presidente");
		ola.setFont(new Font("Arial", Font.BOLD, 20));
		ola.setForeground(Color.WHITE);
		ola.setBounds(131, 32, 150, 31);
		contentPane.add(ola);
		
		JLabel nome = new JLabel("nome!");
		nome.setForeground(Color.WHITE);
		nome.setFont(new Font("Arial", Font.BOLD, 20));
		nome.setBounds(276, 36, 69, 23);
		contentPane.add(nome);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionText);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 3, true));
		panel.setBounds(10, 92, 414, 338);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton cadastroDiretor = new JButton("");
		cadastroDiretor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cadastroDiretor.setIcon(new ImageIcon(MenuPresidente.class.getResource("/br/com/poo/imagens/relatorioDiretor.png")));
		cadastroDiretor.setBounds(161, 63, 110, 109);
		panel.add(cadastroDiretor);
		
		JButton cadastroGerente = new JButton("");
		cadastroGerente.setIcon(new ImageIcon(MenuPresidente.class.getResource("/br/com/poo/imagens/cadastroGerente.png")));
		cadastroGerente.setBounds(294, 63, 110, 109);
		panel.add(cadastroGerente);
		
		JButton cadastroCliente = new JButton("");
		cadastroCliente.setIcon(new ImageIcon(MenuPresidente.class.getResource("/br/com/poo/imagens/cadastroCliente.png")));
		cadastroCliente.setBounds(74, 206, 110, 109);
		panel.add(cadastroCliente);
		
		JButton jurosAnuais = new JButton("");
		jurosAnuais.setIcon(new ImageIcon(MenuPresidente.class.getResource("/br/com/poo/imagens/jurosAnual.png")));
		jurosAnuais.setBounds(234, 206, 110, 109);
		panel.add(jurosAnuais);
		
		JButton relatorioPresidente = new JButton("");
		relatorioPresidente.setBounds(27, 63, 110, 109);
		panel.add(relatorioPresidente);
		relatorioPresidente.setBackground(Color.WHITE);
		relatorioPresidente.setIcon(new ImageIcon(MenuPresidente.class.getResource("/br/com/poo/imagens/relatorioPresidente.png")));
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setBounds(177, 11, 63, 28);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(SystemColor.activeCaptionText);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
		
		JButton sair = new JButton("");
		sair.setIcon(new ImageIcon(MenuPresidente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		sair.setBounds(10, 441, 43, 46);
		contentPane.add(sair);
	}
}
