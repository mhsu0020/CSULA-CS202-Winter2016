import java.util.ArrayList;

public class FindingIfExistInArrayListExample {

	public static void main(String[] args) {

		Student studentOne = new Student("1234", "Mike");
		Student studentTwo = new Student("1234", "Mike");

		ArrayList<Student> students = new ArrayList<>();
		students.add(studentOne);

		/*
		 * The contains method specially calls the .equals method of the object
		 * to check if two objects are the same. You can override it (and also
		 * hashcode for good practice)for your own classes to define custom
		 * behavior. Java doesn't know to check if your two student objects have
		 * the same student ID/name. By default it checks if they're the same
		 * object instance. Since studentOne is a different object from
		 * studentTwo, they are considered different
		 */
		System.out.println(students.contains(studentTwo));

		/*
		 * You can check it manually by assuming a data field to be unique
		 *
		 */
		for (Student student : students) {
			if (student.studentId.equals("1234")) {
				System.out.println("student one is in the arrayList");
			}
		}
	}

}
