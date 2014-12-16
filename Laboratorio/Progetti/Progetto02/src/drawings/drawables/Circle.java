package drawings.drawables;

import java.awt.Graphics;

import drawings.Drawable;

public class Circle implements Drawable{

	private int x,y,ray;
	
	public Circle(int x, int y, int ray) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval(x-ray, y-ray, ray<<1, ray<<1);
	}
}
