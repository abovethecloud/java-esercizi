package drawings.generators;

import java.util.ArrayList;

import drawings.Drawable;
import drawings.IDrawableGenerator;
import drawings.Triangle;

public class TriangleGenerator implements IDrawableGenerator{

	@Override
	public Drawable generate(ArrayList<String> parameters) {
		
		int x1=new Integer(parameters.get(0));
		//o anche x1=Integer.parseInt(parameters.get(0));
		int y1=new Integer(parameters.get(1));
		//o anche y1=Integer.parseInt(parameters.get(1));
		
		int x2=new Integer(parameters.get(2));
		//o anche x2=Integer.parseInt(parameters.get(2));
		int y2=new Integer(parameters.get(3));
		//o anche y2=Integer.parseInt(parameters.get(3));
		
		int x3=new Integer(parameters.get(4));
		//o anche x3=Integer.parseInt(parameters.get(4));
		int y3=new Integer(parameters.get(5));
		//o anche y3=Integer.parseInt(parameters.get(5));
		
		return new Triangle(x1, y1, x2, y2, x3, y3);
	}
}
