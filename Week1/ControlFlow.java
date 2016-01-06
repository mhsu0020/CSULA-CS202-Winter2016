
public class ControlFlow {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = 30;

		// Combining operators
		if (x % 2 == 0 || (y % 2 == 0 && z % 2 == 0)) {
			System.out.println("both true");
		}

		int i = 10;
		int j = i++;

		/*
		 * same thing as:
		 *
		 * int j = i;
		 *  i = i +1;
		 *
		 *
		 */
		System.out.println("postincrement: " + j);
		System.out.println("postincrement: " + i);

		int num1 = 10;
		int num2 = ++num1;
		/*
		 * same as
		 * num1 = num1+1;
		 * num2 = num1;
		 */
		System.out.println("preincrement: " +num1);
		System.out.println("preincrement: " +num2);

	}

}
