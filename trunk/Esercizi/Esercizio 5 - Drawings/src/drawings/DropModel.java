package drawings;

public class DropModel implements Curve{

	private int x,y;
	private int width,height;
	
	public DropModel(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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
		float tm=1-t;
		return x+( 
				(width>>1)*4*t*tm*tm*tm
				-(width>>1)*4*t*t*t*tm
		);
	}
	
	@Override
	public float getY(float t) {
		float tm=1-t;
		return y+( 
				+(height*3/4)*4*t*tm*tm*tm
				+(height)*6*t*t*tm*tm
				+(height*3/4)*4*t*t*t*tm
		);
	}
}
