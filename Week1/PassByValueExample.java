
/*
 * Java is always pass by value. You cannot reassign variables in your methods
 *
 * */
public class PassByValueExample {

	public static void testPassingPrimitive(int x){
		x = 3000;
	}

	public static void testPassingNonPrimitive(String s){
		s = "This is changed";
	}

	public static void main(String[] args) {
		int x = 20;
		PassByValueExample.testPassingPrimitive(x);
		System.out.println(x);

		String s = "not changed";
		PassByValueExample.testPassingNonPrimitive(s);

		System.out.println(s);


	}

}
