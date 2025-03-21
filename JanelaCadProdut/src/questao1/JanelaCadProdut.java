package questao1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class JanelaCadProdut extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCod;
	private JTextField textField;
	private JTextField textPeso;
	private JTextField textPrecoCompra;
	private JTextField textPrecoVenda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadProdut frame = new JanelaCadProdut();
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
	public JanelaCadProdut() {
		setTitle("Gestão De Estoque");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTela = new JPanel();
		panel.add(panelTela, BorderLayout.NORTH);
		
		JLabel lblCadProdut = new JLabel("Cadastro de Produto");
		lblCadProdut.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelTela.add(lblCadProdut);
		
		JPanel panelObservacao = new JPanel();
		panel.add(panelObservacao, BorderLayout.SOUTH);
		panelObservacao.setLayout(new BorderLayout(0, 0));
		
		JLabel lblObs = new JLabel("Observação");
		panelObservacao.add(lblObs, BorderLayout.NORTH);
		
		JTextArea textAreaObs = new JTextArea();
		textAreaObs.setRows(10);
		panelObservacao.add(textAreaObs, BorderLayout.SOUTH);
		
		JPanel panelEntrada = new JPanel();
		FlowLayout fl_panelEntrada = (FlowLayout) panelEntrada.getLayout();
		fl_panelEntrada.setVgap(10);
		fl_panelEntrada.setAlignment(FlowLayout.LEFT);
		panel.add(panelEntrada, BorderLayout.CENTER);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(lblCodigo);
		
		textCod = new JTextField();
		textCod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(textCod);
		textCod.setColumns(10);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(lblProduto);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(textField);
		textField.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(lblPeso);
		
		textPeso = new JTextField();
		textPeso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblPrecoCompra = new JLabel("Preço de Compra");
		lblPrecoCompra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(lblPrecoCompra);
		
		textPrecoCompra = new JTextField();
		textPrecoCompra.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(textPrecoCompra);
		textPrecoCompra.setColumns(10);
		
		JLabel lblPrecoVend = new JLabel("Preço de Venda");
		lblPrecoVend.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(lblPrecoVend);
		
		textPrecoVenda = new JTextField();
		textPrecoVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(textPrecoVenda);
		textPrecoVenda.setColumns(10);
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(lblFornecedor);
		
		JComboBox comboFornec = new JComboBox();
		comboFornec.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelEntrada.add(comboFornec);
		comboFornec.addItem("");
		comboFornec.addItem("Nacional");
		comboFornec.addItem("Importado");
	}

}
