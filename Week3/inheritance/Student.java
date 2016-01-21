package inheritance;

public class Student extends Person {

	int numberOfYearsAtGym;

	public Student(int numberOfYearsAtGym, String name, String address, String phoneNumber) {
		/*
		 * Super: represents the parent class Because parent doesn't have
		 * default constructor, Need to explicitly call Otherwise calls super();
		 */
		super(name, address, phoneNumber);
		this.numberOfYearsAtGym = numberOfYearsAtGym;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(numberOfYearsAtGym);
	}

}
