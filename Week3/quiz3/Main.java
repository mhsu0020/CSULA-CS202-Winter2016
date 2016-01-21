package quiz3;
import java.util.Scanner;

import javax.sound.midi.Receiver;

import examples.Recipe;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		System.out.println("Enter description: ");
		String description = scanner.nextLine();
		System.out.println("Enter unit: ");
		String unit = scanner.nextLine();

		System.out.println("Enter costPerUnit: ");
		String costPerUnit = scanner.nextLine();

		System.out.println("Enter caloriesPerUnit: ");
		double caloriesPerGram = Double.parseDouble(scanner.nextLine());


		String string = "example string";
		Ingredient ingredient = new Ingredient(name, description, unit, costPerUnit, caloriesPerGram);

	}

}
