package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Aluno {

	protected int posicaox;
	protected int posicaoy;
	protected int quantAluno;
	Plano p;
	Random random = new Random();
	protected ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

	public Aluno(int quantAluno) {
		super();
		this.quantAluno = quantAluno;
//		if (quantAluno <= p.listaDeCelulas.size() / 2) {
//			this.quantAluno = quantAluno;
//		}
//		this.p = p;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getPosicaoxAluno() {
		return posicaox;
	}

	public int getPosicaoyAluno() {
		return posicaoy;
	}

	public void sortearPosicaoAlunos(int numAlunos) {
		for (int i = 0; i < numAlunos; i++) {
			int posX = random.nextInt(p.getTamanhoX()) + 1;
			int posY = random.nextInt(p.getTamanhoY()) + 1;

			Aluno aluno = new Aluno(numAlunos);
			posicaox = posX;
			posicaoy = posY;
			listaDeAlunos.add(aluno);

			Celula celula = p.retornarCelula(posX, posY);
			celula.setAluno(aluno);
		}
	}

	public void encontrouAluno(Robo r, Plano p) {
		int x = r.getPosicaox();
		int y = r.getPosicaoy();
		Celula c = p.retornarCelula(x, y);
		if (c.possuiAluno()) {
			quantAluno--;
		}
	}

}
