package tracciabilità_prodotti;

public class ProdottoDelSupermercato {

	private String cod;
	private int volume;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume < 0)
			volume = 0;
		this.volume = volume;
	}

	public ProdottoDelSupermercato(String cod, int volume) {
		super();
		setCod(cod);
		setVolume(volume);
	}

}
