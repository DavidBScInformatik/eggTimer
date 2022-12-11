package ke5ea2;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Window;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

public class EggTimerCanvas extends Canvas {
	
	private EggTimerModel eggModel;
	
	public EggTimerCanvas(EggTimerModel eggModel) {
		this.eggModel = eggModel;
		Dimension dimension = new Dimension(320, 320);
		this.setPreferredSize(dimension);
		this.setBackground(Color.BLACK);
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.RED);
		g2d.fillOval(this.getX(), this.getY()-28, this.getWidth(), this.getHeight());
		
		int arch = (int) this.eggModel.getElapsedPart();
		for(int i=0; i<=60; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			g2d.setColor(Color.GREEN);
			g.fillArc (this.getX(), this.getY()-28, this.getHeight(), this.getWidth(), 90, -arch);
			arch += 6;
		}
	}

}
