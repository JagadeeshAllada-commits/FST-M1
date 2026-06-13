package activities;

public class Driver {

	public static void main(String[] args) {

		MountainBike mb = new MountainBike(2, 10, 5);
		System.out.println(mb.bicycleDesc());
	    mb.speedUp(20);
	    mb.applyBrake(5);
	}

}
