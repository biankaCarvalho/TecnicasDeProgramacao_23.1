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

	protected ArrayList<Robo> listaDeRobo;

	public Partida(ArrayList<Robo> r, Plano p) {
		listaDeRobo = r;
		this.p = p;
		partida = true;
	}

	
	public void gerarTabuleiro(Plano p, ArrayList<Robo> r) {
		int cont = 0;

		for (int i = 1; i <= p.getTamanhoX(); i++) {
			for (int j = 1; j <= p.getTamanhoY(); j++) {

				Celula celula = new Celula(cont, j, i);
				celula = p.retornarCelula(j, i);
				String area = "[ ]";

				for (Robo robo : listaDeRobo) {
					if (robo.getPosicaox() == j && robo.getPosicaoy() == i) {
						area = "[" + robo.getNome() + "]";
					}
				}

				if (celula.possuiAluno()) {
					area = "[*]"; // Representação de um aluno
				} else if (celula.possuiBug()) {
					area = "[*]"; // Representação de um bug
				}
				System.out.print(area);
			}
			System.out.println();
			cont++;
		}

	}

	// verificar se ainda tem algum aluno para reiniciar a partida

	public boolean aindaTemAluno(Plano p) {
		for (int i = 1; i <= p.getTamanhoX(); i++) {
			for (int j = 1; j <= p.getTamanhoY(); j++) {
				Celula celula = p.retornarCelula(i, j);
				if (celula.possuiAluno()) {
					return true;
				}
			}
		}
		return false;
	}

	public void gerarRelatorio(Bug bug, Aluno aluno, ArrayList<Robo> robos) {
		System.out.println();
		System.out.println("Quantidade de BUGS restantes: " + bug.quantBug);
		System.out.println("Quantidade de ALUNOS restantes: " + aluno.quantAluno);
		for (Robo robo : robos) {
			System.out.println();
			System.out.println("Robo " + robo.getNome() + "; Pontuação = " + robo.getPontos() + "; Posição atual= ("
					+ robo.posicaox + ", " + robo.posicaoy + ")");
		}
	}

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

	public void iniciarPartida(Plano p, int tamanhop) {
		Scanner z = new Scanner(System.in);
		int rodada = 1;

		Plano plano = new Plano(tamanhop, tamanhop);

		// ALUNOS
		System.out.println("Certo, e quantos alunos🐱‍🏍 se perderam? ");
		int numAluno = z.nextInt();
		Aluno aluno = new Aluno(numAluno);

		// BUGS
		System.out.println("Agora informe a quantidade de bugs☠ presentes: ");
		int numBug = z.nextInt();
		Bug bug = new Bug(numBug);

		do {
			aluno.sortearPosicaoAlunos(numAluno);
			bug.sortearPosicaoBug(numBug, plano);

			ArrayList<Robo> robos = new ArrayList<Robo>();

			Partida partida = new Partida(robos, plano);

			partida.gerarTabuleiro(plano, robos);

			ArrayList<Aluno> a = new ArrayList<Aluno>();
			for (int i = 0; i < numAluno; i++) {
				a.add(aluno);
			}

			ArrayList<Bug> b = new ArrayList<Bug>();
			for (int i = 0; i < numBug; i++) {
				b.add(bug);
			}

			System.out.println();
			System.out.println("**********RODADA " + rodada + " **********");
			for (Robo robo : robos) {
				System.out.println("Quanto " + robo.getNome() + " irá se mover?");
				int numCelulas = z.nextInt();
				System.out.println("Para avançar digite 1\nPara retroceder digite 2");
				int opcao = z.nextInt();
			}
			System.out.println();
			System.out.println("******* FIM DA RODADA " + rodada + " *******");
			System.out.println();
			System.out.println("******* RELATÓRIO *******");
			gerarRelatorio(bug, aluno, robos);
			System.out.println();
			rodada++;
			if (verificarVencedor(robos) != null) {
				System.out.println();
				System.out.println("******* VENCEDOR DA RODADA *******");
				verificarVencedor(robos);
			}
		} while (aindaTemAluno(plano));

	}

}
