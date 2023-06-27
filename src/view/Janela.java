package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
	
	protected PainelPontuacaoETabuleiro pontTabu;
	protected PainelRelatorio relatorio;
	protected PainelOpcoes opcoes;
	
	public Janela() {
		
		setTitle("Jogo Ilha Java");
		
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
		setLocationRelativeTo(null);
		opcoes = new PainelOpcoes(this);
		pontTabu = new PainelPontuacaoETabuleiro();
		relatorio = new PainelRelatorio();
		
		this.setLayout(new BorderLayout());
		pontTabu.setVisible(false);
		relatorio.setVisible(false);
		this.add(opcoes, BorderLayout.NORTH);
		this.add(pontTabu, BorderLayout.CENTER);
				
		setVisible(true);
	}
	
}
