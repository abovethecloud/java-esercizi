package esercizio0701v3;

public class VerificaCaratteriStranieri implements IVerifica{

	@Override
	public boolean verifica(String parola) {
		char[] array=parola.toLowerCase().toCharArray();
		for (int j = 0; j < array.length; j++) {
			char c=array[j];
			switch(c){
				case 'j':case 'k':case 'x':case 'y':case 'w': return true;
				default: //do nothing
			}
		}
		return false;
	}
	
//	public int conteggio(String[] parole){
//		
//		int somma=0;
//		for (int i = 0; i < parole.length; i++) {
//			
//			char[] array=parole[i].toLowerCase().toCharArray();
//			boolean caratteriStranieri=false;
//			for (int j = 0; j < array.length; j++) {
//				char c=array[j];
//				switch(c){
//					case 'j':case 'k':case 'x':case 'y':case 'w': caratteriStranieri=true;
//					default: //do nothing
//				}
//			}
//			if(caratteriStranieri)
//				somma++;
//			
//		}
//		
//		return somma;
//	}
	
}
