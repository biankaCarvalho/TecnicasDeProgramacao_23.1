package controller;

public class Pontuacao {
	
	protected Robo robos[];
	protected Aluno aluno;
	protected Bug bug;
	
	private int pontuacaoR1;
	private int pontuacaoR2;
	private int pontuacaoR3;
	
	public Pontuacao() {
	
	}
	
	public void setpontuacaoRobo1() {
		//se achou aluno
		pontuacaoR1+=10;
		//se achou bug
		pontuacaoR1-=15;
	}
	
	public void setpontuacaoRobo2() {
		//se achou aluno
		pontuacaoR2+=10;
		//se achou bug
		pontuacaoR2-=15;
	}
	
	public void setpontuacaoRobo3() {
		//se achou aluno
		pontuacaoR3+=10;
		//se achou bug
		pontuacaoR3-=15;
	}

	public int getPontuacaoR1() {
		return pontuacaoR1;
	}

	public int getPontuacaoR2() {
		return pontuacaoR2;
	}

	public int getPontuacaoR3() {
		return pontuacaoR3;
	}
	
	public int pontuacaoGeral() {
		int pontGeral;
		pontGeral = pontuacaoR1 + pontuacaoR2 + pontuacaoR3;
		return pontGeral;
	}
	
}
