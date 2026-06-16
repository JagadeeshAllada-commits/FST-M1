package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Object> list = new ArrayList<Object>();
		Random indexGen = new Random();
		
		System.out.println("Enter the values");
		System.out.println("Enter non Integer to terminate: ");
		
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);
 
        scan.close();
	}

}
