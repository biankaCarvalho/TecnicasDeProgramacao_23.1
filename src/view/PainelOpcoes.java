package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Jogador;
import model.Dados;

public class PainelOpcoes extends JPanel{

	JButton jogar;
	JButton relatorio;
	Jogador jogador;
	String nomeJogador;
	PainelPontuacaoETabuleiro p;

	public PainelOpcoes() {

		JLabel label = new JLabel("Nome: ");
		this.add(label);
		setBackground(Color.lightGray);
		JTextField caixa = new JTextField();
		caixa.setPreferredSize(new Dimension(80, 27));
		jogador = new Jogador();
		nomeJogador = caixa.getText();
		jogador.setNome(nomeJogador);
		
		this.setLayout(new FlowLayout());
		p = new PainelPontuacaoETabuleiro();
		jogar = new JButton("Jogar");
		jogar.setBackground(Color.white);
		jogar.addActionListener(new MostrarPainelPrincipal());
		
		relatorio = new JButton("Relatório");
		relatorio.setBackground(Color.white);
		relatorio.addActionListener(new MostrarRelatorio());

		this.add(caixa);
		this.add(jogar);
		this.add(relatorio);

	}
	
	public String getText() {
		String s = "";
		s += jogador.getNome()+";";
		return s;
	}
}

class MostrarPainelPrincipal implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		PainelPontuacaoETabuleiro p = new PainelPontuacaoETabuleiro();
		PainelOpcoes po = new PainelOpcoes();
		p.setVisible(true);
		Dados d = new Dados();
		File f = new File("dados");
		d.escrever(po.getText(), f);
		System.out.println("SOCORRO");
	}
}

class MostrarRelatorio implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		PainelRelatorio pr = new PainelRelatorio();
		PainelPontuacaoETabuleiro p = new PainelPontuacaoETabuleiro();
		p.setVisible(false);
		pr.setVisible(true);
		System.out.println("AJUDA");
	}
}
