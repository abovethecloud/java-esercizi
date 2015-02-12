package campoMinato.model;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Questa classe è un Builder di una matrice di Caselle che serve a Campo, e
 * implementa un Factory Method per astrarre sul tipo di casella da utilizzare.
 * 
 * @author claudio
 *
 */
public class CampoBuilderConcrete implements ICampoBuilder{

	Random random = new Random();
	
	private int dim_campo;
	private int num_mine;
	
	
	@Override
	public Casella[][] generaCampo(int dim, int num_mine) {
		this.dim_campo = dim;
		this.num_mine = num_mine;
		
		Casella[][] campoDiCaselle = new Casella[dim][dim];
		for (int i = 0; i < dim; i++) { // Righe
			for (int j = 0; j < dim; j++) { // Colonne
				campoDiCaselle[i][j] = createCasella(j, i);
			}
		}
		return campoDiCaselle;
	}

	// Restituisce una normale casella nuova
	@Override
	public Casella createCasella(int colonna, int riga) {
		return new Casella(colonna, riga);
	}
	
	public void reset() {
		// TODO Auto-generated method stub

	}
	
	//Metodo da buttare
//	private TreeSet<int[]> setMine(int dim_campo, int num_mine) {
//		TreeSet<int[]> setMine = new TreeSet<int[]>();
//		
//		while (setMine.size() < num_mine){
//			int k = random.nextInt(dim_campo);
//			int h = random.nextInt(dim_campo);
//			int[] array = {k, h};
//			setMine.add(array);
//		}
//		System.out.println(setMine.toArray());
//		
//		return setMine;
//	}
	

	/* TODO: IMPLEMENTARE IL POSIZIONAMENTO CASUALE DELLE MINE */
}
