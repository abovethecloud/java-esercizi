package drawings;

import java.awt.Graphics;

public class Triangle implements Drawable{

	private int x1,y1;
	private int x2,y2;
	private int x3,y3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	@Override
	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub
		int[] xPoints={x1,x2,x3};
		int[] yPoints={y1,y2,y3};
		graphics.drawPolygon(xPoints, yPoints, 3);
	}
}
