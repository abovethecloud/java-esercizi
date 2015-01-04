package time;

public class Data {

	private int giorno, mese, anno;

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		if (giorno < 1)
			giorno = 1;
		if (giorno > getMaxGiorni())
			giorno = getMaxGiorni();
			this.giorno = giorno;
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		if (mese < 1)
			mese = 1;
		if (mese > 12)
			mese = 12;
		this.mese = mese;
		setGiorno(this.giorno);
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
		setMese(this.mese);
	}
	

	public Data(int giorno, int mese, int anno) {
		super();
		this.setAnno(anno);
		this.setMese(mese);
		this.setGiorno(giorno);
	}

	private boolean AnnoBisestile() {
		if (this.anno % 100 != 0) {
			if (this.anno % 4 == 0)
				return true;
		}
		return false;
				
	}
	
	private int getMaxGiorni() {
		int MaxGiorni = 30;
		
		switch (this.mese) {
		case 2:
			if (AnnoBisestile()) {
				MaxGiorni = 29;
			} else {
				MaxGiorni = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			MaxGiorni = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			MaxGiorni = 31;
			break;

		}
		
		return MaxGiorni;
	}
	
	@Override
	public String toString() {
		return giorno+"/"+mese+"/"+anno;
	}
	
	/** Trascuriamo il giorno di vita in più ogni quattro anni dovuto ai bisestili..
	 * ..e consideriamo i mesi di mediamente 30 gg.
	 * @param altraData
	 * @return Il numero di giorni che intercorrono tra le due date, immaginando risultati positivi se l'"altraData" è nel futuro rispetto alla data attuale
	 */
	public int diffDate(Data altraData) {
		int ga = 365*(altraData.getAnno() - this.getAnno());
		int gm = 30*(altraData.getMese() - this.getMese());
		int gg = (altraData.getGiorno() - this. getGiorno());
		
		return ga+gm+gg;
		
	}
	
	@Override
	public Data clone(){
		Data d = new Data(this.giorno, this.mese, this.anno);
	return d;
	}
}
