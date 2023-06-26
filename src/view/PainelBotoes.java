package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Celula;

public class PainelBotoes extends JPanel {
	
	Celula c;
	
	public PainelBotoes() {

		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.lightGray);
		setLayout(new GridLayout(8, 8));
		int id = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				c = new Celula(id, i, i);
				criarBotoesTabuleiro();
			}
			id++;
		}
		setVisible(true);
	}

	public JButton criarBotoesTabuleiro() {
		JButton botao = new JButton();
		botao.setBackground(Color.pink);
		botao.addActionListener(new AdicionarRoboNoTabuleiro());
		this.add(botao);

		return botao;
	}
}

class AdicionarRoboNoTabuleiro implements ActionListener {

	private JButton[][] botoesDoMapa;
	Celula c;
	
	public void actionPerformed(ActionEvent e) {
		this.botoesDoMapa = new JButton[8][8];
		JButton botao = (JButton) e.getSource();
		botao.setIcon(BotoesRobos.selecionarRobo.getIcon());
		for (int i = 0; i < botoesDoMapa.length; i++) {
			for (int j = 0; j < botoesDoMapa[i].length; j++) {
				c = new Celula(i, j);
				if (botao == botoesDoMapa[i][j]) {
					if (BotoesRobos.selecionarRobo != null) {
						botao.setIcon(BotoesRobos.selecionarRobo.getIcon());
						botao.setBackground(Color.decode("#051923"));

						if (c.possuiAluno()) {
							botao.setBackground(Color.decode("#588157"));

						} else if (c.possuiBug()) {
							botao.setBackground(Color.decode("#d90429"));
						}
						//PainelControle.atualizarPontos(pontuacao);

					}
				}
			}
		}
	}
}
