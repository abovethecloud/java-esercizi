package drawings;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;

public class CompositeDrawableBuilder implements Drawable{
	
	
	
	private String string, splittedString[];
	private String sType, sColor;
	private ArrayList<String> sParameters = new ArrayList<String>();
	private HashMap<String, Drawable> map = new HashMap<String, Drawable>();
	
	private Drawable drawable;
	
	
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Drawable getDrawable() {
		return drawable;
	}

	public void setDrawable(Drawable drawable) {
		this.drawable = drawable;
	}

	public CompositeDrawableBuilder(String string) {
		super();
		this.string = string;
	}
	
	/**
	 * Per convertire la stringa utilizzo il metodo di string".split", che
	 * restituisce un vettore di stringhe divise dal(dai) token.
	 */
	public void convertString() {
		
		// Assegno il vettore contenenete i frammenti di string.
		this.splittedString = this.string.split(" ");
		
		// Setto separatmente i noti sType e sColor e
		// aggiungo parametri all'ArrayList sParameters
			this.sType = splittedString[0];
			this.sColor = splittedString[1];
			
			for (int i = 2; i < splittedString.length; i++) {
				this.sParameters.add(splittedString[i]);
			}

			map.put("Cerchio", new Circle(50, 50, 20));
			
			drawable=map.get(sType);
			
	}

	@Override
	public void draw(Graphics graphics) {
		drawable.draw(graphics);
		
	}

}
