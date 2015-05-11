package model;

import java.util.Observable;

public class ProxyOggetto extends Observable implements IOggetto {

	private IOggetto oggetto = new OggettoDefault();

	@Override
	public String getContenuto() {
		return oggetto.getContenuto();
	}

	@Override
	public void setContenuto(String stringa) {
		oggetto.setContenuto(stringa);
		setChanged();
		notifyObservers();
	}

	public void setOggetto(IOggetto oggetto) {
		this.oggetto = oggetto;
	}

	/*
	 * Metodi utili da utilizzare nel caso in cui Oggetto sia un proxy, per
	 * avvisare gli Observer che il proxy è cambiato e qindi devono adeguare la
	 * vista a un tipo di input diverso per una diversa componente del modello,
	 * o per notificare qualunque cambiamento che debba subito riflettersi nella
	 * UI
	 */
	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	@Override
	protected synchronized void setChanged() {
		super.setChanged();
	}

	@Override
	public void notifyObservers(Object arg) {
		super.notifyObservers(arg);
	}

}
