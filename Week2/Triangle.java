
public class Triangle {
	/*
	 * numeric primitives:
	 *
	 * default value is 0
	 *
	 * */
	public double base;
	public double height;
	/*
	 * defaults to ascii code 0
	 * */
	public char exampleChar;
	/*
	 *
	 * boolean: default value is false
	 *
	 * */
	public boolean isWhole;

	/*
	 *
	 * reference types: null
	 *
	 * */
	public String[] tags;
	public String name;
	public Triangle innerTriangle;


	public Triangle(double base, double height){
		name = "Example Triangle";
		this.base = base;
		this.height = height;
		this.tags = new String[10];
	}
//	public Triangle(){
//	}

	public void addTag(String tag){
		tags[0] = tag;
	}

	public double calculateArea() {
		return base * height /2;
	}

	public static void doSomething(){

	}


}
