package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class telaCarregamento extends JFrame {

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
					telaCarregamento frame = new telaCarregamento();
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
	public telaCarregamento() {
		setTitle("DÉ BANK");
		setIconImage(Toolkit.getDefaultToolkit().getImage(telaCarregamento.class.getResource("/br/com/poo/imagens/100x100.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 536);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(-34, 459, 505, 143);
		contentPane.add(panel);
		
		JLabel iniciando = new JLabel("Iniciando");
		panel.add(iniciando);
		iniciando.setToolTipText("");
		iniciando.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		iniciando.setForeground(new Color(0, 0, 0));
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(telaCarregamento.class.getResource("/br/com/poo/imagens/300x300.png")));
		logo.setBounds(65, 38, 236, 166);
		contentPane.add(logo);
		
		JLabel esferasDoDragao = new JLabel("");
		esferasDoDragao.setIcon(new ImageIcon(telaCarregamento.class.getResource("/br/com/poo/imagens/image-removebg-preview.png")));
		esferasDoDragao.setBounds(-18, 380, 348, 57);
		contentPane.add(esferasDoDragao);
		
		JLabel gokuCorrendo = new JLabel("");
		gokuCorrendo.setIcon(new ImageIcon(telaCarregamento.class.getResource("/br/com/poo/imagens/goku100x100.png")));
		gokuCorrendo.setBounds(313, 380, 78, 74);
		contentPane.add(gokuCorrendo);
	}
}
