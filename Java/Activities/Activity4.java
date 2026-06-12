package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] unsortedArray = {4, 3, 2, 10, 12, 1, 5, 6};
		int lengthOfUnsortedArr = unsortedArray.length;
		
		// Printing the unsorted array
		System.out.println("Unsorted Array:");
		for(int i=0; i<lengthOfUnsortedArr; i++) {
			System.out.println(unsortedArray[i]);
		}
		
		insertionSort(unsortedArray);
		System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(unsortedArray));

	}
	
	public static void insertionSort(int[] arr) {
	    for (int i = 1; i < arr.length; i++) {
	        int key = arr[i];
	        int j = i - 1;

	        while (j >= 0 && arr[j] > key) {
	            arr[j + 1] = arr[j]; // shift right
	            j--;
	        }

	        arr[j + 1] = key; // insert key
	    }
	}

}
