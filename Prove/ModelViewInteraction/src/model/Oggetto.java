package model;

import java.util.Observable;

public class Oggetto extends Observable {

	private String stringa = null;

	public String getStringa() {
		return stringa;
	}

	public void setStringa(String stringa) {
		this.stringa = stringa;
		setChanged();
		notifyObservers();
	}

	/*
	 * Metodi utili da utilizzare nel caso in cui Oggetto sia un proxy, per
	 * avvisare gli Observer che il proxy è cambiato e qindi devono adeguare la
	 * vista a un tipo di input diverso per una diversa componente del modello
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
