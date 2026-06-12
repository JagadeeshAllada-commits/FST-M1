package activities;

public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car(String color, String transmission, int make) {
		this.color =color;
		this.transmission = transmission;
		this.make = make;
		this.tyres = 4;
		this.doors = 4;
	}
	
	//This displays the values of all the variables
	public void displayCharacteristics() {
		System.out.println("Color of the car is " +this.color);
		System.out.println("It has the transmission of " +this.transmission);
		System.out.println("It's made on " +this.make);
		System.out.println("It has " +this.tyres +" tyres");
		System.out.println("It has " +this.doors +" doors");
	}
	
	//This method to accelarate the car "Car is moving forward."
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	//This method help to stop the car "Car has stopped."
	 public void brake() {
		 System.out.println("Car has stopped.");
	 }
}
