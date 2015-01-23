package drawings;

import java.util.ArrayList;

/**
 * Un Modulo in grado di convertire una serie di Stringhe in parametri
 * e generare un Drawable
 * 
 * @author Alessandro
 */
public interface IDrawableGenerator {

	/**
	 * Genera un drawable dati i parametri
	 * @param parameters
	 * @return
	 */
	public Drawable generate(ArrayList<String> parameters);
}
