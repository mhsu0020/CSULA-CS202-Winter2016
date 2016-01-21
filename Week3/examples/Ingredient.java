package examples;

import java.math.BigDecimal;

/*
 * name, description, unit (grams, liters, etc), costPerUnit (use a string) and caloriesPerUnit (double).
 * */
public class Ingredient {

	 String name;
	public String description;
	public String unit;
	public BigDecimal costPerUnit;
	public double caloriesPerGram;

	/*
	 * constructor
	 * */
	public Ingredient(String name, String description, String unit, BigDecimal costPerUnit, double caloriesPerGram) {
		this.name = name;
		this.description = description;
		this.unit = unit;
		this.costPerUnit = costPerUnit;
		this.caloriesPerGram = caloriesPerGram;
	}



}
