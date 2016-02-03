
/*
 * You can only extend from one type, but you can implement multiple interfaces
 *
 * */
public class OnlineCourse extends Course implements DriveCar, Comparable<OnlineCourse>{

	public void changeCourseName(String name){
		this.courseName = name;
	}

	@Override
	public int compareTo(OnlineCourse o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void turn(String direction) {
		// TODO Auto-generated method stub

	}

	@Override
	public int signalTurn(String direction, boolean signalOn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getClassInfo() {
		System.out.println("enter online class info");


	}
}
