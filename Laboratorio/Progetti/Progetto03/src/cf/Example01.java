package cf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Example01 {

	public static void main(String[] args) {
		
		// ArrayList è una delle implementazioni èrincipali dell'interfaccia List. No differenze comportamentali. Posso usare quello o LinkedList. Hanno qualche differenza
		
		//List<String> stringsList = new ArrayList<String>();
		List<String> stringsList = new LinkedList<String>();

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
		stringsList.add("Falafel");
		stringsList.add("Falafel");
		stringsList.add("Birbantello");
		stringsList.add("Winzozz");
		stringsList.add("Steve");
		
		System.out.println("Primo Caso:");
		for (String string : stringsList) {
			System.out.println(string);

		}
		Iterator<String> iterator = stringsList.iterator();		
		while(iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
		
		// Iteratori frequenti. Metodo veloce per scriverlo in Java con la sua sintassi: FOREACH
		System.out.println("Secondo Caso:");
		for (String string : stringsList) {
			System.out.println(string);
		}
		
		System.out.println("Terzo Caso:");
		for (int i = 0; i < stringsList.size(); i++) {

			System.out.println(stringsList.get(i));
		}
		
	}
}
