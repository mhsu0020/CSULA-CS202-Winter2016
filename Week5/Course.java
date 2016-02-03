/**
 * Course abstract class, you cannot instantiate that type
 *
 * */
public abstract class Course {

	public String courseName;
	public int courseNumber;

	public void changeName(String courseName){
		this.courseName = courseName;
	}

	public abstract void getClassInfo();
}
