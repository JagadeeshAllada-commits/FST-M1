package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity8 {
	
	

	public static void main(String[] args) {		
		List<String> myList = new ArrayList<String>();
		
		myList.add("name1");
		myList.add("name2");
		myList.add("name3");
		myList.add("name4");
		myList.add("name5");
		
		for(String name:myList) {
			System.out.println(name);
		}
		
		System.out.println("The 3rd string is " + "'" + myList.get(2) + "'");
		System.out.println("The 'name4' is existing in the string - " + myList.contains("name4"));
		System.out.println("No.of names present in the list - " + myList.size());
		System.out.println("Removing the name2 from the list - " + myList.remove("name2"));
		System.out.println("No.of names present in the list after removing the one name - " +myList.size());

	}

}
