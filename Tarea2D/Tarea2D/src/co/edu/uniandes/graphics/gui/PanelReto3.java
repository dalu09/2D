package co.edu.uniandes.graphics.gui;

import java.awt.Color;
import java.awt.MultipleGradientPaint;
import java.awt.RadialGradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class PanelReto3 extends JPanel{
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		/* INTENTO DE DEGRADADO :(
		 * RoundRectangle2D r = new RoundRectangle2D.Float(5, 5, 150, 150, 25,
		        25);
		    RoundGradientPaint rgp = new RoundGradientPaint(75, 75, Color.magenta,
		        new Point2D.Double(0, 85), Color.blue);
		    g2d.setPaint(rgp);
		    g2d.fill(r);
		  }*/
		
		//RECTANGULO
		Rectangle2D.Double rectangulo1 = new Rectangle2D.Double(0,0,100,100);
		Rectangle2D.Double rectangulo2 = new Rectangle2D.Double(100,0,100,100);
		Rectangle2D.Double rectangulo3 = new Rectangle2D.Double(0,100,100,100);
		Rectangle2D.Double rectangulo4 = new Rectangle2D.Double(100,100,100,100);
		
		//ELIPSE
		Ellipse2D.Double elipse1 = new Ellipse2D.Double(0,0,100,100);
		Ellipse2D.Double elipse2 = new Ellipse2D.Double(100,0,100,100);
		Ellipse2D.Double elipse3 = new Ellipse2D.Double(0,100,100,100);
		Ellipse2D.Double elipse4 = new Ellipse2D.Double(100,100,100,100);
		
	     
		
		//AMARILLO
		g2d.setColor(Color.YELLOW);
		g2d.draw(rectangulo1);
		g2d.fill(rectangulo1);
		g2d.draw(rectangulo2);
		g2d.fill(rectangulo2);
		g2d.draw(rectangulo3);
		g2d.fill(rectangulo3);
		g2d.draw(rectangulo4);
		g2d.fill(rectangulo4);
		
		//BLANCO
		g2d.setColor(Color.WHITE);
		g2d.draw(elipse1);
		g2d.fill(elipse1);
		g2d.draw(elipse2);
		g2d.fill(elipse2);
		g2d.draw(elipse3);
		g2d.fill(elipse3);
		g2d.draw(elipse4);
		g2d.fill(elipse4);
		

		
	
	}
}
