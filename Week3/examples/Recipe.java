package examples;

import java.math.BigDecimal;

public class Recipe {

	//Object composition
	private Ingredient[] ingredients;

	public int numberOfIngredients;

	private String name;

	public Recipe(){
		this.ingredients = new Ingredient[200];
	}

	public BigDecimal getTotalIngredientCost(){
		BigDecimal result = new BigDecimal(0);
		for (int i = 0; i < numberOfIngredients; i++) {
			Ingredient ingredientToCalculate = ingredients[i];
			result = result.add(ingredientToCalculate.costPerUnit);
		}
		return result;

	}

	public void addIngredient(Ingredient ingredientToAdd){
		ingredients[numberOfIngredients] = ingredientToAdd;
		numberOfIngredients++;
	}

	/*
	 * setter
	 * Lets people modify your private data field
	 * */
	public void setName(String name){
		this.name = name;
	}


	public String getName(){
		return this.name;
	}

	public Ingredient[] getIngredients(){
		return this.ingredients;
	}

}
