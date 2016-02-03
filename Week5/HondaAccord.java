
public class HondaAccord implements DriveCar, Comparable<HondaAccord>{

	int year;
	int mileage;

	@Override
	public void turn(String direction) {
		System.out.println("Direction is: "+direction);
		System.out.println("Honda crashes");
	}

	@Override
	public int signalTurn(String direction, boolean signalOn) {
		System.out.println("direction: no turn");
		return 0;
	}

	@Override
	public int compareTo(HondaAccord o) {
		if(this.year > o.year){
			return 1;
		}
		if(this.mileage > o.mileage){
			return 1;
		}
		if(this.year == o.year && this.mileage == o.mileage){
			return 0;
		}
		if(this.year < o.year){
			return -1;
		}
		if(this.mileage<o.mileage){
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "HondaAccord [year=" + year + ", mileage=" + mileage + "]";
	}



}
