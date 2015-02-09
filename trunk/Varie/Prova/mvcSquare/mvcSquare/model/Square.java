package mvcSquare.model;

import java.util.Observable;
import java.util.Observer;

public class Square extends Observable {

	private int x, y, l;

	public Square(int x, int y, int l) {
		setX(x);
		setY(y);
		setL(l);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= 0)
			this.x = x;
		else
			this.x = 0;
		setChanged();
		notifyObservers();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= 0)
			this.y = y;
		else
			this.y = 0;
		setChanged();
		notifyObservers();
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		if (l > 0)
			this.l = l;
		else
			this.l = 1;
		setChanged();
		notifyObservers();
	}

	/*
	 * Esplicito il metodo di aggiunta di un Observer che fa parte della
	 * superclasse Observable
	 */
	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}

}
