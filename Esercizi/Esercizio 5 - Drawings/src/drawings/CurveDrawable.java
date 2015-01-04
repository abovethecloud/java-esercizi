package drawings;

import java.awt.Graphics;

public class CurveDrawable implements Drawable{

	private Curve curve;
	public CurveDrawable(Curve curve) {
		super();
		this.curve = curve;
	}
	@Override
	public void draw(Graphics graphics) {
		
		float min=curve.getMinT();
		float max=curve.getMaxT();
		int Nsegmenti=100;
		float deltaT=(max-min)/Nsegmenti;
		
		for (int i = 0; i < Nsegmenti; i++) {
			float t1=deltaT*i;
			float t2=t1+deltaT;
			graphics.drawLine((int)curve.getX(t1), 
					(int)curve.getY(t1), 
					(int)curve.getX(t2), 
					(int)curve.getY(t2));
		}
		
	}
}
