package tema1.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import tema1.attivita.Attivita;
import tema1.attivita.AttivitaCommerciale;
import tema1.attivita.DataFactory;
import tema1.attivita.Locale;
import tema1.attivita.Ricavato;
import tema1.attivita.Servizio;

/**
 * Classe di test che implementa DataFactory e fornisce 
 * valori di testing al fine di verificare il funzionamento del programma.
 * 
 * @author Alessandro Martinelli
 */
public class TestDataFactory extends DataFactory{

	@Override
	public Attivita[] getAttivita() {
		
		//i dati sono sempre recuperati dallo stesso file
		File file=new File("data/tema1/DatiCentro.txt");
		
		//elenco dei locali e delle attività
		ArrayList<Locale> locali=new ArrayList<Locale>();
		ArrayList<Attivita> attivitas=new ArrayList<Attivita>();
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			
			String line=reader.readLine();
			while(line!=null){

				//Verificare il file 'data/tema1/DatiCentro.txt' per capire
				//i passaggi di questo StringTokenizer
				StringTokenizer tok=new StringTokenizer(line);
				String type=tok.nextToken();
				if(type.equalsIgnoreCase("Loc")){

					tok.nextToken();//salta la Stringa che indica l'indice del locale (informazione superflua)
					locali.add(new Locale(new Integer(tok.nextToken())));
					
				}else{
					
					//genero la corretta istanza di attività
					Attivita at;
					if(type.equalsIgnoreCase("AttCom")){
						at=new AttivitaCommerciale();
					}else{
						at=new Servizio();
					}
					
					//recupero i dati dell'attività
					at.setNome(tok.nextToken());
					tok.nextToken();//salta la Stringa 'Locs'
					String token=tok.nextToken();
					//Fino a che non incontro la stringa 'Costi' sto leggendo l'indice di un locale
					while(!token.equalsIgnoreCase("Costi")){
						/*i locali sono indicizzati nel file a partire da 1, mentre nella lista 
						 sono indicizzati a partire da 0*/
						at.addLocale(locali.get(new Integer(token)-1));
						token=tok.nextToken();
					}	
					at.setCostoFisso(new Integer(tok.nextToken()));
					
					//inserisco l'attività nell'elenco di attività
					attivitas.add(at);
					
				}
				
				line=reader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			//Niente da fare: non ci aspettiamo di avere problemi con i file di test
		} catch (IOException e) {
			//Niente da fare: non ci aspettiamo di avere problemi con i file di test
		}
		
		return attivitas.toArray(new Attivita[attivitas.size()]);
	}
	
	@Override
	public Ricavato[] getRicavati() {
		
		//i dati sono sempre recuperati dallo stesso file
		File file=new File("data/tema1/RicavatiGiornalieri.txt");
		
		//i dati sono sempre recuperati dallo stesso file
		ArrayList<Ricavato> ricavati=new ArrayList<Ricavato>();
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader(file));
			
			String line=reader.readLine();
			while(line!=null){

				//Verificare il file 'data/tema1/RicavatiGiornalieri.txt' per capire
				//i passaggi di questo StringTokenizer
				StringTokenizer tok=new StringTokenizer(line);
				String name=tok.nextToken();
				int ricavato=new Integer(tok.nextToken());
				ricavati.add(new Ricavato(name,ricavato));
				
				line=reader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			//Niente da fare: non ci aspettiamo di avere problemi con i file di test
		} catch (IOException e) {
			//Niente da fare: non ci aspettiamo di avere problemi con i file di test
		}
		
		return ricavati.toArray(new Ricavato[ricavati.size()]);
	}
	
}
