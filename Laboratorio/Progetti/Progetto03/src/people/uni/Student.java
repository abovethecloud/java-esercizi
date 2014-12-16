package people.uni;

import people.Person;
import utils.time.Date;

public class Student extends Person {		

	private int studentID;
	
	
	// Non posso dichiarare una classe studente se non metto un costruttore in grado di chiamare il costruttore della classe padre. Provvedo:
	public Student(String name, String surname, Date date, int studentID) {
		super(name, surname, date);
		this.studentID = studentID;
	}
	
	@Override
	public String toString() {
		return super.toString()+"["+studentID+"]";
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	// Facciamo l'Override di compareTo, per far si che gli studenti vengano comparati in maniera differente dalle banali persone
	
	@Override
	public int compareTo(Person other) {
		String surnamei=this.getName();
		String surnamej=other.getName();
		return surnamei.compareTo(surnamej);
	}

	// Se adesso provassi a creare in automatico un metodo setName con il completamento, ottengo che Eclipse mi fa l'overrdie con il "super."
//	@Override
//	public void setName(String name) {
//		// TODO Auto-generated method stub
//		super.setName(name);
//	}
	
}
