package co.edu.uniandes.graphics.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class PanelLienzo extends JPanel {
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		//RECTANGULOS
		Rectangle2D.Double rectangulo1 = new Rectangle2D.Double(0,0,700,700);
		Rectangle2D.Double rectangulo2 = new Rectangle2D.Double(390,130,20,40);
		Rectangle2D.Double rectangulo3 = new Rectangle2D.Double(338,170,130,40);
		Rectangle2D.Double rectangulo4 = new Rectangle2D.Double(360,170,80,180);
		Rectangle2D.Double vestido = new Rectangle2D.Double(360,195,80,230);
		Rectangle2D.Double tirante1 = new Rectangle2D.Double(350,170,20,40);
		Rectangle2D.Double tirante2 = new Rectangle2D.Double(430,170,20,40);
		
		//RECTANGULO REDONDEADO
		RoundRectangle2D.Double round1 = new RoundRectangle2D.Double(320,170,25,180,20,20);
		RoundRectangle2D.Double round2 = new RoundRectangle2D.Double(455,170,25,180,20,20);
		RoundRectangle2D.Double round3 = new RoundRectangle2D.Double(345,200,15,40,20,20);
		RoundRectangle2D.Double round4 = new RoundRectangle2D.Double(440,200,15,40,20,20);
		RoundRectangle2D.Double round5 = new RoundRectangle2D.Double(360,330,35,180,20,20);
		RoundRectangle2D.Double round6 = new RoundRectangle2D.Double(405,330,35,180,20,20);
		
		//ELIPSE
		Ellipse2D.Double elipse = new Ellipse2D.Double(350,30,100,100);
		
		//POLIGONO
		int[] arrX = {230, 250, 550, 570};
		int[] arrY = {550, 500, 500, 550};
		int[] arrX1 = {310, 360, 440, 490};
		int[] arrY2 = {450, 250, 250, 450};
		
		Polygon poligono = new Polygon(arrX, arrY, 4);
		Polygon falda = new Polygon(arrX1, arrY2, 4);
		
		//GRIS
		g2d.setColor(Color.GRAY);
		g2d.draw(rectangulo1);
		g2d.fill(rectangulo1);
		g2d.draw(round3);
		g2d.fill(round3);
		g2d.draw(round4);
		g2d.fill(round4);
		
		//BLANCO
		g2d.setColor(Color.WHITE);
		g2d.draw(poligono);
		g2d.fill(poligono);		
		
		//NEGRO
		g2d.setColor(Color.BLACK);
		g2d.draw(elipse);
		g2d.fill(elipse);
		g2d.draw(rectangulo2);
		g2d.fill(rectangulo2);
		g2d.draw(rectangulo3);
		g2d.fill(rectangulo3);
		g2d.draw(rectangulo4);
		g2d.fill(rectangulo4);
		g2d.draw(round1);
		g2d.fill(round1);
		g2d.draw(round2);
		g2d.fill(round2);
		g2d.draw(round5);
		g2d.fill(round5);
		g2d.draw(round6);
		g2d.fill(round6);
		
		//YELLOW
		//RETO 2
		g2d.setColor(Color.YELLOW);
		g2d.drawOval(50, 50, 120, 120);
		g2d.fillOval(50, 50, 120, 120);		
		
		//ROJO
		g2d.setColor(Color.RED);
		g2d.draw(vestido);
		g2d.fill(vestido);		
		g2d.draw(tirante1);
		g2d.fill(tirante1);	
		g2d.draw(tirante2);
		g2d.fill(tirante2);	
		
		//ROSA
		g2d.setColor(Color.PINK);
		g2d.draw(falda);
		g2d.fill(falda);	
		
		
	
	}
}
