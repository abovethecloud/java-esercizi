package tracciabilità_prodotti;

public class Scaffale {

	private int capienza;
	private ProdottoDelSupermercato[] prodottiScaffale;

	public int getCapienza() {
		return capienza;
	}

	public void setCapienza(int capienza) {
		if (capienza < 1)
			capienza = 1;
		if (capienza < this.capienza) // Per semplicità gli scaffali si possono
										// allargare ma non restringere
			capienza = this.capienza;
		this.capienza = capienza;
	}

	public ProdottoDelSupermercato[] getProdottiScaffale() {
		return prodottiScaffale;
	}

	public void setProdottiScaffale(ProdottoDelSupermercato[] prodottiScaffale) {
		if (prodottiScaffale.length <= getCapienza())
			this.prodottiScaffale = prodottiScaffale;
		else
			System.out.println("Errore: Troppi prodotti per lo scaffale");
	}

	public Scaffale(int capienza, ProdottoDelSupermercato... prodotti) {
		super();
		setCapienza(capienza);
		setProdottiScaffale(prodotti);

	}
	
	public ProdottoDelSupermercato prodottoDaCodice(String cod) {
		// TODO: Restituire il prodotto a partire dal codice
		return new ProdottoDelSupermercato("NULL",0);
	}

}
