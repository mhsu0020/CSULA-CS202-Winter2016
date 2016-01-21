package inheritance;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Person> peopleArrayListExample = new ArrayList<>();

		/*
		 * Student and Instructor are both Persons, as they extend from Person.
		 * So you can use a Person varialbe to store both students/instructors
		 *
		 */
		Person studentOne = new Student(0, "Mike", "5151 satte", "19212");
		Person instructorOne = new Instructor("John", "5151 satte", "121212", "12345", new BigDecimal("2"));

		Person[] peopleAtGym = new Person[2];
		peopleAtGym[0] = studentOne;
		peopleAtGym[1] = instructorOne;

		peopleArrayListExample.add(instructorOne);

		/*
		 *  Java figures out the most specific method implementation.
		 *
		 *  1. Sees person object
		 *  2. Person object is also a student
		 *  3. does student have printInfo?
		 *
		 * */
		System.out.println("student print info");
		peopleAtGym[0].printInfo();
		System.out.println("-----------");
		peopleAtGym[1].printInfo();
		System.out.println("--------");
		System.out.println(instructorOne.toString());
	}

}
