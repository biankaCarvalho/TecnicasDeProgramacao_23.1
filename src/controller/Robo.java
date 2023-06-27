package controller;

import javax.swing.JButton;

import view.PainelBotoes;

public class Robo {

	// todos os robos comecam na posicao X = 1 e Y = 1

	protected String nome;
	protected int posicaox = 1;
	protected int posicaoy = 1;
	protected int id;
	protected int pontos = 0;
	protected PainelBotoes pb;
	protected JButton botao;
	protected Partida p;

	public Robo(int id, String nome, Plano plano) {
		this.id = id;
		this.nome = nome;

		Celula aux = null;
		for (int i = 0; i < plano.listaDeCelulas.size(); i++) {
			aux = plano.listaDeCelulas.get(i);
			if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
				aux.robo = this;
			}
		}
	}
	
	public void setBotao(JButton botao) {
        this.botao = botao;
    }

	public Robo() {
		// TODO Auto-generated constructor stub
	}
	
	public void moverParaPosicao(int linha, int coluna) {
		 posicaox = linha;
		 posicaoy = coluna;
		 
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getPosicaox() {
		return posicaox;
	}

	public int getPosicaoy() {
		return posicaoy;
	}
	
	public void pegouAluno(Aluno a) {
		pontos += 10;
		a.encontrouAluno(this);
	}

	public void pegouBug(Bug b) {
		pontos -= 15;
		b.encontrouBug(this);
	}
		
	public int getPontos() {
		return pontos;
	}
	
	
}
