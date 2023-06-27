package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Celula;
import controller.Robo;

public class PainelBotoes extends JPanel implements ActionListener {

	protected ArrayList<Celula> listaCelulas;

	public PainelBotoes() {

		setPreferredSize(new Dimension(400, 400));
		setBackground(Color.lightGray);
		setLayout(new GridLayout(8, 8));
		listaCelulas = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				criarBotoesTabuleiro();
				Celula c = new Celula(i, j);
				listaCelulas.add(c);
			}
		}
		setVisible(true);
	}

	public JButton criarBotoesTabuleiro() {
		JButton botao = new JButton();
		botao.setBackground(Color.pink);
		botao.addActionListener(this);
		this.add(botao);

		return botao;
	}
	
	public void actionPerformed(ActionEvent e) {
	    Robo roboSelecionado = BotoesRobos.getRoboSelecionado();
	    if (roboSelecionado != null) {
	        JButton botaoClicado = (JButton) e.getSource();
	        int index = this.getComponentZOrder(botaoClicado); // Obtém o índice do botão clicado no painel
	        Celula celulaClicada = listaCelulas.get(index); // Obtém a célula correspondente ao botão clicado

	        int linhaClicada = celulaClicada.getPosicaoX();
	        int colunaClicada = celulaClicada.getPosicaoY();
	        BotoesRobos br = new BotoesRobos();
	        roboSelecionado.moverParaPosicao(linhaClicada, colunaClicada);
	        botaoClicado = br.botaoClicadoNoTabu;
	        br.actionPerformed(e);
	    }
	}

}
