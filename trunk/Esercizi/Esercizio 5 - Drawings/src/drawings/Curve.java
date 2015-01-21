package drawings;

import java.nio.channels.SeekableByteChannel;

/**
 * Interfaccia della generica curva. "t" rappresenta il parametro della curva
 * (parametrizzata come in Analisi 2, con t che varia in un intervallo, come da
 * 0 a 1. "X" e "Y" sono le coordinate di un punto della curva, e vengono
 * determinate sostituendo "t" all'interno della parametrizzazione della curva.
 * 
 * @author Claudio
 * 
 * @see CurveDrawable
 * @see DropModel
 * @see FlowerModel
 * @see SpiralModel
 *
 */

public interface Curve {

	/**
	 * Ogni curva può essere parametrizzata in un intervallo diverso.
	 * 
	 * @return minT: il minimo dell'intervallo di parametrizzazione in cui
	 *         spazia t
	 */
	public float getMinT();
	
	/**
	 * Ogni curva può essere parametrizzata in un intervallo diverso.
	 * 
	 * @return maxT: il massimo dell'intervallo di parametrizzazione in cui
	 *         spazia t
	 */
	public float getMaxT();

	/**
	 * @param t indica il parametro in base a cui calcolare l'ascissa
	 * @return X: l'ascissa del punto
	 */
	public float getX(float t);

	/**
	 * @param t indica il parametro in base a cui calcolare l'ordinata
	 * @return Y: l'ordinata del punto
	 */
	public float getY(float t);
}
