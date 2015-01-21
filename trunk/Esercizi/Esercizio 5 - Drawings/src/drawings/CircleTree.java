package drawings;

import java.awt.Color;

public class CircleTree extends CompositeDrawable {

	public CircleTree(int x, int y, int radius, int baseLength, int height,
			Color color1, Color color2) {
		
		super(); // In realta' questa chiamata di super() viene fatta in
					// automatico, perche' la classe figlia DEVE necessariamente
					// istanziare un'oggetto della classe padre.

		Rectangle rectangle = new Rectangle(x - (baseLength >> 1), y - height,
				baseLength, height, true);

		ColoredDrawable cl1 = new ColoredDrawable(color1, rectangle);

		getDrawables().add(cl1);

		Circle circle = new Circle(x, y - height, radius, true);

		ColoredDrawable cl2 = new ColoredDrawable(color2, circle);

		getDrawables().add(cl2);
	}
}
