package time;

public class Ora {
	
	private int h, m;
	
	
	public int getH() {
		return h;
	}

	public void setH(int h) {
		if (h<0)
			h=0;
		if (h>23)
			h=23;
		
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		if (m<0)
			m=0;
		if (m>59)
			m=59;
		
		this.m = m;
	}

	
	public int getDiffMinuti(Ora altraOra) {
		//TODO: algoritmo che data questa ora ed un'altra, sia in grado di restituirmi la differenza temporale in minuti
		int dh = h - altraOra.getH();
		if (dh<0)
			dh = -dh;
		int dm = m - altraOra.getM();
		if (dm<0)
			dm = -dm;
		
		return (60*dh + dm);
	}

}
