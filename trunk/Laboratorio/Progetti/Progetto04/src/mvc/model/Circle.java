package mvc.model;

import java.util.Observable;
import java.util.Observer;

public class Circle extends Observable {

	private int x, y, ray;

	public Circle(int x, int y, int ray) {
		super();
		this.x = x;
		this.y = y;
		this.ray = ray;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		setChanged();
		notifyObservers();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		setChanged();
		notifyObservers();
	}

	public int getRay() {
		return ray;
	}

	public void setRay(int ray) {
		this.ray = ray;
		setChanged();
		notifyObservers();
	}
	
	// Metodo semplicemente esplicitato. Appartiene alla classe padre Observable
	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}
}


/* ATTENZIONE al setChanged: è un metodo di Observable protected, questo significa che l'unico modo per accedervi è estendere la classe Observable.*/
