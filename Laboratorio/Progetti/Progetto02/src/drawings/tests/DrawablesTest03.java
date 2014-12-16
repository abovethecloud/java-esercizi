package drawings.tests;

import java.awt.Color;

import drawings.DrawingsFrame;
import drawings.drawables.Circle;
import drawings.drawables.ColoredDrawable;
import drawings.drawables.CompositeDrawable;
import drawings.drawables.Rectangle;

public class DrawablesTest03 {

	public static void main(String[] args) {

		ColoredDrawable drawable1=new ColoredDrawable(
				new Rectangle(10, 10, 50, 50), Color.RED);
		ColoredDrawable drawable2=new ColoredDrawable(
				new Rectangle(110, 10, 50, 50), Color.BLUE);
		ColoredDrawable drawable3=new ColoredDrawable(
				new Circle(200, 200, 50), Color.YELLOW);
		
		DrawingsFrame frame = 
			new DrawingsFrame(
				new CompositeDrawable(
					drawable1,drawable2,drawable3
				)
			);
		frame.launchFrame();
		
	}
}
