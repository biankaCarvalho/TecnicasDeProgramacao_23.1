package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Aluno;
import controller.Bug;

public class PainelAlunoBug extends JPanel {

	private Aluno a;
	private Bug b;

	public PainelAlunoBug() {
		a = new Aluno();
		b = new Bug();
		
		this.setBackground(Color.lightGray);
		JLabel quantA = new JLabel("Alunos: " + a.getQuantAluno());
		JLabel quantB = new JLabel("Bugs: " + b.getQuantBug());
		
		this.setLayout(new FlowLayout());
		this.add(quantB);
		this.add(quantA);
		this.setVisible(true);
	}
}
