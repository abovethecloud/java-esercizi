package drawings;

import java.util.ArrayList;

/**
 * Un componente in grado di tradurre una Stringa in Informazioni utili
 * alla costruzione di un Drawable Composito.
 * 
 * @author Alessandro
 */
public interface IDrawableBuilder {

	/**
	 * Imposta la stringa contenente informazioni utili.
	 * @param description
	 */
	public void setDescription(String description);
	
	/**
	 * Ritorna il nome del colore presente nell'ultima 'description' inviata a setDescription,
	 * o null se la setDescription non è mai stata invocata
	 * @return
	 */
	public String getColor();
	
	/**
	 * Ritorna il nome del drawable presente nell'ultima 'description' inviata a setDescription,
	 * o null se la setDescription non è mai stata invocata
	 * @return
	 */
	public String getDrawableName();
	
	/**
	 * Ritorna i parametri presenti nell'ultima 'description' inviata a setDescription,
	 * o una lista vuota non è mai stata invocata
	 * @return
	 */
	public ArrayList<String> getParameters();
}
