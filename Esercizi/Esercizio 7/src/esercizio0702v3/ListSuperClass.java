package esercizio0702v3;

import java.util.ArrayList;

/**
 * Classe Padre di tutti gli strumenti per le liste, concreta ed istanziabile.
 * Dichiara al suo interno un oggetto di tipo IOrder, che contiene al proprio
 * interno l'implementazione concreta del meccanismo di ordinamento. Poiché
 * l'oggetto può cambiare a RunTime, questa classe può essere utilizzata come
 * Proxy.
 * 
 * @author claudio
 *
 */
public class ListSuperClass {

	private IOrder orderType;

	protected ArrayList<String> stringList = new ArrayList<String>();

	/* Constructor */
	public ListSuperClass(IOrder orderType) {
		this.orderType = orderType;
	}

	/* Getters and Setters */
	public IOrder getOrderType() {
		return orderType;
	}

	public void setOrderType(IOrder orderType) {
		this.orderType = orderType;
	}

	/**
	 * Metodo per l'aggiunta di stringhe alla lista contenuta.
	 * 
	 * @param strings
	 *            Vettore di stringhe (o stringa singola) che vanno inserite
	 *            nella lista stringList
	 */
	public void addStrings(String... strings) {

		for (int i = 0; i < strings.length; i++) {
			this.stringList.add(strings[i]);
		}
	}

	/**
	 * Metodo che permette di contare il numero di volte che un carattere
	 * compare nella lista di stringhe contenuta nello strumento
	 * 
	 * @param character
	 *            Il carattere di cui verificare il numero di presenze nella
	 *            lista di Stringhe
	 * @return Il numero di volte che il carattere compare
	 */
	public int countChar(Character character) {
		int conteggio = 0;
		for (String string : stringList) {
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == character)
					conteggio += 1;
			}
		}
		return conteggio;
	}

	/**
	 * Metodo di ordinamento che viene effettuato secodno l'algoritmo specifico
	 * contenuto all'interno dell'oggetto di tipo *IOrder*
	 * 
	 * @return Una NUOVA lista di Stringhe ordinata secondo il tipo di
	 *         ordinamento definito all'interno di OrderType
	 */
	public ArrayList<String> order() {
		ArrayList<String> temporaryList = new ArrayList<String>();
		temporaryList.addAll(stringList);

		orderType.specificOrder(temporaryList);

		return temporaryList;
	}

}