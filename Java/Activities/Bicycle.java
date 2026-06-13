package activities;

public class Bicycle implements BicycleParts, BicycleOperations{

//	private Object gears;
//	private Object currentSpeed;
	
	 public int gears;
	 public int currentSpeed;


	public Bicycle(int gears, int currentSpeed) {
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed = this.currentSpeed-decrement;
		
	}

	
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed = this.currentSpeed+increment;
		
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + maxSpeed);
	}

}
