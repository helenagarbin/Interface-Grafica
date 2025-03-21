package fixacao2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class JanelaCalculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCalculadora frame = new JanelaCalculadora();
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
	public JanelaCalculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelResultado = new JPanel();
		contentPane.add(panelResultado, BorderLayout.NORTH);
		
		fieldResultado = new JTextField();
		fieldResultado.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panelResultado.add(fieldResultado);
		fieldResultado.setColumns(30);
		
		JPanel panelCalcula = new JPanel();
		FlowLayout fl_panelCalcula = (FlowLayout) panelCalcula.getLayout();
		fl_panelCalcula.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelCalcula, BorderLayout.SOUTH);
		
		JButton buttonCalcular = new JButton("Calcular");
		panelCalcula.add(buttonCalcular);
		
		JPanel panelNumeros = new JPanel();
		contentPane.add(panelNumeros, BorderLayout.CENTER);
		panelNumeros.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton button1 = new JButton("1");
		panelNumeros.add(button1);
		
		JButton button2 = new JButton("2");
		panelNumeros.add(button2);
		
		JButton button3 = new JButton("3");
		panelNumeros.add(button3);
		
		JButton buttonMais = new JButton("+");
		panelNumeros.add(buttonMais);
		
		JButton button4 = new JButton("4");
		panelNumeros.add(button4);
		
		JButton button5 = new JButton("5");
		panelNumeros.add(button5);
		
		JButton button6 = new JButton("6");
		panelNumeros.add(button6);
		
		JButton buttonMenos = new JButton("-");
		panelNumeros.add(buttonMenos);
		
		JButton button7 = new JButton("7");
		panelNumeros.add(button7);
		
		JButton button8 = new JButton("8");
		panelNumeros.add(button8);
		
		JButton button9 = new JButton("9");
		panelNumeros.add(button9);
		
		JButton buttonDivisao = new JButton("/");
		panelNumeros.add(buttonDivisao);
		
		JButton buttonZero = new JButton("0");
		panelNumeros.add(buttonZero);
		
		JButton buttonElevado = new JButton("^");
		panelNumeros.add(buttonElevado);
		
		JButton buttonC = new JButton("C");
		panelNumeros.add(buttonC);
		
		JButton buttonCE = new JButton("CE");
		panelNumeros.add(buttonCE);
	}

}
