package tracciabilità_prodotti;

public class ProdottoDelSupermercato {

	private String cod;
	private int giacenza;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public int getGiacenza() {
		return giacenza;
	}

	public void setGiacenza(int giacenza) {
		if (giacenza < 0)
			giacenza = 0;
		this.giacenza = giacenza;
	}

	public ProdottoDelSupermercato(String cod, int giacenza) {
		super();
		setCod(cod);
		setGiacenza(giacenza);
	}
	
	public void importProduct(ProdottoDelSupermercato prodotto) {
		setCod(prodotto.getCod());
		setGiacenza(prodotto.getGiacenza());
	}

}
