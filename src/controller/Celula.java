package controller;

public class Celula {
	
	protected int posicaoX;
	protected int posicaoY;
	protected int id;
	protected Robo robo;
	protected Aluno aluno;
	protected Bug bug;
	
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
