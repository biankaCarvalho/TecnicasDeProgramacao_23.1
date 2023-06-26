package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bug {

	protected int posicaox;
	protected int posicaoy;
	Random random = new Random();
	protected int quantBug;
	Plano p;
	ArrayList<Bug> listaDeBugs = new ArrayList<Bug>();
	
	public Bug(int quantBug) {
		this.quantBug = quantBug;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getPosicaoxBug() {
		return posicaox;
	}

	public int getPosicaoyBug() {
		return posicaoy;
	}
	
	public void sortearPosicaoBug(int numBugs, Plano p) {
	    for (int i = 0; i < numBugs; i++) {
	        int posX = random.nextInt(p.getTamanhoX()) + 1;
	        int posY = random.nextInt(p.getTamanhoY()) + 1;

	        Bug bug = new Bug(numBugs);
	        posicaox = posX;
	        posicaoy = posY;
	        listaDeBugs.add(bug);

	        Celula celula = p.retornarCelula(posX, posY);
	        celula.setBug(bug);
	    }
	}
	
	public void encontrouBug(Robo r, Plano p) {
		int x = r.getPosicaox();
		int y = r.getPosicaoy();
		Celula c = p.retornarCelula(x, y);
		if (c.possuiBug()) {
			quantBug--;
		}
	}
	
}
