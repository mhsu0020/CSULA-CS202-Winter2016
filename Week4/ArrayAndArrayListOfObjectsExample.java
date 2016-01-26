import java.util.ArrayList;

public class ArrayAndArrayListOfObjectsExample {

	public static void main(String[] args) {
		/*
		 * arrays provide default values depending on the type.
		 *
		 * Primitives have default values such as zero or false.
		 *
		 * arrays of reference types (Strings, Student, etc) have a default
		 * value of null. You need to initialize an object and put it in the
		 * array.
		 *
		 *
		 */

		// Example of empty string array
		String[] exampleStringArray = new String[5];
		for (String s : exampleStringArray) {
			// All elements by default are null, aka nothing
			System.out.println(s);
		}

		// Example of empty array of a type that you made up
		GeometricObject[] exampleGeometryArray = new GeometricObject[5];
		for (GeometricObject g : exampleGeometryArray) {
			// All elements by default are null, aka nothing
			System.out.println(g);
		}

		// The following code will cause a NullPointerException
		// String newString = exampleStringArray[1].toUpperCase();

		/*
		 * Unlike an an array, an ArrayList has a dynamic size. It starts out as
		 * size 0. As you add elements to it, the size increases dynamically
		 *
		 *
		 */

		ArrayList<String> exampleStringArrayList = new ArrayList<>();
		System.out.println("initial size: "+exampleStringArrayList.size());

		//Adding an element
		exampleStringArrayList.add("test string 1233");
		System.out.println("new size: "+exampleStringArrayList.size());




	}

}
