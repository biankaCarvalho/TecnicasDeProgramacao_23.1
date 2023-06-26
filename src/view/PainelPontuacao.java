package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Aluno;
import controller.Bug;
import controller.Plano;
import controller.Robo;

public class PainelPontuacao extends JPanel {
	
	Robo robo;
	
	public PainelPontuacao() {
		robo = new Robo();
		JLabel label = new JLabel("   " + "Pontuação: " + robo.getPontos());
		this.add(label);
		setBackground(Color.lightGray);

		JButton verificar = new JButton("Verificar");
		verificar.setBackground(Color.white);
		verificar.addActionListener(new VerificarPontuacao());
		
		JButton sair = new JButton("Sair do Jogo");
		sair.setBackground(Color.white);
		sair.addActionListener(new SairdoJogo());

		BotoesRobos robos = new BotoesRobos();
		painelRobosComPontuacao();
		this.add(robos.painelRobos);
		this.add(verificar);
		this.add(sair);
		this.setLayout(new GridLayout(5, 1));

		this.setVisible(true);
	}

	public void painelRobosComPontuacao() {

		ImageIcon robo1 = new ImageIcon(getClass().getResource("/imgs/clubPenguin25050-removebg (2).png"));
		ImageIcon robo2 = new ImageIcon(getClass().getResource("/imgs/clubPenguin25050-removebg (1).png"));
		ImageIcon robo3 = new ImageIcon(getClass().getResource("/imgs/clubPenguinEspiao5050sembg.png"));

		JLabel labelR1 = new JLabel(robo1);
		JLabel pontuacaoR1 = new JLabel(" :"+ robo.getPontos());
		JLabel labelR2 = new JLabel(robo2);
		JLabel pontuacaoR2 = new JLabel(" :"+ robo.getPontos());
		JLabel labelR3 = new JLabel(robo3);
		JLabel pontuacaoR3 = new JLabel(" :"+ robo.getPontos());

		JPanel painelRobos = new JPanel();
		painelRobos.setLayout(new FlowLayout());
		painelRobos.setBackground(Color.lightGray);

		painelRobos.setPreferredSize(new Dimension(100, 100));

		painelRobos.add(labelR1);
		painelRobos.add(pontuacaoR1);
		painelRobos.add(labelR2);
		painelRobos.add(pontuacaoR2);
		painelRobos.add(labelR3);
		painelRobos.add(pontuacaoR3);
		painelRobos.setVisible(true);

		this.add(painelRobos);
	}
}

class SairdoJogo implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

class VerificarPontuacao implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Aluno aluno = new Aluno(5);
		Bug bug = new Bug(7);
		Robo robo = new Robo();
		Plano p = new Plano(8,8);
		aluno.encontrouAluno(robo, p);
		bug.encontrouBug(robo, p);
	}
}
