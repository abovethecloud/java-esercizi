package drawings;

public class FlowerModel implements Curve{

	private int x,y;
	private int N;
	private float r;
	
	public FlowerModel(int x, int y, int n, float r) {
		super();
		this.x = x;
		this.y = y;
		N = n;
		this.r = r;
	}

	public float getX(float t){
		return (float)(this.x+r*Math.cos(N*t)*Math.cos(t));
	}
	
	public float getY(float t){
		return (float)(this.y+r*Math.cos(N*t)*Math.sin(t));
	}
	@Override
	public float getMaxT() {
		return (float)(2*Math.PI);
	}
	@Override
	public float getMinT() {
		return 0;
	}
}
