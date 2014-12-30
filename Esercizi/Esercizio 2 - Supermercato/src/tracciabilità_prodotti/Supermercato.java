package tracciabilità_prodotti;

public class Supermercato {

	private int mscaff, capienza;
	private Scaffale[] scaffaliSupermercato;

	public int getMscaff() {
		return mscaff;
	}

	private void setMscaff(int mscaff) {
		if (mscaff < 1)
			mscaff = 1;
		if (mscaff < this.mscaff) // Si può solo aumentare
			mscaff = this.mscaff;
		this.mscaff = mscaff;
	}

	public int getCapienza() {
		return capienza;
	}

	private void setCapienza(int capienza) {
		if (capienza < 1)
			capienza = 1;
		if (capienza < this.capienza)
			capienza = this.capienza;
		this.capienza = capienza;
	}

	public Supermercato(int mscaff, int capienza) {
		super();
		setMscaff(mscaff);
		setCapienza(capienza);

		scaffaliSupermercato = new Scaffale[getMscaff()];

		for (int i = 0; i < scaffaliSupermercato.length; i++) {
			scaffaliSupermercato[i] = new Scaffale(getCapienza());
		}

	}

	public void setProdotto(int nScaffale, int posizione, ProdottoDelSupermercato prodotto) {
		
		if (nScaffale >= 0 && nScaffale < scaffaliSupermercato.length)
			scaffaliSupermercato[nScaffale].setProdotto(posizione, prodotto);
		
	}
	
	public int contaGiacenzeSup(String cod) {
		// TODO: contare le giacenze nel supermercato
		int totGiacenze = 0;
		for (int i = 0; i < scaffaliSupermercato.length; i++) {
			totGiacenze += scaffaliSupermercato[i].contaGiacenzeScaff(cod);
		}
		return totGiacenze;
	}
	
	
	
}
