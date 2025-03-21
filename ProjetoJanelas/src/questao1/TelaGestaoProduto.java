package questao1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaGestaoProduto extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldCod;
	private JTextField fieldProd;
	private JTextField fieldQuant;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGestaoProduto frame = new TelaGestaoProduto();
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
	public TelaGestaoProduto() {
		setTitle("Tela de Gestão de Produtos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 568, 277);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem menuItemCadProd = new JMenuItem("Cadastra Produto");
		menuArquivo.add(menuItemCadProd);
		menuItemCadProd.addActionListener(this);
		
		JMenuItem menuItemConsProdut = new JMenuItem("Consulta Produto");
		menuArquivo.add(menuItemConsProdut);
		
		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuArquivo.add(menuItemSair);
		menuItemSair.addActionListener(this);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panelVazio = new JPanel();
		contentPane.add(panelVazio, "vazio");
		
		JPanel panelTelaCadastro = new JPanel();
		contentPane.add(panelTelaCadastro, "telaCadastro");
		panelTelaCadastro.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTela = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelTela.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelTelaCadastro.add(panelTela, BorderLayout.NORTH);
		
		JLabel labelTelaCad = new JLabel("TELA DE CADASTRO");
		labelTelaCad.setFont(new Font("Segoe UI", Font.BOLD, 18));
		panelTela.add(labelTelaCad);
		
		JPanel panelBotoes = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelBotoes.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelTelaCadastro.add(panelBotoes, BorderLayout.SOUTH);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelBotoes.add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelBotoes.add(btnEditar);
		
		JButton btnExibir = new JButton("Exibir");
		btnExibir.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelBotoes.add(btnExibir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelBotoes.add(btnSair);
		
		JPanel panelEntrad = new JPanel();
		panelTelaCadastro.add(panelEntrad, BorderLayout.CENTER);
		panelEntrad.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCod = new JLabel("Código");
		lblCod.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelEntrad.add(lblCod);
		
		fieldCod = new JTextField();
		fieldCod.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelEntrad.add(fieldCod);
		fieldCod.setColumns(10);
		
		JLabel lblProd = new JLabel("Produto");
		lblProd.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelEntrad.add(lblProd);
		
		fieldProd = new JTextField();
		fieldProd.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelEntrad.add(fieldProd);
		fieldProd.setColumns(10);
		
		JLabel lblQuant = new JLabel("Quantidade");
		lblQuant.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelEntrad.add(lblQuant);
		
		fieldQuant = new JTextField();
		fieldQuant.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelEntrad.add(fieldQuant);
		fieldQuant.setColumns(10);
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelEntrad.add(lblPreco);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelEntrad.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		panelEntrad.add(lblFornecedor);
		
		JComboBox comboMarcas = new JComboBox();
		panelEntrad.add(comboMarcas);
		comboMarcas.addItem("");
		comboMarcas.addItem("Apple");
		comboMarcas.addItem("Samsung");
		comboMarcas.addItem("Dell");
		comboMarcas.addItem("HP");
}



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	CardLayout card = (CardLayout) contentPane.getLayout();
	//referencia do card
	//retornar o gerenciador
	if(e.getActionCommand().equals("Sair"))
	{
		card.show(contentPane, "vazio");
	}
	else if(e.getActionCommand().equals("Cadastra Produto"))
	{
		card.show(contentPane, "telaCadastro");
	}
}


}

