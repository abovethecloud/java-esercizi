package drawings;

public class SpiralModel implements Curve{

	private float x,y,maxRadius,N;
	
	public SpiralModel(float x, float y, float n, float maxRadius) {
		super();
		this.x = x;
		this.y = y;
		this.maxRadius = maxRadius;
		N = n;
	}

	@Override
	public float getMinT() {
		return 0;
	}
	
	@Override
	public float getMaxT() {
		return 1;
	}
	
	@Override
	public float getX(float t) {
		return (float)(x+maxRadius*t*Math.cos(N*t*(2*Math.PI)));
	}
	
	@Override
	public float getY(float t) {
		return (float)(y+maxRadius*t*Math.sin(N*t*(2*Math.PI)));
	}
}
