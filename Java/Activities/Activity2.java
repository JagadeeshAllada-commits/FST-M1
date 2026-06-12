package activities;

public class Activity2 {

	public static void main(String[] args) {

		int[] arr = {10, 77, 10, 54, -11, 10};
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==10) {
				count = count+10;
			}
			
		}
		if(count == 30) {
			System.out.println("Total 10's sum in array is 30");
		}
		
		
	}

}
