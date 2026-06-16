package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity10 {

	public static void main(String[] args) {
		Map<Integer, String> colours = new HashMap<Integer, String>();
		
		colours.put(1, "Blue");
		colours.put(2, "Green");
		colours.put(3, "Yellow");
		colours.put(4, "Red");
		colours.put(5, "Pink");
		
		System.out.println(colours);
		System.out.println("Removing the " + colours.remove(5));
		System.out.println("Checking if the Green is existing " + colours.containsValue("Green"));
		System.out.println("Size of the colours map is " + colours.size());
	}

}
