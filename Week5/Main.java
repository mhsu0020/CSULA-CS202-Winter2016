import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {


		DriveCar carDriveOne = new Ferrari();
		DriveCar accord = new HondaAccord();

		ArrayList<DriveCar> carsThatDrive = new ArrayList<>();
		carsThatDrive.add(carDriveOne);
		carsThatDrive.add(accord);

		for(DriveCar carThatDrive : carsThatDrive){
			carThatDrive.signalTurn("left", false);
		}
		ArrayList<HondaAccord> accords = new ArrayList<>();

		HondaAccord accordOne = new HondaAccord();
		accordOne.year = 2000;
		accordOne.mileage = 100;

		HondaAccord accordTwo = new HondaAccord();
		accordTwo.year = 1000;
		accordTwo.mileage = 100;

		accords.add(accordOne);
		accords.add(accordTwo);

		//You can sort arraylists of type HondaAccord because you implemented compareTo
		Collections.sort(accords);

		for (HondaAccord accordToPrint : accords) {
			System.out.println(accordToPrint);
		}





	}

}
