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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PC\\Downloads\\Design sem nome.png"));
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
		logo.setIcon(new ImageIcon("C:\\Users\\PC\\Downloads\\Design sem nome (4).png"));
		logo.setBounds(57, 38, 236, 166);
		contentPane.add(logo);
		
		JLabel esferasDoDragao = new JLabel("New label");
		esferasDoDragao.setIcon(new ImageIcon("C:\\Users\\PC\\Downloads\\image-removebg-preview.png"));
		esferasDoDragao.setBounds(-14, 391, 348, 57);
		contentPane.add(esferasDoDragao);
		
		JLabel gokuCorrendo = new JLabel("New label");
		gokuCorrendo.setIcon(new ImageIcon("C:\\Users\\PC\\Downloads\\Design_sem_nome__7_-removebg-preview.png"));
		gokuCorrendo.setBounds(324, 408, 55, 57);
		contentPane.add(gokuCorrendo);
	}
}
