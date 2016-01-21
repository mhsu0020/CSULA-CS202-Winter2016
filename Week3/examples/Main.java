package examples;
import java.math.BigDecimal;
import java.util.Scanner;

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

		Ingredient ingredient = new Ingredient(name, description, unit, new BigDecimal(costPerUnit), caloriesPerGram);

		System.out.println(ingredient.name);
		System.out.println(ingredient.description);
		System.out.println(ingredient.unit);
		System.out.println(ingredient.costPerUnit);
		System.out.println(ingredient.caloriesPerGram);
		Recipe recipe = new Recipe();
		recipe.addIngredient(ingredient);

		System.out.println("total cost is: "+recipe.getTotalIngredientCost());

		recipe.setName("Pancakes");
	}

}
