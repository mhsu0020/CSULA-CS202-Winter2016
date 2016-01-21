package quiz3;

import java.math.BigDecimal;

/*
 * name, description, unit (grams, liters, etc), costPerUnit (use a string) and caloriesPerUnit (double).
 * */
public class Ingredient {

	 String name;
	public String description;
	public String unit;
	public String costPerUnit;
	public double caloriesPerGram;

	/*
	 * constructor
	 * */
	public Ingredient(String name, String description, String unit, String costPerUnit, double caloriesPerGram) {
		this.name = name;
		this.description = description;
		this.unit = unit;
		this.costPerUnit = costPerUnit;
		this.caloriesPerGram = caloriesPerGram;
	}



}
