package questao2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class JanelaCotacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDia;
	private JTextField textMoeda;
	private JTextField textCotacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCotacao frame = new JanelaCotacao();
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
	public JanelaCotacao() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotao = new JPanel();
		panelBotao.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		FlowLayout flowLayout = (FlowLayout) panelBotao.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelBotao, BorderLayout.SOUTH);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Segoe UI", Font.BOLD, 13));
		panelBotao.add(btnConsultar);
		
		JPanel panelEntrada = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelEntrada.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelEntrada.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panelEntrada, BorderLayout.CENTER);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Segoe UI", Font.BOLD, 13));
		panelEntrada.add(lblDia);
		
		textDia = new JTextField();
		textDia.setFont(new Font("Segoe UI", Font.BOLD, 13));
		panelEntrada.add(textDia);
		textDia.setColumns(20);
		
		JLabel lblMoeda = new JLabel("Moeda");
		lblMoeda.setFont(new Font("Segoe UI", Font.BOLD, 13));
		panelEntrada.add(lblMoeda);
		
		textMoeda = new JTextField();
		textMoeda.setFont(new Font("Segoe UI", Font.BOLD, 13));
		panelEntrada.add(textMoeda);
		textMoeda.setColumns(20);
		
		JLabel lblCotacao = new JLabel("Cotação");
		lblCotacao.setFont(new Font("Segoe UI", Font.BOLD, 13));
		panelEntrada.add(lblCotacao);
		
		textCotacao = new JTextField();
		textCotacao.setFont(new Font("Segoe UI", Font.BOLD, 13));
		panelEntrada.add(textCotacao);
		textCotacao.setColumns(20);
	}

}
