package controller;


public class Robo {

	// todos os robos comecam na posicao X = 1 e Y = 1

	protected String nome;
	protected int posicaox = 1;
	protected int posicaoy = 1;
	protected int id;
	protected int pontos = 0;
	Plano plano;
	Partida p;

	public Robo(int id, String nome, Plano plano) {
		this.id = id;
		this.nome = nome;
		this.plano = plano;

		Celula aux = null;
		for (int i = 0; i < plano.listaDeCelulas.size(); i++) {
			aux = plano.listaDeCelulas.get(i);
			if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
				aux.robo = this;
			}
		}
	}
	
	public Robo() {
		// TODO Auto-generated constructor stub
	}

//	public boolean verificarLimites() {
//	    int tamanhox = plano.getTamanhoX();
//	    int tamanhoy = plano.getTamanhoY();
//
//
//	    // verificar se a posição atual do robô está dentro dos limites do plano
//	    if (posicaox >= 0 && posicaox < tamanhox && posicaoy >= 0 && posicaoy < tamanhoy) {
//	        return true; // posição válida
//	    } else {
//	        return false; // posição inválida
//	    }
//	}

	
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

	public void avancar(int numCelulas) {
		posicaox++;
	}

	public void retroceder(int numCelulas) {
		posicaox++;
	}
	
	public void pegouAluno(Aluno a) {
		pontos += 10;
		a.encontrouAluno(this, plano);
	}

	public void pegouBug(Bug b) {
		pontos -= 15;
		b.encontrouBug(this, plano);
	}
		
	public int getPontos() {
		return pontos;
	}
	
	
}
