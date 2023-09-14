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
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TransacoesBancarias extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textValorSaque;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransacoesBancarias frame = new TransacoesBancarias();
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
	public TransacoesBancarias() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TransacoesBancarias.class.getResource("/br/com/poo/imagens/100x100.png")));
		setTitle("DÉ BANK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 534);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(TransacoesBancarias.class.getResource("/br/com/poo/imagens/100x100.png")));
		logo.setBounds(27, 0, 100, 87);
		contentPane.add(logo);
		
		JLabel lblTransacoesBancarias = new JLabel("Transações Bancarias");
		lblTransacoesBancarias.setFont(new Font("Arial", Font.BOLD, 20));
		lblTransacoesBancarias.setForeground(Color.WHITE);
		lblTransacoesBancarias.setBounds(157, 27, 230, 40);
		contentPane.add(lblTransacoesBancarias);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(Color.GRAY, 3, true));
		panel.setBounds(10, 91, 414, 337);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox cbTransacoes = new JComboBox();
		cbTransacoes.setBackground(new Color(255, 255, 255));
		cbTransacoes.setForeground(SystemColor.controlText);
		cbTransacoes.setToolTipText("Opção");
		cbTransacoes.setFont(new Font("Agency FB", Font.PLAIN, 10));
		cbTransacoes.setBounds(149, 11, 123, 22);
		panel.add(cbTransacoes);
		
		JLabel lblValorDeSaque = new JLabel("Valor de Saque: R$");
		lblValorDeSaque.setFont(new Font("Arial", Font.BOLD, 15));
		lblValorDeSaque.setBounds(67, 77, 134, 13);
		panel.add(lblValorDeSaque);
		
		JLabel lblValorDeDepsito = new JLabel("Valor de Depósito: R$");
		lblValorDeDepsito.setFont(new Font("Arial", Font.BOLD, 15));
		lblValorDeDepsito.setBounds(48, 128, 153, 13);
		panel.add(lblValorDeDepsito);
		
		textValorSaque = new JTextField();
		textValorSaque.setFont(new Font("Arial", Font.BOLD, 15));
		textValorSaque.setColumns(10);
		textValorSaque.setBounds(216, 69, 185, 30);
		panel.add(textValorSaque);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(216, 120, 185, 30);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(216, 179, 185, 30);
		panel.add(textField_2);
		
		JLabel lblValorDaTransferncia = new JLabel("Valor da Transferência: R$");
		lblValorDaTransferncia.setFont(new Font("Arial", Font.BOLD, 15));
		lblValorDaTransferncia.setBounds(14, 187, 187, 13);
		panel.add(lblValorDaTransferncia);
		
		JLabel lblCpfParaTransferncia = new JLabel("Cpf para Transferência:");
		lblCpfParaTransferncia.setFont(new Font("Arial", Font.BOLD, 15));
		lblCpfParaTransferncia.setBounds(34, 241, 167, 13);
		panel.add(lblCpfParaTransferncia);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(216, 233, 185, 30);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TransacoesBancarias.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		btnNewButton.setBounds(11, 439, 47, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(TransacoesBancarias.class.getResource("/br/com/poo/imagens/1.png")));
		btnNewButton_1.setBounds(373, 445, 40, 34);
		contentPane.add(btnNewButton_1);
	}

}
