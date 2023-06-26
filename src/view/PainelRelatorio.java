package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelRelatorio extends JPanel{
	
	public PainelRelatorio() {
		setPreferredSize(new Dimension(400,400));
		setBackground(Color.lightGray);
		setLayout(new GridLayout(1,9));
		criarPainel("Jogador");
		criarPainel("Quant Jogadas");
		criarPainel("Celulas Vazias");
		criarPainel("Pontuação");
		criarPainel("Alunos Resgatados");
		criarPainel("Bugs Encontrados");
		criarPainel("Espião");
		criarPainel("Cantor");
		criarPainel("Mecanico");
		setVisible(false);
	}
	
	public JPanel criarPainel(String dado) {
		JPanel painel = new JPanel();
		painel.setBackground(Color.white);
		painel.setLayout(new GridLayout(2,1));
		JLabel qualDado = new JLabel(dado); 
		painel.add(qualDado);
		return painel;
	}
}
