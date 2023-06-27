package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class Partida {

	Plano p;
	Aluno aluno;
	Bug bug;
	Robo r;
	Celula celula;
	protected boolean partida;
	protected ArrayList<Celula> c;
	protected ArrayList<Robo> listaDeRobo;

	public Partida(ArrayList<Celula> c) {
//		listaDeRobo = r;
		p = new Plano(8, 8);
		this.c = c;
		partida = true;
	}

	public boolean aindaTemAluno(Plano p) {
		for (int i = 1; i <= c.size(); i++) {
			for (int j = 1; j <= c.size(); j++) {
				Celula celula = p.retornarCelula(i, j);
				if (celula.possuiAluno()) {
					return true;
				}
			}
		}
		return false;
	}

//	public void gerarRelatorio(Bug bug, Aluno aluno, ArrayList<Robo> robos) {
//		System.out.println();
//		System.out.println("Quantidade de BUGS restantes: " + bug.quantBug);
//		System.out.println("Quantidade de ALUNOS restantes: " + aluno.quantAluno);
//		for (Robo robo : robos) {
//			System.out.println();
//			System.out.println("Robo " + robo.getNome() + "; Pontuação = " + robo.getPontos() + "; Posição atual= ("
//					+ robo.posicaox + ", " + robo.posicaoy + ")");
//		}
//	}

	public Robo verificarVencedor(ArrayList<Robo> robos) {
		Robo vencedor = null;
		int pontuacaoMaxima = Integer.MIN_VALUE;

		for (Robo robo : robos) {
			int pontuacao = robo.getPontos();

			if (pontuacao > pontuacaoMaxima) {
				pontuacaoMaxima = pontuacao;
				vencedor = robo;
			} else {
				return null;
			}
		}

		return vencedor;
	}

	// iniciando a partida

	public void iniciarPartida(Plano p) {
		int rodada = 0;
		do {
			rodada++;
			SortearPosicaoAB sortear = new SortearPosicaoAB(c);
			sortear.adicionarAlunosEBugs();
		} while (aindaTemAluno(p));

	}

}
