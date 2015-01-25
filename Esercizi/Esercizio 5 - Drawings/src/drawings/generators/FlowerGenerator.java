package drawings.generators;

import java.util.ArrayList;

import drawings.CurveDrawable;
import drawings.Drawable;
import drawings.FlowerModel;
import drawings.IDrawableGenerator;

public class FlowerGenerator implements IDrawableGenerator{

	@Override
	public Drawable generate(ArrayList<String> parameters) {
		
		int x=new Integer(parameters.get(0));
		//o anche x=Integer.parseInt(parameters.get(0));
		int y=new Integer(parameters.get(1));
		//o anche y=Integer.parseInt(parameters.get(1));
		int n=new Integer(parameters.get(2));
		//o anche n=Integer.parseInt(parameters.get(2));
		int r=new Integer(parameters.get(3));
		//o anche r=Integer.parseInt(parameters.get(3));
		
		return new CurveDrawable(new FlowerModel(x, y, n, r));
	}
}
