package people.uni.tests;

import people.People;
import people.Person;
import people.uni.Student;
import people.uni.Teacher;
import utils.time.Date;

public class PeopleTest {

	public static void main(String[] args) {
		
		Person[] persons=new Person[5];
		persons[0]=new Student("Marco","Bianchi",new Date(1,1,2014), 0);
		persons[1]=new Student("Anna","Rossi",new Date(1,1,2014), 1);
		persons[2]=new Student("Giovanni","Verdi",new Date(1,1,2014), 2);
		persons[3]=new Teacher("Luca","Neri",new Date(1,1,2014), "Analisi");
		persons[4]=new Teacher("Davide","Bruni",new Date(1,1,2014), "Fisica");
	
		People people = new People();
		people.setPeople(persons);
		people.order();
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
	}
}
