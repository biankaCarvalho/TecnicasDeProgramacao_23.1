package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Plano;
import controller.Robo;

public class BotoesRobos extends JButton implements ActionListener{

	static Robo selecionarRobo;
	JButton robo1;
	private JButton robo2;
	private JButton robo3;
	protected JPanel painelRobos = new JPanel();
	private ImageIcon icon1;
	private ImageIcon icon2;
	private ImageIcon icon3;
	protected JButton botaoClicadoNoTabu;

	public BotoesRobos() {
		selecionarRobo = new Robo();
		painelRobos.setBackground(Color.lightGray);
		painelRobos.setLayout(new FlowLayout());

		icon1 = new ImageIcon(getClass().getResource("/imgs/clubPenguin15050.jpg"));
		icon2 = new ImageIcon(getClass().getResource("/imgs/clubPenguin25050.png"));
		icon3 = new ImageIcon(getClass().getResource("/imgs/clubPenguinEspiao5050.png"));

		robo1 = new JButton();
		robo1.setPreferredSize(new Dimension(52, 55));
		robo1.setBackground(Color.white);
		robo1.setIcon(icon1);
		robo1.addActionListener(this);
		painelRobos.add(robo1);

		robo2 = new JButton();
		robo2.setPreferredSize(new Dimension(52, 55));
		robo2.setBackground(Color.white);
		robo2.setIcon(icon2);
		robo2.addActionListener(this);
		painelRobos.add(robo2);

		robo3 = new JButton();
		robo3.setPreferredSize(new Dimension(52, 55));
		robo3.setBackground(Color.white);
		robo3.setIcon(icon3);
		robo3.addActionListener(this);
		painelRobos.add(robo3);

	}

	public void actionPerformed(ActionEvent e) {
	    JButton botaoClicado = (JButton) e.getSource();
	    botaoClicadoNoTabu = (JButton) e.getSource();

        if (botaoClicado == robo1) {
            selecionarRobo = new Robo();
            botaoClicadoNoTabu.setIcon(icon1);
        //    selecionarRobo.setBotao(botaoClicadoNoTabu);
        } else if (botaoClicado == robo2) {
            selecionarRobo = new Robo();
            botaoClicadoNoTabu.setIcon(icon2);
        //    selecionarRobo.setBotao(botaoClicadoNoTabu);
        } else if (botaoClicado == robo3) {
            selecionarRobo = new Robo();
            botaoClicadoNoTabu.setIcon(icon3);
        //    selecionarRobo.setBotao(botaoClicadoNoTabu);
        }
	}
	
	public JPanel getPainelRobo() {
		return painelRobos;
	}

	public static Robo getRoboSelecionado() {
		return selecionarRobo;
	}

}
