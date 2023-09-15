package br.com.poo.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class TelaCarregamento extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

   

    public TelaCarregamento() {
        setTitle("DÉ BANK");
        setIconImage(Toolkit.getDefaultToolkit().getImage(TelaCarregamento.class.getResource("/br/com/poo/imagens/100x100.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 536);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel gokuCorrendo = new JLabel("");
        gokuCorrendo.setIcon(new ImageIcon(TelaCarregamento.class.getResource("/br/com/poo/imagens/300x300.gif")));
        gokuCorrendo.setBounds(64, 98, 300, 334);
        contentPane.add(gokuCorrendo);

        JPanel panel = new JPanel();
        panel.setBounds(0, 433, 434, 64);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Carregando...");
        lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 20));
        lblNewLabel.setBounds(178, 11, 100, 36);
        panel.add(lblNewLabel);

        Timer timer = new Timer(25000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaDeLogin();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void abrirTelaDeLogin() {
        dispose(); // Fecha a tela de carregamento
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PaginaLogin frame = new PaginaLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}