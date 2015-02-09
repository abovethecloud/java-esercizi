package esercizio07v1;

public class VerificaCaratteriStranieriConCodiceDuplicato {

	public int conteggio(String[] parole){
		
		int somma=0;
		for (int i = 0; i < parole.length; i++) {
			
			char[] array=parole[i].toLowerCase().toCharArray();
			boolean caratteriStranieri=false;
			for (int j = 0; j < array.length; j++) {
				char c=array[j];
				switch(c){
					case 'j':case 'k':case 'x':case 'y':case 'w': caratteriStranieri=true;
					default: //do nothing
				}
			}
			if(caratteriStranieri)
				somma++;
			
		}
		
		return somma;
	}
	
}
