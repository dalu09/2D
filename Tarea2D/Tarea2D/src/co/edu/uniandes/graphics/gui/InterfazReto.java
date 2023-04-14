package co.edu.uniandes.graphics.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class InterfazReto extends JFrame{
	
	private PanelReto3 PanelReto3;
	
	
	public InterfazReto() {
		
		setLayout(new BorderLayout());
		setSize(new Dimension(400,400));
		setVisible(true);
		PanelReto3 = new PanelReto3();
		
		
		add(PanelReto3,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		InterfazPrincipal vc = new InterfazPrincipal();
	}
}


