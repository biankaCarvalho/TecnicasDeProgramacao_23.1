package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PainelRelatorio extends JPanel{
	
//	public PainelRelatorio() {
//		setPreferredSize(new Dimension(400,400));
//		setBackground(Color.lightGray);
//		setLayout(new GridLayout(1,9));
//		this.add(criarPainel("Jogador"));
//		this.add(criarPainel("Quant Jogadas"));
//		this.add(criarPainel("Celulas Vazias"));
//		this.add(criarPainel("Pontuação"));
//		this.add(criarPainel("Alunos Resgatados"));
//		this.add(criarPainel("Bugs Encontrados"));
//		this.add(criarPainel("Espião"));
//		this.add(criarPainel("Cantor"));
//		this.add(criarPainel("Mecanico"));
//		
//		setVisible(false);
//	}
//	
//	public JPanel criarPainel(String dado) {
//		JPanel painel = new JPanel();
//		painel.setBackground(Color.white);
//		painel.setLayout(new GridLayout(2,1));
//		JLabel qualDado = new JLabel(dado); 
//		painel.add(qualDado);
//		return painel;
//	}
	
	JPanel painelFundo;
	private JTable tabela;
	private JScrollPane barraRolagem;

	public PainelRelatorio() {

		painelFundo = new JPanel();
		painelFundo.setLayout(new GridLayout(1, 1));
		tabela = new JTable(dados, colunas);
		barraRolagem = new JScrollPane(tabela);
		painelFundo.add(barraRolagem);

		this.add(painelFundo);
	}

	Object[][] dados = { { "Ana Monteiro", "080.080.080-80", "2222", "Computacao" },

	};

	String[] colunas = { "Nome", "CPF", "Matr�cula", "Vertente" };

}


