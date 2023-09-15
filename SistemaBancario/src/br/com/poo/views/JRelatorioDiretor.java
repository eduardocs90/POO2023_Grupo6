package br.com.poo.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class JRelatorioDiretor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRelatorioDiretor frame = new JRelatorioDiretor();
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
	public JRelatorioDiretor() {
		setTitle("DéBank");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JRelatorioDiretor.class.getResource("/br/com/poo/imagens/100x100.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 512);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 107, 374, 296);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome","CPF","Agência"
			}
		));
		table.setBackground(Color.BLACK);
		table.setBorder(new LineBorder(Color.GRAY, 5, true));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(JRelatorioDiretor.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel.setBounds(0, 10, 97, 55);
		contentPane.add(lblNewLabel);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(218, 53, 87, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Relatórios do Diretor");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(132, 17, 197, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Agência");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(138, 53, 78, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton buttonRelatorio = new JButton("Gerar Relatório");
		buttonRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(buttonRelatorio, "Ainda não implementamos esse método :( Volte em outra versão");
			}
		});
		buttonRelatorio.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonRelatorio.setForeground(Color.WHITE);
		buttonRelatorio.setBackground(Color.BLACK);
		buttonRelatorio.setBounds(138, 425, 144, 21);
		contentPane.add(buttonRelatorio);
		
		JButton buttonVoltar = new JButton("");
		buttonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		buttonVoltar.setIcon(new ImageIcon(JRelatorioDiretor.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		buttonVoltar.setBounds(10, 415, 50, 50);
		contentPane.add(buttonVoltar);
	}
}
