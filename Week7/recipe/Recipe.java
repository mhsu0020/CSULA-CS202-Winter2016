package recipe;

import java.util.ArrayList;

public class Recipe {

	String recipeName;
	String description;
	ArrayList<String> steps;
	String imagePath;
	ArrayList<String> ingredients;

	public Recipe(String recipeName, String description,  String imagePath) {
		this.recipeName = recipeName;
		this.description = description;
		this.steps = new ArrayList<String>();
		this.imagePath = imagePath;
		this.ingredients =  new ArrayList<String>();
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getSteps() {
		return steps;
	}

	public void setSteps(ArrayList<String> steps) {
		this.steps = steps;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}

}
