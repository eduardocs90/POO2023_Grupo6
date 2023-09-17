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
import javax.swing.border.LineBorder;
import java.awt.Font;

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
		setBounds(100, 100, 450, 349);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 5, true));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(46, 63, 327, 187);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton buttonRelatorio = new JButton("");
		buttonRelatorio.setIcon(new ImageIcon(MenuGerente.class.getResource("/br/com/poo/imagens/RELATORIO1.png")));
		buttonRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				RelatorioGerente rg = new RelatorioGerente(f);
				rg.setLocationRelativeTo(rg);
				rg.setVisible(true);
			}
		});
		buttonRelatorio.setBounds(41, 77, 100, 50);
		panel.add(buttonRelatorio);

		JLabel lblNewLabel_1 = new JLabel("Olá Gerente " + f.getNome());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(56, 10, 248, 27);
		panel.add(lblNewLabel_1);
		
		JButton buttonCadastro = new JButton("");
		buttonCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JCadastroCliente jcc = new JCadastroCliente(f);
				jcc.setLocationRelativeTo(jcc);
				jcc.setVisible(true);
			}
		});
		buttonCadastro.setIcon(new ImageIcon(MenuGerente.class.getResource("/br/com/poo/imagens/cadastroCliente.png")));
		buttonCadastro.setBounds(189, 60, 100, 100);
		panel.add(buttonCadastro);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MenuGerente.class.getResource("/br/com/poo/imagens/100x100.png")));
		lblNewLabel.setBounds(159, 0, 94, 62);
		contentPane.add(lblNewLabel);
		
				JButton sair = new JButton("");
				sair.setBounds(24, 260, 49, 42);
				contentPane.add(sair);
				sair.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						PaginaLogin pl = new PaginaLogin();
						pl.setLocationRelativeTo(pl);
						pl.setVisible(true);
					}
				});
				sair.setIcon(new ImageIcon(MenuGerente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
	}
}
