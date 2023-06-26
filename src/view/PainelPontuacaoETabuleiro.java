package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.border.Border;

public class PainelPontuacaoETabuleiro extends JPanel{
	
	PainelPontuacao pontuacao;
	PainelBotoes tabuleiro;
	
	public PainelPontuacaoETabuleiro() {
		pontuacao = new PainelPontuacao();
		tabuleiro = new PainelBotoes();
		
		
		this.setLayout(new BorderLayout());
		this.add(pontuacao, BorderLayout.EAST);
		this.add(tabuleiro, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
