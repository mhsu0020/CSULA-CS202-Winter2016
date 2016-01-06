import java.util.Scanner;

/**
 *
 * Read a line from user and print it out
 *
 * */
public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter line:");
		String userInput = scanner.nextLine();
		System.out.println(userInput);
		scanner.close();
	}

}
