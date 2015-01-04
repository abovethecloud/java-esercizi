package drawings;

import java.awt.Graphics;

/**
 * Un cerchio dato il centro (x,y) e il raggio
 * radius
 * 
 * @author Alessandro
 */
public class Circle extends Shape implements Drawable{

	private int x,y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(false);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public Circle(int x, int y, int radius,boolean filled) {
		super(filled);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw(Graphics graphics){
		if(isFilled()){
			graphics.fillOval(x-radius, y-radius, 
					radius<<1, radius<<1);
		}else{
			graphics.drawOval(x-radius, y-radius, 
					radius<<1, radius<<1);
		}
	}
}
