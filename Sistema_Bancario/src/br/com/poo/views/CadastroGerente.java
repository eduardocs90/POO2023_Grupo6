package br.com.poo.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class CadastroGerente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroGerente frame = new CadastroGerente();
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
	public CadastroGerente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Serratec\\OneDrive\\Documentos\\DéBank.jpg"));
		setTitle("Cadastro Gerente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(67, 59, 310, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro Gerente ");
		lblNewLabel.setBounds(110, 11, 94, 25);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(110, 47, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 78, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(71, 47, 27, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setBounds(81, 81, 19, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 109, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Senha");
		lblNewLabel_3.setBounds(71, 143, 35, 14);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 140, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Agencia");
		lblNewLabel_4.setBounds(60, 112, 38, 14);
		panel.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(110, 173, 86, 20);
		panel.add(textField_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("Confirmar Senha");
		lblNewLabel_3_1.setBounds(22, 176, 88, 14);
		panel.add(lblNewLabel_3_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Serratec\\Downloads\\confirmar.png"));
		btnNewButton.setBounds(266, 194, 44, 33);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(0, 194, 44, 33);
		panel.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Serratec\\Downloads\\sair.png"));
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Serratec\\Downloads\\DéBank3.png"));
		lblNewLabel_5.setBounds(171, 0, 96, 48);
		contentPane.add(lblNewLabel_5);
	}

}
