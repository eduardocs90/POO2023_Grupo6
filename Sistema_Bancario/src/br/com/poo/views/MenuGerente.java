package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MenuGerente extends JFrame {

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
					MenuGerente frame = new MenuGerente();
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
	public MenuGerente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Serratec\\OneDrive\\Documentos\\DéBank.jpg"));
		setTitle("DéBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(47, 61, 327, 166);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Relatórios");
		btnNewButton.setBounds(90, 59, 141, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Seja bem-vindo ao menu Gerente !");
		lblNewLabel_1.setBounds(80, 11, 178, 27);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Cadastro");
		btnNewButton_1.setBounds(90, 93, 141, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Serratec\\Downloads\\DéBank3.png"));
		lblNewLabel.setBounds(157, 0, 94, 62);
		contentPane.add(lblNewLabel);
	}
}
