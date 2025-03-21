package fixacao3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldUsuario;
	private JTextField fieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaLogin frame = new JanelaLogin();
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
	public JanelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 252);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelDadosPessoais = new JPanel();
		panelDadosPessoais.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelDadosPessoais.setBackground(Color.PINK);
		contentPane.add(panelDadosPessoais, BorderLayout.CENTER);
		panelDadosPessoais.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel labelUsuario = new JLabel("Usuário");
		labelUsuario.setFont(new Font("Tahoma", Font.BOLD, 25));
		panelDadosPessoais.add(labelUsuario);
		
		fieldUsuario = new JTextField();
		panelDadosPessoais.add(fieldUsuario);
		fieldUsuario.setColumns(15);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setFont(new Font("Tahoma", Font.BOLD, 25));
		panelDadosPessoais.add(labelSenha);
		
		fieldSenha = new JTextField();
		panelDadosPessoais.add(fieldSenha);
		fieldSenha.setColumns(15);
		
		JPanel panelBotoes = new JPanel();
		panelBotoes.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelBotoes.setBackground(Color.PINK);
		contentPane.add(panelBotoes, BorderLayout.SOUTH);
		
		JButton btnAutenticar = new JButton("Autenticar");
		btnAutenticar.addActionListener(new ActionListener() {
			//autenticar o login
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelBotoes.add(btnAutenticar);
		
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fieldUsuario.setText("");
				fieldSenha.setText("");
			}
		});
		panelBotoes.add(btnLimpar);
	}


}
