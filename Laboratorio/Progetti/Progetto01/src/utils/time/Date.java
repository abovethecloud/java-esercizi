package utils.time;

public class Date {
	
	private int day;
	private int month;
	private int year;

	
	public Date(int day, int month, int year) {
		
		// Dichiaro gli attributi. Posso anche non scrivere il "this." quando chiamo le set, perchÃ© non sussiste omonimia.
		this.year = year;	// Questa Ãš ancora la dichiarazione normale.
		this.setDay(day);	// Qui dichiaro day come setDay perchÃ© in tal modo sono certo che anche nella dichiarazione iniziale rispetto i vincoli.
		this.setMonth(month);	// Qui dichiaro month come setMonth perchÃ© in tal modo sono certo che anche nella dichiarazione iniziale rispetto i vincoli.
	}

	
	// Il seguente metodo sarebbe un Override del metodo toString.
	// In genere mi piace fare un Override che mi riporta al metodo originale. ma....
	// IN QUESTO PARTICOLARE CASO, invece, preferisco modificarlo, perché toString è fatto apposta per essere scritto per le particolari situazioni
	// Scrivo un possibile toString di Date
	@Override
	public String toString() {
		return "("+day+", "+month+", "+year+")";
	}
	
	// Qui dichiaro la funzione che si rende conto se l'anno e' bisestile o meno
	public static boolean getLeapYear(int year){
		if((year % 100) != 0){	// vero se l'anno non e' divisibile per 100
			if((year % 4) == 0)	// vero se l'anno e' divisibile per 4
				return true;	// anno bisestile
		}						// altrimenti
		return false;			// anno non bisestile
	}

	
	public static int getMaxDays(int month, int year) {		// Devo passare anche l'anno per colpa di Febbraio

		int maximumDays = 31;

		// Con uno switch mi assicuro che i giorni massimi del mese corrispondano al mese stesso.
		// Non ho ancora risolto la possiblitÃ  che, cambiando il mese dopo il giorno, cambi il massimo numero di giorni per il mese. Devo implementare un setDay all'interno di setMonth.
		switch(month) {

			case 4:case 6: case 9:case 11:
				maximumDays = 30;
				break;
			case 2:		// 29 ogni 4 anni ma 28 ogni 100
				if(getLeapYear(year)) {
					maximumDays = 29;
				} else {
					maximumDays = 28;
				}
				break;
			default:		// Visto che di default i giorni massimi sono gi 31, posso ometterlo in "default"
		}

		return maximumDays;
	}

	
	public void setMonth(int month) {
		if (month < 1)
			month = 1;
		if (month > 12)
			month = 12;
		this.month = month;

		this.setDay(this.day);	// Con questo comando risolvo la problematica del mese che cambia dopo il giorno. Riverifico il giorno

	}

	public int getMonth() {
		return this.month;
	}

	// Questa Ãš la funzione che mi restituisce il massimo numero di giorni per uno specifico mese.
	// Viene dichiarata come static. Cosa significa? Che Ãš una funzione di carattere generale che non ha nulla a che fare con gli attributi della classe. Fornisce gli stessi risultati a prescindere dalla classe in cui viene chiamata. Quindi ne esisterÃ  una sola a cui tutte faranno riferimento. Posso richiamarla anche se non ho ancora istanziato nessun oggetto per quella classe.


	public void setDay(int day) {
		int maximumDays = getMaxDays(this.month, this.year);	// Con questo comando richiamo un metodo che mi calcola il massimo numero di giorni

		if (day < 1)
			day = 1;
		if (day > maximumDays)
			day = maximumDays;
		this.day = day;
	}

	public int getDay() {
		return this.day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		this.setMonth(this.month);			// Controlla se il giorno settato e' coerente con il mese settato
		return this.year;
	}

}