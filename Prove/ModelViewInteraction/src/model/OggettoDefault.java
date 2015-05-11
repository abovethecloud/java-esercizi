package model;


public class OggettoDefault implements IOggetto {

	private String stringa = null;

	@Override
	public String getContenuto() {
		return stringa;
	}

	@Override
	public void setContenuto(String stringa) {
		this.stringa = stringa;
	}
}
