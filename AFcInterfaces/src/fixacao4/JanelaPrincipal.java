package fixacao4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JanelaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCPFCad;
	private JTextField textNomeCad;
	private JTextField textFieldCad;
	private JTextField textCPFCons;
	private JTextField textNomeCons;
	private JTextField textEnderecoCons;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle("Janela Principal");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuJanelaPrinc = new JMenuBar();
		setJMenuBar(menuJanelaPrinc);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuJanelaPrinc.add(menuArquivo);
		
		JMenuItem menuItemCad = new JMenuItem("Cadastrar");
		menuArquivo.add(menuItemCad);
		menuItemCad.addActionListener(this);
		
		JMenuItem menuItemCons = new JMenuItem("Consultar");
		menuArquivo.add(menuItemCons);
		menuItemCons.addActionListener(this);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelCadastro = new JPanel();
		contentPane.add(panelCadastro, "telaCadastro");
		panelCadastro.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTelaCad = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelTelaCad.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelCadastro.add(panelTelaCad, BorderLayout.NORTH);
		
		JLabel lblTelaCad = new JLabel("TELA DE CADASTRO");
		lblTelaCad.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelTelaCad.add(lblTelaCad);
		
		JPanel panelBotoesCad = new JPanel();
		FlowLayout fl_panelBotoesCad = (FlowLayout) panelBotoesCad.getLayout();
		fl_panelBotoesCad.setAlignment(FlowLayout.LEFT);
		panelCadastro.add(panelBotoesCad, BorderLayout.SOUTH);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		panelBotoesCad.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Limpar");
		panelBotoesCad.add(btnLimpar);
		
		JPanel panelEntradaCad = new JPanel();
		FlowLayout fl_panelEntradaCad = (FlowLayout) panelEntradaCad.getLayout();
		fl_panelEntradaCad.setAlignment(FlowLayout.LEFT);
		panelCadastro.add(panelEntradaCad, BorderLayout.CENTER);
		
		JLabel lblCPFCad = new JLabel("CPF");
		panelEntradaCad.add(lblCPFCad);
		
		textCPFCad = new JTextField();
		panelEntradaCad.add(textCPFCad);
		textCPFCad.setColumns(10);
		
		JLabel lblNomeCad = new JLabel("Nome");
		panelEntradaCad.add(lblNomeCad);
		
		textNomeCad = new JTextField();
		panelEntradaCad.add(textNomeCad);
		textNomeCad.setColumns(17);
		
		JLabel lblEnderecoCad = new JLabel("Endereço");
		panelEntradaCad.add(lblEnderecoCad);
		
		textFieldCad = new JTextField();
		panelEntradaCad.add(textFieldCad);
		textFieldCad.setColumns(10);
		
		JPanel panelConsulta = new JPanel();
		contentPane.add(panelConsulta, "telaConsulta");
		panelConsulta.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTelaCons = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelTelaCons.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelConsulta.add(panelTelaCons, BorderLayout.NORTH);
		
		JLabel lblTelaCons = new JLabel("TELA DE CONSULTA");
		lblTelaCons.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelTelaCons.add(lblTelaCons);
		
		JPanel panelBotoesCons = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panelBotoesCons.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panelConsulta.add(panelBotoesCons, BorderLayout.SOUTH);
		
		JButton btnConsultar = new JButton("Consultar");
		panelBotoesCons.add(btnConsultar);
		
		JButton btnLimparCons = new JButton("Limpar");
		panelBotoesCons.add(btnLimparCons);
		
		JPanel panelEntradaCons = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panelEntradaCons.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panelConsulta.add(panelEntradaCons, BorderLayout.CENTER);
		
		JLabel lblCPFCons = new JLabel("CPF");
		panelEntradaCons.add(lblCPFCons);
		
		textCPFCons = new JTextField();
		panelEntradaCons.add(textCPFCons);
		textCPFCons.setColumns(10);
		
		JLabel lblNomeCons = new JLabel("Nome");
		panelEntradaCons.add(lblNomeCons);
		
		textNomeCons = new JTextField();
		textNomeCons.setEditable(false);
		panelEntradaCons.add(textNomeCons);
		textNomeCons.setColumns(10);
		
		JLabel lblEnderecoCons = new JLabel("Endereço");
		panelEntradaCons.add(lblEnderecoCons);
		
		textEnderecoCons = new JTextField();
		textEnderecoCons.setEditable(false);
		panelEntradaCons.add(textEnderecoCons);
		textEnderecoCons.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		CardLayout card = (CardLayout)contentPane.getLayout(); 
		if(e.getActionCommand().equals("Cadastrar"))
		{
			card.show(contentPane, "telaCadastro");
		}
		else if (e.getActionCommand().equals("Consultar"))
		{
			card.show(contentPane, "telaConsulta");
		}
		
	}

}
