package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarRelatorio implements ActionListener{
	
	private Janela frame;
	public MostrarRelatorio(Janela frame) {
		
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent arg0) {
		frame.pontTabu.setVisible(false);
		frame.relatorio.setVisible(true);
	}


}

