package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {

		/*
		 * Note the use of the Integer wrapper type. Also unlike an array, the
		 * size is not specified
		 */
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(100);
		numbers.add(80);
		numbers.add(40);
		numbers.add(20);

		/* enhanced loop */
		for (Integer num : numbers) {
			System.out.println(num);
		}

		/* loop with index */
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		/* shuffles the arrayList */
		Collections.shuffle(numbers);

		/* sorts the arrayList */
		Collections.sort(numbers);

	}

}
