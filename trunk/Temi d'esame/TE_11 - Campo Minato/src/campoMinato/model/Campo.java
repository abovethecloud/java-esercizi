package campoMinato.model;

import java.awt.Graphics;
import java.util.Observable;

import campoMinato.exceptions.LostException;

/**
 * Il Campo è un Observable. E' anche il Director di un DP Builder. La
 * generazione del campo viene delegata a un Builder di interfaccia
 * ICampoBuilder. Contiene una matrice di caselle: campoDiCaselle.
 * 
 * @author claudio
 *
 */
public class Campo extends Observable{
	
	public static final int DIM_CAMPO = 5;
	public static final int NUM_MINE = 3;
	
	private ICampoBuilder builder;
	private Casella[][] campoDiCaselle;
	private int dim_campo = DIM_CAMPO;
	private int num_mine = NUM_MINE;
	
	/**
	 * Il costruttore di defualt riempie il campo di caselle e setta il valore
	 * delle mine adiacenti per ogni casella
	 */
	public Campo(ICampoBuilder builder) {
		super();
		this.builder = builder;
		buildCampoDiCaselle();
	}

	/**
	 * Questo metodo serve ad accedere alla matrice di caselle
	 * 
	 * @return
	 */
	public Casella[][] getCampoDiCaselle() {
		return campoDiCaselle;
	}
	
	public int getDim_campo() {
		return dim_campo;
	}


	/**
	 * Questo metodo delega la creazione della matrice di Caselle ad un builder
	 * specializzato e notifica agli Observer l'avvenuta creazione
	 */
	public void buildCampoDiCaselle() {
		// Chiamo il builder concreto
		this.campoDiCaselle = builder.generaCampo(dim_campo, num_mine);
		settaMineAdiacenti();
		
		setChanged();
		notifyObservers();
	}
	
	public void reset() {
		buildCampoDiCaselle();
	}
	
	/**
	 * Disegna il campo di caselle (la matrice) in base alle regole delle
	 * singole caselle
	 */
	public void draw(Graphics g) {
		for (int i = 0; i < dim_campo; i++) {
			for (int j = 0; j < dim_campo; j++) {
				campoDiCaselle[i][j].draw(g);
			}
		}

	}
	
	/**
	 * Metodo che conta il numero di mine adiacenti ad una casella, data la
	 * casella
	 * 
	 * @return Il numero di mine adiacenti alla casella
	 */
	public int contaMineAdiacenti(Casella casella) {
		int riga = casella.getRiga();
		int colonna = casella.getColonna();
		int numeroMineAdiacenti = 0;
		/* Controllo sulle righe e sulle colonne nel for: mi assicuro di non uscire dalle dimensioni del campo con gli indici */
		for ( int i = (riga-1>=0)? riga-1 : 0    ; i <= riga+1 && i < dim_campo; i++) {	// Righe
			for ( int j = (colonna-1>=0)? colonna-1 : 0    ; j <= colonna+1 && j < dim_campo; j++) {	// Colonne
				if (campoDiCaselle[i][j].isMine())
					numeroMineAdiacenti+=1;				
			}
		}
		return numeroMineAdiacenti;
	}
	
	/**
	 * Imposta il numero di mine adiacenti ad ogni casella chiamando il metodo
	 * contaMineAdiacenti per ogni casella
	 */
	public void settaMineAdiacenti() {
		int numeroMine = 0;
		for (int i = 0; i < dim_campo; i++) {	// Righe
			for (int j = 0; j < dim_campo; j++) {	// Colonne
				numeroMine = contaMineAdiacenti(campoDiCaselle[i][j]);
				campoDiCaselle[i][j].setNumeroMineAdiacenti(numeroMine);
			}
		}

	}
	
	public void cliccaCaselleAdiacenti(Casella casella) {
		int riga = casella.getRiga();
		int colonna = casella.getColonna();
		
		if (casella.getNumeroMineAdiacenti() == 0) {
			for ( int i = (riga-1>=0)? riga-1 : 0    ; i <= riga+1 && i < dim_campo; i++) {	// Righe
				for ( int j = (colonna-1>=0)? colonna-1 : 0    ; j <= colonna+1 && j < dim_campo; j++) {	// Colonne
					try {
						if (campoDiCaselle[i][j].isClicked() == false) {
							campoDiCaselle[i][j].setClicked(true);
							cliccaCaselleAdiacenti(campoDiCaselle[i][j]);
						}
						
					} catch (LostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
				}
			}
		}
		

	}
	
	/* IMPORTANTE: PER QUALUNQUE MODIFICA ALLE CASELLE RICORDARSI DI NOTIFICARE AGLI OBSERVERS */

}
