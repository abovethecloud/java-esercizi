package dizionario.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class BuilderDizionario{
	
	private HashMap<String, String> mapDizionario = new HashMap<String, String>();
	private ConvertiStringa convertiStringa = new ConvertiStringa();
	
	public HashMap<String, String> getMapDizionario() {
		return mapDizionario;
	}
	
	public BuilderDizionario() {
		super();
		aggiungiTerminiAlDizionario();
	}
	
	private void aggiungiTerminiAlDizionario(){

		try {
			FileReader fileReader = new FileReader("italiano-inglese.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while (true) {
				try {
					convertiStringa.dividiStringa(bufferedReader.readLine());
					mapDizionario.put(convertiStringa.getParola(), convertiStringa.getDescrizione());
				} catch (NullPointerException e) {
					bufferedReader.close();
				}
				
			}
		} catch (Exception e) {
			System.err.println("File not Found");
			return;
		}

		

	}

}
