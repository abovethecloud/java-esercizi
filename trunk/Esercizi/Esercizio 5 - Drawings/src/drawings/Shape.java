package drawings;


/**
 * TODO
 * 
 * @author Alessandro
 */
public abstract class Shape implements Drawable{

	private boolean filled;

	public Shape(boolean filled) {
		super();
		this.filled = filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	//public abstract void draw(Graphics graphics);
}
