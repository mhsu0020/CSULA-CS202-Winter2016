package inheritance;

import java.math.BigDecimal;

public class Instructor extends Person {

	String instructorId;
	BigDecimal hourlyWage;

	public Instructor(String name, String address, String phoneNumber, String instructorId, BigDecimal hourlyWage) {
		super(name, address, phoneNumber);
		this.instructorId = instructorId;
		this.hourlyWage = hourlyWage;
	}

	/*
	 * constructor/method overloading. Same method name, different parameters
	 *
	 * */
	public Instructor(String name, String address, String phoneNumber, String instructorId) {
		super(name, address, phoneNumber);
		this.instructorId = instructorId;
		this.hourlyWage = new BigDecimal("0");
	}


	/**
	 * Example of method overriding. There is a printInfo method in the Person
	 * class. Java will know to use this version of printInfo after you override
	 * the method.
	 */
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("instructorID " + instructorId);
		System.out.println("hourlyWage " + hourlyWage);
	}

}
