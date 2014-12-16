package files.people;

import java.util.ArrayList;
import java.util.Collections;

import files.utils.FileLoader;

import people.Person;

public class PeopleFilesTest {

	public static void main(String[] args) {
		
		ArrayList<Person> allPeople=new ArrayList<Person>();
		
		FileLoader peopleLoader=new FileLoader(
					new PeopleBuilder(allPeople),"people/input.txt");
		
		peopleLoader.loadFile();
		
		Collections.sort(allPeople);
		
		for (Person person : allPeople) {
			System.out.println(person);
		}
	}
	
}