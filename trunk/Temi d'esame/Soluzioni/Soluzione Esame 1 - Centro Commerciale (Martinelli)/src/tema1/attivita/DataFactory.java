package tema1.attivita;

/**
 * 
 * Il pattern 'AbstractFactory' è usato in questo caso per creare una astrazione
 * sul modo con cui sono generati i dati in Input al problema
 * 
 * @author Alessandro Martinelli
 */
public abstract class DataFactory {

	/**
	 * @return l'elenco delle attività sulle quali devono essere svolte le procedure
	 */
	public abstract Attivita[] getAttivita();
	/**
	 * @return l'elenco di ricavati giornalieri di ogni attività
	 */
	public abstract Ricavato[] getRicavati();

	//Mantiene una istanza statica di questa factory
	private static DataFactory dataFactory;

	public static DataFactory getDataFactory() {
		return dataFactory;
	}
	public static void setDataFactory(DataFactory dataFactory) {
		DataFactory.dataFactory = dataFactory;
	}
	
}
