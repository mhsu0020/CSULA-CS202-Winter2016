public interface DriveCar {


	//They are all public static final, we omit the modfiers by convention
	int DRIVER_NUM = 20;

	int LICENSE_NUM = 40;

	//The methods are public abstract by default, we omit the modifiers by convention
	void turn(String direction);

	int signalTurn(String direction, boolean signalOn);

	//New Features
	default void handleUAV(String UAVId){
		System.out.println("shoot down "+UAVId);
	};
}
