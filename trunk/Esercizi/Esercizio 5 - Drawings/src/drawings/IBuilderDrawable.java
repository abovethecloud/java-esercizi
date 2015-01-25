package drawings;

import java.util.ArrayList;

/**
 * Interfaccia generica di un Builder di Drawable. E' la componente che si
 * occupa di interpretare la stringa in entrata e fornire i vari parametri a
 * seconda dell'implementazione specifica. E' utile utilizzare il Builder perché
 * in tal modo sarà possibile interpretare in maniera diversa (con builder
 * diversi) le stringe a seconda della loro formattazione, e il Direttore non
 * dovrà saperlo.
 * 
 * @author claudio
 *
 */
public interface IBuilderDrawable {

	/**
	 * Importa la descrizione e genera gli elementi singoli: Tipo, Colore,
	 * Parametri
	 * 
	 * @param description
	 *            Stringa con formattazione variabile. Diverse formattazioni
	 *            richiedono diversi ConcreteBuilder.
	 */
	public void setDescription(String description);

	/**
	 * 
	 * @return Una STRINGA contenente il nome del TIPO di Drawable (Cerchio,
	 *         Rettangolo, Fiore....)
	 */
	public String getType();

	/**
	 * Imposta il tipo di Drawable
	 * 
	 * @param type
	 */
	public void setType(String type);

	/**
	 * 
	 * @return Una STRINGA contenente il COLORE
	 */
	public String getColor();

	/**
	 * Imposta il tipo di colore
	 * 
	 * @param color
	 */
	public void setColor(String color);

	/**
	 * 
	 * @return Un ArrayList di STRINGHE rappresentanti i parametri del Drawable
	 */
	public ArrayList<String> getParameters();

	/**
	 * Aggiunge un parametro all'ArrayList di parametri
	 * 
	 * @param parameter
	 *            Stringa rappresentante un parametro
	 */
	public void addParameter(String parameter);

	/**
	 * Un metodo di ESTREMA importanza. Deve essere chiamato all'inizio di
	 * setDescription per "pulire" i parametri precedenti
	 */
	public void reset();

}
