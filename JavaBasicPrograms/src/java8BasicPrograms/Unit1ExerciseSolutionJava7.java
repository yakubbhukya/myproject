package java8BasicPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList( 
				new Person("Charles","Dickons",60),
				new Person("Lewis","Carrol",42),
				new Person("Thomos","Carlyle",51),
				new Person("Charlotte","Bronte",45),
				new Person("Matthew","Arnold",39)
				);
	
		// Step 1: Sort list by last Name
		Collections.sort(people,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		
		});
		
		// Step 2: Create a Method that prints all elements in the List
		printAll(people);
		
	}
		// Step 3: Create a Method That prints all people that have last name beginning with C


	private static void printAll(List<Person> people) {
	 for(Person p:people) {
		 System.out.println(p);
		
	}
		
	 printLastNameBeginningWith(people);
		
		

	}
		private static void printLastNameBeginningWith(List<Person> people) {
			
			for(Person p:people) {
				if(p.getLastName().startsWith("C")) {
				 System.out.println(p);
				}
			}	
		}

}
