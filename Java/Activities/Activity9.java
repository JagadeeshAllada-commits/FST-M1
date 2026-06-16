package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity9 {

	public static void main(String[] args) {
		
		Set<Object> hs = new HashSet<Object>();
		
		hs.add(1);
		hs.add("Hello");
		hs.add(10);
		hs.add(5.6);
		hs.add("world");
		hs.add(100);
		
		System.out.println("Size of the set is " + hs.size());
		System.out.println("Removing 'Hello' from set " + hs.remove("Hello"));
		System.out.println("Trying to remove te element which is not present in the set " + hs.remove("Java"));
		System.out.println("10 is preset in the set - " + hs.contains(10));
		System.out.println(hs);

	}

}
