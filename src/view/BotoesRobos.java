package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controller.Plano;
import controller.Robo;

public class BotoesRobos extends JButton{
	
	static JButton selecionarRobo;
	JButton robo1;
	JButton robo2;
	JButton robo3;
	JPanel painelRobos = new JPanel();
	
	public BotoesRobos() {
		selecionarRobo = new JButton();
		Plano p = new Plano(8, 8);
		painelRobos.setBackground(Color.lightGray);
		painelRobos.setLayout(new FlowLayout());
		
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/imgs/clubPenguin15050.jpg"));
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/imgs/clubPenguin25050.png"));
		ImageIcon icon3 = new ImageIcon(getClass().getResource("/imgs/clubPenguinEspiao5050.png"));
		
		robo1 = new JButton();
		robo1.setPreferredSize(new Dimension(52,55));
		robo1.setBackground(Color.white);
		robo1.setIcon(icon1);
		robo1.getIcon();
		painelRobos.add(robo1);
		
		robo2 = new JButton();
		robo2.setPreferredSize(new Dimension(52,55));
		robo2.setBackground(Color.white);
		robo2.setIcon(icon2);
		painelRobos.add(robo2);
		
		robo3 = new JButton();
		robo3.setPreferredSize(new Dimension(52,55));
		robo3.setBackground(Color.white);
		robo3.setIcon(icon3);
		painelRobos.add(robo3);
		
	}
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == robo1) {
				selecionarRobo = robo1;
			} else if (e.getSource() == robo2) {
				selecionarRobo = robo2;
			} else if (e.getSource() == robo3) {
				selecionarRobo = robo3;
			}
	}
}

