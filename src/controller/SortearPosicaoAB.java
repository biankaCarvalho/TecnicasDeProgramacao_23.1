package controller;

import java.util.ArrayList;
import java.util.Random;

public class SortearPosicaoAB {
	
	private Aluno aluno;
	private Bug bug;
	private ArrayList<Celula> listaCelulas;
	private int quantAluno = 5, quantBug = 7;
	
	public SortearPosicaoAB(ArrayList<Celula> c) {
		listaCelulas = c;
		aluno = new Aluno(quantAluno);
		bug = new Bug(quantBug);
	}
	
	public void adicionarAlunosEBugs() {        
        aluno.sortearPosicaoAlunos(quantAluno, listaCelulas);
        bug.sortearPosicaoBug(quantBug, listaCelulas);

        }
    }

