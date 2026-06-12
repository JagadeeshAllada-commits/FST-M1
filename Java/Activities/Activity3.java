package activities;

public class Activity3 {

	public static void main(String[] args) {
		
		 System.out.println(adjustDevice("Thermostat", 40));
		 System.out.println(adjustDevice("Thermostat", 60));
		 System.out.println(adjustDevice("Thermostat", 20));
		 System.out.println(adjustDevice("another", 10));
		 System.out.println(adjustDevice("Light", 400));
		
	}
	
	public static String adjustDevice(String device, int value) {
		
		String status = switch(device) {
		case null -> "Error: No device detected.";
		case "Thermostat" -> {
			if(value >= 40) {
				yield "[THERMOSTAT] Warning: Temperature high";
			} else { 
				yield "[THERMOSTAT] Temperature is set to "+value;
			}
		}
		
		case "Light" -> "[LIGHT] Adjusting brightness to " +value+"%.";
		default -> "Unknown device type.";	
		};
		
		return status;
		
	}
	
}
