package cf;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Example02 {

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
		
		Collections.sort(stringsList);
		
		for (String string : stringsList) {
			System.out.println(string);


		}

	}
}
