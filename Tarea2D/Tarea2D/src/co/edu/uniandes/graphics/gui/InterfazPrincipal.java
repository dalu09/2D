package co.edu.uniandes.graphics.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

public class InterfazPrincipal extends JFrame {
	
	private PanelLienzo PanelLienzo;
	
	
	public InterfazPrincipal() {
		
		setLayout(new BorderLayout());
		setSize(new Dimension(700,700));
		setVisible(true);
		PanelLienzo = new PanelLienzo();
		
		
		add(PanelLienzo,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		InterfazPrincipal vc = new InterfazPrincipal();
		InterfazReto vr = new InterfazReto();
	}
}
