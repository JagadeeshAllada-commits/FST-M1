package activities;

public class Activity5 {

	public static void main(String[] args) {
		
		String bookName = "Marchent of Vennice";
		MyBook newNovel = new MyBook();
		
		//Set title
		newNovel.setTitle(bookName);
		
		//Print result
		System.out.println("The title is: " + newNovel.getTitle());

	}

}
