package br.com.poo.views;


import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import br.com.poo.banco.enums.PessoasEnum;
import br.com.poo.banco.io.LeituraEscrita;
import br.com.poo.banco.pessoas.Cliente;

public class JCadastroCliente extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textNome;
    private JTextField textCpf;
    private JTextField textContato;
    private JTextField textEndereco;
    private JPasswordField textSenha;
    private JPasswordField textConfSenha;

  

    public JCadastroCliente() {
        setTitle("DéBank");
        setIconImage(Toolkit.getDefaultToolkit().getImage(JCadastroCliente.class.getResource("/br/com/poo/imagens/50x50.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 556, 445);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
        contentPane.setForeground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("CADASTRO DE CLIENTE");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(185, 26, 221, 25);
        contentPane.add(lblNewLabel);

        textNome = new JTextField();
        textNome.setBounds(182, 112, 224, 19);
        contentPane.add(textNome);
        textNome.setColumns(10);

        textCpf = new JTextField();
        textCpf.setColumns(10);
        textCpf.setBounds(182, 152, 224, 19);
        contentPane.add(textCpf);

        textContato = new JTextField();
        textContato.setColumns(10);
        textContato.setBounds(182, 192, 224, 19);
        contentPane.add(textContato);

        textEndereco = new JTextField();
        textEndereco.setColumns(10);
        textEndereco.setBounds(182, 233, 224, 19);
        contentPane.add(textEndereco);

        textSenha = new JPasswordField();
        textSenha.setBounds(182, 269, 224, 19);
        contentPane.add(textSenha);

        textConfSenha = new JPasswordField();
        textConfSenha.setBounds(182, 310, 224, 19);
        contentPane.add(textConfSenha);

        JLabel lblNewLabel_1 = new JLabel("NOME:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(65, 113, 59, 13);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("CPF: ");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(65, 153, 59, 13);
        contentPane.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("SENHA:");
        lblNewLabel_1_2.setForeground(Color.WHITE);
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_2.setBounds(65, 270, 59, 13);
        contentPane.add(lblNewLabel_1_2);

        JLabel lblNewLabel_1_3 = new JLabel("CONFIRMAR SENHA:");
        lblNewLabel_1_3.setForeground(Color.WHITE);
        lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1_3.setBounds(65, 312, 128, 13);
        contentPane.add(lblNewLabel_1_3);

        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Corrente", "Poupança"}));
        comboBox.setBounds(295, 69, 85, 21);
        contentPane.add(comboBox);

        JButton buttonContinuar = new JButton("");
        buttonContinuar.setIcon(new ImageIcon(JCadastroCliente.class.getResource("/br/com/poo/imagens/Design sem nome.png")));
        buttonContinuar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText();
                String cpf = textCpf.getText();
                String telefone = textContato.getText();
                String endereco = textEndereco.getText();
                String senha = new String(textSenha.getPassword());
                String confSenha = new String(textConfSenha.getPassword());

                if (nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || endereco.isEmpty() || senha.isEmpty() || confSenha.isEmpty()) {
                    JOptionPane.showMessageDialog(buttonContinuar, "Preencha todos os campos.");
                } else if (!senha.equals(confSenha)) {
                    JOptionPane.showMessageDialog(buttonContinuar, "As senhas não coincidem.");
                } else { 
                	LeituraEscrita.cadastrarCliente("banco", nome, cpf, telefone, endereco, senha, confSenha, buttonContinuar);
                    Cliente novoCliente = new Cliente(PessoasEnum.CLIENTE.getTipoPessoas(),nome, cpf, telefone, endereco, senha);
                    // Aqui você precisa adicionar o novo cliente ao seu banco de dados ou onde quer que esteja mantendo a lista de clientes.
                    // Exemplo: Cliente.mapaClientes.put(cpf, novoCliente);
                    JOptionPane.showMessageDialog(buttonContinuar, "Cliente cadastrado com sucesso!");
                }
            }
        });
        buttonContinuar.setBackground(UIManager.getColor("Button.shadow"));
        buttonContinuar.setBounds(430, 346, 50, 50);
        contentPane.add(buttonContinuar);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon(JCadastroCliente.class.getResource("/br/com/poo/imagens/100x100.png")));
        lblNewLabel_2.setBounds(10, 15, 85, 55);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_1_4 = new JLabel("TELEFONE:");
        lblNewLabel_1_4.setForeground(Color.WHITE);
        lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_4.setBounds(65, 193, 85, 13);
        contentPane.add(lblNewLabel_1_4);

        JLabel lblNewLabel_1_1_1 = new JLabel("ENDEREÇO:");
        lblNewLabel_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1_1.setBounds(65, 234, 85, 13);
        contentPane.add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_3 = new JLabel("Tipo Conta");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_3.setForeground(new Color(255, 255, 255));
        lblNewLabel_3.setBounds(216, 72, 69, 13);
        contentPane.add(lblNewLabel_3);

        JButton buttonVoltar = new JButton("");
        buttonVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        buttonVoltar.setIcon(new ImageIcon(JCadastroCliente.class.getResource("/br/com/poo/imagens/Voltar50x50.png")));
        buttonVoltar.setBounds(23, 346, 50, 50);
        contentPane.add(buttonVoltar);
    }
}
