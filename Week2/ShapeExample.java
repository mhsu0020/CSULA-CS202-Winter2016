
public class ShapeExample {

	/*
	 * Create 100 random triangles,
	 *
	 * store them somewhere, and let the user access the info?
	 *
	 *
	 */

	public static void printTriangleInfo(Triangle triangleToPrint){
		//triangleToPrint.base = 1000;
		//System.out.println(triangleToPrint.base);

		//triangleToPrint = new Triangle(10, 10);
	}
	public static void main(String[] args) {

		int i = 0;
		Triangle[] randomTriangles = new Triangle[100];
		while (i < 100) {
			//Triangle randomTriangle = new Triangle();
			Triangle randomTriangle = new Triangle(Math.random() * 10, Math.random() * 10);
			System.out.println("Random area of triangle is:");
			System.out.println(randomTriangle.calculateArea());
			randomTriangle.addTag("Instagram");
			randomTriangles[i] = randomTriangle;
			i++;
		}
		System.out.println("base of triangle number 80 is " + randomTriangles[79].base);
		System.out.println((int) randomTriangles[79].exampleChar);
        System.out.println(randomTriangles[40].name);
		ShapeExample.printTriangleInfo(randomTriangles[40]);
		System.out.println(randomTriangles[40].base);
	}

}
