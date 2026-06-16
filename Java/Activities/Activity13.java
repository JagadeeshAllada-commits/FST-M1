package activities;

import java.util.Scanner;

public class Activity13 {

	public static void registerUser(String age) {
		int numAge;
		
		try {
			numAge = Integer.parseInt(age);
			
			if(numAge < 18) {
				throw new IllegalArgumentException("Users must be at least 18 years old to register.");
			}
			System.out.println("Registration successful! Welcome aboard.");
		}catch(NumberFormatException nfe) {
			System.out.println("Error: Age must be a valid number.");
		}
		
		catch(IllegalArgumentException iae){
			System.out.println("Registration Failed -> Error: " + iae.getMessage());
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your age!");
		
		Scanner sc =new Scanner(System.in);
		String age1 = sc.nextLine();
		
		registerUser(age1);
		
		
	}

}
