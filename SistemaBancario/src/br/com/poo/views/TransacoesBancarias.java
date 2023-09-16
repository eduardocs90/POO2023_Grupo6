package br.com.poo.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.poo.banco.contas.Conta;
import br.com.poo.banco.contas.ContaCorrente;
import br.com.poo.banco.enums.TransacoesEnum;
import br.com.poo.banco.pessoas.Cliente;

public class TransacoesBancarias extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textSaque;
	private JTextField textDeposito;
	private JTextField textTransferencia;
	private JTextField textNumConta;

	public TransacoesBancarias(Conta conta, Cliente c) {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(TransacoesBancarias.class.getResource("/br/com/poo/imagens/100x100.png")));
		setTitle("DÉ BANK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 588);
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

		JComboBox<String> comboBox = new JComboBox<>();
		List<TransacoesEnum> listaTrans = Arrays.asList(TransacoesEnum.values());
		comboBox.addItem("Selecione uma opção");
		for (TransacoesEnum p : listaTrans) {
			comboBox.addItem(p.getTipoTransferencia());
		}
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setForeground(SystemColor.controlText);
		comboBox.setToolTipText("Opção");
		comboBox.setFont(new Font("Agency FB", Font.PLAIN, 10));
		comboBox.setBounds(149, 11, 123, 22);
		panel.add(comboBox);

		JLabel lblValorDeSaque = new JLabel("Valor de Saque:");
		lblValorDeSaque.setFont(new Font("Arial", Font.BOLD, 15));
		lblValorDeSaque.setBounds(21, 78, 142, 13);
		panel.add(lblValorDeSaque);

		JLabel lblValorDeDepsito = new JLabel("Valor de Depósito:");
		lblValorDeDepsito.setFont(new Font("Arial", Font.BOLD, 15));
		lblValorDeDepsito.setBounds(21, 129, 169, 13);
		panel.add(lblValorDeDepsito);

		textSaque = new JTextField();
		textSaque.setFont(new Font("Arial", Font.BOLD, 15));
		textSaque.setColumns(10);
		textSaque.setBounds(216, 69, 185, 30);
		panel.add(textSaque);

		textDeposito = new JTextField();
		textDeposito.setFont(new Font("Arial", Font.BOLD, 15));
		textDeposito.setColumns(10);
		textDeposito.setBounds(216, 120, 185, 30);
		panel.add(textDeposito);

		textTransferencia = new JTextField();
		textTransferencia.setFont(new Font("Arial", Font.BOLD, 15));
		textTransferencia.setColumns(10);
		textTransferencia.setBounds(216, 179, 185, 30);
		panel.add(textTransferencia);

		textNumConta = new JTextField();
		textNumConta.setFont(new Font("Arial", Font.BOLD, 15));
		textNumConta.setColumns(10);
		textNumConta.setBounds(216, 233, 185, 30);
		panel.add(textNumConta);

		JLabel lblValorDaTransferncia = new JLabel("Valor da Transferência:");
		lblValorDaTransferncia.setFont(new Font("Arial", Font.BOLD, 15));
		lblValorDaTransferncia.setBounds(21, 188, 180, 13);
		panel.add(lblValorDaTransferncia);

		JLabel lblCpfParaTransferncia = new JLabel("Número da Conta:");
		lblCpfParaTransferncia.setFont(new Font("Arial", Font.BOLD, 15));
		lblCpfParaTransferncia.setBounds(21, 242, 134, 13);
		panel.add(lblCpfParaTransferncia);

		JButton buttonVoltar = new JButton("");
		buttonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				PaginaLogin pl = new PaginaLogin();
				pl.setLocationRelativeTo(pl);
				pl.setVisible(true);
			}
		});
		buttonVoltar
				.setIcon(new ImageIcon(TransacoesBancarias.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
		buttonVoltar.setBounds(11, 439, 47, 34);
		contentPane.add(buttonVoltar);

		JButton buttonContinuar = new JButton("");
		buttonContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String saque = textSaque.getText();
				String deposito = textDeposito.getText();
				String transferencia = textTransferencia.getText();
				String numConta = textNumConta.getText();

				String selectedTransacao = comboBox.getSelectedItem().toString();

				if (selectedTransacao.equals(TransacoesEnum.SAQUE.getTipoTransferencia())) {
					if (conta.sacar(Double.parseDouble(saque))) {
						JOptionPane.showMessageDialog(buttonContinuar, "Saque feito com sucesso!");
					} else {
						JOptionPane.showMessageDialog(buttonContinuar, "Não pôde ser feito o saque.");
					}
				} else if (selectedTransacao.equals(TransacoesEnum.DEPOSITO.getTipoTransferencia())) {
					conta.depositar(Double.parseDouble(deposito));
					JOptionPane.showMessageDialog(buttonContinuar, "Depósito feito com sucesso!");
				} else if (selectedTransacao.equals(TransacoesEnum.TRANSFERENCIA.getTipoTransferencia())) {
					String destinoConta = JOptionPane.showInputDialog("Informe o número da conta de destino:");
					Conta contaDestino = Conta.mapaContas.get(destinoConta);
					if (contaDestino == null) {
						JOptionPane.showMessageDialog(buttonContinuar, "Conta de destino não encontrada.");
					} else {
						if (conta.transferir(Double.parseDouble(transferencia), contaDestino)) {
							JOptionPane.showMessageDialog(buttonContinuar, "Transferência feita com sucesso!");
						} else {
							JOptionPane.showMessageDialog(buttonContinuar, "Não foi possível efetuar a Transferência.");
						}
					}
				}
			}
		});
		buttonContinuar.setIcon(new ImageIcon(TransacoesBancarias.class.getResource("/br/com/poo/imagens/1.png")));
		buttonContinuar.setBounds(373, 445, 40, 34);
		contentPane.add(buttonContinuar);

		JButton BotaoContaCorrente = new JButton("Conta Corrente");
		BotaoContaCorrente.setForeground(Color.WHITE);
		BotaoContaCorrente.setBackground(Color.BLACK);
		BotaoContaCorrente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ContaCorrente cc = ((ContaCorrente) conta);
					dispose();
					MenuCorrente mc = new MenuCorrente(cc, c);
					mc.setLocationRelativeTo(mc);
					mc.setVisible(true);
				} catch (java.lang.ClassCastException exc) {

					JOptionPane.showMessageDialog(BotaoContaCorrente, "Você não possui conta corrente! ");
					exc.printStackTrace();
				}
			}
		});
		BotaoContaCorrente.setBounds(143, 450, 126, 23);
		contentPane.add(BotaoContaCorrente);

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
		BotaoContaPoupanca.setBounds(143, 502, 126, 23);
		contentPane.add(BotaoContaPoupanca);
	}

}
