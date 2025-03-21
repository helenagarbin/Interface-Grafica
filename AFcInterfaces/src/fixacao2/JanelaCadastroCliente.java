package fixacao2;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastroCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fieldCPF;
	private JTextField fieldNome;
	private JTextField fieldEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCadastroCliente frame = new JanelaCadastroCliente();
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
	public JanelaCadastroCliente() {
		setTitle("Janela de Cadastro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 181);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panelDadosPessoais = new JPanel();
		FlowLayout fl_panelDadosPessoais = (FlowLayout) panelDadosPessoais.getLayout();
		fl_panelDadosPessoais.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelDadosPessoais);
		
		JLabel labelCPF = new JLabel("CPF");
		panelDadosPessoais.add(labelCPF);
		
		fieldCPF = new JTextField();
		panelDadosPessoais.add(fieldCPF);
		fieldCPF.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		panelDadosPessoais.add(labelNome);
		
		fieldNome = new JTextField();
		panelDadosPessoais.add(fieldNome);
		fieldNome.setColumns(20);
		
		JPanel panelEndProfi = new JPanel();
		FlowLayout fl_panelEndProfi = (FlowLayout) panelEndProfi.getLayout();
		fl_panelEndProfi.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelEndProfi);
		
		JLabel labelEndereco = new JLabel("Endereço");
		panelEndProfi.add(labelEndereco);
		
		fieldEndereco = new JTextField();
		panelEndProfi.add(fieldEndereco);
		fieldEndereco.setColumns(10);
		
		JLabel Profissão = new JLabel("Profissão");
		panelEndProfi.add(Profissão);
		
		JComboBox boxProfissoes = new JComboBox();
		panelEndProfi.add(boxProfissoes);
		boxProfissoes.setPreferredSize(new Dimension(122, 24)); 
		boxProfissoes.addItem("");
		boxProfissoes.addItem("Professor(a)");
		boxProfissoes.addItem("Engenheiro(a)");
		boxProfissoes.addItem("Escritor(a)");
		
		JPanel panelBotoes = new JPanel();
		FlowLayout fl_panelBotoes = (FlowLayout) panelBotoes.getLayout();
		fl_panelBotoes.setAlignment(FlowLayout.LEFT);
		contentPane.add(panelBotoes);
		
		JButton buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("CPF: " +fieldCPF.getText());
				System.out.println("Nome: " +fieldCPF.getText());
				System.out.println("Endereço: " +fieldEndereco.getText());
				System.out.println("Profissão: " +boxProfissoes.getSelectedItem());
				System.out.println("Cadastrado com sucesso!");
			}
		});
		panelBotoes.add(buttonCadastrar);
		
		JButton buttonLimpar = new JButton("Limpar");
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fieldCPF.setText(""); 
				fieldNome.setText("");
				fieldEndereco.setText(""); 
				boxProfissoes.setSelectedIndex(0);
			}
		});
		panelBotoes.add(buttonLimpar);
		
	}

}
	

