package drawings.drawables;

import java.awt.Graphics;

import drawings.Drawable;

public class CompositeDrawable implements Drawable{

	private Drawable[] drawables;
	
	
	
	public CompositeDrawable(Drawable... drawables) {
		//super();
		this.drawables = drawables;
	}



	@Override
	public void draw(Graphics g) {
		for (int i = 0; i < drawables.length; i++) {
			drawables[i].draw(g);
		}	
	}
}
