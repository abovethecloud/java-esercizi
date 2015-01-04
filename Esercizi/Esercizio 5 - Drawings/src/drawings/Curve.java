package drawings;

public interface Curve {
	
	public float getMinT();

	public float getMaxT();
	
	public float getX(float t);
	
	public float getY(float t);
}
