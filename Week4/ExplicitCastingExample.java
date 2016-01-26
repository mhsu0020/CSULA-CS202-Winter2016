import java.util.ArrayList;

public class ExplicitCastingExample {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();

		// studentOne is a variable of type Student that stores a
		// InternationalStudent object
		Student studentOne = new InternationalStudent("1234", "mike123");

		// This doesn't work, because the studentOne variable is of type Student
		// studentOne.printInternationalStatus();

		// Because printInternationalStatus is only in InternationalStudent, not
		// student, you need to explicitly cast it to InternationalStudent
		((InternationalStudent) studentOne).printInternationalStatus();

		students.add(studentOne);
		((InternationalStudent) students.get(0)).printInternationalStatus();

	}

}
