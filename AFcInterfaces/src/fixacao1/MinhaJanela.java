package fixacao1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class MinhaJanela extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldValRaio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MinhaJanela frame = new MinhaJanela();
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
	public MinhaJanela() {
		setTitle("Calculando a Área de um Círculo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 370, 150);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelRaio = new JLabel("Raio");
		labelRaio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelRaio.setBounds(10, 11, 46, 14);
		contentPane.add(labelRaio);
		
		fieldValRaio = new JTextField();
		fieldValRaio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fieldValRaio.setBounds(44, 10, 86, 20);
		contentPane.add(fieldValRaio);
		fieldValRaio.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular área do círculo");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 77, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel labelResultado = new JLabel("");
		labelResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelResultado.setBounds(256, 52, 46, 14);
		contentPane.add(labelResultado);
	}

	
}
