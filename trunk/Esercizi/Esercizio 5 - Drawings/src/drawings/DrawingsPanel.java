package drawings;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawingsPanel extends JPanel{

	private ArrayList<Drawable> drawables=
		new ArrayList<Drawable>();
	
	public void addDrawable(Drawable drawable){
		drawables.add(drawable);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < drawables.size(); i++) {
			drawables.get(i).draw(g);
		}
	}
}
