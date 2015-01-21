package drawings;

import java.awt.Graphics;

/**
 * La generica curva (interfaccia Curve) non dispone di un metodo di disegno
 * DRAW. Questa classe incapsula un'altra curva e, come un decorator, supplisce
 * alla mancanza fornendo un metodo di disegno draw.
 * 
 * @author claudio
 *
 */
public class CurveDrawable implements Drawable {

	private Curve curve;

	public CurveDrawable(Curve curve) {
		super();
		this.curve = curve;
	}

	/**
	 * Questo metodo draw disegna la generica curva tracciando dei piccoli
	 * segmenti (dimensione determinata da deltaT, a sua volta determinato da
	 * Nsegmenti) dal punto di partenza al punto di arrivo, passando per tutti i
	 * punti nel mezzo. I punti sono determinati mediante le regole della curva
	 * specifica (vengono dunque chiamati i metodi getX(t) e getY(t), dove t è
	 * il parametro, che progredisce da un minimo ad un massimo (ad esempio da 0
	 * a 1 a seconda dei metodi getMinT() e getMaxT() della curva) a passi di
	 * deltaT. Ogni segmento viene tracciato dal punto determinato mediante t1 e
	 * dal punto determinato mediante t1+deltaT.
	 * Il seguente t1 non è il t2 precedente, ma viene determinato in base al
	 * passo del ciclo for a cui mi trovo, mediante deltaT*i.
	 * 
	 * Tl;Dr: determino due punti della curva inserendo i parametri (ad es. compresi tra 0 e 1)
	 * nell'equazione caratteristica della curva, e traccio un segmento che li congiunga.
	 * In pratica approssimo la curva a segmenti. Piu' segmenti, piu' precisione.
	 *
	 */
	@Override
	public void draw(Graphics graphics) {

		// Determino il deltaT
		float min = curve.getMinT();
		float max = curve.getMaxT();
		int Nsegmenti = 1000;	// era 100
		float deltaT = (max - min) / Nsegmenti;

		// Disegno tutti i segmenti in un ciclo for
		for (int i = 0; i < Nsegmenti; i++) {
			float t1 = deltaT * i;
			float t2 = t1 + deltaT;
			
			// traccio una retta dal punto P1(getX(t1),getY(t2)) a P2.
			graphics.drawLine((int) curve.getX(t1), (int) curve.getY(t1),
					(int) curve.getX(t2), (int) curve.getY(t2));
		}

	}
}
