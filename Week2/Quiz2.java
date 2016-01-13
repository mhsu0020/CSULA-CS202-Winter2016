import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter numbers");
		String input = scanner.nextLine();

		// Parsing the input, getting the indivisual numbers
		String[] inputNumbers = input.split(",");
		for (int i = 0; i < inputNumbers.length; i++) {
			System.out.println(inputNumbers[i]);
		}
		int randomNumberIndex = (int) (Math.random() * inputNumbers.length);

		int numberToGuess = Integer.parseInt(inputNumbers[randomNumberIndex]);

		// Guess at most three times
		int userGuessCounter = 0;
		while (userGuessCounter <= 2) {
			userGuessCounter++;
			System.out.println("Please guess a number");
			int userGuess = Integer.parseInt(scanner.nextLine());
			if (userGuess == numberToGuess) {
				System.out.println("you win");
				System.exit(0);
			} else if (userGuess < numberToGuess) {
				System.out.println("larger");
			} else {
				System.out.println("smaller");
			}

		}
		System.out.println("You lose!!");

	}

}
