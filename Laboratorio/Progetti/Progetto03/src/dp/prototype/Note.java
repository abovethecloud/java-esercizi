package dp.prototype;

public class Note {

	private float  length;
	private int value;
	
	public Note(float length, int value) {
		super();	// questo super() si rifà al costruttore di defualt della classe Object \m/
		this.length = length;
		this.value = value;
	}
	
	
	/* Utilizzo il metodo clone, che ovviamente riscrivo.
	 * Invece di chiamare un metodo Object, ma lo chiamo Note. */
	
	@Override
	public Note clone() /* throws CloneNotSupportedException */ {		// Ho cambiato da restricted a private la visibilità. Posso aumentarla, ma non diminuirla.
		// TODO Auto-generated method stub
		//return super.clone();
		return new Note(length, value);
	}
	
	// TODO: finire la classe implementando altri algoritmi

	
}
