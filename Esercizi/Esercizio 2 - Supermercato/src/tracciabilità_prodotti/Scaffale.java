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
		if (capienza < this.capienza) { // Per semplicità gli scaffali si
										// possono
										// allargare ma non restringere
			capienza = this.capienza;
			System.out
					.println("Errore: Non ho potuto ridurre la dimensione dello scaffale");
		}
		this.capienza = capienza;
	}

	public ProdottoDelSupermercato getProdotto(int i) {
		if (i >= 0 && i <= capienza)
			return prodottiScaffale[i];
		return new ProdottoDelSupermercato("NULL", 0);
	}

	public void setProdotto(int posizione, ProdottoDelSupermercato prodotto) {
		if (posizione <= capienza && posizione >= 0)
			this.prodottiScaffale[posizione] = prodotto;
		else
			System.out.println("Errore: indice fuori intervallo");
	}

	public Scaffale(int capienza) {
		super();
		setCapienza(capienza);
		this.prodottiScaffale = new ProdottoDelSupermercato[capienza];
	}

	public Scaffale(int capienza, ProdottoDelSupermercato... prodotti) {
		super();
		setCapienza(capienza);
		this.prodottiScaffale = new ProdottoDelSupermercato[capienza];

		if (prodotti.length <= capienza) {
			for (int i = 0; i < prodotti.length; i++) {
				this.prodottiScaffale[i] = prodotti[i];
			}
		} else
			System.out
					.println("Troppi prodotti per lo scaffale, non sono stati aggiunti");

	}

	public int numProdottoDaCodice(String cod) {
		for (int i = 0; i < prodottiScaffale.length; i++) {
			if (prodottiScaffale[i].getCod() == cod)
				return i;
		}
		return -1;
	}

	public int cambiaGiacenza(int i, int differenza) {
		if (i >= 0 && i <= capienza) {
			int a = prodottiScaffale[i].getGiacenza();
			prodottiScaffale[i].setGiacenza(a + differenza);
			return (prodottiScaffale[i].getGiacenza() - a);
		}
		return 0;
	}
}
