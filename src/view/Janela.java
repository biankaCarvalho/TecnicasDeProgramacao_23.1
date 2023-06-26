package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
	
	PainelPontuacaoETabuleiro pontTabu;
	
	public Janela() {
		
		setTitle("Jogo Ilha Java");
		
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
		setLocationRelativeTo(null);
		PainelOpcoes opcoes = new PainelOpcoes();
		pontTabu = new PainelPontuacaoETabuleiro();
		
		this.setLayout(new BorderLayout());
		
		this.add(opcoes, BorderLayout.NORTH);
		this.add(pontTabu, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
}
