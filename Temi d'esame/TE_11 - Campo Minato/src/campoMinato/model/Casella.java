package campoMinato.model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;

import campoMinato.exceptions.LostException;

/**
 * La classe Casella contiene tutte le informazioni base della casella, tra cui
 * la posizione, la dimensione e i vari controlli, se è stata cliccata, se ha la
 * bandiera e se ha la mina. Un ulteriore campo che torna utile solo se inserita
 * nel contesto di una matrice di Caselle (un Campo di Caselle) è il
 * numeroDiMineAdiacenti, che viene settato dal Campo stesso. Contiene un metodo
 * draw che disegna la casella diversamente a seconda dello stato dei suoi
 * parametri (idealmente questo metodo potrebbe essere spostato in una
 * CasellaDrawable)
 * 
 * @author claudio
 *
 */
public class Casella extends Observable {

	public static final int DIM_CASELLA = 50;
	public static final int POS_INIZIALE_X = 20;
	public static final int POS_INIZIALE_Y = POS_INIZIALE_X;

	private int colonna, riga; // Indici casella nel Campo

	// La posizione della casella sara' dettata dai suoi indici e dalla
	// dimensione
	private int x, y;
	private int dim = DIM_CASELLA;

	private boolean clicked = false;
	private boolean flag = false;
	private boolean mine = false;
	private boolean perso = false;

	private int numeroMineAdiacenti = 1;

	/**
	 * Il costruttore di defualt imposta riga e colonna della casella nel campo,
	 * e di conseguenza la sua posizione X e Y
	 * 
	 * @param colonna
	 * @param riga
	 */
	public Casella(int colonna, int riga) {
		setColonna(colonna);
		setRiga(riga);
	}

	public int getColonna() {
		return colonna;
	}

	/**
	 * Questo metodo setta l'indice della colonna e aggiusta la posizione
	 * chiamando setX, che a sua volta notifica il cambiamento all'Observer
	 * 
	 * @param colonna
	 */
	public void setColonna(int colonna) {
		if (colonna >= 0) {
			this.colonna = colonna;
			setX();
		} else
			System.out.println("errore setI");
	}

	public int getRiga() {
		return riga;
	}

	/**
	 * Questo metodo setta l'indice della riga e aggiusta la posizione chiamando
	 * setY, che a sua volta notifica il cambiamento all'Observer
	 * 
	 * @param colonna
	 */
	public void setRiga(int riga) {
		if (riga >= 0) {
			this.riga = riga;
			setY();
		} else
			System.out.println("errore setJ");
	}

	public int getX() {
		return x;
	}

	/**
	 * La posizione sulle ascisse (x) viene settata in automatico in base
	 * all'indice della colonna (colonna) e alla dimensione della casella. Il
	 * cambiamento viene notificato agli Observer.
	 * 
	 * TODO: La notifica potrebbe essere superflua
	 */
	private void setX() {
		this.x = POS_INIZIALE_X + colonna * DIM_CASELLA;
//		setChanged();
//		notifyObservers();
	}

	public int getY() {
		return y;
	}

	/**
	 * La posizione sulle ordinate (y) viene settata in automatico in base
	 * all'indice della riga (riga) ed alla dimensione della casella. Il
	 * cambiamento viene notificato agli Observer.
	 * 
	 * TODO: La notifica potrebbe essere superflua
	 */
	private void setY() {
		this.y = POS_INIZIALE_Y + riga * DIM_CASELLA;
//		setChanged();
//		notifyObservers();
	}

	public int getDim() {
		return dim;
	}

	public boolean isClicked() {
		return clicked;
	}

	/**
	 * Se la casella viene cliccata, devo chiamare questo metodo, così da
	 * visualizzare il contenuto della casella. Questo metodo devo pone il
	 * parametro clicked a true e notifica agli Observer il cambiamento (in modo
	 * da visualizzare la modifica)
	 * 
	 * @param clicked
	 *            Indica se la casella è già stata cliccata
	 * @throws LostException
	 *             Eccezione che si verifca al click su una mina: SCONFITTA
	 */
	public void setClicked(boolean clicked){
		this.clicked = clicked;
		setChanged();
		notifyObservers();
		if (mine)
			perso = true;
	}

	public boolean isFlag() {
		return flag;
	}

	/**
	 * Se la casella (non ancora aperta) viene cliccata col tasto destro del
	 * mouse devo chiamare questo metodo e imporre il valore di flag a true. Poi
	 * notifico agli Observer per aggiornare la vista
	 * 
	 * @param flag
	 *            Indica se la casella (non ancora aperta) è contrassegnata da
	 *            una bandierina
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
		setChanged();
		notifyObservers();
	}
	
	public void changeFlag() {
		this.flag = !this.flag;
		setChanged();
		notifyObservers();
	}

	public boolean isMine() {
		return mine;
	}

	/**
	 * Un componente dovrà occuparsi di chiamare questo metodo per settare la
	 * mina in alcune caselle.
	 * 
	 * TODO: La notifica agli Observer potrebbe essere superflua
	 * 
	 * @param mine
	 *            Indica se una casella è una mina
	 */
	public void setMine(boolean mine) {
		this.mine = mine;
		setChanged();
		notifyObservers();
	}

	/**
	 * Questo metodo setta il numero di mine adiacenti in base alle informazioni
	 * passate dal Campo di appartenenza della casella
	 * 
	 * @param numeroMineAdiacenti
	 *            Indica il numero di mine adiacenti alla casella
	 */
	public void setNumeroMineAdiacenti(int numeroMineAdiacenti) {
		this.numeroMineAdiacenti = numeroMineAdiacenti;
		setChanged();
		notifyObservers();
	}
	
	public int getNumeroMineAdiacenti() {
		return numeroMineAdiacenti;
	}
	

	public boolean isPerso() {
		return perso;
	}
	
	public void setPerso(boolean perso) {
		this.perso = perso;
	}

	/**
	 * Disegna la casella con tutti i suoi possibili parametri. Controlla se la
	 * casella sia già stata cliccata o meno. Se non è mai stata cliccata
	 * disegnerà una copertura grigia ed eventualmente la bandierina se la
	 * casella è contrassegnata. Se è già stata cliccata mostrerò il contenuto
	 * della casella (mina o numero)
	 * 
	 * @param g
	 */
	public void draw(Graphics g) {
		// Se il quadrato non è mai stato cliccato lo lascio grigio pieno,
		// eventualmente con la bandiera
		if (!clicked) {
			g.setColor(Color.GRAY);
			g.fillRect(getX() + 1, getY() + 1, getDim() - 2, getDim() - 2);
			g.setColor(Color.BLACK);
			if (flag) {
				// Se contrassegno la casella con una bandiera, disegno un cerchio
				g.drawOval(getX() + (getDim() / 4), getY() + (getDim() / 4),
						getDim() / 2, getDim() / 2);
			}
		}

		// Se il quadrato è stato cliccato disegno il contorno e all'interno una
		// mina oppure il numero di mine adiacenti
		if (clicked) {
			g.drawRect(getX(), getY(), getDim(), getDim());

			if (mine)
				g.drawRect(getX() + (getDim() / 4), getY() + (getDim() / 4),
						getDim() / 2, getDim() / 2);
			else
				// SE NON MINA STAMPA IL NUMERO DI MINE ADIACENTI
				g.drawString(((Integer) numeroMineAdiacenti).toString(), getX()
						+ getDim() / 2, getY() + getDim() / 2);
		}
	}

}
