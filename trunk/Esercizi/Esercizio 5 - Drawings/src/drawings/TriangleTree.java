package drawings;

import java.awt.Color;


public class TriangleTree extends CompositeDrawable{
	
	public TriangleTree(int x,int y,int baseLength,
			int treeWidth,int baseHeight,int treeHeight,
			Color color1,Color color2){
		Rectangle rectangle=
			new Rectangle(x-(baseLength>>1), 
						  y-baseHeight, 
						  baseLength, 
						  baseHeight,true);
		ColoredDrawable cl1=new ColoredDrawable(color1,
				rectangle);
		getDrawables().add(cl1);
		Triangle triangle=new Triangle(
				x-((treeWidth>>1)),y-baseHeight, 
				x,y-baseHeight-treeHeight, 
				x+((treeWidth>>1)),y-baseHeight);
		ColoredDrawable cl2=new ColoredDrawable(color2,
				triangle);
		getDrawables().add(cl2);
	}
}
