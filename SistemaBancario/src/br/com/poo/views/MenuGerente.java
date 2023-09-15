package br.com.poo.views;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.pessoas.Funcionario;

public class MenuGerente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MenuGerente(Funcionario f) {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(MenuGerente.class.getResource("/br/com/poo/imagens/50x50.png")));
		setTitle("DéBank");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(46, 63, 327, 166);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Relatórios");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RelatorioGerente rg = new RelatorioGerente(f);
				rg.setLocationRelativeTo(rg);
				rg.setVisible(true);
			}
		});
		btnNewButton.setBounds(90, 59, 141, 23);
		panel.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Olá Gerente " + f.getNome());
		lblNewLabel_1.setBounds(74, 11, 197, 27);
		panel.add(lblNewLabel_1);

		JButton btnNewButton_1 = new JButton("Cadastro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JCadastroCliente jcc = new JCadastroCliente();
				jcc.setLocationRelativeTo(jcc);
				jcc.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(90, 93, 141, 23);
		panel.add(btnNewButton_1);

		JButton sair = new JButton("");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		sair.setBounds(0, 124, 49, 42);
		panel.add(sair);
		sair.setIcon(new ImageIcon(MenuGerente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MenuGerente.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel.setBounds(159, 0, 94, 62);
		contentPane.add(lblNewLabel);
	}
}
