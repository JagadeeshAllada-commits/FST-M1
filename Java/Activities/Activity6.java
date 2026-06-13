package activities;

public class Activity6 {

	public static void main(String[] args) {
		Plane plane = new Plane(10);
		plane.onboard("Pass1");
		plane.onboard("pass2");
		plane.onboard("Pass3");
		plane.onboard("Pass1");
		plane.onboard("pass2");
		plane.onboard("Pass3");
		plane.onboard("Pass1");
		plane.onboard("pass2");
		plane.onboard("Pass3");
		plane.onboard("Pass1");
		plane.onboard("pass2");
		plane.onboard("Pass3");
		
		System.out.println("Plane taking off on "+plane.takeOff());
		System.out.println("Passengers travelling are "+plane.getPassengers());
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		plane.land();
		System.out.println("Plane landed on "+plane.lastTimeLanded);
	}

}
