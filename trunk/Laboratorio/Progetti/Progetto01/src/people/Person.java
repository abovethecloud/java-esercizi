package people;

import utils.time.Date;

public class Person implements Comparable<Person>{

	private String name;
	private String surname;
	private Date date;
	
	public Person(String name, String surname, Date date) {
		//super();
		this.name = name;
		this.surname = surname;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return name+" "+surname+" "+date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	// compareTo è un nome non dato a caso
	// Vorrei essere in gra
	public int compareTo(Person other){
		String surnamei=this.getSurname();
		String surnamej=other.getSurname();
		return surnamei.compareTo(surnamej);
	}
	
}



