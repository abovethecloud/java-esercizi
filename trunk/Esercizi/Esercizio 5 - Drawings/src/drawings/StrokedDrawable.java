package drawings;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class StrokedDrawable implements Drawable{

	private Drawable drawable;
	private int width;
	
	public StrokedDrawable(Drawable drawable, int width) {
		super();
		this.drawable = drawable;
		this.width = width;
	}
	
	@Override
	public void draw(Graphics graphics) {
		Graphics2D graphics2D=(Graphics2D)graphics;
		graphics2D.setStroke(new BasicStroke(width));
		drawable.draw(graphics);
		graphics2D.setStroke(new BasicStroke(
				DefaultSettings.
				getSettings().getWidth()));
	}
}
