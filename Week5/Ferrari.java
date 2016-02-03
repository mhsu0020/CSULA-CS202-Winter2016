
public class Ferrari implements DriveCar{

	public int maxSpeed;

	@Override
	public void turn(String direction) {
		System.out.println("direction: "+direction);
		System.out.println("it just goes straight");
	}

	@Override
	public int signalTurn(String direction, boolean signalOn) {
		return 1;
	}

}
