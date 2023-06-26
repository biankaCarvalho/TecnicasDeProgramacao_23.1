package controller;

public class Celula {
	
	public int posicaoX;
	public int posicaoY;
	public int id;
	public Robo robo;
	Aluno aluno;
	Bug bug;
	
	public Celula(int id, int x, int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		robo = null;
	}
	
	public Celula(int x, int y) {
		posicaoX = x;
		posicaoY = y;
		robo = null;
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}
	
	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
	
	public boolean possuiAluno() {
		return aluno != null; 
	}
	
	public boolean possuiBug() {
		return bug != null; 
	}

	public void setAluno(Aluno a) {
		aluno = a;
	}

	public void setBug(Bug b) {
		bug = b;
	}
	
}
