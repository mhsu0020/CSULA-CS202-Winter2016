package inheritance;

public class Person extends Animal {

	private String name;
	private String address;
	private String phoneNumber;

	public Person(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(phoneNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/*
	 * toString method from java.lang.Object. Every Java class extends from
	 * java.lang.object by default
	 *
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

}
