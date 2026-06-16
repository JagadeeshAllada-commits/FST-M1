package activities;

public class Activity11 {

	public static void main(String[] args) {
		Addable ad1 = (a,b) -> (a+b);
		System.out.println("Results through NO BODY Lambda Function " + ad1.add(5, 2));
		

		Addable ad2 = (a,b) -> {
			return a+b;
		};
		
		System.out.println("Results through HAS BODY lambda Function " + ad2.add(5, 2));
		
		
	}

}
