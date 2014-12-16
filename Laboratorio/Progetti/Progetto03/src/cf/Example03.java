package cf;

import java.util.Set;
import java.util.TreeSet;


public class Example03 {

	public static void main(String[] args) {
		
		Set<String> stringsList = new TreeSet<String>();
		
		stringsList.add("Ciao");
		stringsList.add("Mondo");
		stringsList.add("Crudele");
		stringsList.add("Sonno");
		stringsList.add("Maremma");
		stringsList.add("Pirolino");
		stringsList.add("Pulcinella");
		stringsList.add("Tremendoleone");
		stringsList.add("Porco Rosso");
		stringsList.add("Falafel");
		stringsList.add("Falafel");		// Viene eliminato perché uso TreeSet (nel Set, no elementi duplicati)
		stringsList.add("Falafel");		// Viene eliminato perché uso TreeSet (nel Set, no elementi duplicati)
		stringsList.add("Birbantello");
		stringsList.add("Winzozz");
		stringsList.add("Steve");
		
		// Collections.sort lavora solo con le liste
		// Collections.sort(stringsList);
		
		for (String string : stringsList) {
			System.out.println(string);

		}

	}
}
